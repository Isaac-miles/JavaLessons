package dev.zico;

public class Main {
    public static void main(String[] args){
        Course jsm = new Course("JSM","Javascript Masterclass");
        Course csharp = new Course("CSHARP","C# Masterclass");
        Student miles = new Student ("NG",2022,"M",28,true,jsm,csharp);
        System.out.println(miles);
    }
}
