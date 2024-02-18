package dev.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String aText = "Hello";
        String bTest = "Hello";
        String ctest = String.join("l", "He","lo");
        String dTesxt = "He".concat("llo");
        String eText = "hello";

        List<String> hellos = Arrays.asList(aText,bTest,ctest,dTesxt,eText);
        hellos.forEach(s-> System.out.println(s+": "+ s.hashCode()));

        Set<String> mySet = new HashSet<>(hellos);
        System.out.println("mySet"+ mySet);
        System.out.println("# of elements = "+ mySet.size());

        for(String setValue:mySet){
            System.out.println(setValue+": ");
            for (int i=0; i< hellos.size(); i++){
                if(setValue==hellos.get(i)){
                    System.out.println(i+", ");
                }
            }
            System.out.println(" ");
        }
    }
}
