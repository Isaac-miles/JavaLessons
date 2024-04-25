package dev.streamsChallenge;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    static int counter = 0;

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

        seed +=15;
        var streamG = Stream.of("G46","G47","G48","G49","G50","G51");

        seed +=15;
        int rSeed = seed;

        var streamO = Stream.generate(Main::getCounter)
                        .limit(15)
                                .map(i->"o"+(rSeed +i));
        var streamBI = Stream.concat(streamB,streamI);
        var streamGN = Stream.concat(streamG,streamN);
        var stringBING = Stream.concat(streamBI,streamGN);
        Stream.concat(stringBING,streamO).forEach(System.out::println);
//        streamO.forEach(System.out::println);

        System.out.println("-------------------------------");
        Stream.generate(()->new Random().nextInt(rSeed,rSeed+15))
                .distinct()
                .limit(15)
                .map(i->"o"+i)
                .sorted()
                .forEach(System.out::println);
    }
    private static int getCounter(){
        return counter++;
    }
}
