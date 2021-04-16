package com.callor.score.Impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	protected List<StudentVO> studentList;
	
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 학과 = 4;
	protected final int 주소 = 5;
	
	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
		this.loadStudent();
	}
	
	@Override
	public void insertStudent() {

	}

	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub
		String studentName = "src/com/callor/score/student.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(studentName);
			buffer = new BufferedReader(fileReader);

			String strST;
			while (true) {
				strST = buffer.readLine();
				if (strST == null) break;
			
				String students[] = strST.split(":");
				
				StudentVO studentVO = new StudentVO();
				
				studentVO.setNum(students[학번]);
				studentVO.setName(students[이름]);
				studentVO.setGrade(students[학년]);
				studentVO.setDept(students[학과]);
				studentVO.setAddress(students[주소]);
				
				studentList.add(studentVO);
				System.out.println(studentVO.toString());
				
			}
			System.out.println("종료");
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO 학번으로 학생조회하여 학생정보 return
		
		// 1번 코드
		int nSize = studentList.size();
		for( int i = 0 ; i<nSize; i++) {
			// StudentVO vo = null;
			// vo = studentList.get(i);
			StudentVO vo = studentList.get(i);
			if(vo.getNum().equals(num)) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public void printStudent() {
		System.out.println("=".repeat(60));
		System.out.println("학번\t 이름\t 학과\t 학년\t 주소");
		System.out.println("-".repeat(60));
		
		int nSize = studentList.size();
		for( int i = 0 ; i<nSize; i++) {
			StudentVO vo = studentList.get(i);
			
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getDept() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.print(vo.getAddress() + "\t\n");
		}
		System.out.println("=".repeat(60));

	}

}
