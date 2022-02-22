package com.urdomain.lecture.ch06.exc;

public class FourthCarExample {

	public static void main(String[] args) {

		FourthCar fourthCar = new FourthCar();

		fourthCar.setGas(5); // Car의 setGas()메소드 호출

		boolean gasState = fourthCar.isLeftGas();

		if (gasState) {
			System.out.println("출발합니다.");
			fourthCar.run();
		}

		if (fourthCar.isLeftGas()) { // Car의 isLeftGas() 메소드호출
			System.out.println("gas를 주입할 필요가 없습니다. ");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
