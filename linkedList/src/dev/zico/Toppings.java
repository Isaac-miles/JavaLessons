package dev.zico;

public enum Toppings {
    GREEN,
    PEREWINKO,
    BACON,
    TOMATOES;

    public double getPrice(){
        return switch (this){
            case BACON -> 1.5;
            case GREEN -> 2.0;
            case TOMATOES -> 2.5;
            case PEREWINKO -> 1.0;
            default -> 0.0;
        };
    }
}
