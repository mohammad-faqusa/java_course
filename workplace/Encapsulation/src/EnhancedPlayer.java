public class EnhancedPlayer {

    private String fullName;
    private int health;
    private String weapon;
    private int healthPercintage;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100 , "Sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if(health < 0 ) {
            this.health = 0;
        } else if (health > 100 ) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        health -= damage;;
        if(health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health += extraHealth;
        if(health > 100) {
            System.out.println("Player resotred to 100%");
            health = 100;
        }
    }


}
