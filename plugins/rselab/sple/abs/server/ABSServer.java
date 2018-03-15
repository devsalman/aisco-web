package com.fmse.absserver;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 *
 * @author Kandito Agung
 */
public class ABSServer {

    /**
     * @param args the command line arguments
     */
    public String port = null;
    public static void main(String[] args) {
        ABSServer server = new ABSServer();
	for (int ii=0; ii<args.length;ii++){
	    if(args[ii].equals("-p")){
		ii++;
		if(ii == args.length){
		    System.err.println("Please provide port");
		    System.exit(1);
		}
		else{
		    server.port = args[ii];
		}
	    }
	}
        server.run();
    }

    public void run() {

        String webappDirLocation = "external";
        Tomcat tomcat = new Tomcat();

        //The port that we should run on can be set into an environment variable
        //Look for that variable and default to 8080 if it isn't there.
	String webPort = null;
	if (this.port == null){
            webPort = System.getenv("PORT");
            if (webPort == null || webPort.isEmpty()) {
                webPort = "8081";
            }
	}
	else{
	   webPort = this.port;
	}

        tomcat.setPort(Integer.valueOf(webPort));

        Context ctx;
        try {
            ctx = tomcat.addWebapp("", new File(webappDirLocation).getAbsolutePath());

            Tomcat.addServlet(ctx, "absservlet", new ABSServlet());
            Tomcat.addServlet(ctx, "absservletLogin", new ABSServletLogin());
            Tomcat.addServlet(ctx, "absservletLogout", new ABSServletLogout());

            ctx.addServletMapping("", "absservlet");
            ctx.addServletMapping("*.abs", "absservlet");
            ctx.addServletMapping("/login", "absservletLogin");
            ctx.addServletMapping("/logout", "absservletLogout");

            System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());

            try {
                tomcat.start();
            } catch (LifecycleException ex) {
                Logger.getLogger(ABSServer.class.getName()).log(Level.SEVERE, null, ex);
            }
            tomcat.getServer().await();
        } catch (ServletException ex) {
            Logger.getLogger(ABSServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
