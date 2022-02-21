package com.urdomain.lecture.ch06.exc;

import com.urdomain.lecture.ch06.Car;

public class StudentrExample {

	public static void main(String[] args) {
		
		
		Car car =new Car();
		
		Student student = new Student();
		
		System.out.println("student.no" + student.no);
		
		//객체접근 연산자. 을 사용하여 car 객체변수의 값을 참조
		System.out.println("company" + car.company);
		System.out.println("model" + car.model);
		System.out.println("color" + car.color);
		System.out.println("maxSpeed" + car.maxSpeed);
		System.out.println("speed" + car.speed);    //0
		
		car.speed = 100;
		
		System.out.println("speed:" + car.speed);  //100
		System.out.println();  

	//speed 가 maxspeed 보다 속도가 높은지 낮은지를 출력해 주는 함수를 만들어서 출력하시오.
	upDown(car.maxSpeed, car.speed);
	}
	
public static void upDown (int maxSpeed, int speed) {
	if(maxSpeed>speed) {
		System.out.println("speed가 maxSpeed보다 낮습니다. ");
	}	else if(maxSpeed<speed) {
			System.out.println("speed가 maxSpeed 보다 높습니다.");
	}		else
				System.out.println("speed가 maxSpeed와 동일합니다. ");
	}
	}

