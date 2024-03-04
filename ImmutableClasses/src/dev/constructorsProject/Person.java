package dev.constructorsProject;

public record Person(String name, String dob) {
    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob.replace("-","/");
    }
}
