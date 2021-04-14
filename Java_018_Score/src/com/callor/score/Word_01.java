package com.callor.score;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class Word_01 {
	
	public static void main(String[] args) {
		
		
		String fileName = "src/com/callor/score/word.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			String reader;
			while(true) {
				reader = buffer.readLine();
				
				if(reader == null) break;
				
				String[] names = reader.split(":");
				System.out.printf("%s\t\t %s\n"
						,names[0],names[1]);
			}
			System.out.println("종료");
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
