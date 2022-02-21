package com.urdomain.lecture.ch06.exc;

public class Korean {

	String nation = "대한민국";
	String name;
	String ssn;  //소셜 시큐리티 넘버 
	
	
	public Korean() {
		
		//이건 꺼ㅃ데기?
	}
	
	/*
	 * public Korean(String n, String s) {
	 * 
	 * name = n; ssn = s;
	 * 
	 * }
	 */
		
		public Korean(String name, String ssn) {
			
			this.name = name;
			this.ssn = ssn;
	}
	
}
