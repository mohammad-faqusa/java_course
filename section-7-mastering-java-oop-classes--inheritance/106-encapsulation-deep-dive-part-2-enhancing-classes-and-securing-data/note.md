## 106. Encapsulation Deep Dive, Part 2: Enhancing Classes and Securing Data

### The problems when classes aren't properly encapsulated 
* bypass checks and operations 
* interdependency or coupling betweeen the calling code and the class
  * the Main code is responsible for defining the internal variables 

### The process 
1. in the previous project, create new class `EnahacedPlyaer`

```java
public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    // create constructor with three parameters 
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health <= 0) {
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }

        this.weapon = weapon;
    }
    
    public EnhancedPlayer(String name) {
        this(name, 100, "Sword"); 
    }
    
    // copy the methdos defined in player class ;

    public void loseHealth(int damage) {

        health = health - damage;
        if(health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health += extraHealth;
        if(health > 100){
            System.out.println("Player restored to 100%");
            health  = 100 ;
        }
    }
}

```
2. write on Main class : 
```java
public class Main {

    public static void main(String[] args) {

        EnhancedPlayer mohammad = new EnhancedPlayer("mohammad" , 100 , "Ak-47");
        System.out.println("Initial health is " + mohammad.healthRemaining());
    }
}
```

#### lets check some problems : 
1. change the player name field
   * refactor the name in the same class, 
   * in EnhancedPlayer, this won't affect other classes 


#### Benefits of Encapsulation 
* changes may do not affect other code 
* can't bypass data 

#### Staying in Control 
* to protect from external access 
* no direct access 

#### Encapsulation principles 
* create constructors for object initialization , which enforces that only objects with valid data will get created 
* use the private access modifier 
* use setter methods sparingly and only as needed 
* use access modifiers that aren't private, only for the methods that the calling code need to use 

