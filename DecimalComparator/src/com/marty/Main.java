package com.marty;

public class Main {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.175, -3.1758);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 = num1 * 1000;
        num2 = num2 * 1000;

        if ((int) num1 == (int) num2) {
            return true;
        }
        return false;
    }
}

