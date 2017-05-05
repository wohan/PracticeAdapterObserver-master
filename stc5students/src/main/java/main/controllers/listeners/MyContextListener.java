package main.controllers.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by admin on 20.04.2017.
 */
public class MyContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        // Fetching context-param from web.xml
        String myParam = servletContextEvent.getServletContext().getInitParameter("MY_PARAM");
        //System.out.println(myParam); // It will print '1234'

        String truePass = "1234";

        if (myParam.equals(truePass)){


        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
