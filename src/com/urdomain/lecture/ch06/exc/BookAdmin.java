package com.urdomain.lecture.ch06.exc;

import java.util.Date;

public class BookAdmin {

	//필드
	
	String ifmmSeq = "";  
	String ifmmId="";
	String ifmmName="";
	String ifmmNumber="";
	
	String bookSeq =""; 
	String author="";   
	String bookName="";
	Date bookPublish;
	String bookCompany="";
	String seriesCd="";  
	
	Integer bookNumber = 0; //대여수
	Date borrowDatetime;
	Date returnDatetime;
	Integer extensionNy = 0;  //연장여부
	
	
	Integer bookNumberOf =0;  // 재고수
	Integer bookOrderNy=0 ;   // 추가주문
	
	
	//회원확인
	public void ifmmIdCheck(String ifmmId) { 
		}
	
	//책대여, 재고관리
	public int borrowBook(int a) {
		int bookNumberOf = 0;
		return bookNumberOf - a;
	}

	//책반납, 재고관리
	
	public int returnBook(int a ) {
		int bookNumberOf = 0;
		return bookNumberOf + a;
	}

	
}
