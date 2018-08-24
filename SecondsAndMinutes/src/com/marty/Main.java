package com.marty;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(70,30));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(-20));
    }

    private static String getDurationString(int minutes, int seconds) {
        if (isMinValueInvalid(minutes) || isMinValueInvalid(seconds) || isMaxValueInvalid(seconds)) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        minutes %= 60;

        String fullHours = convertToDoubleDigits(hours);
        String fullMinutes = convertToDoubleDigits(minutes);
        String fullSeconds = convertToDoubleDigits(seconds);

        String durationMessage = fullHours + "h " + fullMinutes + "min " + fullSeconds+ "s";
        return durationMessage;

    }

    private static String getDurationString(int seconds) {
        if (isMinValueInvalid(seconds)) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        seconds %= 60;

        return getDurationString(minutes, seconds);
    }

    private static String convertToDoubleDigits(int num) {
        if(num < 10) {
            return "0" + Integer.toString(num);
        }
        return Integer.toString(num);
    }

    private static boolean isMinValueInvalid(int val) {
        return (val < 0) ? true : false;
    }
    private static boolean isMaxValueInvalid(int val) {
        return (val > 59) ? true : false;
    }
}
