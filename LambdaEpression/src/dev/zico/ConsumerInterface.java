package dev.zico;

import java.util.ArrayList;
import java.util.List;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "Mick","Z ico","John","Bravo","Alpha"
        ));

        String prefix = "Ninja";
        list.forEach(s-> {
            char first = s.charAt(0);
            System.out.println(prefix + " "+  first+" means "+ s);
        });
    }
}
