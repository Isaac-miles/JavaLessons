package dev.GameConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Game<T extends Player> {
    private final String gameName;
    private final List<T> players = new ArrayList<>();
    private Map<Character,GameAction> standardActions = null;

    public Game(String gameName) {
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }

    public Map<Character, GameAction> getStandardActions() {
        return standardActions;
    }
    public abstract T createNewPlayer(String name);

}
