package com.company;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Random;

/**
 * Created by wnb on 12.04.2017.
 */
public class FlowNumders extends Thread {

    int flowType;
    Integer [] listNumbers;
    int lengtSegment=5;
    int durationWork=20;
    static boolean flowStop = true;
    int j = 0;

    public FlowNumders(int flowType, Integer[] listNumbers) {
        this.flowType = flowType;
        this.listNumbers = listNumbers;
    }



    public void run() {
        Random randomNuber = new Random();

        try {
            flowStop = true;
            while(j <= durationWork&&flowStop){
            //for (int j = 0; j < durationWork; j++){
                synchronized (listNumbers){
                    if (this.flowType == 1) {
                        flowStop = false;
                        int i = 0;
                        while (i < this.lengtSegment) {
                            listNumbers[i] = randomNuber.nextInt(100);
                            i++;
                            sleep(10);
                        }
                    } else {
                            j++;
                            flowStop=true;
                            for(int k = 0;k <= lengtSegment; k++){
                            System.out.println(listNumbers[k]);
                            k++;}
                            sleep(50);
                    }
                }
            }
            } catch (InterruptedException e) {
            }

    }
}

