package com.iu.s2.ex1;

import java.util.Scanner;

public class PhoneView { //멤버 메서드 클래스, PhoneView클래스 타입
	
	Scanner sc = new Scanner(System.in);
	//멤버 메서드 선언
	//접근지정자 리턴타입 메서드명(매개변수들 선언){}
	
			// 매개변수 자리에 데이터 타입과 변수명(맘대로 지어도댐)들 선언
//	public void view(String name, int price, String brand) {
//	System.out.println(name);
//	System.out.println(brand);
//	System.out.println(price);
//	}
	//위에 처럼 해도 되지만.....
	
//매개변수의 값은 "데이터타입과 힙영역의 메모리주소(=참조변수명)"를 넣어주면 편하다
	// Phone(멤버변수가 담긴 클래스) 데이터 타입   phone 멤버 변수명
	public void view(Phone phone) {
		System.out.println(phone.name);
		System.out.println(phone.brand);
		System.out.println(phone.price);
	}
	
	//핸드폰의 합계 금액을 계산해서 출력. 매개변수는 하나만 !!!!선언!!!!!
	public void makePrice(Phone [] phones) {//배열선언
		
		int sum=0;
		
		for(int i=0; i<phones.length; i++) {	//조건 배열의 길이
			sum = sum + phones[i].price;
		}
		System.out.println("최종 가격 : " + sum);
	}
	
}
