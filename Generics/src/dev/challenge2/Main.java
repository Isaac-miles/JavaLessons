package dev.challenge2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueryList<ZCOStudent> queryList = new QueryList<>();
        for (int i = 0; i < 5; i++) {
            queryList.add(new ZCOStudent());
        }
        System.out.println("Ordered");
//        queryList.sort(Comparator.naturalOrder());
    }
    public static void printList(List<?> students){
        for(var student: students){
            System.out.println(student);
        }
    }
}
