package dev.pirate;

import dev.zico.GameConsole.Game;
import dev.zico.GameConsole.GameAction;

import java.util.*;

public class PirateGame extends Game<Pirate> {

    private static final List<List<Town>> levelMap;

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
        List<Weapon> weapons = Weapon.getWeaponsByLevel(pirate.value("level"));

        Map <Character, GameAction> map = new LinkedHashMap<>();
        for(Weapon weapon: weapons){
            char init = weapon.name().charAt(0);
            map.put(init, new GameAction(init,"Use "+ weapon, this::useWeapon));
        }
        map.putAll(getStandardActions());
        return map;
    }
    private static void loadData(){
        //level 1 towns
        levelMap.add(new ArrayList<Town>(List.of(
                new Town("Bridgetown","barbados",0),
                new Town("Fitts Village","Barbados",0 ),
                new Town("Holetown","Barbados",0)
        )));

        //level 2 towns
        levelMap.add(new ArrayList<Town>(List.of(
                new Town( "Fort-de-France", "Martinique", 1),
                new Town( "Saint-Anne", "Martinique",1),
                new Town("Le Vauclin", "Martinique",1)
        )));
    }
    public static List<Town> getTowns(int level){
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

    @Override
    public boolean printPlayer(int playerIndex) {
        System.out.println(getPlayer(playerIndex).information());
        return false;
    }
}
