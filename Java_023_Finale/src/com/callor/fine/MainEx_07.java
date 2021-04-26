package com.callor.fine;

public class MainEx_07 {

	public static void main(String[] args) {

		/*
		 * 5단 구구단 출력하기
		 */

		int nums = 5;
		System.out.printf("%d 단 구구단\n", nums);
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", nums, i, nums * i);
		}

	}

}
