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

        int index = emails.indexOf(new Contact("Helen Jones"));

        Contact imade = emails.get(index);
        imade.addEmail("30bg Music");
        imade.addEmail("30bg Music");
        imade.replaceEmailIfExists("HJones@30bgmusic.com","HJones@30bgmusic.org");
        System.out.println(imade);

        Set<Contact> unionAB = new HashSet<>(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("(A∪ B) union of emails (A) with phones (B)", unionAB);

    }
    public static void printData(String header, Collection<Contact> contacts){
        System.out.println("-".repeat(35));
        System.out.println(header);
        System.out.println("-".repeat(35));
        contacts.forEach(System.out::println);
    }
}
