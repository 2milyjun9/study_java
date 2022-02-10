package com.urdomain.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {

		/*
		 * int score = 75; String grade = "";
		 * 
		 * if (score >= 90) { if (score >= 95) { System.out.println("A+"); } else {
		 * System.out.println("A"); } } else if (score >= 80) { if (score >= 85) {
		 * System.out.println("B+"); } else { System.out.println("B"); } } else if
		 * (score >= 70) { if (score >= 75) { System.out.println("C+"); } else {
		 * System.out.println("C"); } } else { System.out.println("F"); } } }
		 */

int score = (int) 4.0;
String grade = "";

if (score >= 4.0) {
	if (score >= 4.3) {
		grade = "A+";
	} else {
		grade = "A";
	}
}
else if  (score >= 3.0) {
		if (score >= 3.5) {
			grade = "B+";
		} else {
			grade = "B";
		}
	}
else if (score >= 2.0) {
			if (score >= 2.5) {
				grade = "C+";
			} else {
				grade = "C";
			}
		}
else  {
	grade = "F";
			}
System.out.printf("학점은:" + grade);
		}
}
