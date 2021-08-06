package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Create 3 different players
        FootballPlayer milo = new FootballPlayer("Milo");
        BaseballPlayer garry = new BaseballPlayer("Garry");
        SoccerPlayer codi = new SoccerPlayer("Codi");

        // Create the team & add the players to it
        Team happyHoops = new Team("Happy Hoops");
        happyHoops.addPlayer(milo);
        happyHoops.addPlayer(garry);
        happyHoops.addPlayer(codi);
        happyHoops.numPlayers();

        // Enemy players
        FootballPlayer opponent1 = new FootballPlayer("Opponent1");
        FootballPlayer opponent2 = new FootballPlayer("Opponent2");
        FootballPlayer opponent3 = new FootballPlayer("Opponent3");

        // Enemy team
        Team sadHoops = new Team("Sad Hoops");
        sadHoops.addPlayer(opponent1);
        sadHoops.addPlayer(opponent2);
        sadHoops.addPlayer(opponent3);
        sadHoops.numPlayers();

        // Set the match results
        happyHoops.matchResult(sadHoops, 10, 5);

        // Display the rank of each team
        happyHoops.ranking();
        sadHoops.ranking();
    }
}
