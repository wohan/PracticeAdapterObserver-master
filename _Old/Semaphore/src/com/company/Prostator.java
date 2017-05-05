package com.company;

import static com.company.Summator.sumAllNumber;

/**
 * Created by admin on 16.04.2017.
 */
class Prostator extends Thread{

    public int [] masProstator;
    public int prostatorSum;

    public Prostator(int[] masProstator) {

        this.masProstator = masProstator;

    }

    public void run(){

        for(int numberFomMas: masProstator) {

            prostatorSum = prostatorSum + sumAllNumber(0,0,numberFomMas);

            System.out.println("Значение суммы Prostator:   " + prostatorSum );

        }

    }


}