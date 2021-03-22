package com.callor.controller;

import java.util.Random;

public class Controller_15 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int std1 = rnd.nextInt(100)+1;
		int std2 = rnd.nextInt(100)+1;
		int std3 = rnd.nextInt(100)+1;
		int std4 = rnd.nextInt(100)+1;
		int std5 = rnd.nextInt(100)+1;
		int std6 = rnd.nextInt(100)+1;
		int std7 = rnd.nextInt(100)+1;
		int std8 = rnd.nextInt(100)+1;
		int std9 = rnd.nextInt(100)+1;
		int std10 = rnd.nextInt(100)+1;
		
		for(int i = 0; i<10 ; i++) {
			int num = i+1;
		}
		/*
		 * num 변수하고
		 * std 이름하고 합하여
		 * 		std1~10 처럼 만들수 있을거 같은대
		 * 		안된다!!
		 * 
		 */
		
		int intSum = std1;
		intSum += std2;
		intSum += std3;
		intSum += std4;
		intSum += std5;
		intSum += std6;
		intSum += std7;
		intSum += std8;
		intSum += std9;
		intSum += std10;
		float floatAvg = (float)intSum/10;
		
		System.out.println("학생1 : "+std1);
		System.out.println("학생2 : "+std2);
		System.out.println("학생3 : "+std3);
		System.out.println("학생4 : "+std4);
		System.out.println("학생5 : "+std5);
		System.out.println("학생6 : "+std6);
		System.out.println("학생7 : "+std7);
		System.out.println("학생8 : "+std8);
		System.out.println("학생9 : "+std9);
		System.out.println("학생10 : "+std10);
		System.out.println("====================");
		
		System.out.printf("총점 : %d, 평균 : %3.2f",intSum,floatAvg);
	}

}
