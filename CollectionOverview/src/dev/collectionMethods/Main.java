package dev.collectionMethods;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Card[] cardArray = new Card[13];
        Card aceOfhearts = Card.getFaceCard(Card.Suit.HEART,'A');
        Arrays.fill(cardArray,aceOfhearts);
        Card.printDeck(Arrays.asList(cardArray),"Ace of Hearts",1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards,aceOfhearts);
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13,aceOfhearts);
        Card.printDeck(acesOfHearts,"Aces of hearts",2);

        Card kingsOfClubs = Card.getFaceCard(Card.Suit.CLUB,'K');
        List<Card> kingOfClubs = Collections.nCopies(13,kingsOfClubs);
        Card.printDeck(kingOfClubs,"kings of clubs",2);

        Collections.addAll(cards,cardArray);
        Collections.addAll(cards,cardArray);

        Card.printDeck(cards,"Card Collection with Aces added",1);

        //using the copy,this replaces the total no of element in your cards, but throws an error if it has 0 elements
        Collections.copy(cards,kingOfClubs);
        Card.printDeck(cards,"Card Collection with kings copied",2);

        //this method is a true copy and returns an unmodifiable list, if you need a modifiable copy of the list
        //you make a call to the copyOf method and pass it to the lis constructor e.g addAll
        cards = List.copyOf(kingOfClubs);
        Card.printDeck(cards,"List Copy of Kings",1);

       List<Card> deck = Card.getStandardDeck();
       Card.printDeck(deck);

       Collections.shuffle(deck);
       Card.printDeck(deck,"Shuffled Deck",4);

        Collections.reverse(deck);
        Card.printDeck(deck,"reversed Deck",4);

//        var sortAlg = Comparator.<Card,Integer>comparing(card -> card.rank())
//                .thenComparing(card -> card.suit());

        var sortingAlgorithm = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);
        Collections.sort(deck,sortingAlgorithm);
        Card.printDeck(deck,"standard Deck sorted by rank,suit",13);

        Collections.reverse(deck);
        Card.printDeck(deck,"reversed Deck sorted by rank,suit",13);

        List<Card> kings = new ArrayList<>(deck.subList(4,8));
        Card.printDeck(kings,"kings in deck", 1);

        List<Card> tens = new ArrayList<>(deck.subList(16,20));
        Card.printDeck(tens,"tens in deck", 1);

        int subListIndex = Collections.indexOfSubList(deck,tens);
        System.out.println("sublist index for tens = "+subListIndex);
        System.out.println("Contains = "+ deck.containsAll(tens));

        boolean disjoint = Collections.disjoint(deck,tens);
        System.out.println("disjoint = "+ disjoint);

        boolean disjoint2 = Collections.disjoint(tens,kings);
        System.out.println("disjoint = "+ disjoint2);

        deck.sort(sortingAlgorithm);
        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART,10);
        int foundIndex = Collections.binarySearch(deck,tenOfHearts,sortingAlgorithm);
        System.out.println("found Index = " + foundIndex);
        System.out.println("foundIndex = "+deck.indexOf(tenOfHearts));
        System.out.println(deck.get(foundIndex));

        Card tenOfClubs = Card.getNumericCard(Card.Suit.CLUB,10);
        Collections.replaceAll(deck,tenOfClubs,tenOfHearts);
        Card.printDeck(deck.subList(32,36),"Tens row",1);

        Collections.replaceAll(deck,tenOfHearts,tenOfClubs);
        Card.printDeck(deck.subList(32,36),"Tens row",1);

        if(Collections.replaceAll(deck,tenOfClubs,tenOfHearts)){
            System.out.println("Tens of hearts replaced with tens of clubs");
        }else {
            System.out.println("No tens of heart found in the list");
        }

        System.out.println("Ten of clubs cards = "+ Collections.frequency(deck,tenOfHearts));
        System.out.println("Best Card = "+ Collections.max(deck,sortingAlgorithm));
        System.out.println("Worst Card = "+ Collections.min(deck,sortingAlgorithm));

        var sorBySuit = Comparator.comparing(Card::suit).thenComparing(Card::rank);
        deck.sort(sorBySuit);
        Card.printDeck(deck,"Sorted by suit,rank", 4);

        List<Card> copied = new ArrayList<>(deck.subList(0,13));
        Collections.rotate(copied,3);
        System.out.println("Unrotated "+deck.subList(0,13));
        System.out.println("Rotated "+3+ copied);

        copied = new ArrayList<>(deck.subList(0,13));
        Collections.rotate(copied,-3);
        System.out.println("Unrotated "+deck.subList(0,13));
        System.out.println("Rotated "+ -3+  copied);
    }
}
