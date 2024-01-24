package dev.zico;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> places = new LinkedList<>();
          var placesToVisit = new LinkedList<String>();
          placesToVisit.add("sydney");
          placesToVisit.add(0,"lagos");
        System.out.println(placesToVisit);
        addMore(placesToVisit);
        System.out.println(placesToVisit);
    }
    public static void addMore(LinkedList<String> list){
        list.addFirst("abuja");
        list.addLast("kogi");
        list.offerFirst("yobe");
        list.offerLast("damaturu");
        list.offer("dogo");

    }
}