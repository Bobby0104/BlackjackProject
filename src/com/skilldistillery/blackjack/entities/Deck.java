package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Deck {
	
	private List<Card> deck;
	
	public Deck() {
		deck = new ArrayList<Card>(52);
		for(Suit suit :Suit.values()) {
//			System.out.println(suit);
			for (Rank rank : Rank.values())  {
				Card currentCard = new Card(rank, suit);
				deck.add(currentCard);
				
			}
		}
		
	}
	
	public int checkDeckSize() {
		return deck.size();
		
	}
	
	public Card dealCard() {
		return deck.remove(0);
		
	}
	
	public void shufffle() {
		Collections.shuffle(deck);
		
	}
	


}
