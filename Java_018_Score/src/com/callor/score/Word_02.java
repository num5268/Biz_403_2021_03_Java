package com.callor.score;

import com.callor.score.impl.WordServiceImplV2;

public class Word_02 {
	
	public static void main(String[] args) {
		
		
		WordService wService = new WordServiceImplV2();
		
		wService.viewWord();
	}

}
