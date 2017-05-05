package com.company;

import Library.models.Reader;

public class Main {



    public static void main(String[] args) {
	// write your code here
        Library library =new Library();
        Reader jonh = new Reader("Jonh","Connor","Androidovicn",123233);
        Reader sara = new Reader("Sara", "Connor","Human",56456465 );
        library.buyBook("Intro in Java","Shild","554546dsf",5,2017);
        library.buyBook();
        library.takeBook("John", );
    }
}
