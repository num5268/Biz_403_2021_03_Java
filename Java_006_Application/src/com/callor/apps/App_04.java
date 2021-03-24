package com.callor.apps;

import java.util.Random;

public class App_04 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int [20];
		
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100)+1;
		}
		for (int i = 0 ; i< intNums.length; i++) {
			
			if(intNums[i]%3==0) {
				System.out.printf("3의 배수가 저다오딘 최초의 위치:");
				System.out.printf(i+" 번");
			} break;
		}
		
	}

}
