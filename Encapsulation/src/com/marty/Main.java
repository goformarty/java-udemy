package com.marty;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player();
	    player.name = "Marty";
	    // player.health = 20;
	    player.weapon = "claws";
		System.out.println("Remaining health = " + player.healthRemaining());

		player.loseHealth(10);
		System.out.println("Remaining health = " + player.healthRemaining());

		EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Super Marty", 50, "Sword");
		System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}
