package dev.SetsAndMaps;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> emails =  ContactData.getData("email");
        List<Contact> phones =  ContactData.getData("phone");

    }
    public static void printData(String header, Collection<Contact> contacts){
        System.out.println("-".repeat(30));
        System.out.println(header);
        System.out.println("-".repeat(30));
        contacts.forEach(System.out::println);
    }
}
