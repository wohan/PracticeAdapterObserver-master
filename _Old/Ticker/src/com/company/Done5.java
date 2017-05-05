package com.company;


import static com.company.Timer.alarm;
import static com.company.Timer.start5;

/**
 * Created by admin on 16.04.2017.
 */
class Done5 extends Thread {


    public void run() {
       // try {
            for (; ; ) {
                synchronized (start5){
                if (start5) {
                    System.out.println("Прошло еще 5 секунд!");
                    start5 = false;
                    try {
                        start5.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                }

            }
        //} catch (InterruptedException e){}

    }
}