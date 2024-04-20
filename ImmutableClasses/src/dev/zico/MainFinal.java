package dev.zico;

import dev.GameConsole.Game;
import dev.GameConsole.GameConsole;
import dev.GameConsole.Player;

class SpecialGameConsole<T extends Game<? extends Player>> extends GameConsole<Game<? extends Player>> {

    public SpecialGameConsole(Game<? extends Player> game) {
        super(game);
    }
}

public class MainFinal {
    public static void main(String[] args) {

    }
}
