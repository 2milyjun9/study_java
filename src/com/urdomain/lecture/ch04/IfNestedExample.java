package com.urdomain.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {

		
		int score = 75;
		String grade = "";
		
		if(score >=90) {
		   if(score >=95) {
			   grade = "A+";
		   }else if (score>=85) {
				   grade = "B+";
			   }
			   else if (score>=80) {
				   grade = "B";
			   }
			   else if (score>=75) {
				   grade = "C+";
			   }
			   else if (score>=70) {
				   grade = "C";
			   }
			   else if (score>=75) {
				   grade = "D+";
			   }
			   else if (score>=70) {
				   grade = "D";
			   }
		   }else {
			   grade = "F 정신차리세요";
			  
		}
		System.out.println("학점은:"+ grade);
	}

}
