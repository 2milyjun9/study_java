package com.urdomain.lecture.ch06.exc;

public class SeventhCar {

	
	int speed = 0;
	
void run () {
	System.out.println(speed + "으로 달립니다.");
}

public static void main(String[] args) {
	
	SeventhCar seventhCar = new SeventhCar();
	
	seventhCar.speed = 10;
	seventhCar.run();

}
}
