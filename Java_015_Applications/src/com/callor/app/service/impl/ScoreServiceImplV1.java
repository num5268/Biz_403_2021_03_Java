package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.num5268.standard.InputService;
import com.num5268.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected Scanner scan;
	protected InputService ipService;
	protected List<ScoreVO> scoreList;

	public ScoreServiceImplV1() {
		ipService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {
		while (true) {
			System.out.println("1. 성적처리");
			System.out.println("2. 성적 리스트 출력");
			System.out.println("QUIT:업무중지");
			System.out.println("=".repeat(30));
			System.out.print(">> ");
			String strNums = scan.nextLine();
			System.out.println();

			if (strNums.equals("QUIT")) {
				break;
			}
			Integer intMenu;
			try {
				intMenu = Integer.valueOf(strNums);
			} catch (NumberFormatException e) {
				System.out.println("QUIT나 1,2번만 입력");
				continue;
			}
			if (intMenu == 1) {
				this.inputName();
			} else if (intMenu == 2) {
				this.printScore();
			} else {
				System.out.println("1,2번 중 한가지만 고르시오");
				continue;
			}
			return;
		}
		System.out.println("업무중지!");
		// TODO Auto-generated method stub
	}

	@Override
	public String inputName() {
		System.out.println("***학생 성적입력***");
		System.out.print("학번>> ");
		String strNum = scan.nextLine();
		System.out.print("이름>> ");
		String strName = scan.nextLine();

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		this.inputScore();
		return null;
	}

	@Override
	public void inputScore() {

		System.out.println("=".repeat(50));
		Integer intKor = ipService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = ipService.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = ipService.inputValue("수학", 0, 100);
		if (intMath == null) {
			return;
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		
		scoreList.add(scoreVO);

		this.selectMenu();

		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		System.out.println("=".repeat(55));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(55));

		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			System.out.print(scoreVO.getNum() + "\t");
			System.out.print(scoreVO.getName() + "\t");
			System.out.print(scoreVO.getKor() + "\t");
			System.out.print(scoreVO.getEng() + "\t");
			System.out.print(scoreVO.getMath() + "\t");
			System.out.print(scoreVO.getTotal() + "\t");
			System.out.printf("%3.2f\n", scoreVO.getAvg());
			
		}
		System.out.println("=".repeat(55));

		// TODO Auto-generated method stub

	}

}
