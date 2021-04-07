package com.callor.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	protected InputNumberV1 inputNum;
	
	protected Scanner scan = new Scanner(System.in);
	
	public Integer inputScore() {
		
		Integer retNum = inputNum.inputValue("kor",0,100);
		
		if(retNum == null) {
			System.out.println("종료");
		} else {
			System.out.printf("점수 : %d",retNum);
		}
		return retNum;
	}
	
}
