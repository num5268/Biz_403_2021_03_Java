package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.num5268.standard.InputService;
import com.num5268.standard.MenuService;
import com.num5268.standard.impl.InputServiceImplV1;
import com.num5268.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV2 implements ScoreService {

	protected InputService ipService;
	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;

	public ScoreServiceImplV2() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		ipService = new InputServiceImplV1();
	}

	@Override
	public void selectMenu() {

		/*
		 * 보통 맴버변수(클래스영역에 선언된 변수들) 
		 * 		객체는 이 클래스의 생성자에서 만드는 것이 좋다
		 * 
		 * 하지만 객체를 생성할때 전달해야할 매개변수(파라메터)에 
		 * 		대하여 수행해야할 연산코드가 있을 경우는 
		 * 		객체를 사용하기 전에 객체를 생성하는
		 * 		코드를 작성하여도 된다.
		 */

		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");

		menuService = new MenuServiceImplV1("빛고을 고교 성적처리", 
				scoreMenu);

		while (true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				System.out.println("업무종료!!!");
				break;
			}
			if (menu == 1) {
				this.inputScore();
			} else if (menu == 2) {
				this.printScore();
			} else if (menu == 3) {
				this.saveScore();
			}
		}
	}

	@Override
	public void inputScore() {
		// 학번입력, 이름입력, 과목별 성적 입력
		// ScoreVO 객체에 담고, list에 추가
		// = ScoreVO 클래스를 사용하여 새성한 scoreVO객체에 담고
		// = ScoreVO에 담고

		System.out.print("학번입력>> ");
		String strNum = scan.nextLine();
		if (strNum.equals("QUIT")) {
			return;
		}
		Integer intNum = null;
		try {
			intNum = Integer.valueOf(strNum);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("QUIT만 입력");

		}
		System.out.print("이름입력>> ");
		String strName = scan.nextLine();

		Integer intKor = ipService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = ipService.inputValue("영어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intMath = ipService.inputValue("수학", 0, 100);
		if (intKor == null) {
			return;
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		scoreList.add(scoreVO);
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		while (true) {
			System.out.println("성적리스트 저장");
			System.out.println("저장할 파일이름을 입력하세요");
			System.out.print(">> ");
			String strFileName = scan.nextLine();
			if (strFileName.equals("")) {
				System.out.println("파일이름을 입력해야 합니다");
				continue;
			}

			FileWriter fileWriter = null;
			PrintWriter out = null;

			strFileName = "src/com/callor/app/" + strFileName + ".txt";

			try {
				fileWriter = new FileWriter(strFileName);
				out = new PrintWriter(fileWriter);

				int nSize = scoreList.size();
				/*
				 * 파일에 저장할때
				 * 각 데이터를 컴마(,)로 구분하여 입력하고
				 * 파일이름을 csv로 저장하면
				 * excel에서 파일을 읽을 수 있다
				 * 
				 * csv : 
				 */
				
				for (int i = 0; i < nSize; i++) {
					ScoreVO vo = scoreList.get(i);
					out.print(vo.getNum() + ",");
					out.print(vo.getName() + ",");
					out.print(vo.getKor() + ",");
					out.print(vo.getEng() + ",");
					out.print(vo.getMath());
				}
				out.flush();
				out.close();
			} catch (IOException e) {
				System.out.println("파일을 생성할수 없습니다.");
				System.out.println("파일 이름을 다시 입력해 주세요");
				continue;
			}
			return;
		}
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
