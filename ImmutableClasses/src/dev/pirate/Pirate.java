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
        gameData = new HashMap<>(Map.of());
    }


    @Override
    public String name() {
        return name;
    }
}
