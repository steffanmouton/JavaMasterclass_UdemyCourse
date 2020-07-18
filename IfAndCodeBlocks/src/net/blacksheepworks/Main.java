package net.blacksheepworks;

public class Main
{

    public static void main(String[] args)
    {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        CalculateScore(gameOver, score, levelCompleted, bonus);


        // Challenge:
        // Print out a second score on the screen with the following:
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        // === Implementation 1 ===

        CalculateScore(gameOver, 10000, 8, 200);

        // === Implementation 2 ===

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        CalculateScore(gameOver, score, levelCompleted, bonus);

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

