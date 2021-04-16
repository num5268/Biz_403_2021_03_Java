package com.callor.score;

import com.callor.score.Impl.StudentServiceImplV1;
import com.callor.score.service.StudentService;

public class Student_01 {
	
	public static void main(String[] args) {
	
		StudentService stService = new StudentServiceImplV1();
		stService.getStudent("학번");
		
	}
	
	
}
