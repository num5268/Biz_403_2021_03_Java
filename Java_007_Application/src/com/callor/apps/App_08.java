package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_08 {
	
	public static void main(String[] args) {
		
		ScoreServiceV1 scV1 = new ScoreServiceV1();
		
		scV1.makeNums();
		scV1.makeSum();
		scV1.printList();
		
	}

}
