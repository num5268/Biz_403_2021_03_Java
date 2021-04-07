package com.callor.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	protected String[] subject;
	protected InputServiceV2 inService;

	List<Integer> kors;
	List<Integer> engs;
	List<Integer> maths;
	public ScoreServiceV5() {
		inService = new InputServiceV2();
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();
		subject = new String[] {"국어","영어","수학"};
		
	}

	public void inputScore() {
		for (int i = 0; i < subject.length; i++) {
			Integer score = inService.inputValue(subject[i],0,100);
			if( score == null){
				return;
			}
			if( i ==0) {
				kors.add(score);
			} else if(i ==1) {
				engs.add(score);
			} else if(i == 2) {
				maths.add(score);
			} else if(i==3) {
				
			}
		}
	}
	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t합계");
		System.out.println("-".repeat(50));
		
		for(int index = 0; index < kors.size();index++) {
			System.out.println(kors.get(index)+"\t");
			System.out.println(engs.get(index)+"\t");
			System.out.println(maths.get(index)+"\t");
			}
		System.out.println("=".repeat(50));
	}
	public void inputScore1() {
		for(int st = 0; st<5; st++) {
			Integer[] scores = new Integer [subject.length];
			for(int sb =0; sb<subject.length; sb++) {
				scores[sb] = inService.inputValue(subject[sb]);
			}
			// scores에는 한 학생의 국어,영어,수학 점수가
			// 저장되어 있다
			kors.add(scores[0]);
			engs.add(scores[1]);
			maths.add(scores[2]);
		}
	}

}
