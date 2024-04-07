package dev.GameConsole;

public class Main {
    public static void main(String[] args) {
        var console = new GameConsole<>(new ShooterGame("The Shootout Game"));
        int playerIndex = console.addPlayer();
        console.playGame(playerIndex);
//        GameConsole con = new GameConsole<>(new ShooterGame("the wounded game"));
    }
}
