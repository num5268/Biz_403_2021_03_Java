package com.callor.apps;

import java.util.Random;

public class App_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intStd = new int[5];
		
		
		
		System.out.println("===========================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===========================");
		
		
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		
		for (int i = 0; i < 5; i++) {
			intStd[i] = i;
			System.out.println(i+1);
			}
		
		for (int i = 0; i < 5 ; i++) {
			int intKor1 = rnd.nextInt(51)+50;
			intKor[i] = intKor1;
			System.out.println(intKor[i]);
		}
		for (int i = 0; i < 5 ; i++) {
			int intEng1 = rnd.nextInt(51)+50;
			intEng[i] = intEng1;
			System.out.println(intEng[i]);
		}
		for (int i = 0; i < 5 ; i++) {
			int intMath1 = rnd.nextInt(51)+50;
			intMath[i] = intMath1;
			System.out.println(intMath[i]);
		}
		
	}

}
