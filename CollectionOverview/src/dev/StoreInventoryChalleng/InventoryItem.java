package dev.StoreInventoryChalleng;

public class InventoryItem {
    private Product product;
    private double price;
    private int qtyTotal;
    private int qtyReserve;
    private int qtyReorder;
    private int qtyLow;

    public InventoryItem(Product product, double price, int qtyTotal, int qtyReorder, int qtyLow) {
        this.product = product;
        this.price = price;
        this.qtyTotal = qtyTotal;
        this.qtyReorder = qtyTotal;
        this.qtyLow = qtyLow;
    }

    public Product getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }
    public boolean reservedItem(int qty){
        if((qtyTotal - qtyReserve) >= qty){
            qtyReserve +=qty;
            return true;
        }
        return false;
    }
    public void releaseItem(int qty){
        qtyReserve -=qty;
    }
    public boolean sellItem(int qty){
        if(qtyTotal >=qty){
            qtyTotal -=qty;
            qtyReserve -=qty;
            if(qtyTotal <= qtyLow){
                placeInventoryOrder();
            }
            return true;
        }
        return false;
    }
    private void placeInventoryOrder(){
        System.out.printf("Ordering qty %d : %s%n", qtyReorder,product);
    }

    @Override
    public String toString() {
        return "%s, $%.2f : [%04d,%2d]".formatted(product,price,qtyTotal,qtyReserve);
    }
}
