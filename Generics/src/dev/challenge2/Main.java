package dev.challenge2;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueryList<ZCOStudent> queryList = new QueryList<>();
        for (int i = 0; i < 25; i++) {
            queryList.add(new ZCOStudent());
        }
        System.out.println("Ordered");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        System.out.println("Macthes");
        var matches = queryList
                .getMatches("percentComplete", "50")
                .getMatches("Course","Java");
        matches.sort(new ZCOStudentComparator());
        printList(matches);

        System.out.println("ordeered");
        matches.sort(null);
        printList(matches);
    }
    public static void printList(List<?> students){
        for(var student: students){
            System.out.println(student);
        }
    }
}
