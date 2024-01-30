package dev.zico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Dog dog = new Dog("wolf","big",100);
    dog.makeNoise();

    doAnimalStuffs(dog);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German shepard","small",25));
        animals.add(new  Fish("Goldfish","big", 200));
        animals.add(new Fish("Titus","medium",150));
        animals.add((new Dog("Pug","small",10)));
        animals.add((new Horse("Royal","big",250)));

        for(Animal animal:animals){
            doAnimalStuffs(animal);
            if (animal instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }
    }
    private static void doAnimalStuffs(Animal animal){
        animal.makeNoise();
        animal.move("fast");
    }
}