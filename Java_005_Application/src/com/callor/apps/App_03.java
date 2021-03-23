package com.callor.apps;

import java.util.Random;

public class App_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intScores = new int[10];
		

		for (int i = 0; i<10 ; i++) {
			intScores[i] = rnd.nextInt(51)+50;
			System.out.println(intScores[i]);
		}
			int i = 0;
			int intSum = 0;
			intSum = intScores[i];
			float FloatAvg = (float) intSum/10;
			System.out.printf("총점 : %d    평균 : %3.2f"
					,intSum,FloatAvg);
	}

}
