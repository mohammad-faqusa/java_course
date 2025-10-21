package dev.lpa.pirate;

import dev.lpa.game.Game;
import dev.lpa.game.GameAction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PirateGame extends Game<Pirate> {

    private static final List<List<String>> levelMap;

    // ------------------------------------

    static {
        levelMap = new ArrayList<>();
        System.out.println("Loading data...");
        loadData();

        if(levelMap.size() == 0 ) {
            throw new RuntimeException("Could not load any data, try later");
        }
        System.out.println("Finished loading Data.");
    }

    // --------------------------------------

    private static void loadData() {
        // level 1 Towns
        levelMap.add(new ArrayList<>(List.of(
                "Bridge town, barabados",
                "Fits village, barabados",
                "HoleTown, barabados"
        )));

        // level 2
        levelMap.add(new ArrayList<>(List.of(
                "Fort de france, martenic",
                "siante , martenic",
                "le vacluine , martenic"
        )));

    }

    public static List<String> getTowns(int level) {
        if(level <= (levelMap.size()-1)) {
            return levelMap.get(level);
        }
        return null;
    }

    public PirateGame(String gameName) {
        super(gameName);
    }

    @Override
    public Pirate createNewPlayer(String name) {
        return new Pirate(name);
    }

    @Override
    public Map<Character, GameAction> getGameActions(int playerIndex) {
        Pirate player =  getPlayer(playerIndex);
        System.out.println(player);

        List<Weapon> weaponse = Weapon.getWeaponsByLevel(player.value("level"));

        Map<Character, GameAction> map = new HashMap<>();

        for(var w : weaponse) {
            char charinit = w.name().charAt(0);
            map.put(charinit, new GameAction(charinit, "Use " + w, this::useWeapon));
        }
        map.putAll(getStandardActions());
        return map;
    }

    private boolean useWeapon(int playerIndex) {
        return getPlayer(playerIndex).useWeapon();
    }

    @Override
    public boolean executeGameAction(int player, GameAction action) {
        getPlayer(player).setCurrentWeapon(Weapon.getWeaponByChar(action.key()));
        return super.executeGameAction(player, action);
    }
}
