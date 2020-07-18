package net.blacksheepworks;

public class Main
{

    public static void main(String[] args)
    {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000)
        {
            System.out.println("YOur score was " + score + ".");

        }

        if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        // Challenge:
        // Print out a second score on the screen with the following:
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        // === Implementation 1 ===

        // Set variables to new vals, then run if check and print
        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        // === Implementation 2 ===

        // Reset variables to original vals
        score = 800;
        levelCompleted = 5;
        bonus = 100;

        if (gameOver)
        {

        }

    }

    public static void CalculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if (gameOver)
        {
            int finalScore = score + levelCompleted * bonus;
            System.out.println("Your final score was " + finalScore);
        }
    }

}

