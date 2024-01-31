package dev.abstractChallenge;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product){}
public class Store {
    private static ArrayList<ProductForSale> storeProducts =new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new ArtObject("NFT", 150,"An epic art of wonders"));
        storeProducts.add(new ArtObject("Nature painting", 170,"Nature at it's best"));
        listProducts();
    }
    public static void listProducts(){
        for(var item:storeProducts){
            System.out.println("_".repeat(35));
            item.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty,storeProducts.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for(var item:order){
            item.product().printPricedItem(item.qty());
            salesTotal +=item.product().getSalesPrice(item.qty());

        }
        System.out.printf("Sales Total = NGN%6.2f", salesTotal);
    }
}
