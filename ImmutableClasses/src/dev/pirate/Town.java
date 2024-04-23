package dev.pirate;

import java.util.List;

public record Town(String name, String island, int level,
                   List<Loot> loot,
                   List<Feature> features,
                   List<Combatant> opponents) {

}
