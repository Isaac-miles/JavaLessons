package dev.SetsAndMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        List<Contact> emails =  ContactData.getData("email");
        List<Contact> phones =  ContactData.getData("phone");

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
//        fullList.forEach(System.out::println);
        System.out.println("--------------------------------------");

        Map<String, Contact> contacts = new HashMap<>();

        for(Contact contact:fullList){
            contacts.put(contact.getName(),contact);
        }
        contacts.forEach((k,v)-> System.out.println("key= "+k+", value= "+v));
        System.out.println("--------------------------------------");
        System.out.println(contacts.get("Isaac All"));

        System.out.println(contacts.get("Miles All"));

        Contact defaultContact = new Contact("Miles All");
        System.out.println(contacts.getOrDefault("Miles All",defaultContact));

        System.out.println("--------------------------------------");
        contacts.clear();
        for(Contact contact:fullList){
            Contact duplicate = contacts.put(contact.getName(),contact);
            if(duplicate !=null){
//                System.out.println("duplicate = "+duplicate);
//                System.out.println("current = "+ contact);
                contacts.put(contact.getName(),contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k,v)-> System.out.println("key= "+k+", value= "+v));

        System.out.println("----------------------------------------------");
        contacts.clear();
        for(Contact contact:fullList){
            contacts.putIfAbsent(contact.getName(),contact);
        }
        contacts.forEach((k,v)-> System.out.println("key= "+k+", value= "+v));

        System.out.println("----------------------------------------------");
        contacts.clear();
        for(Contact contact:fullList){
           Contact duplicate = contacts.putIfAbsent(contact.getName(),contact);
           if(duplicate != null){
               contacts.put(contact.getName(),contact.mergeContactData(duplicate));
           }
        }
        contacts.forEach((k,v)-> System.out.println("key= "+k+", value= "+v));

        System.out.println("-------------------------------------------------");
        contacts.clear();
        fullList.forEach(contact -> contacts.merge(contact.getName(),contact,
                (prev, curr)->{
                    Contact merged = prev.mergeContactData(curr);
                    System.out.println("merged: "+ merged);
                    return merged;
                }
                ));
        contacts.forEach((k,v)-> System.out.println("key= "+k+", value= "+v));

    }
}
