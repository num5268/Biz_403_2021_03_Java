package com.callor.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	protected InputNumberV1 inputNum;
	
	protected Scanner scan = new Scanner(System.in);
	
	public void inputScore() {
		
		Integer retNum = inputNum.inputValue("국어",0,100);
		
		if(retNum == null) {
			System.out.println("종료");
		} else {
			System.out.printf("점수 : %d",retNum);
		}
	}
	
}
