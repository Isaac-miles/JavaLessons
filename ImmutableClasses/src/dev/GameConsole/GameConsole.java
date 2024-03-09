package dev.GameConsole;

import java.util.Scanner;

public class GameConsole<T extends Game<? extends Player>> {
    private final T game;
    private static final Scanner scanner = new Scanner(System.in);
    public GameConsole(T game){
        this.game = game;
    }
}
