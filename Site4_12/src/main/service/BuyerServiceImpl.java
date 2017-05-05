package main.service;

import main.models.dao.BuyerDAO;
import main.models.dao.BuyerDAOImpl;
import main.models.pojo.Buyer;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 22.04.2017.
 */

public class BuyerServiceImpl implements main.service.BuyerService {

    private static final Logger logger = Logger.getLogger(BuyerServiceImpl.class);
    @Autowired
    public BuyerServiceImpl() {
    }

    /**
     * Метод проверяет принадлежность пользователя к существующим клиентам.
     * @param buyerName   имя пользователя
     * @param passName   пароль пользователя
     * @return 1- авторизация успешна, 2 - пароль не верный, 1 - авторизация успешна
     */
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

    /**
     * Метод проверки на длину слова.
     * @param word - слово для проверки
     * @param length - мин длина
     * @return true - если длина слова больше или равна length, false если меньше.
     */
    public Boolean satisfactionLength(String word, int length){
        word = word.replaceAll(" ", "");
        if (length > word.length()) return false;
            else  return true;
    }

    /**
     *  Метод хеширования паролей.
     * @param word - слово
     * @return хеш строку соотвествующую входящему слову
     */
    public String md5Apache(String word) {
        String md5Hex;
        md5Hex = DigestUtils.md5Hex(word);
        return md5Hex;
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
}
