package com.company;


import java.util.Set;

class Cubator extends Thread {

    synchronized  int run (int a){
        return a*3;
    }
}

class  Kvadrator extends Thread {

    synchronized  int  run (int b){
        return b*2;
    }
}

class Prostator extends Thread {

    synchronized  int run (int c){
        return c;
    }
}

class Consumer{

    int Summator (int cub, int kvad,int prost){

        return cub+kvad+prost;
    }

    public static void main(String[] args){

        int [] a = {1,2,3,4,7};
        int [] b = {1,2,3,4};
        int [] c = {1,2,3};




    }}

