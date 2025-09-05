//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Player player1 = new BaseBallPlayer("John", 23);
        Player player2 = new FootBallPlayer("Jane", 22);
        Player player3 = new VollyVallPlayers("Jill", 21);

        Affeliation aff1 = new Affeliation("USA", "NBA", "US");

        Team<Player, Affeliation> team1 = new Team<>("New York Yankees", aff1);
        team1.addTeamMember(player1);
        team1.addTeamMember(player2);
        team1.addTeamMember(player3);
        team1.listTeamMembers();
        System.out.println("Team ranking: " + team1.ranking());


//        Team<String> team2 = new Team<>("London");
//        team2.addTeamMember("John");
//        team2.addTeamMember("Jane");
//        team2.listTeamMembers();
//        System.out.println("Team ranking: " + team2.ranking());
    }
}