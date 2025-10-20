## 240. Building a Game Console Framework with Player Input

#### the game 
1. game console, scanner code
   * collect user name 
   * create player 
2. display menu for options 

#### gmae console 
* is the container for the game 
* should have sanner field , `System.in`
* impelemet two methods 
  * `addPlayer`
  * `playGame` : display all options , then call action of the input 

#### game action record 
1. three fields 
   * char field 
   * prompt 
   * lambda expression (Predicate)

#### Player Interface 
* have method resturn String 

#### the GameClass 
* abstract and generic 
* three fields 
  * game name 
  * list of players 
  * map 
* two abstract methods 
  * createNewPlayer 
  * getGameAcitons 

* concrete methods 
  * addPlayer
  * executeGameAction
  * printPlayer 
  * getter and helper methods 

* create simple game 

#### the process 
1. create Main class 
2. crete dev.lpa.game.Player 
```java
public interface Player {
    String name(); 
}
```
3. create GameAction recrod lpa.game.GameAction 
```java
public record GameAction(char key, String prompt, Predicate<Integer> action) {
}
```
4. in the same package, create Game class

```java
import java.util.LinkedHashMap;

public abstract class Game<T extends Player> {

    private final Stirng gameName;
    private final List<T> players = new ArrayList<>();
    private Map<Character, GameAction> standardActions = null;

    public Game(String gameName) {
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }

    public Map<Character, GameAction> getStandardActions() {
        if (standardActions == null) {
            standardActions = new LinkedHashMap<>(Map.of(
                    'I', 
                    new GameAction('I', "Print Player Info", 
                            i -> this.printPlayer(i)),
                    new GameAction('Q', "Quit Game", 
                            this::quitGame)
            ));
        }

        return standardActions;
    }

    public abstract T craeteNewPlayer();

    public abstract Map<Character, GameAction> getGameActions(int playerIndex);

    final int addPlayer(String name) {
        T player = craeteNewPlayer(name);
        if(player != null ) {
            players.add(player); 
            return players.size() -1 ; 
            
        }
        return -1;
    }
    
    protected final T getPlayer(int playerIndex) {
        return players.get(playerIndex); 
    }
    
    public boolean executeGameAction(int player, GameAction action) {
        return action.action().test(player); 
    }
    
    public boolean printPlayer(int playerIndex) {
        Player player = players.get(playerIndex);
        System.out.println(player); 
        return false; 
        
    }
    
    public boolean quitGame() {
        Player player = players.get(playerIndex);
        System.out.println("Sorry to see you go," + player.name());
        return true; 
    }
}

```