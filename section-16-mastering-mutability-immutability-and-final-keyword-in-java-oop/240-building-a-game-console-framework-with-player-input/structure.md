# From Tiny Console Game → Clean OOP Framework (Step‑by‑Step)

This guide walks you from a **single‑file, procedural** console game to a **reusable, OOP game framework** with `Player`, `GameAction`, an abstract `Game<T>`, and a `GameConsole` runner. Each step compiles and runs.

> Theme: a very small **Guess 1–5** game so we can focus on structure.

---

## Step 0 — One file, no OOP (just make it work)

**Goal:** Smallest possible program. All logic lives in `main`.

**Package:** `dev.lpa.step0`

```java
package dev.lpa.step0;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();

        int target = 1 + rnd.nextInt(5);
        boolean quit = false;

        while (!quit) {
            System.out.println("[G] Guess 1–5  |  [Q] Quit");
            System.out.print("> ");
            String line = sc.nextLine().trim().toUpperCase();
            if (line.isEmpty()) continue;
            char key = line.charAt(0);

            switch (key) {
                case 'G' -> {
                    System.out.print("Your guess: ");
                    String g = sc.nextLine().trim();
                    try {
                        int val = Integer.parseInt(g);
                        if (val == target) {
                            System.out.println("🎉 Correct, " + name + "!");
                            quit = true;
                        } else {
                            System.out.println("Nope, try again.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Not a number.");
                    }
                }
                case 'Q' -> {
                    System.out.println("Bye, " + name + "!");
                    quit = true;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
```

**What you learn:** input loop, branching, early working version.

---

## Step 1 — Introduce a Player type

**Goal:** Move the name and per‑player state out of `main`.

**Package:** `dev.lpa.step1`

```java
package dev.lpa.step1;

public interface Player { String name(); }
```

```java
package dev.lpa.step1;

public class GuessPlayer implements Player {
    private final String name;
    private boolean won;
    public GuessPlayer(String name) { this.name = name; }
    public String name() { return name; }
    public boolean won() { return won; }
    public void setWon(boolean w) { this.won = w; }
    public String toString() { return "Player{" + name + ", won=" + won + '}'; }
}
```

```java
package dev.lpa.step1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Enter your name: ");
        GuessPlayer p = new GuessPlayer(sc.nextLine().trim());
        int target = 1 + rnd.nextInt(5);

        boolean quit = false;
        while (!quit) {
            System.out.println("[I] Info  |  [G] Guess  |  [Q] Quit");
            System.out.print("> ");
            char key = sc.nextLine().trim().toUpperCase().charAt(0);
            switch (key) {
                case 'I' -> System.out.println(p);
                case 'G' -> {
                    System.out.print("Your guess: ");
                    try {
                        int g = Integer.parseInt(sc.nextLine().trim());
                        if (g == target) { p.setWon(true); System.out.println("🎉 Correct!"); quit = true; }
                        else System.out.println("Nope.");
                    } catch (NumberFormatException e) { System.out.println("Not a number."); }
                }
                case 'Q' -> { System.out.println("Bye, " + p.name()); quit = true; }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
```

**What you learn:** a minimal domain interface (`Player`) and simple state container.

---

## Step 2 — Extract GameAction to remove switch‑case

**Goal:** Represent a menu item as data: key + prompt + function.

**Package:** `dev.lpa.step2`

```java
package dev.lpa.step2;

import java.util.function.IntPredicate; // action(playerIndex) -> boolean quit

public record GameAction(char key, String prompt, IntPredicate action) {}
```

```java
package dev.lpa.step2;

public interface Player { String name(); }
```

```java
package dev.lpa.step2;

public class GuessPlayer implements Player {
    private final String name; private boolean won; private int target;
    public GuessPlayer(String name, int target) { this.name = name; this.target = target; }
    public String name() { return name; }
    public boolean won() { return won; } public void setWon(boolean w) { this.won = w; }
    public int target() { return target; } public void setTarget(int t) { this.target = t; }
    public String toString() { return "Player{" + name + ", won=" + won + ", target=?}"; }
}
```

```java
package dev.lpa.step2;

import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rnd = new Random();
    private static GuessPlayer p;

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        p = new GuessPlayer(sc.nextLine().trim(), 1 + rnd.nextInt(5));

        Map<Character, GameAction> menu = new LinkedHashMap<>();
        menu.put('I', new GameAction('I', "Print Player Info", i -> { System.out.println(p); return false; }));
        menu.put('G', new GameAction('G', "Guess 1–5", i -> guess()));
        menu.put('R', new GameAction('R', "Reset Secret", i -> { p.setTarget(1 + rnd.nextInt(5)); p.setWon(false); System.out.println("Reset."); return false; }));
        menu.put('Q', new GameAction('Q', "Quit", i -> { System.out.println("Bye, " + p.name()); return true; }));

        boolean quit = false;
        while (!quit) {
            System.out.println("\nChoose:");
            for (GameAction a : menu.values()) System.out.printf("[%c] %s%n", a.key(), a.prompt());
            System.out.print("> ");
            char key = sc.nextLine().trim().toUpperCase().charAt(0);
            GameAction chosen = menu.get(key);
            if (chosen == null) { System.out.println("Invalid."); continue; }
            quit = chosen.action().test(0);
        }
        System.out.println("Thanks for playing!");
    }

    private static boolean guess() {
        System.out.print("Your guess: ");
        try {
            int g = Integer.parseInt(sc.nextLine().trim());
            if (g == p.target()) { p.setWon(true); System.out.println("🎉 Correct!"); return true; }
            System.out.println("Nope.");
        } catch (NumberFormatException e) { System.out.println("Not a number."); }
        return false;
    }
}
```

