package dev.pirate;

import dev.GameConsole.Game;
import dev.GameConsole.GameAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PirateGame extends Game<Pirate> {

    private static final List<List<String>> levelMap;

    //------------------------static initializer------
    static {
        levelMap = new ArrayList<>();
        System.out.println("loading data...");
        loadData();

        if(levelMap.size()==0){

        }
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
        return null;
    }
}
