package com.iu.ex1;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("Main2 Start");
		
		Pet pet1 = new Pet();
		pet1.name="비둘기";
		pet1.level=1;
		pet1.friends=1;
		
		
		Pet pet2 = new Pet();
		pet2.name="참새";
		pet2.level=1;
		pet2.friends=1;
		
		Character c1 = new Character();
		c1.p1 = pet1;
		c1.p2 = pet2;
		
		
		//배열
		//배열은 같은 데이터타입만 묶음
		//pet을 담을 수 있는 배열을 선언
		//모을려고하는 데이터타입 [] 변수명 = new 모을려고하는 데이터타입 [갯수]
		Pet [] pets = new Pet[2];	
		pets[0]=pet1;
		pets[1]=new Pet();
		pets[1].name="구리구리";
		//클래스는 데이터타입이다 라고 생각하면 모든것이 풀린다!!
		for(int i=0;i<pets.length;i++) {
			System.out.println(pets[i].name);
		}
		
		
		System.out.println(pets[0].name);
		
		
//		System.out.println(c1.p1.name);
//		System.out.println(c1.p2.name);
//		
		System.out.println("Main2 Finish");
	}

}
