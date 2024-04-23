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
    }
    private <T> List<T> randomReduced(List<T> list, int size){

        Collections.shuffle(list);
        return list.subList(0,size);
    }

}
