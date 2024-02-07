package com.pluralsight.games;

import java.util.ArrayList;

public class CardGame
{
    private ArrayList<Hand> players = new ArrayList<>();

    public void start()
    {
        // start by adding a few players
        players.add(new Hand("Elvis"));
        players.add(new Hand("Jaquell"));

        // loop and deal the cards
        System.out.println("Deal Round");
        System.out.println("==================");
        Deck deck = new Deck();
        deck.shuffle();

        for (Hand player : players){
            for (int i = 0; i < 2; i++){
                Card card = deck.deal();
                player.deal(card);
            }
            System.out.println(player.getPlayerName() + " has " + player.showHand());
        }

        // loop and determine who won
        for (int i = 0; i < players.size(); i++){
        }


        // display the winner
    }
}
