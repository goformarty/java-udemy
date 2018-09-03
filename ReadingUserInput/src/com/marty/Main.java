package com.marty;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {

        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character - enter

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int age = currentYear - yearOfBirth;

            if (age >= 0 && age <= 125) {
                System.out.println("your name is " + name + " and you're " + age + " years old.");
            } else {
                System.out.println("Invalid age");
            }

        } else {

            System.out.println("It's not a number");

        }
        
        scanner.close();
    }
}


