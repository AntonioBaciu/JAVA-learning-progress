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

        System.out.println(happyHoops.numPlayers());
    }
}
