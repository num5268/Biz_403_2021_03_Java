package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

public class ScoreService2 implements ScoreService {

	protected Scanner scan;

	public ScoreService2() {
		scan = new Scanner(System.in);

	}

	@Override
	public void selectMenu() {
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("빛고을 고교 성적처리2021");
			System.out.println("=".repeat(50));
			System.out.println("1. 성적입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("3. 성적 저장");
			System.out.println("QUIT:종료");
			System.out.println("-".repeat(50));
			System.out.print("업무선택 >>");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				return;
			}
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("QUIT나 정수 1,2,3만 입력");
				continue;
			}
			System.out.println("1,2,3번만 입력");
		}
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
