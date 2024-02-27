package dev.StoreInventoryChalleng;

import java.time.LocalDate;
import java.util.Map;

public class Cart {
    enum CartType{PHYSICAL,VIRTUAL};
    private static int lastId = 1;
    private int id;
    private LocalDate cartDate;
    private CartType type;
    private Map<String, Integer> products;

    public Cart(CartType type,int days) {
        this.type = type;
        id = lastId++;
        cartDate = LocalDate.now().minusDays(days);
    }

    public Cart(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDate getCartDate() {
        return cartDate;
    }
    public void addItem(InventoryItem item,int qty){
        products.merge(item.getProduct().sku(),qty, Integer::sum);

        if(!item.reservedItem(qty)){
            System.out.println("Something went wrong, could not add item");
        }
    }
    public void removeItem(InventoryItem item, int qty){
        int current = products.get(item.getProduct().sku());
        if(current<=qty){
            qty = current;
            products.remove(item.getProduct().sku());
            System.out.printf("Item [%s] removed from basket%n",item.getProduct().name());
        }
        item.releaseItem(qty);
    }
}
