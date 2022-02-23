package com.urdomain.lecture.ch06.exc;

public class Person {

	
	final String nation = "Korea";   //1번초기화 방법
	final String ssn;
	String name;

public Person(String ssn, String name) {   //2번초기화 방법

	this.ssn =ssn;
	this.name = name;
}
}
