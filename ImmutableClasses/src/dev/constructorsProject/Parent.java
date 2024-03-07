package dev.constructorsProject;

public class Parent {
    static {
        System.out.println("Parent Static Initializers and parent class is being constructed");
    }
    private final String name;
    private final String dob;
    protected final int siblings;

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

    public Parent(String name, String dob,int siblings) {
        this.name = name;
        this.dob = dob;
        this.siblings = siblings;
//        System.out.println("In parent Constructor");
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+": Name = " + name +'\'' +", dob = "+ dob +'\'' ;
    }
}
