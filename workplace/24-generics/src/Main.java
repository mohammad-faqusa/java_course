//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BaseBallPlayer player1 = new BaseBallPlayer("John", 23);
        BaseBallPlayer player2 = new BaseBallPlayer("Jane", 22);

        BaseBallTeam team1 = new BaseBallTeam("New York Yankees");
        team1.addTeamMember(player1);
        team1.addTeamMember(player2);
        team1.listTeamMembers();
        System.out.println("Team ranking: " + team1.ranking());
    }
}