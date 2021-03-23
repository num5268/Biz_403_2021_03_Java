package com.callor.apps;

public class Pay_05 {
	
	public static void main(String[] args) {
		
		int Pay = 3_723_560;
		int Paper = 50_000;
		
		int sw =1;
		for (;;) {
			int Count = Pay / Paper;
			System.out.printf("%6d 원권  %5d매\n",
							Paper,Count);
			// Paper 2 또는 5로 나누기
			Pay %= Paper;
			if(Pay < 0) {
				break;
			}
			if (sw > 0) {
				Paper /= 5;
			} else {
				Paper/=2;
			}
			sw *= (-1);
		}
		
	}

}
