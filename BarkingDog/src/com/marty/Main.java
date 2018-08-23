package com.marty;

public class Main {

    public static void main(String[] args) {
        bark(true, 15);
    }

    public static boolean bark(boolean isBarking, int hourOfTheDay) {

        if (isBarking && isHourValid(hourOfTheDay)) return true;
        return false;
    }

    public static boolean isHourValid(int hour) {
        if (isRangeValid(hour) && isNightTime(hour)) return true;
        return false;
    }


    public static boolean isRangeValid(int hour) {
        if (hour >= 0 && hour < 24) return true;
        return false;
    }

    public static boolean isNightTime(int hour) {
        if (hour < 8 || hour > 22) return true;
        return false;
    }
}
