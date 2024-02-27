package dev.SortedMaps;

import java.time.LocalDate;
import java.util.*;

public class Main {
    private static Map<String,Purchase> purchases = new LinkedHashMap<>();
    private static NavigableMap<String, Student> students = new TreeMap<>();
    public static void main(String[] args) {
        Course jbc = new Course("jbc101","Java Bi Functions","Java");
        Course python = new Course("pyt102","Python Master Class","Python");

        addPurchase("Mary Martin",jbc,129.88);
        addPurchase("Andy Martin",jbc,120.50);
        addPurchase("Andy Martin",python,120.50);
        addPurchase("Joe Jones",jbc,110.50);
        addPurchase("Bill Brown",python,117.50);

        addPurchase("Chuck Cheese",python,117.50);
        addPurchase("Davey Jone",jbc,127.50);
        addPurchase("Eva east",python,147.50);
        addPurchase("Fred Forker",jbc,137.50);
        addPurchase("Greg Brown",python,117.50);


        purchases.forEach((key,value)-> System.out.println(key+": "+value));
        System.out.println("-".repeat(30));
        students.forEach((key,value)-> System.out.println(key + ": "+value));

        NavigableMap<LocalDate, List<Purchase>> datedPurchases = new TreeMap<>();
        for(Purchase p: purchases.values()){
            datedPurchases.compute(p.purchaseDate(),
                    (date,plist)->{
                    List<Purchase> list =(plist==null)? new ArrayList<>():plist;
                    list.add(p);
                    return list;
                    });
        }
        datedPurchases.forEach((key,value)-> System.out.println(key + ": "+value));

        int currentYear = LocalDate.now().getYear();
        LocalDate firstday = LocalDate.ofYearDay(currentYear,1);
        LocalDate week1 = firstday.plusDays(7);
        Map<LocalDate,List<Purchase>> week1Purchases = datedPurchases.headMap(week1);
        Map<LocalDate,List<Purchase>> week2Purchases = datedPurchases.tailMap(week1);

//        System.out.println("-".repeat(20));
//        week1Purchases.forEach((key,value)-> System.out.println(key+": "+value));
//        System.out.println("-".repeat(20));
//        week2Purchases.forEach((key,value)-> System.out.println(key+": "+value));

        displayStats(1,week1Purchases);
        displayStats(2,week2Purchases);
        System.out.println("-".repeat(20));

        LocalDate lastDate = datedPurchases.lastKey();
        var previouseEntry = datedPurchases.lastEntry();

        while (previouseEntry !=null){
            List<Purchase> lastDaysData = previouseEntry.getValue();
            System.out.println(lastDate+" purchases : "+lastDaysData.size());

            LocalDate prevDate = datedPurchases.lowerKey(lastDate);
            previouseEntry = datedPurchases.lowerEntry(lastDate);
            lastDate = prevDate;
        }
        System.out.println("-".repeat(20));
        var revsersed = datedPurchases.descendingMap();

        LocalDate firstDate = revsersed.firstKey();
//        var nextEntry = revsersed.firstEntry();
        var nextEntry = revsersed.pollFirstEntry();

        while (nextEntry !=null){
            List<Purchase> lastDaysData = nextEntry.getValue();
            System.out.println(firstDate+" purchases : "+ lastDaysData.size());

            LocalDate nextDate = revsersed.higherKey(firstDate);
//            nextEntry = revsersed.higherEntry(firstDate);
            nextEntry = revsersed.pollFirstEntry();

            firstDate = nextDate;

        }
        System.out.println("-".repeat(20));
        datedPurchases.forEach((key,value)-> System.out.println(key+": "+value));
    }
    private static void addPurchase(String name, Course course,double price){
        Student existingStudent = students.get(name);
        if(existingStudent == null){
            existingStudent = new Student(name,course);
            students.put(name,existingStudent);
        }else {
            existingStudent.addCourse(course);
        }

        int day = new Random().nextInt(1,15);
        String key = course.courseId()+"_"+existingStudent.getId();
        int year = LocalDate.now().getYear();
        Purchase purchase = new Purchase(course.courseId(),existingStudent.getId(),price,year,day);
        purchases.put(key,purchase);
    }
    private static void displayStats(int period,Map<LocalDate,List<Purchase>> periodData){
        System.out.println("-".repeat(20));
        Map<String, Integer> weeklyCounts = new TreeMap<>();
        periodData.forEach((key,value)->{
            System.out.println(key+": "+ value);
            for(Purchase p:value){
                weeklyCounts.merge(p.courseId(),1,(prev,cur)->{
                    return prev+cur;
                });
            }
        });
        System.out.printf("Week %d Purchases = %s%n", period,weeklyCounts);
    }

}
