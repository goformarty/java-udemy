package com.marty;

public class Main {

    public static void main(String[] args) {
        // width of char = 16 (2 bytes)
        char myChar = 'M';
        char myUnicodeChar = '\u00A9';
        char uniRegistered = '\u00AE';
        System.out.println("my char is " + myChar);
        System.out.println("my unicode is " + myUnicodeChar);
        System.out.println("registered sign is " + uniRegistered);
    }
}
