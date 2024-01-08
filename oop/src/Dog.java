public class Dog extends AnimalInheritance {
    private String earShape;
    private String tailShape;

    public Dog(String type, double weight){
        this(type, weight, "perky","straight");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight<15 ? "small":(weight<35?"medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public  void makeNoise(){
        if(type=="wolf"){
            System.out.println("Ow woooo!");
        }
        bark();
        System.out.println();
    }
    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tails");
        if(speed=="slow"){
            walk();
            wagtail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }
    private void bark(){
        System.out.println("wooof");
    }
    private void run(){
        System.out.println("running");
    }
    private void walk(){
        System.out.println("walking");
    }
    private void wagtail(){
        System.out.println("tail waging");
    }
}
