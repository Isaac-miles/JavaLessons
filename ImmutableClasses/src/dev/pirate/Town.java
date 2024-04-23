package dev.pirate;

import java.util.Collections;
import java.util.List;

public record Town(String name, String island, int level,
                   List<Loot> loot,
                   List<Feature> features,
                   List<Combatant> opponents) {
    private <T> List<T> randomReduced(List<T> list, int size){

        Collections.shuffle(list);
        return list.subList(0,size);
    }

}
