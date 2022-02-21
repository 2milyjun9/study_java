package com.urdomain.lecture.ch06.exc;

public class SecondCarExample {
	public static void main(String[] args) {
		

		SecondCar SecondCar = new SecondCar();
				
				SecondCar.company = "현대자동차";
				SecondCar.model = "제네시스";
				SecondCar.color = "black";
				SecondCar.maxSpeed = 250;
		
				System.out.println("-----------------------");
				System.out.println("SecondCar.company : " + SecondCar.company);
				System.out.println("SecondCar.model: " + SecondCar.model);
				System.out.println("SecondCar.color : " + SecondCar.color);
				System.out.println("SecondCar.maxSpeed : " + SecondCar.maxSpeed);
				
				SecondCar SecondCar2 = new SecondCar("제네시스");
				
				System.out.println("-----------------------");
				System.out.println("SecondCar2.company : " + SecondCar2.company);
				System.out.println("SecondCar2.model: " + SecondCar2.model);
				System.out.println("SecondCar2.color : " + SecondCar2.color);
				System.out.println("SecondCar2.maxSpeed : " + SecondCar2.maxSpeed);
				
				SecondCar SecondCar3 = new SecondCar("포텐샤","white");	
				
				System.out.println("-----------------------");
				System.out.println("SecondCar3.company : " + SecondCar3.company);
				System.out.println("SecondCar3.model: " + SecondCar3.model);
				System.out.println("SecondCar3.color : " + SecondCar3.color);
				System.out.println("SecondCar3.maxSpeed : " + SecondCar3.maxSpeed);

				SecondCar SecondCar4 = new SecondCar("캐스퍼","red",250);	
				
				System.out.println("-----------------------");
				System.out.println("SecondCar4.company : " + SecondCar4.company);
				System.out.println("SecondCar4.model: " + SecondCar4.model);
				System.out.println("SecondCar4.color : " + SecondCar4.color);
				System.out.println("SecondCar4.maxSpeed : " + SecondCar4.maxSpeed);

}
}