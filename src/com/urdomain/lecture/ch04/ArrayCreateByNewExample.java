package com.urdomain.lecture.ch04;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
		int[] arr1 = new int [3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr["+i+"]: " +arr1[i]);
		}
		
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"]: " +arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i =0;i<3; i++) {
			System.out.println("arr2[" +i+"] :" +arr2[i]);
		}
		
		arr2[0]=1.0;
		arr2[1]=2.0;
		arr2[2]=3.0;
		

	for(int i =0;i<3; i++) {
		System.out.println("arr2[" +i+"] :" +arr2[i]);
	}
	
	
	String[] arr3 = new String[3];
	for (int i =0; i<3; i++) {
		System.out.println("arr3[" +i+"] :" +arr3[i]);
	}
	
	arr3[0]="정미림";
	arr3[1]="박기동";
	arr3[2]="박선우";
	
	}

}
