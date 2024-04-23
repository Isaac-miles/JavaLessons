package dev.pirate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

public record Town(String name, String island, int level,
                   List<Loot> loot,
                   List<Feature> features,
                   List<Combatant> opponents) {
    public Town{
        loot = randomReduced(new ArrayList<>(EnumSet.allOf(Loot.class)),level+2);
        features = randomReduced(new ArrayList<>(EnumSet.allOf(Feature.class)),level+3);

        opponents = new ArrayList<>();
        if(level ==0){
            opponents.add(new Islander("Joe", Weapon.KNIFE));
        }else {
            opponents.add(new Islander("Joe",Weapon.MACHETE));
            opponents.add(new Islander("John",Weapon.PISTOL));

        }
    }
    private <T> List<T> randomReduced(List<T> list, int size){

        Collections.shuffle(list);
        return list.subList(0,size);
    }

}
