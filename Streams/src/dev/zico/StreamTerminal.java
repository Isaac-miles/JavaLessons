package dev.zico;

import java.util.stream.IntStream;

public class StreamTerminal {
    public static void main(String[] args) {
        var result = IntStream.iterate(0, i -> i <=1000, i->i+3)
                .summaryStatistics();
        System.out.println("Result = "+result);
    }
}
