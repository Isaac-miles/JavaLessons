package dev.zico;

public  class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

    }

    @Override
    public void makeNoise() {
        if(type.equalsIgnoreCase("wolf")){
            System.out.println("Howling");
        }else {
            System.out.println("woof!");
        }
    }
    private static void doAnimalStuffs(Animal animal){
        animal.makeNoise();
        animal.move("fast");
    }
}
