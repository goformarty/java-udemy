package com.marty;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(31));

        System.out.println(getLargestPrime(3));
        System.out.println(getLargestPrime(17));
        System.out.println(getLargestPrime(22));
        
        System.out.println(getLargestPrime2(8));
        System.out.println(getLargestPrime2(22));

    }
//    ***************************
//    SOLUTION 1
//    ***************************

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

//    ***************************
//    SOLUTION 2
//    ***************************

    private static int getLargestPrime2(int num) {

        if (num < 2) return -1;

        for (var i = 2; i < num; i++) {
            while (num % i == 0 && num != i) {
                num /= i;
            }
        }
        return num;
    }
}
