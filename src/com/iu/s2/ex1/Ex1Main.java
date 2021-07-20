package com.iu.s2.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("Ex1 Start");
		
	//객체 생성 방법
		//클래스명 참조변수명 = new 클래스명();
		Phone phone = new Phone();	// 객체 생성 : 멤버 변수
		PhoneView phoneView = new PhoneView(); // 객체 생성 : 멤버 메서드
		
	//객체(멤버변수) 사용[접근] 방법
		//참조변수명.변수명
		phone.name = "삼성";
		phone.brand = "갤럭시 S10";
		phone.color = "검정";
		phone.size = 5.5;
		phone.price = 990000;
		
		Phone phone2 = new Phone(); //객체 생성 : 멤버 변수2 만들기
		phone2.name = "애플";
		phone2.brand = "iphone13";
		phone2.color = "silver";
		phone2.size=5;
		phone2.price=2000000;
		
		
	//객체(멤버메서드) 사용[접근] 방법
		//참조변수명.메서드명(인자값);
		phoneView.view(phone); //멤버 메서드 호출 및 인자값 입력
		//인자값 자리에 위에 선언한 멤버변수명을 그대로 넣는다		
	
		
//phoneView.view(phone); == phoneView.view(phone.name, phone.price, phone.brand); 		
		//호출된 메서드의 인자값의 순서는 멤버 메서드의 매개변수에서 선언한 순서와 동일해야 한다
		//같은 데이터타입을 맞추기 위함!
		
		
		
		
		//메서드 호출
		
		Phone [] phones = new Phone[2];
		phones[0]=phone;
		phones[1]=phone2;
		
		phoneView.makePrice(phones);
		
		
		System.out.println("Ex1 Finish");
	}

}
