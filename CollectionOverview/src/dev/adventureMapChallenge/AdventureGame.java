package dev.adventureMapChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AdventureGame {
    private static final String GAME_LOCATIONS = """
            road, at the end of the road, w: hill, E:well house, S:valley,N: forest
            hill, on top of hill with a view in all directions,N: forest, E: road
            well house, inside a well house for a small spring,W: road, N: lake, S: stream
            valley, in a forest valley beside a tumbling stream,N: road, W:hill,E:strea
            forest, at the edge of a thick dark forest,S: road,E: lake
            lake, by an alpine lake surrounded by wildflowers, W: forest, S:well house
            stream, near a stream with a rocky bed,W:valley, N:well house
            """;
    private enum Compass{
        E,N,S,W;
        private static final String[] directions = {"East","North","South","West"};
        public String getString(){
            return directions[this.ordinal()];
        }
    }
    private record Location(String description, Map<Compass, String> nextPlaces){}
    private String lastPlace;
    private  Map<String,Location> addventureMap = new HashMap<>();
    public AdventureGame(){}

    public AdventureGame(String customLocation) {
        this.lastPlace = lastPlace;
    }
    private void loadLocations(String data){
        for(String s: data.split("\\R")){
            String[] parts = s.split(",",3);
            Arrays.asList(parts).replaceAll(String::trim);

        }
    }
}
