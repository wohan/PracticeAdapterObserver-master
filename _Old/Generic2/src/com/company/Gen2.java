package com.company;

/**
 * Created by wnb on 04.04.2017.
 */
public class Gen2<T> {
    T it;


    public Gen2(T mIt) {
        it = mIt;
    }


    public T getGen2() {
        return this.it;
    }

    public void showGen2() {
        System.out.println("Тип T: " + it.getClass().getName());
    }
}
