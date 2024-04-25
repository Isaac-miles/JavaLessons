package dev.streamIntermediate;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        IntStream.iterate((int) 'A', i -> i <= (int) 'z', i-> i+1)
                .filter(Character::isAlphabetic)
                .dropWhile(i-> Character.toUpperCase(i) <= 'E')
//                .skip(5)
//                .filter(i->Character.toUpperCase(i)>'E')
                .forEach(d-> System.out.printf("%c ",d));
    }
}
