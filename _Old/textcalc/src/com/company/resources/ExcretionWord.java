package com.company.resources;

/**
 * Created by Zykov Vladimir on 15.04.2017.
 */
public class ExcretionWord {


    public ExcretionWord(String regularExpressions) {

        this.regularExpressions = regularExpressions;
    }


    public String wordFromPattern (String wordForExcretion, String regularExpressions) {

        String result;

        result = wordForExcretion.replaceAll(regularExpressions, "");

        return result;

    }

    public String wordFromPattern (String wordForExcretion) {
        return wordFromPattern (wordForExcretion, this.regularExpressions);
    }

    private String regularExpressions;

}
