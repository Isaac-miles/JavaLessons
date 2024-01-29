package dev.zico;

public class TheEnumClass {
    public static void main(String[] args) {
        EnumTypeExample weekdays = EnumTypeExample.WED;
        System.out.println(weekdays);

        System.out.printf("Name is %s, Ordinal Value = %d%n",weekdays.name(), weekdays.ordinal());

    }
}
