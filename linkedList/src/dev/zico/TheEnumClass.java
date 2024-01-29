package dev.zico;

import java.util.Random;

public class TheEnumClass {
    public static void main(String[] args) {
        EnumTypeExample weekdays = EnumTypeExample.WED;
        System.out.println(weekdays);

        for (int i = 0; i <10; i++) {
            weekdays = getRandomDay();
            System.out.printf("Name is %s, Ordinal Value = %d%n",weekdays.name(), weekdays.ordinal());
            if(weekdays==EnumTypeExample.FRI){
                System.out.println("TGIF");
            }
        }
    }
    public static void switchDayOfWeek(EnumTypeExample weekDay){
        int weekDayInteger = weekDay.ordinal()+1;
        switch (weekDay){
            case FRI -> System.out.println("Friday is day" + weekDayInteger);
        }
    }
    public static EnumTypeExample getRandomDay(){
        int random = new Random().nextInt(7);
        var allDays = EnumTypeExample.values();
        return allDays[random];
    }
}
