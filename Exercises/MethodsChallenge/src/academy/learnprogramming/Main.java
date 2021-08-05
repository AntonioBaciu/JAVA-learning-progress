package academy.learnprogramming;

// Solution
public class Main {

    public static void main(String[] args) {
        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Player1", highScore);

        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("Player2", highScore);

        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Player3", highScore);

        highScore = calculateHighScorePosition(50);
        displayHighScorePosition("Player4", highScore);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

//    public static int calculateHighScorePosition(int score) {
//        if(score >= 1000) {
//            return 1;
//        } else if(score >= 500){
//            return 2;
//        } else if(score >= 100){
//            return 3;
//        }
//
//        return 4;
//    }

// Alternative Solution ( eliminates multiple return statements )

    public static int calculateHighScorePosition(int score) {
        int position = 4; // assuming position 4 will be returned

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }

}

