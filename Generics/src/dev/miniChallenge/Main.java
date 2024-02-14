package dev.miniChallenge;

public class Main {
    public static void main(String[] args) {
        var nationalNGParks = new Park[]{
                new Park("Yankari","22.1442, -204.45213"),
                new Park("Abia reserves", "332.4762, -101.9848"),
                new Park("Elegushi","28.4245, -023.23424")
        };
        Layer<Park> parkLayer = new Layer<>(nationalNGParks);
        parkLayer.renderLayer();

        var majorNGRivers = new River[]{
                new River("Niger","10.204, -92.201","33.12, -87.212", "13.203, -22.2923"),
                new River("Benue","10.204, -92.201","33.12, -87.212", "13.203, -22.2923"),
        };
        Layer<River> riverLayer= new Layer<>(majorNGRivers);
        riverLayer.addElements(new River("Port","10.204, -92.201","33.12, -87.212", "13.203, -22.2923"));
        riverLayer.renderLayer();
    }
}
