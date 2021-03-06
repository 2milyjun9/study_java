package com.urdomain.lecture.ch10;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {

//		사전 처리가 중요하다.
		
		String data1 = null;
		String data2 = null;
		
		
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {		//예외는 경험적으로 작성을 하는 부분이 있고 모호하면 Exception 사용
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TrayCatchFinallyRuntimeExceptionExample num1 num2");
			return;		// return을 해버리면 아래 try catch문이 돌지 않는다.
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(NumberFormatException e) {		//예외는 경험적으로 작성을 하는 부분이 있고 모호하면 Exception 사용
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}