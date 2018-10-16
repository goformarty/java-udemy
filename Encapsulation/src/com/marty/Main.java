package com.marty;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player();
	    player.name = "Marty";
	    player.health = 20;
	    player.weapon = "claws";

	    player.loseHealth(10);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
