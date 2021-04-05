package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV3 {

	public Integer inputNum() {

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("정수 0 ~ 100까지 입력");
			System.out.println("QUIT를 입력하면 종료");
			System.out.print(">> ");
			String strNum = scan.nextLine();

			if (strNum.trim().equals("QUIT")) {
				return null;
			} else {

			// 1. 입력된값이 QUIT가 아니면 일단
			// 정수로 바꿔보자

			Integer intNum;
			try {
				intNum = Integer.valueOf(strNum);
					
				//2. 정수이면 0~100까지 인지 알아보자
				if (intNum < 0 || intNum > 100) {
					System.out.println("범위 초과");
					// 다시 입력하는 곳으로 가라!!
						continue;
					}
					return intNum;
				} catch (NumberFormatException e) {
					System.out.println("숫자만 입력");
					// 다시 입력하는 곳으로 가라!!
					continue;
				}
				//return null;
			}
		}
	}
}
