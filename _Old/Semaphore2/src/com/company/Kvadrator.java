package com.company;

import static com.company.Summator.sumAllNumber;

/**
 * Created by admin on 16.04.2017.
 */
class Kvadrator extends Thread{

    public int masKvadrator;

    public Kvadrator(Integer masKvadrator) {

        this.masKvadrator = masKvadrator;
    }

    public void run(){

        masKvadrator=masKvadrator*masKvadrator;
        sumAllNumber(0,masKvadrator,0);
    }

}