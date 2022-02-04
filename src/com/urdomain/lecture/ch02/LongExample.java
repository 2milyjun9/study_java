package com.urdomain.lecture.ch02;

public class LongExample {

	public static void main(String[] args) {
		
		
		long var1= 10; 
		long var2= 20L;
		long var3= 1123145345L;
		long var4= 10000000000L;
		
		//int범위를 벗어나는 리터럴인 경우엔 뒤에 l을 붙여주어야한다.
		//int -2147483648~214483647
		//long -9223372036854775808~9223372036854775807
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);

	}

}
