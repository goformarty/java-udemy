package com.marty;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myInt = 5/3;
        // width of float = 32 (4 bytes)
        float myFloat = 5f / 3f;
        // width of double = 64 (8 bytes)
        double myDouble = 5d / 3d;

        System.out.println("my int " + myInt);
        System.out.println("my float " + myFloat);
        System.out.println("my double " + myDouble);

        double poundsToKilos = 0.453_592_37d;
        double myPounds = 42.8d;
        double myKilograms = myPounds * poundsToKilos;
        System.out.println("my kilos is " + myKilograms);
    }
}
