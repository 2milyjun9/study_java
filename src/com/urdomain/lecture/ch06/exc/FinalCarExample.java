package com.urdomain.lecture.ch06.exc;

public class FinalCarExample {

	public static void main(String[] args) {
		
		
		FinalCar finalCar = new FinalCar ();
		
		//잘못된 속도변경
		
		finalCar.setSpeed(-50);
		
		System.out.println("현재속도:" + finalCar.getSpeed());
		
		//올바른 속도변경
		
		finalCar.setSpeed(60);
		
		//멈춤
		if(!finalCar.isStop()) {
			finalCar.setStop(true);
		}
		
		System.out.println("현재속도:" + finalCar.getSpeed());
	}

}
