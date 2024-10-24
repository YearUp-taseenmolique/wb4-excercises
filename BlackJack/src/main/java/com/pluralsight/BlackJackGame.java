package com.pluralsight;

import java.util.ArrayList;

public class BlackJackGame {

    private Deck deck;
    private ArrayList<Player> players;
    private Player dealer;

    public BlackJackGame(){
        this.deck = new Deck();
        this.deck.shuffle();
        this.players = new ArrayList<Player>();
        this.dealer = new Player("Dealer");
    }

    public void AddPlayer(String playerName){
        players.add(new Player(playerName));
    }

    public void AddPlayer(Player player){
        players.add(player);
    }

    public void DealCards(){

        for(Player player : this.players){
            player.getHand().Deal(deck, 2);
        }

        dealer.getHand().Deal(deck, 2);

    }

    public Deck getDeck() {
        return deck;
    }

    public Player getDealer() {
        return dealer;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player[] getWinner(){
        //Look through all the player's cards. Whoever is closest to 21 without exceeding it is the winner
        return null;
    }

}