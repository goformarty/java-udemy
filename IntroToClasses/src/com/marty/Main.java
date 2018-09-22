package com.marty;

public class Main {

    public static void main(String[] args) {
        Car porshe = new Car();

        System.out.println(porshe.getModel());

        porshe.setModel("911");

        System.out.println(porshe.getModel());

        porshe.setModel("Carrera");

        System.out.println(porshe.getModel());
    }
}
