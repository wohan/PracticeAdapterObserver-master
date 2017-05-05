package com.company;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        Integer [] masCubator = {1,2,2,2,2,2,3,6};
        Integer [] masKvadrator = {3,5,6};
        Integer [] masProstator = {2,4,5,8,8,3,5,6};

        Cubator cubator;
        Kvadrator kvadrator;
        Prostator prostator;

        for (Integer c: masCubator){
            cubator = new Cubator(c);
            cubator.start();
        }
        for (Integer k: masKvadrator){
            kvadrator = new Kvadrator(k);
            kvadrator.start();
        }
        for (Integer p: masProstator){
            prostator = new Prostator(p);
            prostator.start();
        }


        Thread.sleep(1000);

        Summator summator;
        summator = new Summator();

        System.out.println(" сумма:  " + summator.sumCubator + "  " + summator.sumKvadrator + "  "
                + summator.sumProctator );






    }
}
