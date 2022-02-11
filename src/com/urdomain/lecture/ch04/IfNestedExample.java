package com.urdomain.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {

		
int score = 98;
String grade = "";

if (score >= 90) {
	if (score >= 95) {
		grade = "A+";
	} else {
		grade = "A";
	}
}
else if  (score >= 80) {
		if (score >= 85) {
			grade = "B+";
		} else {
			grade = "B";
		}
	}
else if (score >= 70) {
			if (score >= 75) {
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





