package com.callor.fine.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{
	// 무엇을 고쳐야하나? ImplV1에 private으로 하면안됨
	public ScoreServiceImplV2() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		
	}

}
