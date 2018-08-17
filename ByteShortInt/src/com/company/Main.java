package com.company;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myIntVal = (myMinValue/2);
        System.out.println("My int val = " + myIntVal);

        // byte has a width of 8
        byte myMinByte = -128;
        byte myMaxByte = 127;
        byte myByteVal = (byte) (myMinByte/2);
        System.out.println("my byte val = " + myByteVal);

        // short has a width of 16
        short myMinShort = -32_768;
        short myMaxShort = 32_767;
        short myShortVal = (short) (myMinShort/2);

        // long has a width of 64
        long myLongVal = 100L;
        long myMinLong = -9_223_372_036_854_775_808L;
        long myMaxLong = 9_223_372_036_854_775_807L;
        long myLongExp = 5000L + 10L + (myByteVal + myIntVal + myShortVal);
        System.out.println("my long = " + myLongExp);
    }
}
