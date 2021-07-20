package com.iu.s2;

import java.util.Scanner;

public class Method1 {

	
	//접근지정자 그외지정자 리턴타입 메서드명 (매개변수선언){}
	//public	static	void	main (Stinrg[] args){}
	
	//접근지정자는 모르거나 확신이 안드면 public
	//그외지정자는 모르거나 확신이 없으면 쓰지 마세요
	//리턴타입은 모르거나 확신이 없으면 void
	//매개변수는 모르거나 확신이 없으면 쓰지 마세요
	public void prn() {//메서드명 prn
		//print, if, for
		System.out.println("prn method 실행");
	}
	
	//prn2 선언
	//hello world 3번 출력
	
	public void prn2() {//메서드명 prn2
		int num=10; //stack영역에 선언되므로 지역변수, 실제 값을 가지므로 참조변수가아 아니다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수 입력");
		num = sc.nextInt();
		for(int i=0; i<num; i++) {
		System.out.println("hello world");
		}
		System.out.println("Num : "+num);
	}
	
	
	public void prn3() {
		System.out.println("hello world");
	}
							//count
	public void prn4(int num) { //매개변수에 내가 필요한 데이터타입 입력
								// int num만큼 일한다
								//메인 메서드로부터 인자값을 받는다
		for(int i=0; i<num; i++) {
			System.out.println("hello world");
		}
	}
	
	
}

//멤버메서드로만 이루어진 클래스 21/07/20