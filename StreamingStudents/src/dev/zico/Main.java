package dev.zico;

public class Main {
    public static void main(String[] args){
        Course jsm = new Course("JSM","Javascript Masterclass");
        Course csharp = new Course("CSHARP","C# Masterclass");
        Student miles = new Student ("NG",2022,28,"M",true,jsm,csharp);
        System.out.println(miles);

        miles.watchLecture("JSM",5,2,2022);
        miles.watchLecture("CSHARP",10,7,2023);
        System.out.println(miles);
    }
}
