package com.company;

import java.io.*;

public class Main {

    public static void readFile() {
        File file = new File("input.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            System.out.println(reader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    Throwable

    public static void readWithTry() {
        File file = new File("input.txt");
        //BufferedReader reader = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("Ok!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readMyFile() {
        try (MyFile file = new MyFile()) {
            file.doSum();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readMyFile();
    }
}
