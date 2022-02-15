package com.urdomain.lecture.ch04;

public class Exc {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		//2부터 9까지 정수형 배열 변수 2개를 만들고 for문을 사용하여 구구단 출력을 하시오
		
		int[] array1 = {2, 3, 4, 5, 6, 7, 8, 9};	// 2 ~ 9
		int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};	// 1 ~ 9
		
		
		for(int j = 0; j < array2.length; j++) {
			for(int i = 0; i < array1.length; i++) {

				System.out.print(array1[i] + " X " + array2[j] + " = " + array1[i]*array2[j] + '\t');
			}
			System.out.println();
		}

}}