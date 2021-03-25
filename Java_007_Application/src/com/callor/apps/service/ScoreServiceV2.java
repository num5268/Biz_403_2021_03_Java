package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV2 extends ScoreServiceV1 {
	
	// for(int i = 0)
	// int members = 0
	// 
	
	int[] intNums;
	Random rnd;
	
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	int[] intTotal;
	float[] floatAvg;
	public ScoreServiceV2() {
		
		intNums = new int[10];
		
		intKor = new int[intNums.length];
		intEng = new int[intNums.length];
		intMath = new int[intNums.length];
		
	}
	public void makeNums() {
		Random rnd = new Random();
		for (int i = 0; i< intNums.length ;i++) {
			intNums[i] = i+1;
			System.out.println(intNums[i]);
		}
		for (int i = 0 ; i< intNums.length ; i++) {
			intKor[i] = rnd.nextInt(100)+1;
			intEng[i] = rnd.nextInt(100)+1;
			intMath[i] = rnd.nextInt(100)+1;
		}
	}
	
	public void makeSum() {
		for (int i = 0 ; i< intNums.length; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			
			floatAvg[i] += (float) intTotal[i]/3;
		}
	}
	public void printList() {
		for(int i = 0 ; i< intNums.length; i++) {
			System.out.printf("%3d",intKor[i]);
		}
		
		
	}

}
