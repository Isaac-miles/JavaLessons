package dev.SetsAndMaps;

import java.util.*;

public class MapViewsMain {
    public static void main(String[] args) {
        Map<String, Contact> contacts = new HashMap<>();
        ContactData.getData("phone").forEach(contact -> contacts.put(contact.getName(), contact));
        ContactData.getData("email").forEach(contact -> contacts.put(contact.getName(), contact));

        Set<String> keysView = contacts.keySet();
        System.out.println(keysView);

        Set<String> copyOfKeys = new TreeSet<>(contacts.keySet());
        System.out.println(copyOfKeys);

        if(contacts.containsKey("Charles Okocha")){
            System.out.println("Charlse and I go together a long time ago");
        }

        keysView.remove("Imade David");
        System.out.println(keysView);
        contacts.forEach((k,v)-> System.out.println(v));

        copyOfKeys.remove("Livi Stingy");
        System.out.println(copyOfKeys);
        contacts.forEach((k,v)-> System.out.println(v));

        keysView.retainAll(List.of("Livi Stingy","Charlse Okocha","Robin Hood", "Mickey Mouse"));
        System.out.println(keysView);
        contacts.forEach((k,v)-> System.out.println(v));

    }
}
