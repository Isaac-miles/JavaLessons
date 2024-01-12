public class CompositionProduct {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int dept;

    public CompositionProduct(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends CompositionProduct{

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }
}

class MotherBoard extends CompositionProduct{

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }
}
class ComputerCase extends CompositionProduct{

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
}