package com.callor.apps;

public class Pay_03 {
	
	public static void main(String[] args) {
		
		int Pay = 3_723_560;
		int Paper = 50_000;
		
		int sw =1;
		for (int index = 0;Pay >0;index++) {
			int Count = Pay / Paper;
			System.out.printf("%6d 원권  %5d매\n",
							Paper,Count);
			// Paper 2 또는 5로 나누기
			Pay %= Paper;
			if (sw > 0) {
				Paper /= 5;
			} else {
				Paper/=2;
			}
			sw *= (-1);
		}
		
	}

}
