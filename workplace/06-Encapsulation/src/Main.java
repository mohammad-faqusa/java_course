public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Mohammad";
//        player.health = 12;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
////        without encapulation
//        player.health = 200; // it didn't call restoreHealth
//
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer mohammad = new EnhancedPlayer("mohammad" , 100 , "Ak-47");
        System.out.println("Initial health is " + mohammad.healthRemaining());
    }
}