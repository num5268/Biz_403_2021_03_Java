package com.callor.apps.service;

import java.util.Random;

//클래스 선언문(시작하는곳)
public class EvenServiceV1 {
	int intNum1[]; // 이렇게 하지않는다
	int intNum[]; // 여기서는 선언만
	
	/*
	 * 생성자 method
	 *  클래스를 선언하면
	 *  자동으로 만들어지는 method
	 *  별도의 코드가 필요없으면 만들지 않아도 된다
	 *  new EvenServiceV1() 코드에서 호출되는 method
	 * 생성자 method에는 클래스영역의 변수들을
	 *  초기화 생성하기 위한 코드들이 작성된다. 
	 */
	public EvenServiceV1() {
		intNum = new int[100]; // 생성은 생성자에서
	}
	
	public void makeNums() {
		
		Random rnd = new Random();
		// intNums 배열 개수만큼 코드를 반복실행하라
		for (int i = 0; i< intNum.length; i++) {
			intNum[i] = rnd.nextInt(100)+1;
		}
	}
	
	// 짝수(Even) 홀수(Odd)
	public void printEven() {
		
		System.out.println("===========================");
		System.out.println("짝수들의 리스트");
		System.out.println("===========================");
		int intSum = 0;
		
		// intNums 배열 전체를 뒤져서
		// 짝수가 있으면 찾아서 출력하라
		for (int i = 0 ; i<intNum.length; i++) {
			if (intNum[i]%2==0) {
				System.out.println(intNum[i]);
			}
		}
		
	}
	public void sumEven () {
		int intSum = 0;
		for (int i = 0 ; i<intNum.length ; i++) {
			if (intNum[i]%2==0) {
				intSum += intNum[i];
				
			}
		}
		
		System.out.println("짝수의 합:"+intSum);
	}
}
