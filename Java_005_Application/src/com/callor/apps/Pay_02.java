package com.callor.apps;

public class Pay_02 {
	
	public static void main(String[] args) {
		
		int Pay = 3_723_560;
		int Paper = 50_000;
		
		for (int index = 0;Pay >0;index++) {
			
			int Count = Pay / Paper;
			System.out.printf("%6d 원권  %5d매\n",
							Pay,Count);
			Pay %= Paper;
			if (index %2==0) {
				Paper /= 5;
			} else {
				Paper/=2;
			}
			// Paper 2 또는 5로 나누기
			
		}
		
	}

}
