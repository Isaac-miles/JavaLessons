package dev.copyingClasses;

import java.util.Arrays;

record Person(String name, String dob,Person[] kids){
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

        Person[] persons = {jane,jack,joe,jill,jim};
        Person[] personCopy = Arrays.copyOf(persons,persons.length); //shallow copy

        for(int i =0;i<5;i++){
            if(persons[i]== personCopy[i]){
                System.out.println("Equal References "+ persons[i]);
            }
        }
    }
}
