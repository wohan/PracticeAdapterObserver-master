package main.controllers.filters;

        import javax.servlet.*;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

/**
 * Created by admin on 28.04.2017.
 */
public class BuyerFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        String urlNext = (String) ((HttpServletRequest) servletRequest).getSession().getAttribute("urlNext");
        if (urlNext.equals("/listbuyer")) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            ((HttpServletResponse) servletResponse)
                    .sendRedirect(((HttpServletRequest) servletRequest).getContextPath() + "/passnottrue");
        }
    }

    public void destroy() {
    }
}

