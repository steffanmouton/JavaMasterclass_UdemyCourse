package net.blacksheepworks;

public class Main
{

    public static void main(String[] args)
    {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // Commenting out for posterity, we are now using an int return method
        /*CalculateScore(gameOver, score, levelCompleted, bonus);


        // CHALLENGE:
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

        CalculateScore(gameOver, score, levelCompleted, bonus);*/

        int highScore = CalculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        // CHALLENGE:
        // Create a method called displayHighScorePosition
        // it should receive a player's name as a parameter, and a 2nd param as a position in the high score table
        // You should display the player's name along with a message like "Managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a second method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is >1000
        // 2 if the score is > 500 and < 1000
        // 3 if the score is > 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, and 50

        displayHighScorePosition("Steffan", calculateHighScorePosition(1500));
        displayHighScorePosition("Ross", calculateHighScorePosition(900));
        displayHighScorePosition("Emily", calculateHighScorePosition(400));
        displayHighScorePosition("Camille", calculateHighScorePosition(50));



    }

    public static int CalculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if (gameOver)
        {
            int finalScore = score + levelCompleted * bonus;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position)
    {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore)
    {
        // Commented for posterity. Will reimplement without using multiple return statements.
        /*if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500){
            return 2;
        }
        else if (playerScore >= 100){
            return 3;
        }

        return 4;*/

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        }
        else if (playerScore >= 500){
            position = 2;
        }
        else if (playerScore >= 100){
            position = 3;
        }

        return position;

    }



}

