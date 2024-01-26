package dev.zico;

import java.util.LinkedList;
import java.util.Scanner;

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

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quiteLoop = false;
        boolean forward = true;

//        printMenus();
        while (!quiteLoop){
            if(!iterator.hasPrevious()){
                System.out.println("Originating : "+iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()){
                System.out.println("final : "+iterator.previous());
                forward = false;
            }

            System.out.println("Enter value");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch (menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    if(!forward){ //reversing direction
                        forward = true;
                        if(iterator.hasNext()){
                            iterator.next(); //adjust  position forward
                        }
                    }
                    if (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backward");
                    if(forward){ //reversing direction
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous(); //adjust  position forward
                        }
                    }
                    if (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    printMenus();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                default:
                    quiteLoop = true;
                    break;
            }
        }

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
    private static void printMenus(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist places
                (M)enu
                (Q)uit """);
    }
}
