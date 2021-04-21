package com.callor.app;

import com.callor.app.service.DeckServiceV1;

public class DeckEx_01 {
	
	public static void main(String[] args) {
		
		DeckServiceV1 deckV1 = new DeckServiceV1();
		
		deckV1.makeDeck();
		deckV1.getDeck();
	}

}
