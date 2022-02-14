package com.urdomain.lecture.ch04;

public class Test {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int evenSum = 0;
		int oddSum = 0;
		
		for ( i=2; i<=9; i++ ) 
		for(j=1; j<=9; j++) 
			if(i*j %2==0) {
				evenSum += i*j;
						
			}else {
				oddSum += i*j;	
		}
    System.out.println("구구단 결괏값의 짝수의 총 합은 " +evenSum+ "이고, 홀수의 총 합은 " + oddSum
            + "입니다.");
	}
}




