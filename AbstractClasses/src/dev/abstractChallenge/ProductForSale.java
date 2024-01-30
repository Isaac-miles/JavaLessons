package dev.abstractChallenge;

public  abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type,double price, String description){
        this.type = type;
        this.price = price;
        this.description = description;
    }



}
