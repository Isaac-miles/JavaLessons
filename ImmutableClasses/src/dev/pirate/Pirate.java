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

    int value(String name){
        return gameData.get(name);
    }

    private void setValue(String name, int value){
        gameData.put(name, value);
    }
    private void adjustValue(String name, int adj){
        gameData.compute(name,(k,v)-> v  += adj);
    }
    private void adjusthealth(int adj){
        int health = value("health");
        health +=adj;
        health = (health < 0) ? 0:((health > 100)? 100 : health);
        setValue("health", health);
    }
    boolean useWeapon(){
        System.out.println("Used the "+ currentWeapon);
        return false;
    }


    @Override
    public String name() {
        return name;
    }
}
