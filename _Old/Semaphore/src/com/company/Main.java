package com.company;

import static com.company.Summator.sumAllNumber;
import static java.lang.Thread.sleep;

public class Main {



    public static void main(String[] args) throws InterruptedException {

        int [] masCubator = {1,2,2,2,2,2,3,6};
        int [] masKvadrator = {3,5,6};
        int [] masProstator = {2,4,5,8,8,3,5,6};

        Cubator cubator;
        Kvadrator kvadrator;
        Prostator prostator;


        cubator = new Cubator(masCubator);
        kvadrator = new Kvadrator(masKvadrator);
        prostator = new Prostator(masProstator);



        cubator.start();
        kvadrator.start();
        prostator.start();



        Thread.sleep(1000);

        System.out.println("Общая сумма:  " + sumAllNumber(cubator.cubatorSum,
                kvadrator.kvadratorSum, prostator.prostatorSum));






    }
}
