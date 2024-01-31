package dev.abstractChallenge;

import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> storeProducts =new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new ArtObject("NFT", 150,"An epic art of wonders"));
        storeProducts.add(new ArtObject("Nature painting", 170,"Nature at it's best"));

    }
}
