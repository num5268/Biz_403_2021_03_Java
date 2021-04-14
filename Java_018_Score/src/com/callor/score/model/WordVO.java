package com.callor.score.model;

public class WordVO {
	
	private String english;
	private String korea;
	private String count;
	public String getEnglisg() {
		return english;
	}
	public void setEnglisg(String english) {
		this.english = english;
	}
	public String getKorea() {
		return korea;
	}
	public void setKorea(String korea) {
		this.korea = korea;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "WordVO [englisg=" + english + ", korea=" + korea + 
				", count=" + count + "]";
	}
	
	

}
