package academy.learnprogramming;

import java.util.ArrayList;

public class Team {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    // list of team members
    private ArrayList<Player> teamMembers = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Method that adds a player to the team
    // The type Player is used since we first need to create a specific player using the
    // BaseballPlayer class, Football class, etc.
    // So, as long as the player is created using the constructors of the classes above,
    // we will be able to add the player to the team using only reference name
    public boolean addPlayer(Player player) {
        // Ensures there can't be two identical players added to the same team
        if (teamMembers.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {  // if the player name is unique, it will be added to the team
            teamMembers.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    // Returns the number of players in the team
    public int numPlayers() {
        return this.teamMembers.size();
    }

    //
    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }

        played++; // increases the number of games played after every match

        //????
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    // returns the ranking score of the team
    public int ranking() {
        return (won * 2) + tied; // one ranking score formula
    }

}
