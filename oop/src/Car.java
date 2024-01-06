public class Car {
    private String make;
    private String model;
    private String color;
    private int door;
    private boolean convertible;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoor() {
        return door;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar(){
        System.out.println(door + "-Door "+
                color+" "+
                make+" "+
                model+" "+
                (convertible? "Convertible":""));
    }

}
