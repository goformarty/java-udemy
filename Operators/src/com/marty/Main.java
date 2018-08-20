package com.marty;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 is " + result);

        double myDouble = 20d;
        double mySecondDouble = 80d;
        double myNum = (20d + 80d) * 25d;
        double remainder = myNum % 40d;
        System.out.println("my remainder is " + remainder);

        if (remainder <= 20)
            System.out.println("Total was over the limit");


        int x = 5;
        int y = 10;

        System.out.println(++x);
        System.out.println(x++);
        System.out.println(--x);
        System.out.println(x--);
        System.out.println(x);


    }
}
