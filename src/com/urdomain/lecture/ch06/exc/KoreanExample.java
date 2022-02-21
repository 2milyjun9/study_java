package com.urdomain.lecture.ch06.exc;

public class KoreanExample {
	
	public static void main(String[] args) {

		Korean korean = new Korean();
				
				System.out.println("korean.nation : " + korean.nation);
				System.out.println("korean.name : " + korean.name);
				System.out.println("korean.ssn : " + korean.ssn);

		
		korean.name = "정미림";
		korean.ssn = "132412341234";
		
				System.out.println("-----------------------");
				System.out.println("korean.nation : " + korean.nation);
				System.out.println("korean.name : " + korean.name);
				System.out.println("korean.ssn : " + korean.ssn);
				
				Korean korean2 = new Korean("전지현","064055640654064");		
				
				System.out.println("-----------------------");
				System.out.println("korean2.nation : " + korean2.nation);
				System.out.println("korean2.name : " + korean2.name);
				System.out.println("korean2.ssn : " + korean2.ssn);
				
				
				Korean korean3 = new Korean("고소영","12341341234324");		
				
				System.out.println("-----------------------");
				System.out.println("korean3.nation : " + korean3.nation);
				System.out.println("korean3.name : " + korean3.name);
				System.out.println("korean3.ssn : " + korean3.ssn);
}

}