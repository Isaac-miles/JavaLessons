package dev.miles;

public class BUILDING implements Mappable{
    private String name;
    private  UsageType usage;

    public BUILDING(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name+" ("+usage + " )";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return null;
    }
}

enum UsageType {ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}