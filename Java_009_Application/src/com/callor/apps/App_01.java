package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_01 {
	
	public static void main(String[] args) {
		
		// ScoreServicdV1 클래스를 사용하여
		// 객체를 생성할때, 정수 5를 전달해 주고
		// 5만큼 배열을 생성하도록 코드를 변경
		ScoreServiceV1 ssV1 = new ScoreServiceV1(5);
		
		/*
		 * method를 호출하여 명령 실행하기
		 *  ssV1.makeScore() 명령을 한줄에 실행하므로써
		 *  ScoreServiceV1 클래스에 
		 *  정의되어 있는 
		 *  		"어떤코드"가 실행되는 효과를 만들어낸다
		 */
		ssV1.makeScore();
		ssV1.addNum();
		
		/*
		 * inputScore() method는 private 으로 
		 * 선언되어 있기 때문에
		 * 객체. inputScore() 형식으로 사용할수 없다.
		 */
		//scV1.inputScore();
	}

}
