package com.marty;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 5, 10, 2, 4, 1, 32, "short silky");
        dog.eat();
    }
}
