package com.callor.apps;

import java.util.Random;

public class App_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[20];
		for (int i = 0 ;i<intNums.length; i++) {
			intNums[i] = rnd.nextInt(51)+50;
		}
			for (int i = 2 ; i <100;i++) {
				for (int j = i; j<intNums.length; j++) {
					
				if(100%i==0) {
					break;
				}
				}
			}
		}
}

