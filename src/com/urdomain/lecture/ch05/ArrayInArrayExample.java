package com.urdomain.lecture.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
	
		//3가지 모두 동일한방법
		
		int[][] scores = {{99,88},{77,66},{55,44}};
		
//		int[][] scores2 = new int [3][2];
		
//		int [][] score3 = new int [3][];
//		score3[0] = new int[2];
//		score3[1] = new int[2];
//	score3[2] = new int[2];
		
//		System.out.println("scores.length:" + scores.length);
//		System.out.println();
		
		for(int i=0; i<scores.length; i++) {
// System.out.println(scores[i].length);
			for (int j=0; j<scores[i].length; j++) {
				System.out.println("score[" + i +"]["+j+"]:"+ scores[i][j]);
				
			}
			System.out.println();
		}
		scores[3][1]=100;
		System.out.println("scores[3][1]:" + scores[3][1]);
	}

}
