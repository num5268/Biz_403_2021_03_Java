package com.callor.method;

import com.callor.method.service.NumberServiceV1;

public class NumberEx_01 {
	
	public static void main(String[] args) {
		
		NumberServiceV1 nsV1 = new NumberServiceV1();
		/*
		 * inputNum() method는 정수값을 생성하여
		 * 	3의 배수이면 정수를 아니면 null값을 
		 * 	return 하도록 되어있다
		 * 따라서 이 method를 단순히 호출만 하는 것은
		 *  아무런 의미가 없다
		 *  
		 * 이 method가 어떤 명령들을 수행하는지 알수 있는
		 * 	방법이 없다.
		 */
			nsV1.inputNum();
		/* 이 method는 return 명령문이 강제되어 있기 때문에
		 * method가 return하는 값을 받아서
		 * 	변수에 저장할 수 있다.
		 */
		Integer retNum = nsV1.inputNum();
		/*
		 * method가 return 해준 값을 저장한 변수 retNum값을
		 * 참조하여 이후 코드를 작성할 수 있다.
		 */
		if(retNum == null) {
			System.out.println("return된 값은 3의 배수가아님");
		} else {
			System.out.println(retNum + "는 3의 배수");
		}
		
		// 위의 코드보다 더 권장하는 코드
		if(retNum != null ) {
			System.out.println(retNum + "는 3의 배수");
		} else {
			System.out.println("3의 배수가 아님");
			// 다른 처리를 수행하는 코드를 작성
		}
	}

}
