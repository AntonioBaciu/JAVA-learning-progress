package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        // Challenge //

        // #1st way
//        int  score2 = 10000;
//        int levelCompleted2 = 8;
//        int bonus2 = 200;
//
//        if(gameOver){
//            int finalScore = score2 + (levelCompleted2 * bonus2);
//            System.out.println("Your final score was " + finalScore);
//        }

        // duplication ( not a good practice )
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
