package com.callor.score;

import com.callor.score.Impl.ScoreServiceImplV1;
import com.callor.score.service.ScoreService;

public class Score_01 {
	
	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV1();
		
		sService.insertScore();
		sService.printScore();
				
		
	}

}
