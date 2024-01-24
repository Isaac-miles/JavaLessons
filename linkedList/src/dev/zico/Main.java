package dev.zico;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> places = new LinkedList<>();
          var placesToVisit = new LinkedList<String>();
          placesToVisit.add("sydney");
          placesToVisit.add(0,"lagos");
        System.out.println(placesToVisit);
        addMore(placesToVisit);
        System.out.println(placesToVisit);
//        removeElement(placesToVisit);
//        System.out.println(placesToVisit);
//        getElement(placesToVisit);
         printElements3(placesToVisit);
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
    public static void getElement(LinkedList<String> list){
        System.out.println("retrieved element = "+ list.get(4));
        System.out.println("first element = "+ list.getFirst());
        System.out.println("first last = "+ list.getLast());
        System.out.println("lagos position = "+ list.indexOf("lagos"));
        System.out.println("sydney position = "+ list.lastIndexOf("sydney"));

        //Queue retrievals
        System.out.println("Element from element " + list.element());

        //stack retrievals
        System.out.println("Element from peek " + list.peek());
        System.out.println("Element from peek first " + list.peekFirst());
        System.out.println("Element from peek last " + list.peekLast());

    }
    public static void printElements(LinkedList<String> list){
        System.out.println("Trip starts at "+ list.getFirst());
        for(int i=1;i<list.size();i++){
            System.out.println("--> From: "+list.get(i-1) + " to "+list.get(i));
        }
        System.out.println("Trip ends at "+ list.getLast());

    }
    public static void printElements2(LinkedList<String> list){
        System.out.println("Trip starts at "+ list.getFirst());
        String prevCity = list.getFirst();
       for(String city:list){
           System.out.println("--->From: "+ prevCity+ " to "+city);
           prevCity = city;
       }
        System.out.println("Trip ends at "+ list.getLast());

    }
    public static void printElements3(LinkedList<String> list){
        System.out.println("Trip starts at "+ list.getFirst());
        String prevCity = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);

        while(iterator.hasNext()){
            var city = iterator.next();
            System.out.println("--->From: "+ prevCity+ " to "+city);
            prevCity = city;
        }
        System.out.println("Trip ends at "+ list.getLast());

    }
    private static void testIterator(LinkedList<String> list){

    }
}