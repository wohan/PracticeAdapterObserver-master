package com.company;

class TM extends Thread{

    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("Прошло   секунд");
        }catch(InterruptedException e){}

    }


}


class TM2 extends Thread{

    public void run()    {
                System.out.println("Прошло ЕЩЕ 5 секунд");
    }

}


public class Main {


    public static void main(String[] args)

        throws InterruptedException {

        TM tm1 = new TM();
        TM2 tm2 = new TM2();



        int i = 0;
        int j = 0;

        while (true) {

            tm1.start();
            tm2.start();

            if (j==5){
                        j=0;
            }

            i++;
            j++;}
        }

        }