**What you learn:** the **menu becomes data**, no big switch needed.

---

## Step 3 — Abstract `Game<T extends Player>`

**Goal:** Separate **game state/logic** from the app runner; provide **standard actions** and extension points.

**Package:** `dev.lpa.step3`

```java
package dev.lpa.step3;

public interface Player { String name(); }
```

```java
package dev.lpa.step3;

import java.util.function.IntPredicate;
public record GameAction(char key, String prompt, IntPredicate action) {}
```

```java
package dev.lpa.step3;

import java.util.*;

public abstract class Game<T extends Player> {
    private final String gameName;
    private final List<T> players = new ArrayList<>();
    private Map<Character, GameAction> standardActions;
    protected final Scanner scanner;

    protected Game(String gameName, Scanner scanner) {
        this.gameName = gameName; this.scanner = scanner;
    }
    public String getGameName() { return gameName; }

    public abstract T createNewPlayer(String name);
    public abstract Map<Character, GameAction> getGameActions(int playerIndex);

    public final int addPlayer(String name) {
        T p = createNewPlayer(name);
        if (p != null) { players.add(p); return players.size() - 1; }
        return -1;
    }
    protected final T getPlayer(int i) { return players.get(i); }

    public Map<Character, GameAction> getStandardActions() {
        if (standardActions == null) {
            standardActions = new LinkedHashMap<>();
            standardActions.put('I', new GameAction('I', "Print Player Info", this::printPlayer));
            standardActions.put('Q', new GameAction('Q', "Quit", this::quitGame));
        }
        return standardActions;
    }

    public boolean executeGameAction(int playerIndex, GameAction action) {
        return action.action().test(playerIndex);
    }

    public boolean printPlayer(int i) { System.out.println(getPlayer(i)); return false; }
    public boolean quitGame(int i) { System.out.println("Goodbye, " + getPlayer(i).name()); return true; }
}
```

```java
package dev.lpa.step3;

public class GuessPlayer implements Player {
    private final String name; private boolean won; private int target;
    public GuessPlayer(String name, int target) { this.name = name; this.target = target; }
    public String name() { return name; }
    public boolean won() { return won; } public void setWon(boolean w) { this.won = w; }
    public int target() { return target; } public void setTarget(int t) { this.target = t; }
    public String toString() { return "Player{" + name + ", won=" + won + '}'; }
}
```

```java
package dev.lpa.step3;

import java.util.*;

public class GuessGame extends Game<GuessPlayer> {
    private final Random rnd = new Random();
    public GuessGame(String name, Scanner sc) { super(name, sc); }

    @Override public GuessPlayer createNewPlayer(String name) {
        return new GuessPlayer(name, 1 + rnd.nextInt(5));
    }

    @Override public Map<Character, GameAction> getGameActions(int i) {
        var map = new LinkedHashMap<Character, GameAction>();
        map.put('G', new GameAction('G', "Guess 1–5", idx -> {
            var p = getPlayer(idx);
            System.out.print("Your guess: ");
            try {
                int g = Integer.parseInt(scanner.nextLine().trim());
                if (g == p.target()) { p.setWon(true); System.out.println("🎉 Correct!"); return true; }
                System.out.println("Nope.");
            } catch (NumberFormatException e) { System.out.println("Not a number."); }
            return false;
        }));
        map.put('R', new GameAction('R', "Reset Secret", idx -> { var p = getPlayer(idx); p.setTarget(1 + rnd.nextInt(5)); p.setWon(false); System.out.println("Reset."); return false; }));
        return map;
    }
}
```

```java
package dev.lpa.step3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game<GuessPlayer> game = new GuessGame("Guess 1–5", sc);

        System.out.print("Enter your name: ");
        int player = game.addPlayer(sc.nextLine().trim());
        if (player < 0) { System.out.println("Could not create player"); return; }

        boolean quit = false;
        while (!quit) {
            Map<Character, GameAction> menu = new LinkedHashMap<>();
            menu.putAll(game.getStandardActions());
            menu.putAll(game.getGameActions(player));

            System.out.println("\nChoose:");
            for (GameAction a : menu.values()) System.out.printf("[%c] %s%n", a.key(), a.prompt());
            System.out.print("> ");
            String in = sc.nextLine().trim().toUpperCase();
            if (in.isEmpty()) continue;
            GameAction chosen = menu.get(in.charAt(0));
            if (chosen == null) { System.out.println("Invalid."); continue; }
            quit = game.executeGameAction(player, chosen);
        }
        System.out.println("Thanks for playing!");
    }
}
```

**What you learn:** the framework’s core responsibilities and extension points.

