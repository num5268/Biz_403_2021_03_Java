package com.callor.score.model;

public class WordVO {
	
	private String englisg;
	private String korea;
	private String count;
	public String getEnglisg() {
		return englisg;
	}
	public void setEnglisg(String englisg) {
		this.englisg = englisg;
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
		return "WordVO [englisg=" + englisg + ", korea=" + korea + 
				", count=" + count + "]";
	}
	
	

}
