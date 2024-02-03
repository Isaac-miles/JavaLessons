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
                """;
    }
}
