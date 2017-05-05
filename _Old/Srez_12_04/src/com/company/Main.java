package com.company;



public class Main {


    public static void main(String[] args) {

        //int [] mas ;
        //Integer mas [] = new Integer[100];
        Integer mas [] = new Integer[5];

        FlowNumders pot1 = new FlowNumders(1, mas);
        FlowNumders pot5 = new FlowNumders(0, mas);

        pot1.setPriority(5);
        pot5.setPriority(4);

        pot1.start();
        pot5.start();


    }




}
