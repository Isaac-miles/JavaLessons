package dev.abstractChallenge;

public class ArtObject extends ProductForSale{
    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This "+ type + " is a beautiful reproduction");
        System.out.printf("The price of the piece is NGN%6.2f %n",price);
        System.out.println(description);
    }
}
