package dev.zico;

import java.util.ArrayList;
import java.util.List;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "Mick","Zico","John","Bravo","Alpha"
        ));

        list.forEach((s)-> System.out.println(s));
    }
}
