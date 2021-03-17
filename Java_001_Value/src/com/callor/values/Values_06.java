package com.callor.values;

public class Values_06 {
		public static void main(String[]args) {
			System.out.println((33%2) );
			// 33을 2로 나눈 나머지가 1인가? ==true
			System.out.println((33%2) == 1 );
			// 33을 2로 나눈 나머지가 0인가? ==false
			System.out.println((33%2) == 0 );
			// 어떤 수를 2로 나누어서 나머지가 0이면
			// 그 어떤 수는 짝수이고
			// 그렇지 않으면 그수는 홀수이다
			System.out.println( (33 % 2) == 0 
					? "짝수":"홀수");
		}

}
