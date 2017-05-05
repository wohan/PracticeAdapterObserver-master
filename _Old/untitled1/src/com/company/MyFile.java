package com.company;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by PoGo on 04.04.2017.
 */
public class MyFile implements AutoCloseable {

    public MyFile() throws FileNotFoundException {
        //throw new FileNotFoundException();
    }

    public void doSum() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    @Override
    public void close() throws IOException {
        System.out.println("i close file");
    }
}
