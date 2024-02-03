package dev.miles;

public class UtilityLine implements Mappable {
    private String name;
    private UtilityType type;

    @Override
    public String getLabel() {
        return name+" ("+type+" )";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type){
            case ELECTRICAL -> Color.RED+ " "+LineMarker.DASHED;
            case FIBER_OPTIC -> Color.GREEN+ " "+LineMarker.DOTTED;
            case GAS -> Color.ORANGE+ " "+LineMarker.SOLID;
            case WATER -> Color.BLUE+ " "+LineMarker.SOLID;
            default -> Color.BLACK+" "+LineMarker.DASHED;
        };
    }
    @Override
    public String toJSON() {
        return Mappable.super.toJSON()+ """
                ,"name": "%s", "utility": "%s"\s""".formatted(name,type);
    }
}
enum UtilityType{ELECTRICAL,FIBER_OPTIC,GAS,WATER}