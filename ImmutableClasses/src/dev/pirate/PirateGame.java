package dev.pirate;

import dev.GameConsole.Game;
import dev.GameConsole.GameAction;

import java.util.Map;

public class PirateGame extends Game<Pirate> {
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
