package com.marty;

public class Main {

    public static void main(String[] args) {
        getDurationString(64,30);
        getDurationString(3600);
    }
    public static String getDurationString(int minutes, int seconds) {
        if (!isMinValueValid(minutes) || !isMinValueValid(seconds) || !isMaxValueValid(seconds)) {
            System.out.println("Invalid value");
            return "Invalid value";
        }

        int hours = minutes / 60;
        minutes %= 60;

        String fullHours = convertToDoubleDigits(hours);
        String fullMinutes = convertToDoubleDigits(minutes);
        String fullSeconds = convertToDoubleDigits(seconds);

        String durationMessage = fullHours + "h " + fullMinutes + "min " + fullSeconds+ "s";
        System.out.println(durationMessage);
        return durationMessage;

    }

    public static String getDurationString(int seconds) {
        if (!isMinValueValid(seconds)) {
            System.out.println("Invalid value");
            return "Invalid value";
        }

        int minutes = seconds / 60;
        seconds %= 60;

        String durationMessage = getDurationString(minutes, seconds);
        return durationMessage;
    }

    private static String convertToDoubleDigits(int num) {
        if(num < 10) {
            return "0" + Integer.toString(num);
        }
        return Integer.toString(num);
    }

    private static boolean isMinValueValid(int val) {
        return (val < 0) ? false : true;
    }
    private static boolean isMaxValueValid(int val) {
        return (val > 59) ? false : true;
    }
}
