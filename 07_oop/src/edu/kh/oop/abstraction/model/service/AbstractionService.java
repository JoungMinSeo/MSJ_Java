package edu.kh.oop.abstraction.model.service;

import java.util.Scanner;

import edu.kh.oop.abstraction.model.vo.Student;

public class AbstractionService {

	// 클래스는 반드시 속성, 기능 둘다 작성될 필요는 없다
	
	// 왜? 자바에서 객체란 new 연산자를 통해 Heap 메모리 영역에 할당된 것을 객체라 함.
	
	// 현실에서 객체는 속성, 기능을 둘다 가지고 있지만
	// 자바에서 객체는 속성, 기능을 가질 수 있는 것
	
	public void example1() { // 예제 1번 기능(메소드)
		
		// 학생 객체를 하나 생성해서 이름, 학교명, 학년, 성별을 입력하고 출력
		// + 학생 기능 수행
		
		Student std = new Student();
		// Student 객체를 참조할 변수 std를 선언하고
		// new 연산자에 의해 생성된 Student 객체의 주소를
		// std 변수에 대입
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		std.name = sc.next(); // 홍길동
		
		System.out.print("학교명 : ");
		std.schoolName = sc.next(); // KH고등학교
		
		System.out.print("학년 : ");
		std.grade = sc.nextInt(); // 1
		
		System.out.print("성별 : ");
		std.gender = sc.next().charAt(0); // 남
		
		
		// 새로운 학생 객체를 생성해서 정보를 입력 받아 저장
		Student std2 = new Student();
		
		System.out.println("---두 번째 학생 정보 입력---");
		System.out.print("이름 : ");
		std2.name = sc.next(); // 홍길동
		
		System.out.print("학교명 : ");
		std2.schoolName = sc.next(); // KH고등학교
		
		System.out.print("학년 : ");
		std2.grade = sc.nextInt(); // 1
		
		System.out.print("성별 : ");
		std2.gender = sc.next().charAt(0); // 남
		
		
		// 출력
		/*System.out.println(std.name);
		System.out.println(std.schoolName);
		System.out.println(std.grade);
		System.out.println(std.gender);*/
		
		// 학생 소개 기능을 이용하여 입력 받은 값 출력
		std.introduce();
		std2.introduce();
		
		
		// 학생 기능 수행 == Student 객체가 가지고 있는 메소드를 호출해라
		std.goToSchool();
		std.study();
		std.goToHome();
		
		
	}
	
	
	
	
	
	
	
	
}
