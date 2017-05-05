package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static LinkedList<Object> llo = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.next()) {
            case "likeble":
                llo.add(createBigObject());
                break;
            case "collecteble":
                createCollected();
                break;
        }
    }

    static Object createBigObject() {
        ArrayList<String> stringsList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 1000000000; i++) {
            stringsList.add(rnd.nextInt() + " ");

        }
        return stringsList;
    }

    static void createCollected() {
        createBigObject();
    }
    // write your code here
}

