package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class NumberServiceV7 {
	List<Integer> ipList;
	protected InputService ipService;
	public NumberServiceV7() {
		ipList = new ArrayList<Integer>();
		ipService = new InputService();
	}
	public Integer inputNum() {
		while (true) {
			
			Integer retNum = ipService.inputValue("점수 0~100");
			
			if(retNum == null) {
				return null;
			} else if(retNum < 0 || retNum >100) {
				System.out.println("범위초과");
				continue;
			} else {
				return retNum;
			}
		}
	}
}
