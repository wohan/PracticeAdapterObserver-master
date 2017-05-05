package com.company.resources;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Zykov Vladimir on 15.04.2017.
 */
public class StreamWords {

    public StreamWords(String fileWay) {
        this.fileWay = fileWay;
    }

    public void setFileWay(String fileWay) {
        this.fileWay = fileWay;
    }

    public BufferedReader getBufferedReader ()
            throws IOException {

        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;

        file= new File(fileWay);
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);

        return bufferedReader;

    }


    public String getLineWords (BufferedReader bufferedReader)
            throws IOException {

        return bufferedReader.readLine();
    }


    public String [] getWord (String lineWords){

        return lineWords.split(" ");
    }



    private String fileWay;
}
