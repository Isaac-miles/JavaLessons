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

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        int value = findContact(contact.getName());
        if(value >=0){
            System.out.println("contact is already on the file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        int contactIndex = findContact(oldContact.getName());
        if(contactIndex >=0){
            this.myContacts.set(contactIndex,newContact);
            System.out.println("contact with the name "+oldContact.getName()+" was updated successfully with "+newContact.getName());

            return true;
        }else {
            System.out.println("contact was not found");
            return false;
        }
    }
    public boolean removeContact(Contact contact){
        int foundContact = findContact(contact);
        if(foundContact>=0){
            myContacts.remove(foundContact);
            System.out.println(contact.getName()+" was deleted successfully");
            return true;
        }else {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
    }
    private int findContact(String contactName){
//        for(Contact contact:myContacts){
//            if(contact.getName().equals(contactName)){
//                return myContacts.indexOf(contact);
//            }
//        }
        for(int i=0; i<myContacts.size();i++){
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    private int findContact(Contact contact){
       return myContacts.indexOf(contact);
    }
    private Contact queryContact(String name){
        int position = findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }
    public void printContact(){
        for (Contact contact : myContacts){
            System.out.printf("contact List%n %d.->%s%n", myContacts.indexOf(contact)+1, contact.getName());
        }
    }
}

