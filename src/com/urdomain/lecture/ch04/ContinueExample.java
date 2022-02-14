package com.urdomain.lecture.ch04;

public class ContinueExample {

	public static void main(String[] args) {

	//	for(int i=1; i<10; i++) {
	//		if(i%2 != 0 ) {
	//			continue;
	//		}
	//		System.out.println(i);
	//		}
				
				int a = 1;
				
				while(a<=10) {    //1(T), 2(T) , 2(T) 
					
					if(a%2 == 0) { // 1(F) 2(T) 2(T)
						continue;
					}
					
					System.out.println(a); //1
					a++;
				}
		}
	}


