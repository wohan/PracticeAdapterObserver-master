package com.company;

import static com.company.Summator.sumAllNumber;

/**
 * Created by admin on 16.04.2017.
 */
class Cubator extends Thread{

    public int masCubator =0;

    public Cubator(int masCubator) {
        this.masCubator = masCubator;
    }

    public void run(){

        masCubator=masCubator*masCubator*masCubator;
        sumAllNumber(masCubator, 0, 0);
    }

}
