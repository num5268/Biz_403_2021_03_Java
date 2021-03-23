package com.callor.apps;

import java.util.Random;

public class App_04 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intStd = new int[5];
		
		intStd[0] = rnd.nextInt(10)+50;
			int Total = 0;
			int pizzaBox = 0;
		intStd[1] = rnd.nextInt(10)+50;
		intStd[2] = rnd.nextInt(10)+50;
		intStd[3] = rnd.nextInt(10)+50;
		intStd[4] = rnd.nextInt(10)+50;
		
		System.out.println("============================");
		System.out.println("인원수\t피자주문\t전체");
		System.out.println("----------------------------");
		
		System.out.println(intStd[0]);
		
		}
}
