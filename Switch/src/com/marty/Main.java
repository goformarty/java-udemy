package com.marty;

// Create a new switch statement using char instead of int
// create a new char variable
// create a switch statement testing for
// A, B, C, D, or E
// display a message if any of these are found and then break
// Add a default which displays a message saying not found

public class Main {

    public static void main(String[] args) {
        char switchValue = 'A';

        switch(switchValue){
            case 'A':
                System.out.println("A is for an apple");
                break;

            case 'B':
                System.out.println("B is for a banana");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("I've found a C, D or E");
                break;

            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
