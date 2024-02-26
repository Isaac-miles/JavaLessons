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

        keysView.retainAll(List.of("Livi Stingy","Charlse Okocha","Robbin Hood", "Junior Dash"));
        System.out.println(keysView);
        contacts.forEach((k,v)-> System.out.println(v));

        keysView.clear();
        System.out.println(contacts);

        ContactData.getData("email").forEach(contact -> contacts.put(contact.getName(),contact));
        ContactData.getData("phone").forEach(contact -> contacts.put(contact.getName(),contact));
        System.out.println(keysView);

        var values = contacts.values();
        values.forEach(System.out::println);

        values.retainAll(ContactData.getData("email"));
        System.out.println(keysView);
        contacts.forEach((k,v)-> System.out.println(v));

        System.out.println("-".repeat(25));
        List<Contact> list = new ArrayList<>(values);
        list.sort(Comparator.comparing(Contact::getNameLastFirst));
        list.forEach(c-> System.out.println(c.getNameLastFirst()+ ": "+c));

        System.out.println("-".repeat(25));
        Contact first = list.get(0);
        contacts.put(first.getNameLastFirst(),first);
        values.forEach(System.out::println);
        keysView.forEach(System.out::println);

        HashSet<Contact> set = new HashSet<>(values);
        set.forEach(System.out::println);
        if(set.size()<contacts.keySet().size()){
            System.out.println("Duplicate values are in my Map");
        }
        var nodSet = contacts.entrySet();
        for(var node:nodSet){
            System.out.println(nodSet.getClass().getName());
            if(!node.getKey().equals(node.getValue().getName())){
                System.out.println(nodSet.getClass().getName());

                System.out.println("Key doesn't match name: "+node.getKey()+": "+node.getValue());
            }
        }
    }
}
