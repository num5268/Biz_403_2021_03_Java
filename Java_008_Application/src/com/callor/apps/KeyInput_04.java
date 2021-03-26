package com.callor.apps;

import java.util.Arrays;
import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {
	
	public static void main(String[] args) {
		
		String dLine = LinesService.dLines(30);
		
		Scanner scan = new Scanner(System.in);
		
		int[] intNum = new int[5];
		int intSum =0;
		
		System.out.println("정수 5개를 입력합니다");
		System.out.println(LinesService.dLines(21));
		for (int i = 0 ; i<intNum.length ; i++) {
			System.out.printf("정수 %d번 >> " ,i+1);
			intNum[i] = scan.nextInt();
		}
		intSum = 0;
		for(int i = 0 ;i<intNum.length; i++) { // 합계 부분
			intSum +=intNum[i];
		}
		System.out.println(dLine);
		System.out.print("입력한 숫자들 : ");
		System.out.println(Arrays.toString(intNum));// 리스트 출력문
		System.out.println(dLine);
		System.out.printf("리스트 합계 : "+intSum);
		System.out.printf("\n"+LinesService.dLines(18));
	}

}
