package com.callor.apps;

import java.util.Random;

public class App_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intMembers = 0;
		intMembers = rnd.nextInt(26)+25;
		System.out.println("학생 : "+intMembers);
		
		int intSum = 0;
		intSum += intMembers;
		
		if(intSum%6==0) {
			System.out.println("피자 : "+intSum/6);
		} else {
			//System.out.println("피자 : "+intSum/6);
		}
		
		}
		
}
