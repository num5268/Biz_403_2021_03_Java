package com.callor.apps;

import java.util.Random;

public class App_01 {
	
	/*
	 *  { } 내에 있는 코드는 최소화 하자
	 *  작은 일들로 분해하기
	 *  
	 *  나누어서 정복하라 : Divide and Conquer
	 */

	public static void main(String[] args) {
		/*
		 * 배열의 크기를 변수에 설정해 두고
		 * 코드내에서 공통으로 사용하기
		 */
		int numsLength = 100;

		Random rnd = new Random();
		int[] num = new int[numsLength];
		int intSum = 0;
		// 값을 배열에 저장하기

		for (int i = 0; i<numsLength ; i++) {
			num[i] = rnd.nextInt(100) + 1;
			}
		
		// 짝수리스트 출력
		for (int i = 0 ; i<numsLength ; i++) {
			
			if (num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
		// intSum에 이전 코드에서 어떤 값이 저장되어
		// 있을지 모르기 때문에 clear 하고 시작
		
		// 합계하기 
		intSum=0;
		for (int i=0; i< numsLength; i++) {
			if(num[i] % 2 == 0) {
				// 짝수이면  intSum에 합산 누적
				intSum += num[i];
			}
		}
		System.out.printf("짝수들의 합 : %d\n",intSum);
	}
}

