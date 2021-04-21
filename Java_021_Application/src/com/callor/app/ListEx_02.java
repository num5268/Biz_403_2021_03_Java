package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_02 {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0; i < 10; i++) {
			intList.add( rnd.nextInt(100)+1);
		}
		System.out.println(intList.toString());
		sort(intList);
		
		// intList
		System.out.println("=".repeat(50));
		System.out.println(intList.toString());
		
	} // end main
	
	public static void sort(List<Integer> list) {
		
		int nSize = list.size();
		for(int i = 0; i < nSize; i++) {
			for(int j = 0; j< nSize; j++) {
				if(list.get(i) > list.get(j)) {
					
					Integer te = list.get(i);
					list.set(i, list.get(j));
					list.set(j, te);
				}
			}
		}
		System.out.println(list);
	}
}
