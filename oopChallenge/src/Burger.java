public class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    @Override
    public String getName() {
        return super.getName()+ " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice()+ ((extra1==null? 0:extra1.getAdjustedPrice()));
    }
}
