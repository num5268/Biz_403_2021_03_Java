package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		System.out.print(">>");
		int intNum = 0;
		intNum = scan.nextInt();
			if(intNum%2==0) {
				
				System.out.printf("입력한 정수 %d는 짝수 입니다\n",intNum);
			} else {
				System.out.printf("입력한 정수 %d는 짝수가 아닙니다\n",intNum);
			}
		for (int index = 2; index<intNum ; index++) {
			if (intNum%index==0) {
				System.out.printf("입력한 정수 %d는 소수가 아닙니다\n",intNum);
			} else {
				System.out.printf("입력한 정수 %d는 소수 입니다\n",intNum);
			} break;
		}
	}
}
