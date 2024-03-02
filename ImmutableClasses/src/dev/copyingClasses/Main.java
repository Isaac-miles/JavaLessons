package dev.copyingClasses;

import java.util.Arrays;

record Person(String name, String dob,Person[] kids){
    public Person(Person p) {
        this(p.name() ,p.dob,p.kids() == null ? null :Arrays.copyOf(p.kids(),p.kids().length));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", kids=" + Arrays.toString(kids) +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {

        Person joe = new Person("Joe","01/01/1961",null);
        Person jim = new Person("Jim","01/02/1962",null);
        Person jack = new Person("Jack","01/03/1963",new Person[]{joe,jim});
        Person jane = new Person("Jane","01/04/1964",null);
        Person jill = new Person("Jill","01/05/1965",new Person[]{joe,jim});

        Person[] persons = {joe,jim,jack,jane,jill};
        Person[] personsCopy = persons.clone();
//        Person[] personCopy = Arrays.copyOf(persons,persons.length); //shallow copy
        //Below method is deep copy
//        Person[] personsCopy = new Person[5];
//        for(int i =0;i<5; i++){
//            personsCopy[i] = new Person(persons[i]);
//        }
//        Arrays.setAll(personsCopy,i->new Person(personsCopy[i]));

        var jillsKids = personsCopy[4].kids();
        jillsKids[1] = jane;

        for(int i =0;i<5;i++){
            if(persons[i]== personsCopy[i]){
                System.out.println("Equal References "+ persons[i]);
            }
        }
        System.out.println(persons[4]);
        System.out.println(personsCopy[4]);

    }
}