---

## Step 4 — Extract `GameConsole` (runner) and polish

**Goal:** A reusable console runner that can run **any** `Game<T>` implementation.

**Package:** `dev.lpa.step4`

```java
package dev.lpa.step4;

public interface Player { String name(); }
```

```java
package dev.lpa.step4;

import java.util.function.IntPredicate;
public record GameAction(char key, String prompt, IntPredicate action) {}
```

```java
package dev.lpa.step4;

import java.util.*;

public abstract class Game<T extends Player> {
    private final String gameName; private final List<T> players = new ArrayList<>();
    private Map<Character, GameAction> standardActions; protected final Scanner scanner;

    protected Game(String gameName, Scanner scanner) { this.gameName = gameName; this.scanner = scanner; }
    public String getGameName() { return gameName; }

    public abstract T createNewPlayer(String name);
    public abstract Map<Character, GameAction> getGameActions(int playerIndex);

    public final int addPlayer(String name) { T p = createNewPlayer(name); if (p!=null){players.add(p); return players.size()-1;} return -1; }
    protected final T getPlayer(int i){ return players.get(i); }

    public Map<Character, GameAction> getStandardActions(){
        if (standardActions==null){
            standardActions = new LinkedHashMap<>();
            standardActions.put('I', new GameAction('I', "Print Player Info", this::printPlayer));
            standardActions.put('Q', new GameAction('Q', "Quit Game", this::quitGame));
        }
        return standardActions;
    }

    public boolean executeGameAction(int i, GameAction a){ return a.action().test(i); }
    public boolean printPlayer(int i){ System.out.println(getPlayer(i)); return false; }
    public boolean quitGame(int i){ System.out.println("Sorry to see you go, "+getPlayer(i).name()); return true; }
}
```

```java
package dev.lpa.step4;

public class GuessPlayer implements Player {
    private final String name; private boolean won; private int target;
    public GuessPlayer(String name, int target){ this.name=name; this.target=target; }
    public String name(){ return name; }
    public boolean won(){ return won; } public void setWon(boolean w){ this.won=w; }
    public int target(){ return target; } public void setTarget(int t){ this.target=t; }
    public String toString(){ return "Player{"+name+", won="+won+'}'; }
}
```

```java
package dev.lpa.step4;

import java.util.*;

public class GuessGame extends Game<GuessPlayer> {
    private final Random rnd = new Random();
    public GuessGame(String name, Scanner sc){ super(name, sc); }

    @Override public GuessPlayer createNewPlayer(String name){ return new GuessPlayer(name, 1 + rnd.nextInt(5)); }

    @Override public Map<Character, GameAction> getGameActions(int i){
        var map = new LinkedHashMap<Character, GameAction>();
        map.put('G', new GameAction('G', "Guess 1–5", idx -> {
            var p = getPlayer(idx);
            System.out.print("Your guess: ");
            try {
                int g = Integer.parseInt(scanner.nextLine().trim());
                if (g == p.target()) { p.setWon(true); System.out.println("🎉 Correct!"); return true; }
                System.out.println("Nope.");
            } catch (NumberFormatException e){ System.out.println("Not a number."); }
            return false;
        }));
        map.put('R', new GameAction('R', "Reset Secret", idx -> { var p = getPlayer(idx); p.setTarget(1 + rnd.nextInt(5)); p.setWon(false); System.out.println("Reset."); return false; }));
        return map;
    }
}
```

```java
package dev.lpa.step4;

import java.util.*;

public class GameConsole {
    private final Scanner scanner = new Scanner(System.in);

    public <T extends Player> void run(Game<T> game){
        System.out.println("== " + game.getGameName() + " ==");
        System.out.print("Enter your name: ");
        int player = game.addPlayer(scanner.nextLine().trim());
        if (player < 0) { System.out.println("Could not create player."); return; }

        boolean quit = false;
        while(!quit){
            Map<Character, GameAction> menu = new LinkedHashMap<>();
            menu.putAll(game.getStandardActions());
            menu.putAll(game.getGameActions(player));

            System.out.println("\nChoose an option:");
            for (GameAction a : menu.values()) System.out.printf("[%c] %s%n", a.key(), a.prompt());
            System.out.print("> ");

            String in = scanner.nextLine().trim().toUpperCase(Locale.ROOT);
            if (in.isEmpty()) continue;
            GameAction chosen = menu.get(in.charAt(0));
            if (chosen == null) { System.out.println("Invalid option."); continue; }
            quit = game.executeGameAction(player, chosen);
        }
        System.out.println("Thanks for playing!");
    }

    public static void main(String[] args){
        GameConsole console = new GameConsole();
        console.run(new GuessGame("Guess 1–5", console.scanner));
    }
}
```

**What you learn:** a **reusable runner** and fully decoupled game logic.

---

## Where to go next

* **Multiple players / turns:** store current index; add `nextTurn()` standard action.
* **Validation & UX:** guard empty input, show last result line, etc.
* **Testing:** inject `Scanner` from a `String` for deterministic tests.
* **New games:** create another `Game<T>` (e.g., Rock–Paper–Scissors) without touching the console.
