package com.callor.fine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService{

	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	// 두개의 메서드 구현
	public void inputService() {
		
	}

	public void printService() {
		
	}

}
