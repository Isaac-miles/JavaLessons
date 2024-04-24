package dev.zico.GameConsole;

import dev.pirate.Pirate;
import dev.pirate.PirateGame;
import dev.pirate.Town;
import dev.pirate.Weapon;

public class Main {
    public static void main(String[] args) {
//        var console = new GameConsole<>(new ShooterGame("The Shootout Game"));
//        int playerIndex = console.addPlayer();
//        console.playGame(playerIndex);

        Weapon weapon = Weapon.getWeaponByChar('P');
        System.out.println("Weapon = "+ weapon + ", hitPoints=" + weapon.getHitPoints()+ ", minLevel="+weapon.getMinLevel());

        var list  = Weapon.getWeaponsByLevel(1);
        list.forEach(System.out::println);

        Pirate tim = new Pirate("Tim");
        System.out.println(tim);

        PirateGame.getTowns(0).forEach(System.out::println);
        System.out.println("-".repeat(30));
        PirateGame.getTowns(1).forEach(System.out::println);

        Town bridgeTown = new Town("Bridgetown","Barbados",0);
        System.out.println(bridgeTown);
        System.out.println(bridgeTown.information());

//        var console = new GameConsole<>(new PirateGame("The Pirate Game"));
//        int playerIndex = console.addPlayer();
//        console.playGame(playerIndex);

    }
}
