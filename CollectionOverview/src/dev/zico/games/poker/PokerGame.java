package dev.zico.games.poker;

import dev.collectionMethods.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PokerGame {

    private final List<Card> deck = Card.getStandardDeck();
    private int playerCount;
    private int cardsInHand;
    private List<PokerHand> pokerHands;
    private List<Card> remainingCards;

    public PokerGame(int playerCount, int cardsInHand) {
        this.playerCount = playerCount;
        this.cardsInHand = cardsInHand;
        pokerHands = new ArrayList<>(cardsInHand);
    }

    public void startPlay(){
        Collections.shuffle(deck);
        Card.printDeck(deck);
        int randomMiddle = new Random().nextInt(15,35);
        Collections.rotate(deck,randomMiddle);
        Card.printDeck(deck);
    }
}
