package dev.pirate;

import dev.GameConsole.Game;
import dev.GameConsole.GameAction;

import java.util.*;

public class PirateGame extends Game<Pirate> {

    private static final List<List<String>> levelMap;

    //------------------------static initializer------
    static {
        levelMap = new ArrayList<>();
        System.out.println("loading data...");
        loadData();

        if(levelMap.size()==0){
            throw new RuntimeException("Could not load data, try later");
        }
        System.out.println("Finished loading data");
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
        Pirate pirate = getPlayer(playerIndex);
        System.out.println(pirate);
        Map <Character, GameAction> map = new LinkedHashMap<>();

        return map;
    }
    private static void loadData(){
        //level 1 towns
        levelMap.add(new ArrayList<>(List.of(
                "Bridgetown, barbados",
                "Fitts Village, Barbados",
                "Holetown, Barbados"
        )));

        //level 2 towns
        levelMap.add(new ArrayList<>(List.of(
                "Fort-de-France, Martinique",
                "Saint-Anne , Martinique",
                "Le Vauclin, Martinique"
        )));
    }
    public static List<String> getTowns(int level){
        if(level <= (levelMap.size() - 1)){
            return levelMap.get(level);
        }
        return null;
    }

    private boolean useWeapon(int playerIndex){
        return getPlayer(playerIndex).useWeapon();
    }

    @Override
    public boolean executeGameAction(int player, GameAction action) {
        getPlayer(player).setCurrentWeapon(Weapon.getWeaponByChar(action.key()));
        return super.executeGameAction(player, action);
    }
}
