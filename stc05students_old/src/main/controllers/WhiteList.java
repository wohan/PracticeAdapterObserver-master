package main.controllers;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

/**
 * Created by admin on 20.04.2017.
 */
public class WhiteList implements Filter {

    public boolean isLoggable(LogRecord record) {
        return false;
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse){
        String user
        ()
    }
}
