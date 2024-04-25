package dev.streamsChallenge;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int seed = 1;
        var streamB = Stream.iterate(seed,i-> i<=15,i-> i+1)
                .map(i->"B"+i);

        seed +=15;
        var streamI = Stream.iterate(seed,i->i+1)
                        .limit(15)
                                .map(i->"I"+i);

        seed+=15;
        String[] oLabels = new String[15];
        int finalSeed = seed;
        Arrays.setAll(oLabels, i->"N" +(finalSeed +i));
        var streamN =Arrays.stream(oLabels);

        streamN.forEach(System.out::println);
    }
}
