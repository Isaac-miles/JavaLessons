package dev.GameConsole;

public record Shooter(String name)implements Player {
    boolean findPrize(){
        System.out.println("Prize found, score should be adjusted. ");
        return false;
    }
}
