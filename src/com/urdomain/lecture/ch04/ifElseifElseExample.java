package com.urdomain.lecture.ch04;

public class ifElseifElseExample {

	public static void main(String[] args) {

		int score = 75;

		if (score >= 90) {
			System.out.println("점수가 100~90 사이 입니다. ");
			System.out.println("등급은 A 입니다.  ");
		} else if (score >= 90) {
			System.out.println("점수가 80~89 사이입니다. ");
			System.out.println("등급은 B 입니다.  ");
		} else if (score >= 80) {
			System.out.println("점수가 70~79 사이입니다. ");
			System.out.println("등급은 C 입니다.  ");
		} else if (score >= 70) {
			System.out.println("점수가 60~69 사이입니다. ");
			System.out.println("등급은 D 입니다.  ");
		} else {
			System.out.println("점수가 60 미만 입니다. ");
			System.out.println("등급은 F 입니다. 정신차리세요  ");
		}

		int a = 0;
		int b = 0;

		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");

		}
	}
}