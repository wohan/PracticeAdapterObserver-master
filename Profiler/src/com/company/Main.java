package com.company;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        scanner.next();
        System.out.println("start");
        Random r = new Random();
        for (int i = 0; i<1000;i++) {
            Thread t;
            switch (r.nextInt(5)){
                case 0:
                    t = new Thread(new Runnable1(i));
                    break;
                case 1:
                    t = new Thread(new Runnable2(i));
                    break;
                case 2:
                    t = new Thread(new Runnable3(i));
                    break;
                case 3:
                    t = new Thread(new Runnable4(i));
                    break;
                case 4:
                    t = new Thread(new Runnable5(i));
                    break;
                case 6:
                    t = new Thread(new Runnable6(i));
                    break;
            }
        }
//        scanner.next();
        System.out.println("");
//        scanner.close();

    }
}
