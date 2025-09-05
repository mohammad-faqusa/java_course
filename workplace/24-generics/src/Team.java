import java.util.ArrayList;
import java.util.List;

interface Player {
    String name();
}

record FootBallPlayer(String name, int score) implements Player {}
record BaseBallPlayer(String name, int score) implements Player {}
record VollyVallPlayers(String name, int score) implements Player {}
record Affeliation(String name, String type, String countryCode) implements Player {
    @Override
    public String toString() {
        return "Affiliation: " + name + " " + type + " " + countryCode;
    }
}

public class Team<T extends Player, S > {

    private String name;
    private List<T> teamMembers;
    private int totalWins;
    private int totalLoses;
    private int totalTries;
    private S affiliation;

    public Team(String name) {
        this.name = name;
        teamMembers = new ArrayList<T>();

    }

    public Team(String name, S affiliation) {
        this.name = name;
        this.affiliation = affiliation;
        teamMembers = new ArrayList<T>();
    }

    public void addTeamMember(T player) {
        if(!teamMembers.contains(player)) {
            teamMembers.add(player);
        }

    }

    public void listTeamMembers() {
        System.out.print("Team: " + name + " ");
        System.out.println("Affiliation: " + affiliation);
        for (T t : teamMembers) {
            System.out.println(t.toString());
        }
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
