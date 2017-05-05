package main.controllers;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import main.models.pojo.Ordering;
import main.service.OrderingService;
import main.service.OrderingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 *
 */
@Component
public class ListBuyer extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.
                processInjectionBasedOnServletContext(this, config.getServletContext());
    }


    @Autowired
    private static OrderingService orderingService;

    //private static OrderingService orderingService = new OrderingServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Ordering> orderings = orderingService.getAll();
        req.setAttribute("orderings", orderings);
        req.getRequestDispatcher("/listbuyer.jsp").forward(req, resp);
    }
}
