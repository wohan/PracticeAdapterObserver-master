package com.company;

import sun.awt.windows.ThemeReader;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        //Integer [] masRand = new Integer[100];
        String [] masRand = new String[100];
        Random flowNumbers= new Random(100);

        //for (int i=0;i<masRand.length;i++)  masRand[i] = flowNumbers.nextInt(100);

        //while ((masRand=flowNumbers.nextInt(50)))


        Runnable flow1 = new Runnable() {

            Semaphore semaphore = new Semaphore(3);
            @Override


                public void run () {
                try{


                    semaphore.release();


                    //volatile i;

                    for ( int i=0; i < masRand.length; i++ ) {  masRand[i] = Thread.currentThread().getName();
                        System.out.println("Следующий шаг:  " + masRand[i] + "Поток номер: " + Thread.currentThread().getName());
                    }

                    //for (int a: masRand){
                    //System.out.println("Следующий шаг:  " + a + "Поток номер: " + Thread.currentThread().getName());
                    //Thread.sleep(500);
                    //}

                    semaphore.acquire();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }};


            for (int i=0;i<25;i++) {new Thread(flow1).start();}

//        for (int a: masRand){
//                System.out.println("Следующий шаг:  " + a + "Поток номер: " + Thread.currentThread().getName());
//        }



    }
}
