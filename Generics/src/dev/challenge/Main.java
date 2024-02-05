package dev.challenge;

public class Main {
    public static void main(String[] args) {
        var nationalNGParks = new Part[]{
                new Part("Yankari","22.1442, -204.45213"),
                new Part("Abia reserves", "332.4762, -101.9848"),
                new Part("Elegushi","28.4245, -023.23424")
        };
        Layer<Part> parkLayer = new Layer<>(nationalNGParks);
        parkLayer.renderLayer();
    }
}
