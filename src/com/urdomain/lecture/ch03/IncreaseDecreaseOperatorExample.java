package com.urdomain.lecture.ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {


// ++ 1증감 -- 1감소 ++x; 
// 피연산자 1증가시키고 다른연산 수행 x++; 
// 다른연산 수행후 피연산자1증가 다른연산자가 없으면 앞에 있나 뒤에 있는 결과는동일

		
		
		int x = 10;
		int y = 10;
		int z ;
		

		System.out.println("-----------------------");
		++x;
		x++;
		System.out.println("x=" +x);   //x:12
		
		System.out.println("-----------------------");
		y--;
		--y;
		System.out.println("y=" +y);   //y:8
		
		
		System.out.println("-----------------------");
		z=x++;
		System.out.println("z=" +z);  //12
		System.out.println("x=" +x);  //13
		
		
		
		System.out.println("-----------------------");
		z=++x;
		System.out.println("z=" +z); //14
		System.out.println("x=" +x);  //14
		
		
		System.out.println("-----------------------");
		z=++x + y++;
		System.out.println("z=" +z);  //23
		System.out.println("x=" +x);  //14
		System.out.println("y=" +y);  //9
		


	}

}
