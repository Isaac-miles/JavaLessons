package dev.challenge;

public class Part extends Point{
    private String name;

    public Part(String name,String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name+ " National Park";
    }
}
