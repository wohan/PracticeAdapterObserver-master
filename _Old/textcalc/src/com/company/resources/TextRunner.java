package com.company.resources;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zykov Vladimir on 15.04.2017.
 */

public class TextRunner extends Thread{

    private volatile static boolean jobAllThread = true;
    private String fileWay;
    private Map<String, Integer> frequencyWords = new HashMap<String, Integer>();


    public TextRunner(String fileWay, Map frequencyWords) {

        this.fileWay = fileWay;
        this.frequencyWords = frequencyWords;
    }


    @Override
    public void run() {
        StreamWords streamWords;
        BufferedReader bufferedReader;
        String lineWords;
        String [] wordList;
        ExcretionWord excretionWord;
        String regularExpressions;
        String regularExpressionsLatino;

        regularExpressions  = "(?U)[\\pP\\s0-9]";
        regularExpressionsLatino = "^[a-zA-Z]+$";
        streamWords = new StreamWords(fileWay);
        excretionWord = new ExcretionWord(regularExpressions);

        try {
            bufferedReader = streamWords.getBufferedReader();

            while (bufferedReader.ready() && jobAllThread) {

                lineWords = streamWords.getLineWords(bufferedReader);
                wordList = streamWords.getWord(lineWords);

                for (String word: wordList){

                    word = excretionWord.wordFromPattern(word);

                    if (word.length() > 0)
                        synchronized (frequencyWords) {
//                            jobAllThread = !(word.matches(regularExpressionsLatino));
//                            if(!jobAllThread) {
//                                System.out.println("Слово:  " + word + "    в потоке:  " +
//                                        Thread.currentThread().getName() + "    Останавливаем все потоки!" );
//                                break;
//                            }

                            if (frequencyWords.containsKey(word)) {
                                int frequency = frequencyWords.get(word);
                                frequencyWords.put(word, frequency + 1);

                                System.out.println("Слово:    " + word + "  повторяеться:  " + (frequency + 1)
                                        + "  раз  " + "    из  Потока:   " + Thread.currentThread().getName());
                            } else {
                                frequencyWords.put(word, 1);

                                System.out.println("Слово:    " + word + "  добавлено в список поток:   " + Thread.currentThread().getName());
                            }
                        }
                }

            }
        } catch(IOException e){
                e.printStackTrace();
        }

    }
}
