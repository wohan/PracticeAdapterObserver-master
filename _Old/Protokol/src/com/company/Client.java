package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * Created by admin on 17.04.2017.
 */
public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5555);
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()));

            bufferedWriter.write("Hello from client!");
            bufferedWriter.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
