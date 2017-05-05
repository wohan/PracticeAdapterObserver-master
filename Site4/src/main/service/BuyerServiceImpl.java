package main.service;

import main.models.dao.BuyerDAO;
import main.models.dao.BuyerDAOImpl;
import main.models.pojo.Buyer;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by admin on 22.04.2017.
 */
public class BuyerServiceImpl implements main.service.BuyerService {

    private static final Logger logger = Logger.getLogger(BuyerServiceImpl.class);

    //LOGGER.debug("Hello, Buyer.");
  //private static BuyerDAO buyerDAO = new BuyerDAOImpl();
//
    public Integer passwordVerification(String buyerName, String passName) {
        BuyerService buyerService = new BuyerServiceImpl();
        List<Buyer> buyers;
        buyers = buyerService.getAll();
        for (Buyer buyer: buyers){
            if(buyerName.equals(buyer.getUser_name())){
                if (passName.equals(buyer.getUser_pass())){
                    return 1; //авторизация успешна
                }
                else {
                    return 2; //пароль не верный
                }
            }
        }
        return 3; //пользователь не найден.
    }


    public Buyer getBuyer (int id) {
        BuyerDAO buyerDAO = new BuyerDAOImpl();
        Buyer buyer = buyerDAO.getById(id);
        return buyer;
    }

    public List<Buyer> getAll() {
        BuyerDAO buyerDAO = new BuyerDAOImpl();
        List<Buyer> buyers = new ArrayList<Buyer>();
        buyers = buyerDAO.getAll();
        return buyers;
    }

    public void update(Buyer buyer) {
        BuyerDAO buyerDAO = new BuyerDAOImpl();
        buyerDAO.update(buyer);
    }

    public void delete(Buyer buyer) {
        BuyerDAO buyerDAO = new BuyerDAOImpl();
        buyerDAO.delete(buyer);
    }

    public Integer insert(Buyer buyer) {
        BuyerDAO buyerDAO = new BuyerDAOImpl();
         return buyerDAO.insert(buyer);
    }




//    public Buyer auth(String login, String password) {
//        Buyer buyer = buyerDAO.findUserByLoginAndPassword(login, password);
//        logger.debug("user: " + buyer);
//        if(buyer != null && buyer.isBlocked()) {
//            return null;
//        } else {
//            logger.debug("user not blocked");
//            return buyer;
//        }
//    }


}
