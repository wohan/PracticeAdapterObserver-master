package com.company;
import com.company.resources.TextRunner;


import java.util.*;


public class Main {


    public static void main(String[] args) {


        Map<String, Integer> frequencyWords = new HashMap<String, Integer>();


        String[] fileWay = {"C:\\Users\\admin\\IdeaProjects\\_Old\\textcalc\\1.txt", "C:\\Users\\admin\\IdeaProjects\\_Old\\textcalc\\2.txt",
               "C:\\Users\\admin\\IdeaProjects\\_Old\\textcalc\\3.txt", "C:\\Users\\admin\\IdeaProjects\\_Old\\textcalc\\4.txt"};

       // String[] fileWay = {"C:\\Users\\admin\\IdeaProjects\\textcalc\\tt.txt"};
              //  ,"C:\\Users\\admin\\IdeaProjects\\textcalc\\tt1.txt","C:\\Users\\admin\\IdeaProjects\\textcalc\\tt2.txt"};


        int quantityThread;
        quantityThread = fileWay.length;

        Scanner scanner = new Scanner(System.in);
        scanner.next();

        TextRunner[] Flow;
        Flow = new TextRunner[quantityThread];

        for (int i = 0; i < quantityThread; i++) {

            Flow[i] = new TextRunner(fileWay[i], frequencyWords);
            Flow[i].start();
            System.out.println("Поток:  " + Flow[i].getName() + "    запущен!");

        }
        scanner.next();
        scanner.close();
    }


}


