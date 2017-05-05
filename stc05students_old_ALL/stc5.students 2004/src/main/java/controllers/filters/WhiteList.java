package controllers.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by PoGo on 20.04.2017.
 */
public class WhiteList implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String userLogin = (String) ((HttpServletRequest) request).getSession().getAttribute("userLogin");
        if (userLogin != null) {
            chain.doFilter(request, response);
        } else {
            ((HttpServletResponse) response).sendRedirect(((HttpServletRequest) request).getContextPath() + "/user/login/");
        }
    }

    @Override
    public void destroy() {

    }
}
