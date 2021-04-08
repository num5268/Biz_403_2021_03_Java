package com.callor.service.service;

import java.util.Scanner;

public class InputServiceV1 {

	Scanner scan;

	public InputServiceV1() {
		scan = new Scanner(System.in);
	}

	public Integer InputValue(String title) {
		while (true) {
			System.out.println(title + "값을 입력하세요(QUIT)");
			System.out.print(">> ");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				return null;
			} else {
				Integer intNum = null;
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					System.out.println("정수나 QUIT만 입력");
					continue;
				}
				return intNum;
			}
		}
	}

	public void InpuyValue(String title, int start) {

	}

	public void InputValue(String title, int start, int end) {

	}

}
