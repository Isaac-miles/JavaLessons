package dev.constructorsProject;

import dev.external.Child;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("Jon Doe","01/01/1900",4);
        Child child = new Child();
        System.out.println(parent);
        System.out.println(child);
        Person joe = new Person("Joe","01-10-1950");
        System.out.println(joe);

        Person joeyZaza = new Person(joe);
        System.out.println(joe);

        Generation g = Generation.BABY_BOOMER;
    }


}
