package dev.abstractChallenge;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product){}
public class Store {
    private static ArrayList<ProductForSale> storeProducts =new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new ArtObject("NFT", 150,"An epic art of wonders"));
        storeProducts.add(new ArtObject("Nature painting", 170,"Nature at it's best"));

        storeProducts.add(new Furniture("Iroko",200,"Strong African wood"));
        storeProducts.add(new Furniture("Guava",120, "The fruit wood"));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,0,2);
        addItemToOrder(order1,1,1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2,2,4);
        addItemToOrder(order2,3,3);
        addItemToOrder(order2,0,5);

        printOrder(order2);
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
