package dev.miles;

public class Main {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone("07030991936");
        Contact myContact = Contact.createContact("miles","07030991936");
        mp.addNewContact(myContact);
        mp.printContact();
    }
}
