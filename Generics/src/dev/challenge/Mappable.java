package dev.challenge;

public interface Mappable {
    void render();
    static double[] stringToLocation(String location){
        var splits = location.split(",");
        double lat = Double.parseDouble(splits[0]);
        double lng = Double.parseDouble(splits[1]);
        return new double[]{lat,lng};
    }
}
