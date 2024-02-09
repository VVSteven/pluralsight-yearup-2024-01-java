package com.pluralsight.games;

import java.util.ArrayList;

public class CardGame {
    private ArrayList<Hand> players = new ArrayList<>();

    public void start() {
        // start by adding a few players
        players.add(new Hand("Elvis"));
        players.add(new Hand("Jaquell"));
        players.add(new Hand("Jonathan"));
        players.add(new Hand("Gaby"));

        // loop and deal the cards
        System.out.println("Deal Round");
        System.out.println("============================");
        Deck deck = new Deck();
        deck.shuffle();

        for (Hand player : players) {
            for (int i = 0; i < 2; i++) {
                Card card = deck.deal();
                player.deal(card);
            }
            System.out.println(player.getPlayerName() + " has " + player.showHand());
        }

        // loop and determine who won
        Hand winner = players.getFirst();

        for (int i = 1; i < players.size(); i++) {
            Hand currentPlayer = players.get(i);
            if (currentPlayer.getValue() > winner.getValue()) {
                winner = currentPlayer;
            }
        }
        // display the winner
        System.out.println("============================");
        System.out.println("The winner is: " + winner.getPlayerName() + " with a hand worth " + winner.getValue());
    }
}
