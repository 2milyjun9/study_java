package com.urdomain.lecture.ch02;

public class CastingExample {

	public static void main(String[] args) {
		// byte  < short < int < long 작은놈이 큰놈으로변환시문제없지만 반대는문제된다
		// float < double
		
		//강제 형변환
		

		int intValue =44032;
		System.out.println("intValue: " + intValue);
		
		char charValue = (char) intValue;  //44032->char  가 나 다 라 
		System.out.println("charValue: " + charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println("intValue=" + intValue);

		double doubleValue = 3.14;
		intValue= (int) doubleValue;
		System.out.println("intValue=" + intValue);

	}

}
