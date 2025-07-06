public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name  = "Mohammad";
//        player.health = 100;
//        player.weapon  = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healRemaining());
//        player.health = 200; // the is the disadvantage we get without encapsualtion
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healRemaining());


        EnhancedPlayer mohammad = new EnhancedPlayer("Mohammad", 200, "Sword");
        System.out.println("The initial health = "  + mohammad.healRemaining());
    }

}
