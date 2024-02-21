package dev.SetsAndMaps;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Contact> emails =  ContactData.getData("email");
        List<Contact> phones =  ContactData.getData("phone");
//        printData("Phone List", phones);
//        printData("Email list", emails);

        Set<Contact> emailContacts = new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phones);
        printData("Phone contacts",phoneContacts);
        printData("Email Contact", emailContacts);

        int index = emails.indexOf(new Contact("Nikky Jones"));

        Contact imade = emails.get(index);
        imade.addEmail("Hkm Music");
        System.out.println(imade);
    }
    public static void printData(String header, Collection<Contact> contacts){
        System.out.println("-".repeat(35));
        System.out.println(header);
        System.out.println("-".repeat(35));
        contacts.forEach(System.out::println);
    }
}
