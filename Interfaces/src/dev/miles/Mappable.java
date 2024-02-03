package dev.miles;

public interface Mappable {
    String JSON_PROPERTY = """
            "properties": {%s}
            """;
    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON(){
        return """
                "type": "%s", "label": "%s", "marker": "%s"
                """.formatted(getShape(),getLabel(),getMarker());
    }
    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
    static void mapIt1(Mappable mappable){
        System.out.printf((JSON_PROPERTY) , mappable.toJSON());
    }
}

enum Geometry{LINE,POINT,POLYGON}
enum Color {BLACK,BLUE,GREEN,ORANGE,RED}
enum PointMarker{CIRCLE,PUSH_PIN,STAR,SQUARE,TRIANGLE}
enum LineMarker{DASHED,DOTTED,SOLID}