package com.callor.score;

import com.callor.score.Impl.ScoreServiceImplV1A;
import com.callor.score.service.ScoreService;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		ScoreService sService = new ScoreServiceImplV1A();
		
		sService.insertScore();
		sService.printScore();
	}

}
