package com.marty;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(4, 7);
        calcFeetAndInchesToCentimeters(3);
    }
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }

        int feetIndex = 12;
        double inchIndex = 2.54d;

        inches = feet * feetIndex + inches;
        double centimeters = (double) (inches * inchIndex);

        System.out.println(centimeters);
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        }

        double inchIndex = 2.54d;
        double centimeters = (double) (inches * inchIndex);
        System.out.println(centimeters);
        return centimeters;
    }
}
