package com.callor.service;

public class ScoreScerviceV3 {

	protected InputServiceV2 inService;
	
	public ScoreScerviceV3() {
		inService = new InputServiceV2();
	}
	public void inputScore() {
		Integer intKor = inService.inputValue("국어",0,100);
		
		if(intKor == null) {
			System.out.println("종료");
			return;
		} else {
			System.out.printf("국어점수 : %d\n",intKor);
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if(intEng == null) {
			System.out.println("종료");
			return;
		} else {
			System.out.printf("영어점수 : %d\n" , intEng);
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if(intMath == null) {
			System.out.println("종료");
			return;
		}else {
			System.out.printf("수학점수 : %d\n", intMath);
		}
		Integer intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		float avg = (float)intSum/3;
		
		System.out.println("총점 : "+ intSum);
		System.out.println("평균 : "+ avg );
		
		
	}
	

}
