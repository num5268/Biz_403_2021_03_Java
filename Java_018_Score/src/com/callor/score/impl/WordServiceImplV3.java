package com.callor.score.impl;

import java.util.Random;

import com.callor.score.model.WordVO;

public class WordServiceImplV3 extends WordServiceImplV1{

	protected Random rnd;
	public WordServiceImplV3() {
		rnd = new Random();
	}
	@Override
	public void viewWord() {
		
		WordVO word = this.getWord();
		String strEng = word.getEnglisg();
		
		String[] strWords = strEng.split("");
		
		System.out.println(strWords);
	}
	
	

}
