package dev.SetsAndMaps;

import java.util.HashSet;
import java.util.Set;

public class Contact {
    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public Contact(String name) {
        this(name,null);
    }
    public Contact(String name,String email) {
        this(name,email,0);
    }
    public Contact(String name,long phone) {
        this(name,null,phone);
    }
    public Contact(String name, String email,long phone){
        this.name = name;
        if (email !=null){
            emails.add(email);
        }

    }
}
