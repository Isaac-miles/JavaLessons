public class Inheritance {
    private String type;
    private String size;
    private double weight;

    public Inheritance(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Inheritance{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void move(String speed){
        System.out.println(type + " moves" + speed);
    }
    public void makeNoise(){
        System.out.println(type + " makes some kind of noise");
    }
}
