import java.util.ArrayList;
import java.util.List;

interface Player {

}

record FootBallPlayer(String name, int score) implements Player {}
record BaseBallPlayer(String name, int score) implements Player {}

public class Team<T> {

    private String name;
    private List<T> teamMembers;
    private int totalWins;
    private int totalLoses;
    private int totalTries;

    public Team(String name) {
        this.name = name;
        teamMembers = new ArrayList<T>();
    }

    public void addTeamMember(T player) {
        if(!teamMembers.contains(player)) {
            teamMembers.add(player);
        }

    }

    public void listTeamMembers() {
        System.out.println(teamMembers);
    }

    public int ranking() {
        return (totalLoses * 2) + totalTries;
    }

    String setScore(int ourScore, int theirScore) {
        if(ourScore > theirScore) {
            totalWins++;
        } else if(ourScore < theirScore) {
            totalLoses++;
        } else {
            totalTries++;
        }
        return "Score: " + ourScore + " - " + theirScore;
    }
}
