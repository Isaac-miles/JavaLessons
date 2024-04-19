package dev.pirate;

import dev.GameConsole.Game;
import dev.GameConsole.GameAction;

import java.util.Map;

public class PirateGame extends Game<Pirate> {
    @Override
    public Pirate createNewPlayer(String name) {
        return null;
    }

    @Override
    public Map<Character, GameAction> getGameActions(int playerIndex) {
        return null;
    }
}
