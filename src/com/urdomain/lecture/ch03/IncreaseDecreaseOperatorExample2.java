package com.urdomain.lecture.ch03;

public class IncreaseDecreaseOperatorExample2 {

	public static void main(String[] args) {


// ++ 1증감 -- 1감소 ++x; 
// 피연산자 1증가시키고 다른연산 수행 x++; 
// 다른연산 수행후 피연산자1증가 다른연산자가 없으면 앞에 있나 뒤에 있는 결과는동일

		
		
		int x = 10;
		int y = 10;
		int a = 0;
		int b = 0;
		
		++x;
		System.out.println(x);
		
		y++;
		System.out.println(y);
		
		a=++x;
		b=x++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		

	}

}
