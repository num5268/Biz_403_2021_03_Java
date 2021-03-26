package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	Scanner scan = new Scanner(System.in);
	int[] intNum;
	
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	int[] intTotal;
	float[] floatAvg;
	
	public ScoreServiceV1 ( ) {
		intNum = new int[5];
		
		intKor = new int[5];
		intEng = new int[5];
		intMath = new int[5];
		
		intTotal = new int[5];
		floatAvg = new float[5];
		}
	public void printScore () {
		System.out.println(LinesService.dLines(30));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(LinesService.dLines(30));
		for (int i = 0; i<intNum.length; i++) {
			System.out.println(i+1);
		}
		for (int i = 0; i<intNum.length; i++) {
			intKor[i] = scan.nextInt();
			intEng[i] = scan.nextInt();
			intMath[i] = scan.nextInt();
		}
		for (int i = 0; i<intNum.length; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] +=(float)intTotal[i]/3;
		}
	}
}
