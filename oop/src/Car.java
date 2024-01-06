public class Car {
    private String make;
    private String model;
    private String color;
    private int door;
    private boolean convertible;

    public void describeCar(){
        System.out.println(door + "-Door "+
                color+" "+
                make+" "+
                model+" "+
                (convertible? "Convertible":""));
    }

}
