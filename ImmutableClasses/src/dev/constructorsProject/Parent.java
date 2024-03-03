package dev.constructorsProject;

public class Parent {
    private final String name;
    private final String dob;

    //this is an instance initializer
    {
//        name = "John Doe";
//        dob = "01/01/1900";
        System.out.println("In parent Initializer");
    }

//    public Parent() {
//        System.out.println("the parent no args constructor");
//
//    }

    public Parent(String name, String dob) {
        this.name = name;
        this.dob = dob;
        System.out.println("In parent Constructor");
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "name = " + name +'\'' +", dob = "+ dob +'\'' ;
    }
}
