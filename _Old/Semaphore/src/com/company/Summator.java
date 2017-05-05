package com.company;

/**
 * Created by admin on 16.04.2017.
 */
class Summator {

    public int oneNumber;
    public int twoNumber;

    public Summator(int oneNumber, int twoNumber, int threeNumber) {
        this.oneNumber = oneNumber;
        this.twoNumber = twoNumber;
        this.threeNumber = threeNumber;
    }

    public int threeNumber;


    public static synchronized int sumAllNumber(int oneNumber, int twoNumber, int threeNumber){

        return oneNumber + twoNumber + threeNumber;


    }
}
