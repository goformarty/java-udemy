package com.marty;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 5000, 5, 100);
        System.out.println("Your final score is " + highScore);

        highScore = calculateScore(true, 7000, 6, 80);
        System.out.println("Your final score is " + highScore);

        displayHighScorePosition("Max", calculateHighScorePosition(1500));
        displayHighScorePosition("Susan", calculateHighScorePosition(900));
        displayHighScorePosition("Ellen", calculateHighScorePosition(400));
        displayHighScorePosition("Raf", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int positionInTable) {
        System.out.println(playerName + " managed to get into position " + positionInTable);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore > 500) {
            return 2;
        } else if (playerScore > 100) {
            return 3;
        }
        return 4;
    }
}
