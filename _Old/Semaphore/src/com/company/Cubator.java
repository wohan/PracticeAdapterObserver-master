package com.company;

import static com.company.Summator.sumAllNumber;

/**
 * Created by admin on 16.04.2017.
 */
class Cubator extends Thread{

    public int cubatorSum;
    public int [] masCubator;

    public Cubator(int [] masCubator) {
        this.masCubator = masCubator;
    }

    public void run(){


        for(int numberFomMas: masCubator) {

            numberFomMas=numberFomMas*numberFomMas*numberFomMas;

                cubatorSum = cubatorSum + sumAllNumber(numberFomMas, 0, 0);

                System.out.println("Значение суммы Cubator:     " + cubatorSum);


        }

    }

}
