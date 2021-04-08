package com.callor.service.service;

import com.num5268.standard.InputService;
import com.num5268.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 {
		InputService isV1;
	public ScoreServiceV1() {
		isV1 = new InputServiceImplV1();
	}
	
	public void printScore() {
		
		Integer intKor = isV1.inputValue("국어", 0,100);
		Integer intEng = isV1.inputValue("영어", 0,100);
		Integer intMath = isV1.inputValue("수학", 0,100);
		
		int sum = intKor +intEng +intMath;
		float avg= (float) sum/3;
		
		System.out.println("총점 : "+ sum);
		System.out.println("평균 : "+ avg);
	}
	
}
