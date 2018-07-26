package com.fmse.absserver;

import ABS.Framework.Http.ABSHttpRequestImpl_c;
import ABS.Framework.Http.ABSHttpRequest_i;
import ABS.StdLib.List_Cons;
import ABS.StdLib.List_Nil;
import ABS.StdLib.Pair;
import ABS.StdLib.Pair_Pair;
import abs.backend.java.lib.runtime.ABSObject;
import abs.backend.java.lib.runtime.COG;
import abs.backend.java.lib.types.ABSString;
import abs.backend.java.lib.types.ABSUnit;
import abs.backend.java.lib.types.ABSValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.TemplateResolver;
import com.fmse.absserver.helper.DataTransformer;
import com.fmse.absserver.helper.RoleAccess;
import com.fmse.absserver.exception.ForbiddenAccessException;

/**
 *
 * @author Kandito Agung
 */
public class ABSCaller extends ABSObject {
    private String response;
    private boolean isForbidden;
    private HttpServletRequest request;

    public ABSCaller(COG cog) throws IOException {
        super(cog);
    }

    public static void main(java.lang.String[] args) throws Exception {
        abs.backend.java.lib.runtime.StartUp.startup(args, ABSCaller.class);
    }

    @Override
    public String getClassName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getFieldNames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ABSUnit run() {
        try {
            String contextPath = request.getContextPath();
            String requestURI = request.getRequestURI();
            String route = this.getRoute(requestURI, contextPath);
            /**
             * ************ CALL ABS HERE *********************
             */
            Class resolver = Class.forName("ABS.Framework.Route.RouteConfigImpl_c");
            ABS.Framework.Route.RouteConfigImpl_c router = ABS.Framework.Route.RouteConfigImpl_c.__ABS_createNewObject(this);
            String routeUrl = router.route(ABSString.fromString(route)).getString();
            System.out.println("Route: " + routeUrl + "from" + route);

            if (routeUrl != null && routeUrl.length() > 0) {
                String controllerNameProperty = routeUrl.split("@")[0] + "_c";
                String methodName = routeUrl.split("@")[1];

                if (!RoleAccess.isAllowedRole(request, controllerNameProperty)) {
                    this.isForbidden = true;
                } else {
                    String controllerName = RoleAccess.getControllerName(controllerNameProperty);
                    Class controllerClass = Class.forName(controllerName);
                    Object controllerObject = controllerClass.getMethod("__ABS_createNewObject", ABSObject.class).invoke(controllerClass, this);

                    //todo REQUEST
                    ABS.Framework.Http.ABSHttpRequestImpl_c absrequest = (ABS.Framework.Http.ABSHttpRequestImpl_c) this.createABSHttpRequest();

                    Pair<ABSString, ABS.StdLib.List<ABSValue>> pair = (Pair<ABSString, ABS.StdLib.List<ABSValue>>) controllerObject.getClass().getMethod(methodName, ABSHttpRequest_i.class).invoke(controllerObject, absrequest);

                    this.setResponse(pair);
                }
            } else {
                this.setResponse(null);
            }
            return ABSUnit.UNIT;
        } catch (ForbiddenAccessException ex) {
            Logger.getLogger(ABSCaller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ABSCaller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(ABSCaller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(ABSCaller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ABSCaller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(ABSCaller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(ABSCaller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ABSCaller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ABSUnit.UNIT;
    }

    public String getResponse() throws Exception {
        if (this.isForbidden) {
            throw new ForbiddenAccessException("Forbidden access");
        }

        return response;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void setResponse(Pair<ABSString, ABS.StdLib.List<ABSValue>> pair) throws Exception {
        TemplateResolver templateResolver = new TemplateResolver();
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setSuffix(".html");
        templateResolver.setResourceResolver(new ResourceResolver());

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);

        List_Cons<ABSValue> data;

        if (pair != null) {
            String view = DataTransformer.convertABSStringToJavaString((ABSString) pair.getArg(0));
            Context ctx = new Context();
            if (!(pair.getArg(1) instanceof List_Nil)) {
                data = (List_Cons<ABSValue>) pair.getArg(1);
                ArrayList<Object> dataModels = DataTransformer.convertABSListToJavaList(data);
                System.out.println(dataModels);
                
                //bagian ini untuk mengatasi permasalahan jika jumlah elemen list hanya satu
                //untuk sementara waktu, bagian ini dapat dihapus, jika sudah diimplementasikan
                //cara yang lebih generik
                String cp = this.request.getContextPath();
                String reqURI = this.request.getRequestURI();
                String url = this.getRoute(reqURI, cp);
                ABS.Framework.Route.RouteConfigImpl_c router = ABS.Framework.Route.RouteConfigImpl_c.__ABS_createNewObject(this);
                String routeURL = router.route(ABSString.fromString(url)).getString();

                boolean is_url_list = url.contains("list") || routeURL.contains("list");
                boolean is_url_save = url.contains("save") || routeURL.contains("save");
                boolean is_url_delete = url.contains("delete") || routeURL.contains("delete");
                
                boolean probably_list = is_url_list || is_url_save || is_url_delete;
                //end

                if (dataModels.size() > 1 || probably_list) {
                    ctx.setVariable("dataList", dataModels);
                } else {
                    ctx.setVariable("data", dataModels.get(0));
                }
            }
            ctx.setVariable("requestMethod", this.request.getMethod());
            ctx.setVariable("requestURI", this.request.getRequestURI());
            ctx.setVariable("requestContextPath", this.request.getContextPath());
            ctx.setVariable("requestRoute", this.getRoute(request.getRequestURI(), request.getContextPath()));
            ctx.setVariable("userEmail", RoleAccess.getUserEmail(this.request));
            ctx.setVariable("userRole", RoleAccess.getRole(this.request));

            this.response = templateEngine.process(view, ctx);
        } else {
            this.response = "<h1>ERROR 404: PAGE NOT FOUND</h1>";
            this.response += "<span style='font-size:0.8em;'>ABS Server: " + new Date() + "</span><br />";
        }
    }

    private ABSHttpRequest_i createABSHttpRequest() throws Exception {
        ABS.StdLib.Map<ABSString, ABSString> absRequestInputMap = new ABS.StdLib.Map_EmptyMap<ABSString, ABSString>();
        Enumeration<String> parameterNames = this.request.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String paramName = parameterNames.nextElement();
            String[] paramValue = this.request.getParameterValues(paramName);

            ABSString key = ABSString.fromString(paramName);
            ABSString value = null;
            if (paramValue.length == 1) {
                value = ABSString.fromString(paramValue[0]);
            } else {
                value = ABSString.fromString(paramValue.toString());
            }
            absRequestInputMap = this.addPair(absRequestInputMap, key, value);
        }

        // Add property
        ABS.StdLib.Map<ABSString, ABSString> absRequestPropertyMap = new ABS.StdLib.Map_EmptyMap<ABSString, ABSString>();

        ABSString key = null;
        ABSString value = null;

        // Method
        String httpMethod = this.request.getMethod();
        key = ABSString.fromString("request.method");
        value = ABSString.fromString(httpMethod);
        absRequestPropertyMap = this.addPair(absRequestPropertyMap, key, value);

        // Context path
        String contextPath = this.request.getContextPath();
        key = ABSString.fromString("request.contextPath");
        value = ABSString.fromString(contextPath);
        absRequestPropertyMap = this.addPair(absRequestPropertyMap, key, value);

        // Add URI
        String requestURI = this.request.getRequestURI();
        key = ABSString.fromString("request.URI");
        value = ABSString.fromString(contextPath);
        absRequestPropertyMap = this.addPair(absRequestPropertyMap, key, value);

        // Add route
        key = ABSString.fromString("request.route");
        value = ABSString.fromString(this.getRoute(requestURI, contextPath));
        absRequestPropertyMap = this.addPair(absRequestPropertyMap, key, value);

        // Add user email
        String userEmail = RoleAccess.getUserEmail(this.request);
        key = ABSString.fromString("request.userEmail");
        value = ABSString.fromString(userEmail);
        absRequestPropertyMap = this.addPair(absRequestPropertyMap, key, value);

        ABSHttpRequest_i absHttpRequest = new ABSHttpRequestImpl_c(absRequestInputMap, absRequestPropertyMap);
        return absHttpRequest;
    }

    private ABS.StdLib.Map_InsertAssoc<ABSString, ABSString> addPair(ABS.StdLib.Map<ABSString, ABSString> absRequestInputMap, ABSString key, ABSString value) {
        Pair<ABSString, ABSString> methodPair = new Pair_Pair<ABSString, ABSString>(key, value);
        return new ABS.StdLib.Map_InsertAssoc<ABSString, ABSString>(methodPair, absRequestInputMap);
    }

    private String getRoute(String requestURI, String contextPath) {
        //add route
        String route = requestURI.substring(contextPath.length(), requestURI.length());
        if (route.length() == 0) {
            route = "/";
        }
        return route;
    }

}
