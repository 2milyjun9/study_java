package com.urdomain.lecture.ch04;

public class SwitchExample {

	public static void main(String[] args) {
	
		
		//Math.random() :  0.0~1.0에 가까운 double 형 값 보내줌
		//int num = Math.randon() * (max - min + 1) +min;
		
		//	double num = Math.random();
		//	System.out.println(num);
		
		int num1 = (int) (Math.random() * (6-1+1)+1);
		int num2 = (int) (Math.random() * (6-1+1)+1);
		int sum = num1+num2;
		
		
			System.out.println("첫번째 주사위는"+ num1 + "번 입니다.");
			System.out.println("두번째 주사위는"+ num2 + "번 입니다.");
			System.out.println("두수의 합은"+ sum + "입니다.");
	}
	}



