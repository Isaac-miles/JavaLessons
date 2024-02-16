package dev.zico.games.poker;

import dev.collectionMethods.Card;

import java.util.List;

public class PokerGame {

    private final List<Card> deck = Card.getStandardDeck();
    private int playerCount;
    private int cardsInHand;
    private List<PokerHand> pokerHands;
    private List<Card> remainingCards;

}
