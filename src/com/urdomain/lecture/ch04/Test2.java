package com.urdomain.lecture.ch04;

public class Test2 {

	public static void main(String[] args) {
		
		

		int lotto = (int) (Math.random() * 100 %45 ); 
		// int lotto = (int) (Math.random() * 45 % 100 );
		//  int lotto = (Math.random() * (45-1+1)+1);


		for (int i=0; i<6; i++)
			if(lotto==0)
			{
				continue;
			}
		
		//	if(lotto==lotto) // 에러남.. 다른변수를 선언해서 같지않음을 표현해야하는건지..ㅜㅜ
		//	{
		//		continue;
		//	}
		//	break;  
	
			System.out.println("이번주 행운의 숫자는 "+ lotto + "입니다.");
	}

}
