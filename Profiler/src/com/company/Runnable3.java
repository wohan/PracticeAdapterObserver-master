package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by admin on 28.04.2017.
 */
public class Runnable3 implements Runnable {
    public int i;

    public Runnable3(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Start ");
        Random random = new Random();
        try{
            Thread.sleep(random.nextInt(10_000));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> list = new ArrayList<>();
        for (int k=0; k<random.nextInt(10_00);k++){
            list.add(k+"Thread" );
        }
        System.out.println("Thread M" + " is finished");
    }
}
