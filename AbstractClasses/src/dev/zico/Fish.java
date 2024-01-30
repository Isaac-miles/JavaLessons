package dev.zico;

public  class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(type + " lazily swimming");
        }else {
            System.out.println(type +  " dart frantically");
        }
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
