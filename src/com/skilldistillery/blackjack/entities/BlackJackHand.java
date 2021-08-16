package com.skilldistillery.blackjack.entities;

public class BlackJackHand extends Hand {

	public BlackJackHand() {
	}

	@Override
	public int getHandValue() {
		int totalHandValue = 0;
		for (Card card : getHand()) {
			totalHandValue += card.getValue();
		}
		return totalHandValue;

	}

	public void displayHand() {
		for (Card card : getHand()) {
			System.out.println(card.toString());
		}
	}

}
