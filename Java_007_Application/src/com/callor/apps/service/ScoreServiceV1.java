package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1 {
	
	int[] intNums;
	Random rnd;
	
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	int[] intTotal;
	float[] floatAvg;
	public ScoreServiceV1() {
		
		intNums = new int[10];
		
		intKor = new int[10];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		
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
			System.out.printf("%3d",intEng[i]);
			System.out.printf("%3d",intMath[i]);
			System.out.printf("%3d",intTotal[i]);
			System.out.printf("%3.2f",floatAvg[i]);
		}
		
		
	}

}
