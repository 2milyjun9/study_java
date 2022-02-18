package com.urdomain.lecture.fuction;

public class Fuction {

	public static void main(String[] args) {
	
	//   2. 함수의 사용
	      int sum = add(4, 2);
	      System.out.println(sum);
	      
	      int subtract = bbb(4, 2);
	      System.out.println(subtract);
	      
	      int multiply = ccc(4, 2);
	      System.out.println(multiply);
	      
	      int remainder = ddd(4, 2);
	      System.out.println(remainder);
	      
	      int division = eee(4, 2);
	      System.out.println(division);
	      
	   }
	   
	//   1. 함수 선언
	   public static int add(int a, int b) {
	      int sum = a + (b+1);
	      return sum;
	   }
	   

//	    - * % / 에 대한 함수를 선언 후 사용하는 프로그래밍을 완성하시오.
	   
	   public static int bbb(int a, int b) {
	      int subtract = a - b;
	      return subtract;
	   }
	   public static int ccc(int a, int b) {
	      int multiply = a * b;
	      return multiply;
	   }
	   public static int ddd(int a, int b) {
	      int remainder = a % b;
	      return remainder;
	   }
	   public static int eee(int a, int b) {
	      int division = a / b;
	      return division;
	   }
}
	//	public int aaa(int a, int b, int c , String d, boolean e) {
	//		System.out.println(a);
	//		return 1;
	//	}
		
//public String bbb() {
			
//			return"";
//		}

//public boolean ccc() {
	
//	return true;
//}
//	}


//덧셈함수 int int

//public static int addd(int a, int b) {
//	return 1;
//}

//public static String bbb(String a, String b) {
	
	//String ccc = a+b;
//	return ccc;

