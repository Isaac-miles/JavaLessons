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
}
