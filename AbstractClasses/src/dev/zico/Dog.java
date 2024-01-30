package dev.zico;

public  class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(type + " Running");
        }else {
            System.out.println(type +  " running");
        }
    }

    @Override
    public void makeNoise() {
        if(type.equalsIgnoreCase("wolf")){
            System.out.print("Howling");
        }else {
            System.out.print("woof!");
        }
    }

}
