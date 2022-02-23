package com.urdomain.lecture.ch06.exc;

public class PersonExample {

	public static void main(String[] args) {

		Person person = new Person("123456-124567", "계백");
				
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);

		
		person.name = "을지문덕";
	}

}
