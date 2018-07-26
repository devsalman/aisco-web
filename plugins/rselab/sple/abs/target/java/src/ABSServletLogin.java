package com.fmse.absserver;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.TemplateResolver;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import com.fmse.absserver.helper.RoleAccess;

/**
 *
 * @author Kandito Agung
 */
@WebServlet(urlPatterns = {"/login"})
public class ABSServletLogin extends HttpServlet {
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TemplateResolver templateResolver = new TemplateResolver();
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setSuffix(".html");
        templateResolver.setResourceResolver(new ResourceResolver());

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        Context ctx = new Context();
        ctx.setVariable("requestContextPath", request.getContextPath());

        String result = request.getParameter("result");
        if (result != null && result.equals("fail")) {
            ctx.setVariable("fail", true);
        }

        String body = templateEngine.process("login", ctx);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(body);
        out.close();
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getContextPath();
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes(), 0, password.length());
            String hashedPassword = new BigInteger(1, md.digest()).toString(16);

            Map userInformation = RoleAccess.getUserInformation(email);

            if (hashedPassword.equals(userInformation.get("password"))) {
                HttpSession session = request.getSession();
                session.setAttribute("email", email);
                session.setAttribute("role", userInformation.get("role"));
                response.sendRedirect(path + "/");
            } else {
                response.sendRedirect(path + "/login?result=fail");
            }
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
    }
}
