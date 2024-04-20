package dev.zico;

import dev.GameConsole.Game;
import dev.GameConsole.GameConsole;
import dev.GameConsole.Player;
import dev.pirate.PirateGame;

  class SpecialGameConsole<T extends Game<? extends Player>> extends GameConsole<Game<? extends Player>> {

    public SpecialGameConsole(Game<? extends Player> game) {
        super(game);
    }
}

public class MainFinal {
    public static void main(String[] args) {
        SpecialGameConsole<PirateGame> game = new SpecialGameConsole<>(new PirateGame("Pirate Game"));

    }
}
