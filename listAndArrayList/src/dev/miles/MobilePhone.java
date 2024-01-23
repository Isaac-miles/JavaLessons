package dev.miles;

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


}

