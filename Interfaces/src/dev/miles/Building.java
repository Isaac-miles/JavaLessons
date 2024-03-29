package dev.miles;

public class Building implements Mappable{
    private String name;
    private  UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name+" ("+usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
      return switch (usage){
          case ENTERTAINMENT -> Color.GREEN+ " "+PointMarker.TRIANGLE;
          case GOVERNMENT -> Color.RED+ " "+ PointMarker.STAR;
          case RESIDENTIAL -> Color.BLUE+" "+PointMarker.PUSH_PIN;
          case SPORTS -> Color.ORANGE+" "+PointMarker.CIRCLE;
          default -> Color.BLACK+" "+PointMarker.CIRCLE;
       };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON()+ """
                ,"name": "%s", "usage": "%s"\s""".formatted(name,usage);
    }
}

enum UsageType {ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}