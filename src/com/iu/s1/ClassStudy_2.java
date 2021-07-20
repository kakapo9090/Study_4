package com.iu.s1;

import java.util.Scanner;

public class ClassStudy_2 {

	public static void main(String[] args) {
		System.out.println("Study2 Start");
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("학생 수를 입력하세요");//2
		int count = sc.nextInt();
		
		//학생을 모을 배열 선언
		Student [] students = new Student[count];//배열 갯수
		
		//Student student = null; == Student student = new Student();
		for(int i=0; i<students.length; i++) {
			Student student = new Student();	//멤버변수 student 선언
			System.out.println("이름 입력");
			student.name = sc.next();		
			System.out.println("번호 입력");
			student.num = sc.nextInt();
			System.out.println("국어 점수 입력");
			student.kor = sc.nextInt();
			System.out.println("영어 점수 입력");
			student.eng = sc.nextInt();
			System.out.println("수학 점수 입력");
			student.math = sc.nextInt();
			
			student.total = student.kor + student.eng + student.math;
			student.avg = student.total / 3.0;
			
			students[i]=student; //students 배열에 데이터가 입력되어 있는 상태
		}
		
		//while문 > switch case
		//1. 전체 정보 출력
		//2. 학생 번호 검색 //3누르면 3번학생정보 출력, 없으면 없다고 출력
		//3. 학생 정보 추가 - 학생 한명을 배열에 추가 (옵션)
		//4. 평균 성적 순서 출력(옵션)
		//5. 프로그램 종료
		boolean flag=false;
		
		while(flag==false) {
			System.out.println("1. 전체 정보 출력");
			System.out.println("2. 학생 번호 검색");
			System.out.println("3. 학생 정보 추가");
			System.out.println("4. 평균 성적 순서 출력");
			System.out.println("5. 프로그램 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
				System.out.println("=======================================================");
				for(int i=0; i<students.length; i++) {	//인덱스 호출은 for문과 짝꿍
					System.out.print(students[i].name+"\t");
					System.out.print(students[i].num+"\t");
					System.out.print(students[i].kor+"\t");
					System.out.print(students[i].eng+"\t");
					System.out.print(students[i].math+"\t");
					System.out.print(students[i].total+"\t");
					System.out.println(students[i].avg);
					System.out.println("---------------------------------------------------");
				}
				break;
				
				
			case 2:
				System.out.println("---------------------------------------------------");
				System.out.println("학생 번호를 입력하세요.");
				int num = sc.nextInt();
				
				//학생 번호 일치하는지 검증
				for(int i=0; i<students.length;i++) {
					if(num==students[i].num) {
						System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
						System.out.println("=======================================================");
						System.out.print(students[i].name+"\t");
						System.out.print(students[i].num+"\t");
						System.out.print(students[i].kor+"\t");
						System.out.print(students[i].eng+"\t");
						System.out.print(students[i].math+"\t");
						System.out.print(students[i].total+"\t");
						System.out.println(students[i].avg);
						System.out.println("---------------------------------------------------");
					}else {
						System.out.println("번호가 일치하지 않습니다. 메인으로 돌아갑니다.");
						System.out.println("---------------------------------------------------");
					}
				}
				
				break;
				
				
			case 3://학생정보추가
				
				Student student = new Student(); //데이터를 담을 변수 student 선언
				
				
				
				
				System.out.println("학생 이름 입력");
				student.name = sc.next();
				System.out.println("학생 번호 입력");
				student.num = sc.nextInt();
				System.out.println("국어 점수 입력");
				student.kor = sc.nextInt();
				System.out.println("영어 점수 입력");
				student.eng = sc.nextInt();
				System.out.println("수학 점수 입력");
				student.math = sc.nextInt();
				
				student.total = student.kor + student.eng + student.math;
				student.avg = student.total / 3.0;
							
				
				
				for(int i=0; i<students.length; i++) {
				
						
				System.out.println("학생 정보 추가 완료");
				}
				break;
				
				
				
				
			case 4://평균성적출력 정렬 i: 회전 수, j: 사이클 수
				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
				System.out.println("=======================================================");
				for(int i=0; i<students.length-1; i++) {	//인덱스 호출은 for문과 짝꿍
					for(int j=i+1;j<students.length;j++) {
						if(students[i].avg<students[j].avg) {
							
						}
					}
				}
				
				break;
				
				
				
				
			case 5://종료
				System.out.println("프로그램을 종료합니다.");
				for(int i=0; i<students.length; i++) {
				System.out.println(students[i].name);
				}
				flag=!flag;
				break;
			}//switch 끝
			
		}//while 끝
		
		
		
		
		
		
		
		
		//학생 수 만큼 정보를 입력받는 것- 이름, 번호, 국어, 영어, 수학
		//총점 평균 계산
		//String name = sc.next();
		
		//모든 학생의 정보가 출력
		
		System.out.println("Study2 Finish");

	}

}
