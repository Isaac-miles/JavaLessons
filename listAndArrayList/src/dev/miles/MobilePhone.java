package dev.miles;

import java.util.ArrayList;

class Contact{
    private final String name;
    private final String phoneNumber;
    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        createContact(name,phoneNumber);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name.trim(),phoneNumber.trim());
    }
}

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact contact){
        int value = findContact(contact);
        return value >= 0;
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        int contactIndex = findContact(oldContact);
        if(contactIndex>=0){
            System.out.println("contact exists and updated");
            myContacts.set(contactIndex,newContact);
            return true;
        }else return false;
    }
    public boolean removeContact(Contact contact){
        int findContact = findContact(contact);
        if(findContact>=0){
            myContacts.remove(contact);
            System.out.println("contact removed successfully");
            return true;
        }else return false;
    }
//    private int findContact(String contactName){
//
//        for(Contact contact:myContact){
//
//        }
//        return myContact.indexOf(contactName);
//    }
//    public Contact queryContact(String name){
//       ArrayList<String> contactNames = new ArrayList<>();
//        for(Contact contact:myContact){
//
//           String[] contactName = contact.getName().split(",");
//           contactNames.addAll(List.of(contactName));
//        }
//
//    }
    private int findContact(Contact contact){
       return myContacts.indexOf(contact);
    }
    public void printContact(){

        for (Contact contact : myContacts){
            System.out.printf("contact List%n %d.->%s%n", myContacts.indexOf(contact)+1, contact.getName());
        }
    }
}

