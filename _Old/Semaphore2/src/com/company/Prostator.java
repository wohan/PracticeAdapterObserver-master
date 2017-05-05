package com.company;

import static com.company.Summator.sumAllNumber;

/**
 * Created by admin on 16.04.2017.
 */
class Prostator extends Thread{

    public int masProstator;


    public Prostator(Integer masProstator) {

        this.masProstator = masProstator;
    }


    public void run(){

        sumAllNumber(0,0, masProstator);

    }


}