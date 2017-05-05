package com.company;

import static com.company.Summator.sumAllNumber;

/**
 * Created by admin on 16.04.2017.
 */
class Kvadrator extends Thread{

    public int kvadratorSum;
    public int [] masKvadrator;

    public Kvadrator(int[] masKvadrator) {

        this.masKvadrator = masKvadrator;
    }

    public void run(){

        for(int numberFomMas: masKvadrator) {

            numberFomMas=numberFomMas*numberFomMas;

            kvadratorSum = kvadratorSum + sumAllNumber(0,numberFomMas,0);

            System.out.println("Значение суммы Kvadrator:   " + kvadratorSum  );
        }

    }

}