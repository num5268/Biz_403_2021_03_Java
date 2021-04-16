package com.callor.score.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	protected List<ScoreVO> scoreList;
	protected Scanner scan;

	private final int 학번 = 0;
	private final int 국어 = 1;
	private final int 영어 = 2;
	private final int 수학 = 3;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void insertScore() {

		while (true) {
			System.out.print("학번>> ");
			String strNum = scan.nextLine();
			System.out.print("국어 점수>> ");
			Integer intKor = scan.nextInt();
			System.out.print("영어 점수>> ");
			Integer intEng = scan.nextInt();
			System.out.print("수학 점수>> ");
			Integer intMath = scan.nextInt();

			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setNum(strNum);
			scoreVO.setKor(intKor.valueOf(국어));
			scoreVO.setEng(intEng.valueOf(영어));
			scoreVO.setMath(intMath.valueOf(수학));
			scoreList.add(scoreVO);

			int nSize = scoreList.size();
			for (int i = 0; i < nSize; i++) {
				ScoreVO vo = scoreList.get(i);
				if (vo.getNum().equals(strNum)) {
					System.out.println("학번 중복입력 금지");
				}
			}
		}
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {

		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.println(vo.getNum());
		}

	}

}
