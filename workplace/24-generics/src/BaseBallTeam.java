import java.util.ArrayList;
import java.util.List;

record BaseBallPlayer(String name, int age) {
}

public class BaseBallTeam {

    private String name;
    private List<BaseBallPlayer> teamMembers;
    private int totalWins;
    private int totalLoses;
    private int totalTries;

    public BaseBallTeam(String name) {
        this.name = name;
        teamMembers = new ArrayList<BaseBallPlayer>();
    }

    public void addTeamMember(BaseBallPlayer player) {
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
