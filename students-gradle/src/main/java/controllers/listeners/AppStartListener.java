package controllers.listeners;


import org.apache.log4j.PropertyConfigurator;
import utils.EmailSender;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.File;

@WebListener("application context listener")
public class AppStartListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext context = event.getServletContext();
        String log4jConfigFile = context.getInitParameter("log4j-config-location");
        String fullPath = context.getRealPath("") + File.separator + log4jConfigFile;
        PropertyConfigurator.configure(fullPath);

        String adminEmail = context.getInitParameter("admin-email");
        EmailSender.send(adminEmail, "App started");

    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        // do nothing
    }
}