package dev.zico;

public class Main {
    public static void main(String[] args) {
    Dog dog = new Dog("wolf","big",100);
    dog.makeNoise();

    doAnimalStuffs(dog);
    }
    private static void doAnimalStuffs(Animal animal){
        animal.makeNoise();
        animal.move("fast");
    }
}