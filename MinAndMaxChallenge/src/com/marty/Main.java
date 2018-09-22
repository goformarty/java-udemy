package com.marty;


//        -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//        -Before the user enters the number, print the message ÅgEnter number:Åh
//        -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//        Hint:
//        -Use an endless while loop.
//
//        Bonus:
//        -Create a project with the name MinAndMaxInputChallenge.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        while(true) {
            System.out.println("Enter your number");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int currentNum = scanner.nextInt();
                if(currentNum < min) {
                    min = currentNum;
                }
                if(currentNum > max) {
                    max = currentNum;
                }
            }

            else {
                System.out.println("Your min is: " + min + " and your max is: " + max);
                break;
            }
        }

        scanner.close();
    }


}
