package com.company;


/**
 * Created by admin on 16.04.2017.
 */
class Timer extends Thread{

    public static Boolean start5 = new Boolean(false) ;
    public static Boolean start7 = new Boolean(false) ;
    //public static Boolean alarm = false;
    public static Object alarm = new Object();

    int allTime = 100;

    //public static boolean nameThread = Thread.getName();




    public void run(){
        try {
            for (int i = 1; i < allTime; i++){

                synchronized (start5) {
                    start5 = false;
                    start7 = false;

                    sleep(1000);
                    System.out.println("Прошло:     " + i + "   секунд.");

                    if (i % 5 == 0) {
                        System.out.println("хз что я тут забыл");
                        start5 = true;
                        start5.notify();
                        // notifyAll();

                    }
                    if (i % 7 == 0) {
                        start7 = true;
                        this.wait();
                    }
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
