package com.callor.apps;

import java.util.Random;

/*
 * 5명 학생의 3과 점수(국어,영어,수학)의
 * 성적표 만들기
 */
public class App_05A {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		// 과목 3가지를 학생수 만큼 배열을 선언
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		
	
		
		for (int i = 0; i<5 ; i++) {
			intKor[i] = rnd.nextInt(51)+50;
			intEng[i] = rnd.nextInt(51)+50;
			intMath[i] = rnd.nextInt(51)+50;
		}
		// 학생별로 총점과 평균을 계산하여
		// 저장해두기
		int [] intTotal = new int[5];
		float[] floatAvg = new float[5];
		
		for (int i = 0 ; i<5;i++) {
			
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float)intTotal[i] / 3;
		}
		int intKorTotal = 0;
		int intEngTotal = 0;
		int intMathTotal = 0;
		int intAllTotal = 0;
		
		// 리스트 출력하기
		
		System.out.println("===========================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===========================");
		
		
		for (int i = 0 ; i<5;i++) {
			
			System.out.print((i+1)+"\t");
			System.out.print(intKor[i]+"\t");
			System.out.print(intEng[i]+"\t");
			System.out.print(intMath[i]+"\t");
			
			System.out.print(intTotal[i]+"\t");
			System.out.printf("%3.2f",floatAvg[i]);
			System.out.println();
			
			intKorTotal += intKor[i];
			intEngTotal += intEng[i];
			intMathTotal+= intMath[i];
			intAllTotal += intTotal[i];
		}
		System.out.println("=============================");
		System.out.printf("총점\t%d\t%d\t%d\t%d\n",
					intKorTotal,
					intEngTotal,
					intMathTotal,
					intAllTotal);
	}

}
