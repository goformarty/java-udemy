package com.marty;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println(myString);

        myString = myString + ", and this is more.";
        System.out.println(myString);

        myString = myString + " \u00A9 2018";
        System.out.println(myString);

        String myNumString = "50.45";
        myNumString = myNumString + "49.55";
        System.out.println(myNumString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        
    }
}
