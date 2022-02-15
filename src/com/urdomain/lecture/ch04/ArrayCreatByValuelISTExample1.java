package com.urdomain.lecture.ch04;

public class ArrayCreatByValuelISTExample1 {

	public static void main(String[] args) {
		
		
//		int[] score;   //선언
//		int  score2 []; // 선언
				
//		int[]score3 = {1,2,3}; // 객체 생성
//		int score4[] = {4,5,6}; // 객체 생성
		
//		double[] score6 = {1,2,3,4};
//		String [] strArray = {"장원영", "전지현", "고소영"};
		
		
		int[] score = {83,90,87,99};
		System.out.println("Score[0]"+score[0]);
		System.out.println("Score[1]"+score[1]);
		System.out.println("Score[2]"+score[2]);
		System.out.println("Score[3]"+score[3]);
		
		int sum = 0;
		for(int i=0; i<4; i++) {
			
			sum+=score[i];
		}
		System.out.println("총합은: " +sum);
		double avg = (double) sum/4;
		System.out.println("평균은: " +avg);
		
		
	}

}
