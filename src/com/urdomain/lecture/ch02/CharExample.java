package com.urdomain.lecture.ch02;

public class CharExample {

	public static void main(String[] args) {

		char c1= 'A'; //문자직접저장
		char c2= 65; //십진수로저장 
		char c3= '\u0041'; //16진수저장

		char c4= '가';
		char c5= 44032;
		char c6= '\uac00';
		
		int unicode = c1; //유니코드열기
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(unicode);
	}

}
