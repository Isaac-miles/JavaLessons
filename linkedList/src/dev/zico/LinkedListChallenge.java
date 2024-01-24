package dev.zico;

import java.util.LinkedList;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class LinkedListChallenge {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place lagos = new Place("lagosBeach", 1022);
        addPlace(placesToVisit,lagos);
        addPlace(placesToVisit,new Place("plateau",970));
        addPlace(placesToVisit,new Place("abuja",900));
        addPlace(placesToVisit,new Place("Yobe",1023));
        placesToVisit.addFirst(new Place("Edo",0));



        System.out.println(placesToVisit);
    }
    private static void addPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("Duplicate: Place already exists "+place);
            return;
        }
        for(Place p :list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Duplicate found "+ place);
                return;
            }
        }
        int matchedIndex = 0;
        for(var listPlace:list){
            if(place.distance() < listPlace.distance()){
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }
}
