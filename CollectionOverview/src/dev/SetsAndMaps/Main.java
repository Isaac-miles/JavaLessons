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

        //the union of two sets is addAll
        Set<Contact> unionAB = new HashSet<>(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("(A∪ B) union of emails (A) with phones (B)", unionAB);

        //the intersect of sets is retainAll
        Set<Contact> intersectAB = new HashSet<>(emailContacts);
        intersectAB.retainAll(phoneContacts);
        printData("(A∩ B) union of emails (A) with phones (B)",intersectAB);

        Set<Contact> intersectBA = new HashSet<>(phoneContacts);
        intersectBA.retainAll(emailContacts);
        printData("(B∩ A) union of emails (B) with phones (A)",intersectBA);

        Set<Contact> AminusB = new HashSet<>(emailContacts);
        AminusB.removeAll(phoneContacts);
        printData("(A- B) emails (A) - phones (B)",AminusB);

        Set<Contact> BminusA = new HashSet<>(phoneContacts);
        AminusB.removeAll(emailContacts);
        printData("(B- A) phones (B) - emails (A)",BminusA);

        Set<Contact> symetricDiff = new HashSet<>(AminusB);
        symetricDiff.addAll(BminusA);
        printData("Symmetric Difference: phones and emails", symetricDiff);
    }
    public static void printData(String header, Collection<Contact> contacts){
        System.out.println("-".repeat(35));
        System.out.println(header);
        System.out.println("-".repeat(35));
        contacts.forEach(System.out::println);
    }
}
