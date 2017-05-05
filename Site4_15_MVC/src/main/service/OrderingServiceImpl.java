package main.service;

import main.models.dao.BuyerDAO;
import main.models.dao.BuyerDAOImpl;
import main.models.dao.OrderingDAO;
import main.models.dao.OrderingDAOImpl;
import main.models.pojo.Buyer;
import main.models.pojo.Ordering;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by admin on 22.04.2017.
 */
@Service
public class OrderingServiceImpl implements OrderingService {


    private static final Logger logger = Logger.getLogger(BuyerServiceImpl.class);

    public OrderingServiceImpl() {
    }


    public Ordering getOrdering (int id) {
        OrderingDAO orderingDAO = new OrderingDAOImpl();
        Ordering ordering = orderingDAO.getById(id);
        return ordering;
    }

    public List<Ordering> getAll() {
        OrderingDAO orderingDAO = new OrderingDAOImpl();
        List<Ordering> orderings = new ArrayList<Ordering>();
        orderings = orderingDAO.getAll();
        return orderings;
    }

    public void update(Ordering ordering) {
        OrderingDAO orderingDAO = new OrderingDAOImpl();
        orderingDAO.update(ordering);
    }

    public void delete(Ordering ordering) {
        OrderingDAO orderingDAO = new OrderingDAOImpl();
        orderingDAO.delete(ordering);
    }

    public Integer insert(Ordering ordering) {
        OrderingDAO orderingDAO = new OrderingDAOImpl();
        return orderingDAO.insert(ordering);
    }
}
