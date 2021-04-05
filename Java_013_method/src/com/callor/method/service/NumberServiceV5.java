package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {
	
	public NumberServiceV5() {
		// TODO Auto-generated constructor stub
		
	}
	public Integer inputNum(String title) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(title + "값을 입력하세요");
			System.out.println("QUIT만 입력하세요");
			System.out.print(">> ");
			
			String strNum = scan.nextLine();
			
			Integer intNum = 0;
			if(strNum.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("정수 또는 QUIT만 입력");
					continue;
				}
				if(intNum <0 ) {
					System.out.println("범위초과");
					continue;
				}
			}
			
			return intNum;
		}
	}

}
