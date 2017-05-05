package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calc<Double> calc= new Calc<Double>();
        System.out.println(calc.sum(34.0,56.0));
        //Calc<String> calc1 = new Calc<String>();
        //calc.sum("43","23");
    }
    public static <T> void south(T a){
        System.out.println(a);
    }
    LinkedList a;
    //a.add();
}

