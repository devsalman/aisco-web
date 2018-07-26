package com.fmse.absserver;

import abs.backend.java.lib.runtime.ABSFut;
import abs.backend.java.lib.runtime.ABSMainCall;
import abs.backend.java.lib.runtime.ABSRuntime;
import abs.backend.java.lib.runtime.COG;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fmse.absserver.helper.RoleAccess;
import com.fmse.absserver.exception.ForbiddenAccessException;

/**
 *
 * @author Kandito Agung
 */
@WebServlet(urlPatterns = {"*.abs",""})
public class ABSServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        PrintWriter out = response.getWriter();
        try {
            ABSRuntime runtime = new ABSRuntime();
            COG cog = runtime.createCOG(ABSCaller.class);
            ABSCaller absRouter = new ABSCaller(cog);
            absRouter.setRequest(request);
            runtime.cogCreated(absRouter);
            ABSFut fut = runtime.asyncCall(new ABSMainCall(absRouter));
            fut.await();
            System.out.println("Servlet: getting response");
            response.setContentType("text/html;charset=UTF-8");
            out.print(absRouter.getResponse());
        } catch (ForbiddenAccessException ex) {
            String path = request.getContextPath();

            if (RoleAccess.getRole(request) != null) {
                // User logged in, but with forbidden role
                // Show error message
                String responseMessage = "<h1>ERROR 403: Forbidden Access</h1>";
                responseMessage += "<span style='font-size:0.8em;'>";
                responseMessage += "<a href='" + request.getContextPath() +"/'>Back to Home</a>";
                responseMessage += "</span><br />";

                out.print(responseMessage);
            } else {
                // User not logged in, redirect to login page
                response.sendRedirect(path + "/login?result=fail");
            }
        } catch (Exception ex) {
            Logger.getLogger(ABSServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
    }
}
