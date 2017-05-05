package com.company;


public class Main {

    public static void main(String[] args) throws InterruptedException {

    Timer timer = new Timer();
    Done5 done5 = new Done5();
    Done7 done7 = new Done7();

    timer.setPriority(9);
    done5.setPriority(5);
    done7.setPriority(5);

    timer.start();
    done5.start();
    done7.start();




    }
}
