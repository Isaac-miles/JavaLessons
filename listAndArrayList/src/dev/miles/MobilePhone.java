package dev.miles;

import java.util.ArrayList;

class Contact{
    private final String name;
    private final String phoneNumber;
    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
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
    private ArrayList<Contact> myContact;

    public static void main(String[] args) {
        Contact myContact = new Contact("miles","07030991936");

    }

    public MobilePhone(String myNumber, ArrayList<Contact> myContact) {
        this.myNumber = myNumber;
        this.myContact = myContact;
    }
    public boolean addNewContact(Contact contact){
        int value = findContact(contact);
        return value >= 0;
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        int contactIndex = findContact(oldContact);
        if(contactIndex>=0){
            System.out.println("contact exists and updated");
            myContact.set(contactIndex,newContact);
            return true;
        }else return false;
    }
    public boolean removeContact(Contact contact){
        int findContact = findContact(contact);
        if(findContact>=0){
            myContact.remove(contact);
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
       return myContact.indexOf(contact);
    }
    public void printContact(){

        for (Contact contact :myContact){
            System.out.printf("contact List%n %d.->%s%n",myContact.indexOf(contact)+1, contact.getName());
        }
    }
}

