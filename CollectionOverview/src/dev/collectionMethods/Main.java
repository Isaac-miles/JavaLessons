package dev.collectionMethods;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Card> deck = Card.getStandardDeck();
//        Card.printDeck(deck);
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
    }
}
