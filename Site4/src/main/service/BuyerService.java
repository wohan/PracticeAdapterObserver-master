package main.service;

import main.models.pojo.Buyer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 22.04.2017.
 */
public interface BuyerService {

    Buyer getBuyer (int id);

    List<Buyer> getAll();

    void update(Buyer buyer);

    void delete(Buyer buyer);

    Integer insert(Buyer buyer);

    Integer passwordVerification(String buyerName, String passName);
}
