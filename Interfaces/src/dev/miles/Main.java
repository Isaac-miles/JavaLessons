package dev.miles;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Lagos Ikeja Mall",UsageType.ENTERTAINMENT));
        mappables.add(new Building("Aso rock",UsageType.GOVERNMENT));
        mappables.add(new Building("Tesling Balogun Stadium",UsageType.SPORTS));
    }
}
