package com.company;
import com.company.resources.TextRunner;


import java.util.*;


public class Main {


    public static void main(String[] args) {


        Map<String, Integer> frequencyWords = new HashMap<String, Integer>();


//        String[] fileWay = {"C:\\Users\\admin\\IdeaProjects\\textcalc\\1.txt", "C:\\Users\\admin\\IdeaProjects\\textcalc\\2.txt",
//                "C:\\Users\\admin\\IdeaProjects\\textcalc\\3.txt", "C:\\Users\\admin\\IdeaProjects\\textcalc\\4.txt"};

        String[] fileWay = {"C:\\Users\\admin\\IdeaProjects\\textcalc\\tt.txt"};
              //  ,"C:\\Users\\admin\\IdeaProjects\\textcalc\\tt1.txt","C:\\Users\\admin\\IdeaProjects\\textcalc\\tt2.txt"};


        int quantityThread;
        quantityThread = fileWay.length;

        TextRunner[] Flow;
        Flow = new TextRunner[quantityThread];

        for (int i = 0; i < quantityThread; i++) {

            Flow[i] = new TextRunner(fileWay[i], frequencyWords);
            Flow[i].start();
            System.out.println("Поток:  " + Flow[i].getName() + "    запущен!");

        }
    }
}


