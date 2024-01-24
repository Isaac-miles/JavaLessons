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
        removeElement(placesToVisit);
        System.out.println(placesToVisit);

    }
    public static void addMore(LinkedList<String> list){
        list.addFirst("abuja");
        list.addLast("kogi");
        list.offerFirst("yobe");
        list.offerLast("damaturu");
        list.offer("dogo");
        //Stack methods
        list.push("Uk");
    }
    public static void removeElement(LinkedList<String> list){
        list.pop();
        list.remove(2);
        String pl = list.remove();
        System.out.println(pl+" was removed");

        String pl1 = list.removeFirst();
        System.out.println(pl1+" was removed");

        String pl2 = list.removeLast();
        System.out.println(pl2+" was removed");

        //queue methods
        String p1 = list.poll();
        System.out.println(p1+" was removed");

        list.push("finland");
        System.out.println(list);

    }

}