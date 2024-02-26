package dev.adventureMapChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myLocations = """
                lake,at the edge of Lake Zico,E:ocean,W:forest,S:golf stream,N:market
                ocean,on Zico's lake before a red sea,W:beach
                cave,at the mouth of Zico's bath cave,E:ocean.W:forest,S:lake
                """;

        AdventureGame game = new AdventureGame(myLocations);
        game.play("lake");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String direction = scanner.nextLine().trim().toUpperCase().substring(0,1);
            if(direction.equals("Q")) break;
            game.move(direction);
        }
    }
}
