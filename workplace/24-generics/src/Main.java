//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Player player1 = new BaseBallPlayer("John", 23);
        Player player2 = new FootBallPlayer("Jane", 22);

        Team<Player> team1 = new Team<>("New York Yankees");
        team1.addTeamMember(player1);
        team1.addTeamMember(player2);
        team1.listTeamMembers();
        System.out.println("Team ranking: " + team1.ranking());
    }
}