package com.pluralsight.games;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<>();
    private String playerName;

    public Hand(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void deal(Card card) {
        cards.add(card);
    }

    public int getSize() {
        return cards.size();
    }

    public int getValue() {
        int value = 0;

        for (Card card : cards) {
            value += card.getPointValue();
        }

        return value;
    }

    public String showHand() {
        StringBuilder handString = new StringBuilder();
        for (Card card : cards) {
            card.flip();
            handString.append(card).append(" ");

        }
        return handString.toString();
    }
}
