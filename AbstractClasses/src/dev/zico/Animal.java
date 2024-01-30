package dev.zico;

abstract class Mammal extends Animal{
//an abstract class that extends another abstract class has some flexibility, it can implement some all or none of its parent class
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType()+" ");
        System.out.println(speed.equals("slow")? "walking":"runs");
    }

//    @Override
//    public void makeNoise() {
//
//    }
    public abstract void shedHair();
}
public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    public abstract void move(String speed);
    public abstract void makeNoise();

    public final String getExplicitType(){
       return (getClass().getSimpleName() + " ("+ type+ " )");
    }


}
