package dev.challenge;

public class Main {
    public static void main(String[] args) {
        var nationalNGParks = new Park[]{
                new Park("Yankari","22.1442, -204.45213"),
                new Park("Abia reserves", "332.4762, -101.9848"),
                new Park("Elegushi","28.4245, -023.23424")
        };
        Layer<Park> parkLayer = new Layer<>(nationalNGParks);
        parkLayer.renderLayer();
    }
}
