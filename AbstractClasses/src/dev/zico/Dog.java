package dev.zico;

public  class Dog extends Mammal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(getExplicitType() + " Running");
        }else {
            System.out.println(getExplicitType() +  " running");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType()+" shed hair all the time");
    }

    @Override
    public void makeNoise() {
        if(type.equalsIgnoreCase("wolf")){
            System.out.print(" Howling ");
        }else {
            System.out.print(" woof! ");
        }
    }

}
