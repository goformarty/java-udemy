package com.marty;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot yet";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Shark eats lot of people";
    }
}

class Independence extends Movie {
    public Independence() {
        super("Independence");
    }

    @Override
    public String plot() {
        return "aaaaliens";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Dark force";
    }
}

public class Main {

    public static void main(String[] args) {
	    randomMovie();
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number is " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new Independence();
            case 3:
                return new StarWars();
        }
        return null;
    }
}
