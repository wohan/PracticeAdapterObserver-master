package com.company;


import static com.company.Timer.start5;
import static com.company.Timer.start7;

/**
 * Created by admin on 16.04.2017.
 */

class Done7 extends Thread{

    public void run(){

        while (start7){

                System.out.println("Прошло еще 7 секунд!");
                notifyAll();
                start5 = false;
        }
    }
}