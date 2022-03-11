package com.urdomain.lecture.test;

public class ComputerExample {
	
	public static void main(String[]args) {
		int r = 7;
		
		System.out.println("원의 반지름 : " + r);

		
		Calculator calculator = new Calculator();
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적 : " + calculator.Circle(r));

		
		Computer computer = new Computer();
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적 : " + computer.Circle(r));
	}

}
