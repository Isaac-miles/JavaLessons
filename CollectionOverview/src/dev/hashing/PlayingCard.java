package dev.hashing;

public class PlayingCard {
    private String suit;
    private String face;
    private int internalHash;

    public PlayingCard(String suit, String face) {
        this.suit = suit;
        this.face = face;
        this.internalHash = (suit.equals("Hearts"))? 11 :12;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

}
