package com.callor.score;

import com.callor.score.impl.WordServiceImplV1;
import com.callor.score.impl.WordServiceImplV2;
import com.callor.score.impl.WordServiceImplV3;

public class WordEx_01 {
	
	public static void main(String[] args) {
		WordService wService = new WordServiceImplV3();
		
		//wService.loadWord();
		wService.viewWord();
	}

}
