package dev.SetsAndMaps;

import java.util.*;

public class TreeSetMain {
    public static void main(String[] args) {
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

//        NavigableSet<Contact> sorted = new TreeSet<>(phones);
        Comparator<Contact> mySort = Comparator.comparing(Contact::getName);
        NavigableSet<Contact> sorted = new TreeSet<>(mySort);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

        NavigableSet<String> justNames = new TreeSet<>();
        phones.forEach(contact -> justNames.add(contact.getName()));
        System.out.println(justNames);

        NavigableSet<Contact> fullset = new TreeSet<>(sorted);
        fullset.addAll(emails);
        fullset.forEach(System.out::println);

        List<Contact> fullList = new ArrayList<>(phones);
        fullset.addAll(emails);
        fullList.sort(sorted.comparator());
        System.out.println("---------------------------------");
        fullList.forEach(System.out::println);

        Contact min = Collections.min(fullset,fullset.comparator());
        Contact max = Collections.max(fullset,fullset.comparator());

        Contact first = fullset.first();
        Contact last = fullset.last();

        System.out.println("-----------------------------");
        System.out.printf("min = %s, first=%s %n",min.getName(),first.getName());
        System.out.printf("max = %s, last=%s %n",max.getName(),last.getName());
        System.out.println("------------------------------");

        NavigableSet<Contact> copiedSet = new TreeSet<>(fullset);
        System.out.println("First element = "+ copiedSet.pollFirst());
        System.out.println("Last element = "+ copiedSet.pollLast());
        copiedSet.forEach(System.out::println);
        System.out.println("-------------------------------");


    }
}
