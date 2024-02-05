package dev.challenge;

import java.util.Arrays;

public interface Mappable {
    void render();
    static double[] stringToLocation(String location){
        var splits = location.split(",");
        double lat = Double.parseDouble(splits[0]);
        double lng = Double.parseDouble(splits[1]);
        return new double[]{lat,lng};
    }
}

abstract class Point implements Mappable{
    private double[] location = new double[2];

    @Override
    public void render() {

    }
    private String location(){
        return Arrays.toString(location);
    }
}