package main.controllers;

import main.models.pojo.Buyer;
import main.service.BuyerService;
import main.service.BuyerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by admin on 26.04.2017.
 */
public class ListAdminServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {




        BuyerService buyerService = new BuyerServiceImpl();
        List<Buyer> buyers = buyerService.getAll();
//        resp.setContentType("text/html");
//        resp.setCharacterEncoding("UTF-8");
//        PrintWriter out = resp.getWriter();
//        for (Buyer buyer : buyers) {
//            out.print("\n" + buyer.getUser_name());
//        }

       req.setAttribute("buyers", buyers);
        req.getRequestDispatcher("/listadmin.jsp").forward(req,resp);
       // req.getRequestDispatcher("/list.jsp").forward(req, resp);

    }
}
