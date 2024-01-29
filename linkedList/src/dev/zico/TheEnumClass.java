package dev.zico;

import java.util.Random;

public class TheEnumClass {
    public static void main(String[] args) {
        EnumTypeExample weekdays = EnumTypeExample.WED;
        System.out.println(weekdays);

        System.out.printf("Name is %s, Ordinal Value = %d%n",weekdays.name(), weekdays.ordinal());

    }
    public static EnumTypeExample getRandomDay(){
        int random = new Random().nextInt(7);
        var allDays = EnumTypeExample.values();
        return allDays[random];
    }
}
