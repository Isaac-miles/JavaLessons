package dev.GameConsole;

import dev.pritate.Weapon;

public class Main {
    public static void main(String[] args) {
//        var console = new GameConsole<>(new ShooterGame("The Shootout Game"));
//        int playerIndex = console.addPlayer();
//        console.playGame(playerIndex);

        Weapon weapon = Weapon.getWeaponByChar('P');
        System.out.println("Weapon = "+ weapon + ", hitPoints=" + weapon.getHitPoints()+ ", minLevel="+weapon.getMinLevel());

    }
}
