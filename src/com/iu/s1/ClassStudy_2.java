package com.iu.s1;

import java.util.Scanner;

public class ClassStudy_2 {

	public static void main(String[] args) {
		System.out.println("Study2 Start");
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("학생 수를 입력하세요");//2
		int count = sc.nextInt();
		
		//학생을 모을 배열 선언
		Student [] students = new Student[count];
		
		//Student student = null; == Student student = new Student();
		for(int i=0; i<students.length; i++) {
			Student student = new Student();
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
			
			students[i]=student;
		}
		
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================================");
		for(int i=0; i<students.length; i++) {
			System.out.print(students[i].name+"\t");
			System.out.print(students[i].num+"\t");
			System.out.print(students[i].kor+"\t");
			System.out.print(students[i].eng+"\t");
			System.out.print(students[i].math+"\t");
			System.out.print(students[i].total+"\t");
			System.out.println(students[i].avg);
			System.out.println("---------------------------------------------------");
		}
		
		
		
		
		//학생 수 만큼 정보를 입력받는 것- 이름, 번호, 국어, 영어, 수학
		//총점 평균 계산
		//String name = sc.next();
		
		//모든 학생의 정보가 출력
		
		System.out.println("Study2 Finish");

	}

}
