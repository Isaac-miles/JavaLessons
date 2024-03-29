package dev.zico;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Comparing {
    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = {0,5,10,-50,50};
        for(Integer i : others){
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n",five,(val==0 ? "==" :(val< 0 ? "<" : ">")),i,val);
        }
        String banana = "banana";
        String[] fruit = {"apple","banana","pear","BANANA"};

        for (String s:fruit){
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo=%d%n", banana,(val==0?"==":(val<0)?"<":">"),s,val);
        }
        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));
        System.out.println("A:"+(int)'A' +" "+ "a:"+(int)'a');
        System.out.println("B:"+(int)'B' +" "+ "b:"+(int)'b');
        System.out.println("P:"+(int)'P' +" "+ "p:"+(int)'p');

        Student miles = new Student("Miles");
        Student[] students = {new Student("Zico"),new Student("Helen"),new Student("coll")};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = "+ miles.compareTo(new Student("MILES")));
        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));
    }
}

class Student implements Comparable<Student>{
    private static int LAST_ID = 1000;
    private static Random random = new Random();

    String name;

    private int id;
    protected double gpa;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 5.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id,name,gpa);
    }
    @Override
    public int compareTo(Student o) {
        return Integer.compare(id, o.id);
    }

    //used for comparable example
//    @Override
//    public int compareTo(Student o) {
//        return name.compareTo(o.name);
//    }
    //default comparable interfaced used raw
//    @Override
//    public int compareTo(Object o) {
//        Student other = (Student) o;
//        return name.compareTo(other.name);
//    }
}

class StudentGPAComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return  (o1.gpa + o1.name).compareTo(o2.gpa+o2.name);
    }
}