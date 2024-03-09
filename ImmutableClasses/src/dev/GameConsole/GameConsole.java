package dev.GameConsole;

import java.util.Scanner;

public class GameConsole<T extends Game<? extends Player>> {
    private final T game;
    private static final Scanner scanner = new Scanner(System.in);
    public GameConsole(T game){
        this.game = game;
    }
    public int addPlayer(){
        System.out.println("Enter your playing na,e: ");
        String name  = scanner.nextLine();

        System.out.printf("Welcome to %s, %s!%n".formatted(game.getGameName(),name));
        return game.addPlayer(name);
    }
    public void playGame(int playerIndex){
        boolean done = false;
        while (!done){
            var gameActions = game.getGameActions(playerIndex);
        }
    }
}
