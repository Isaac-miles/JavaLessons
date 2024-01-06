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

    public void setMake(String make){
        if(make==null) make = "unknown";
        String maker = make.toLowerCase();
        switch (maker){
            case "toyota","honda","tesla" -> this.make = make;
            default -> {
                this.make = "unsupported make";
            }
        }
//        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(door + "-Door "+
                color+" "+
                make+" "+
                model+" "+
                (convertible? "Convertible":""));
    }

}
