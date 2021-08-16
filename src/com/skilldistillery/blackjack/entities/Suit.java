package com.skilldistillery.blackjack.entities;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	private String name;

	Suit(String thePoliteNameForDisplay) {
		this.name = thePoliteNameForDisplay;

	}

	@Override
	public String toString() {
		return name;
	}
}