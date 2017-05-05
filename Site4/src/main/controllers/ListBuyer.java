package main.controllers;
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

/**
 *
 */
public class ListBuyer extends HttpServlet {

    private static OrderingService orderingService = new OrderingServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("value", "Hello, buyer");
        List<Ordering> orderings = orderingService.getAll();
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();

        for (Ordering ordering: orderings) {
            out.print("\n" + ordering.getDescription());
            out.print("\n" + ordering.getData());
            out.print("\n" + ordering.getId_buyer());
        }
    }
}
