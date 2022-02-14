package com.urdomain.lecture.ch04;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
	
		int i  = 1;
		int sum =  0; 
		while (i<=10) {
			System.out.println(i);
			i++;
			sum +=1;
		}

	System.out.println("1~" + i + " 합:" + sum);
	}

}
