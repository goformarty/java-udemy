package com.marty;

public class Main {

    public static void main(String[] args) {
        Car porshe = new Car();

        System.out.println(porshe.getModel());

        porshe.setModel("911");

        System.out.println(porshe.getModel());

        porshe.setModel("Carrera");

        System.out.println(porshe.getModel());

        BankAccount homeAccount = new BankAccount(1111, 300.00, "Marty Home Account", "marty@marty", "00-11-22-33");

        System.out.println("This is my account number " + homeAccount.getAccountNumber());
        System.out.println("And I started with £" + homeAccount.getBalance());
        System.out.println("I earned extra £150.00 so I had £" + homeAccount.depositFunds(150.00));
        System.out.println("But then I spent £200 in a shop, so now I have £" + homeAccount.withdrawFunds(200));
    }



}
