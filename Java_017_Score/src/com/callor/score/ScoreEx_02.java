package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.ScoreServiceImplV2;

public class ScoreEx_02 {
	
	public static void main(String[] args) {
		
		ScoreService ssV1 = new ScoreServiceImplV2();
		ssV1.selectMenu();
	
	}
}
