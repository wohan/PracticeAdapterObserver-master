package com.company;
import com.company.models.*;
import javax.xml.bind.JAXBException;
import java.sql.SQLException;
import java.util.ArrayList;

import static com.company.models.ObjectAndXML.metObjectToXML;
import static com.company.models.ObjectAndXML.metXMLToObject;

public class Main {

    public static void main(String[] args) throws JAXBException {

        DataBaseManaget dataBaseManaget;
        dataBaseManaget = new DataBaseManaget();

//        //Выгрузка Buyer из БД
//        ArrayList<Buyer> buyers;
//        buyers = (ArrayList<Buyer>) dataBaseManaget.selectBuyer();
//        CaseBuyer caseBuyer = new CaseBuyer();
//        caseBuyer.setListCase(buyers);
//        metObjectToXML("buyers.xml", caseBuyer);

//        // Загрузка Buyer в БД
//        CaseBuyer caseBuyer1;
//        caseBuyer1 = new CaseBuyer();
//        caseBuyer1 = (CaseBuyer)metXMLToObject("buyers.xml", CaseBuyer.class);
//        for(Buyer buyer1: caseBuyer1.getListCase()) {
//            dataBaseManaget.insertBuyer(buyer1);
//        }


//         //Выгрузка Ordering из БД
//        ArrayList<Ordering> orderings;
//        orderings = (ArrayList<Ordering>) dataBaseManaget.selectOrdering();
//        CaseOrdering caseOrdering = new CaseOrdering();
//        caseOrdering.setListCase(orderings);
//        metObjectToXML("ordering.xml", caseOrdering);
//
//        // Загрузка Product в БД
//        caseOrdering = new CaseOrdering();
//        caseOrdering = (CaseOrdering)metXMLToObject("ordering.xml", CaseOrdering.class);
//        for(Ordering ordering2: caseOrdering.getListCase()) {
//            dataBaseManaget.insertOrdering(ordering2);
//        }

        // Выгрузка Product из БД
//        ArrayList<Product> products;
//        products = (ArrayList<Product>) dataBaseManaget.selectProduct();
//        CaseProduct caseProduct = new CaseProduct();
//        caseProduct.setListCase(products);
//        metObjectToXML("product.xml", caseProduct);

        // Загрузка Product в БД
//        CaseProduct caseProduct = new CaseProduct();
//        caseProduct = (CaseProduct)metXMLToObject("product.xml", CaseProduct.class);
//        for(Product product: caseProduct.getListCase()){
//            try {
//                dataBaseManaget.insertProduct(product);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }


        //Выгрузка Admin из БД
//        ArrayList<Admin> admins;
//        admins = (ArrayList<Admin>) dataBaseManaget.selectAdmin();
//        CaseAdmin caseAdmin = new CaseAdmin();
//        caseAdmin.setListCase(admins);
//        metObjectToXML("admin.xml", caseAdmin);

//        // Загрузка Admin в БД
//            CaseAdmin caseAdmin;
//            caseAdmin = new CaseAdmin();
//            caseAdmin = (CaseAdmin)metXMLToObject("admin.xml", CaseAdmin.class);
//            for(Admin admin: caseAdmin.getListCase()) {
//            try {
//                dataBaseManaget.insertAdmin(admin);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
 //       }
    }
}
