package com.company;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by admin on 28.04.2017.
 */
public class Runnable2 implements Runnable {
    public int i;

    public Runnable2(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Start ");
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(10_000));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> list = new ArrayList<>();
        for (int k = 0; k < random.nextInt(10_00); k++) {
            list.add(k + "Thread");
        }
        System.out.println("Thread M" + " is finished");
//        Arrays stringList;
//        saveToFile(stringList.stream().reduce((s1, s2) -> s1 + s2).toString());
    }
//        private void saveToFile(String str){
//            FileWriter fr = new FileWriter("c:\\temp\\tttx.txt");
            
    }


