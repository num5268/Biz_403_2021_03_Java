package com.callor.method;

import com.callor.method.service.NumberServiceV1;

public class Method_03 {
	
	public static void main(String[] args) {
		
		/*
		 * NumberServiceV1 클래스에 작성한 inputNum()을
		 * 호출하여 명령을 수행하고 싶다
		 * 이때 C와 같은 언어는 단순히 method 이름만
		 * 호출하여 명령을 수행할 수 있다.
		 * 이런 type을 함수호출(function call)이라고 한다
		 *	inputNum(); // 함수호출 방식 
		 * 하지만,
		 * 자바는 이러한 함수호출 방식으로 명령을
		 * 		수행할 수 없다.
		 */
		
		/*
		 * 클래스에 정의된 method를 호출하여
		 * 명령을 수행하려면
		 * 1. 클래스를 사용하여 객체를 생성해야 한다
		 * 2. 객체와 연결연산자를 사용하여 호출한다
		 * 
		 * 	nsV1.inputNum() 방식으로 호출해야 하며
		 * 	nsV1은 이 전에 객체로 생성되어 있어야 한다
		 */
		NumberServiceV1 nsV1 = new NumberServiceV1();
		nsV1.inputNum();
	}

}
