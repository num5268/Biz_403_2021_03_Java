package com.callor.apps.service;

public class TimeServiceV1 {
	
	int[] intNum;
	public TimeServiceV1() {
		intNum = new int[8];
	}
	
	public void makeNums () {
		for(int i = 0 ; i <intNum.length ; i++) {
			intNum[i] = i+2;
			System.out.println(intNum[i]);
		}
	}
	public void printSum() {
		int intSum = 0;
		for (int i = 0 ; i <intNum.length; i++) {
			for(int j = 0 ; j<intNum.length; j++) {
				intSum = intNum[i];
				System.out.println(intSum);
			}
		}
	}
}
