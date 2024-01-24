package dev.miles;

public class Main {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone("07030991936");
        Contact myContact = Contact.createContact("miles","07030991936");
        Contact myContact1 = Contact.createContact("Isaac","07030991937");
        Contact myContact2 = Contact.createContact("Junior","07030991938");
        Contact myContact3 = Contact.createContact("Josiah","07030991939");


        mp.addNewContact(myContact);
        mp.updateContact(myContact,myContact3);
        mp.addNewContact(myContact1);
        mp.addNewContact(myContact2);
        mp.addNewContact(myContact3);
        mp.printContact();
        mp.addNewContact(myContact);
        mp.removeContact(myContact1);
        mp.printContact();
    }
}
