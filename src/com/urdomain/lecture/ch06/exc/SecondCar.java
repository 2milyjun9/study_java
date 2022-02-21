package com.urdomain.lecture.ch06.exc;

public class SecondCar {
	
	String company = "현대자동차";
	String model = "";
	String color = "";
	int maxSpeed = 0;
	
	//생성자 위에 접근자 따라가고, 이름따라가고.........public SecondCar() {}
	public SecondCar() {
		
	}
	

	public SecondCar(String model) {

			this.model = model;
	}
	
	public SecondCar(String model,String color) {
		this.model = model;
		this.color = color;
	}
	
	public SecondCar(String model,int maxSpeed) {
		this.model = model;
		this.color = maxSpeed;
	}
	
	public SecondCar(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
