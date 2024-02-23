package dev.challenge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Task> tasks = TaskData.gettasks("all");
        sortAndPrint("All Tasks", tasks);

        Set<Task> annsTasks = TaskData.gettasks("Ann");
        sortAndPrint("Anns Tasks", annsTasks);
    }

    private static void sortAndPrint(String header, Collection<Task> collection){
        sortAndPrint(header,collection,null);
    }

    private static void sortAndPrint(String header, Collection<Task> collection, Comparator<Task> sorter){
       String heading = "%-20s %-25s %-10s %-10s %s %-20s"
               .formatted("project","description","priority","assignee","status",header);
        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(heading);
        System.out.println(lineSeparator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }

}
