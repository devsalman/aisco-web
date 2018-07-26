package com.fmse.absserver.helper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This helper to manage role access.
 */
public class RoleAccess {
    /**
     * Given controller name from Route.abs, return true if access role is allowed
     * or authentication not required for given controller name.
     *
     * @param request
     * @param controllerNameProperty
     * @return
     */
    public static boolean isAllowedRole(HttpServletRequest request, String controllerNameProperty) {
        if (controllerNameProperty.indexOf(':') > 0) {
            String role = getRole(request);

            if (role == null) {
                // Hasn't role access
                return false;
            }

            String allowedRoleQuery = controllerNameProperty.split(":")[0];
            String[] allowedRole = allowedRoleQuery.split(",");

            return Arrays.asList(allowedRole).contains(role) || Arrays.asList(allowedRole).contains("all");
        }
        return true;
    }

    /**
     * Given controllerNameProperty, return actual controller name.
     * @param controllerNameProperty
     * @return
     */
    public static String getControllerName(String controllerNameProperty) {
        if (controllerNameProperty.indexOf(':') > 0) {
            return controllerNameProperty.split(":")[1];
        }
        return controllerNameProperty;
    }

    /**
     * Given Request object, return authenticated user role name.
     * Return null if user not logged in.
     * @return
     */
    public static String getRole(HttpServletRequest request) {
        HttpSession session = request.getSession();
        return (String) session.getAttribute("role");
    }

    /**
     * Given Request object, return authenticated user email.
     * Return null if user not logged in.
     * @return
     */
    public static String getUserEmail(HttpServletRequest request) {
        HttpSession session = request.getSession();
        return (String) session.getAttribute("email");
    }

    /**
     * Given email, return user information map eg. role and password from auth.properties.
     *
     * @param email
     * @return
     */
    public static Map<String, String> getUserInformation(String email) {
        Properties prop = new Properties();
        InputStream input = null;
        Map<String, String> information = new HashMap<String, String>();

        try {
            input = new FileInputStream("auth.properties");
            prop.load(input);

            String propertyResult = prop.getProperty(email);

            if (propertyResult == null) {
                // Return empty map
                return information;
            }

            String[] userInformation = propertyResult.split(":");

            information.put("password", userInformation[0]);

            // Default role is 'user'
            String role = "user";
            if (userInformation.length > 1) {
                role = userInformation[1];
            }
            information.put("role", role);

            return information;
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // Return empty map
        return information;
    }
}