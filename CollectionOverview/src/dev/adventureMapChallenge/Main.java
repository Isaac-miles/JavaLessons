package dev.adventureMapChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AdventureGame game = new AdventureGame();
        game.play("lake");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String direction = scanner.nextLine().trim().toUpperCase().substring(0,1);
        }
    }
}
