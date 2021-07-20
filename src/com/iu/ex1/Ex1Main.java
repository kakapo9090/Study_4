package com.iu.ex1;

public class Ex1Main {//설계도

	public static void main(String[] args) {
		System.out.println("Ex1 Start");
		
		//캐릭터 생성
		//이름, 레벨, 체력, 마나, 골드를 입력 후 출력
		//데이터타입 변수명 = new 클래스명();
		Character cr = new Character();
		cr.name="iu";
		cr.level=1;
		cr.hp=100;
		cr.mp=100;		
		System.out.println(cr.wp);
		//cr이 가지고 있는 무기의 이름을 출력
		
		
		
		//cr.gold를 넣지 않았음에도 출력되는 이유?
		 
		//무기 생성
		Weapon wp = new Weapon();
		wp.name="낡은 대검";
		wp.damage=50;
		wp.critical=0.4;
		wp.upgrade=1;
		
		cr.wp = wp;
		System.out.println(cr.wp.name);
		
		//cr이 가지고 있는 무기의 이름을 변경하고 출력
		cr.wp.name="튼튼한 대검";
		System.out.println(cr.wp.name);//name: 레퍼런스타입 인스턴스변수, 멤버변수,
		
		wp.name ="도끼";
		System.out.println(cr.wp.name);//참조변수
		
		
		
		System.out.println("이름 : " + cr.name);
		System.out.println("레벨 : " + cr.level);
		System.out.println("체력 : " + cr.hp);
		System.out.println("마나 : " + cr.mp);
		System.out.println("골드 : " + cr.gold); //heap영역에 들어가면 초기화가 자동으로 된다.
		
		
		//ch.wp(힙영역에 저장,멤버변수,참조변수)
		
		
		//몬스터 생성
		Monster monster = new Monster();
		monster.name="오크 전사";
		monster.level=2;
		monster.hp=50;
		monster.mp=50;
		monster.gold=10;
		monster.wp = new Weapon(); //Weapon wp = new Weapon();
		//↑ 한 번만 쓸경우엔 전자로 쓰고 계속 쓸 경우엔 후자로 쓴다
		monster.wp.name = "몽둥이";
		monster.wp.damage=500;
		monster.wp.critical=0.8;
		monster.wp.upgrade=3;
		
		//몬스터 무기를 내 것으로 바꾸기
		cr.wp = monster.wp;
//		cr.wp.name = monster.wp.name;   오답
//		cr.wp.damage = monster.wp.damage;   오답		
		
		//cr = monster; 에러: 변수는 데이터타입을 담을 수 없다
		cr.gold = cr.gold + monster.gold;
		
		System.out.println("이름 : " + monster.name);
		System.out.println("레벨 : " + monster.level);
		System.out.println("체력 : " + monster.hp);
		System.out.println("마나 : " + monster.mp);
		System.out.println("골드 : " + monster.gold);
		System.out.println("Weapon : "+cr.wp.name);
		System.out.println("Wp.damage : "+cr.wp.damage);
		System.out.println("강화수치 : "+cr.wp.upgrade);
		
		//몬스터 죽음
		//monster = null;
		monster = new Monster();
		System.out.println(monster.level);
		
		
		//펫 만들기 
		Pet pet = new Pet();
		pet.name="비둘기";
		pet.level=1;
		pet.friends=1;
		System.out.println(pet.name);
		
		
		System.out.println("Ex1 Finish");

	}

}
