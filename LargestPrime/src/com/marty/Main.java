package com.marty;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(31));
        System.out.println(getLargestPrime(3));
        System.out.println(getLargestPrime(17));
        System.out.println(getLargestPrime(22));
    }

    private static int getLargestPrime(int num) {

        int largestPrime = num;

        while (!(isPrime(largestPrime) && (num % largestPrime == 0))) {
            largestPrime -= 1;
        }
        return largestPrime;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
