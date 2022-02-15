package com.urdomain.lecture.ch04;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		
		//갯수만 우선 정하고 데이터는 나중에 채워넣겠다
		
		String [] strArray = new String[3];
		
		strArray[0] = "정미림";
		strArray[1] = "정미림";
		strArray[2] = new String ("정미림");

		
		for (int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}

			System.out.println(strArray[0]==strArray[1]);   //T
			System.out.println(strArray[0]==strArray[2]);   //F
			
			System.out.println(strArray[0].equals(strArray[1]));   //T
			System.out.println(strArray[0].equals(strArray[2]));   //T
	}

}
