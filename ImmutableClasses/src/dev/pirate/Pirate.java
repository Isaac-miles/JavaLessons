package dev.pirate;

import dev.GameConsole.Player;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Pirate implements Player {
    private final String name;
    private final Map<String,Integer> gameData;
    private final List<String> townsVisited = new LinkedList<>();
    private Weapon currentWeapon;

    public Pirate(String name){
        this.name = name;
    }
    //---------------instance initializer
    {
        gameData = new HashMap<>(Map.of(
                "health",100,
                "score",0,
                "level",0,
                "townIndex",0
        ));
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

     void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    @Override
    public String name() {
        return name;
    }
}
