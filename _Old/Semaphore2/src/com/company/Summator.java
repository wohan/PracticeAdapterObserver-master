package com.company;

import static java.lang.Math.abs;

/**
 * Created by admin on 16.04.2017.
 */
class Summator {

    static public Integer sumCubator = new Integer(0);
    static public Integer sumKvadrator = new Integer(0);
    static public Integer sumProctator = new Integer(0);


    public static void sumAllNumber(int oneNumber, int twoNumber, int threeNumber) {

            if (abs(oneNumber) > 0) {
                synchronized (sumCubator) {
                    sumCubator = sumCubator + oneNumber;
                }
            }
            if (abs(twoNumber) > 0) {
                synchronized (sumKvadrator) {
                    sumKvadrator = sumKvadrator + twoNumber;
                }

            }
            if (abs(threeNumber) > 0) {
                synchronized (sumProctator) {
                    sumProctator = sumProctator + threeNumber;
                }
            }
    }
}

