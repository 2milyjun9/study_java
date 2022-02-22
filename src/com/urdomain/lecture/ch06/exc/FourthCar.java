package com.urdomain.lecture.ch06.exc;

public class FourthCar {
//필드
	
	int gas;  // 3 2 1 0
	
	//생성자
	
	//메소드
	
	void setGas(int gas) {  //T T T F
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다. ");
			return  false;
		}
		System.out.println("gas가 있습니다.");
		return true;
			
	}
	
	void run() {
		while(true) {
			if(gas>0) {  // 3 2 1
				System.out.println("달립니다.(gas잔량 :)"+ gas + ")");
				gas -=1; // 2 1 
			} else { //0
				System.out.println("멈춥니다.(gs잔량 : )" + gas + ")");
				return;
			}
		}
	}
}
