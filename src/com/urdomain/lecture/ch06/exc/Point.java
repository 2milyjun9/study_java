package com.urdomain.lecture.ch06.exc;

import java.util.Date;

public class Point {

	//선생님이한것
	//필드선언
	
	String pointTypeCd = "";  //증감 , 차감
	Integer point = 0;
	Date pointEventDateTime;
	String pointUseSeq="";
	
	//method 
	
	//포인트 충전
	public int addpoint(int a) {
		int finalPoint = 0;
		return finalPoint +a;
	}


	
		//내가한것
		//필드선언
		
		String pointNumber  = "";
		String pointBalance = "";
		
		//method 

		//포인트번호확인
		public void pointNumberCheck(String pointNumber) { 
			}

		//포인트적립
		public void pointSave() {
			}
		
		//포인트잔액확인
		public void pointBalanceCheck(String pointBalance) {
			}

		//포인트사용
		public void pointBalanceUse(String pointBalance) {
			}
		}
	
	//포인트잔액확인
	public void pointBalanceCheck(String pointBalance) {
		}

	//포인트사용
	public void pointBalanceUse(String pointBalance) {
		}
	}
