package com.marty;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot yet";
    }

    public String getName() {
        return name;
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
	    for (int i=1; i<7; i++) {
	        Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    ": "+ movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
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
