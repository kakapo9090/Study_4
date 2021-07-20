package com.iu.s2;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		System.out.println("Method1 Start");
		
		Method1 mth1 = new Method1();//객체만들기 - 참조변수 선언 
		
		//참조변수명.메서드명();
		//메서드 호출 코드
		mth1.prn();
		
		//prn2 호출, 하나의 참조변수에 여러개의 메서드를 불러올 수 있따
		mth1.prn2();
		int num = 20;	// mth1의 int num과 비교-> 중복변수가 아니다!
		System.out.println("Main Num : "+num);
		
		
		//반복할 횟수를 입력 받아서 hello world출력
		//mth1.prn2(); 							방법1
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수 입력");
		int count = sc.nextInt();
		
//		for(int i=0; i<count; i++) { 	//방법2 - 어쩔수 없는 경우만 사용
//			mth1.prn3();
//		}
		
		mth1.prn4(count);	//데이터를 클래스에 보냄 -> 인자값, parameter=argument
		
		System.out.println("Method1 Finish");
	}

}
