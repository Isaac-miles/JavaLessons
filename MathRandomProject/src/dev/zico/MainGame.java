package dev.zico;

import dev.zico.dice.DiceGame;
import dev.zico.game.GameConsole;

public class MainGame {
    public static void main(String[] args) {
//        List<Integer> currentDice = new ArrayList<>(
//                List.of(2,2,4,4,4));
//        for (ScoredItem s: ScoredItem.values()){
//            System.out.printf("Score for %s is %d %n",s,s.score(currentDice));
//        }

        var console = new GameConsole<>(new DiceGame("Dice Game"));
        console.playGame(console.addPlayer());
    }
}
