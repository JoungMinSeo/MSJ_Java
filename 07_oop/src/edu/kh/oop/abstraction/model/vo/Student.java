package edu.kh.oop.abstraction.model.vo;

// model : 비즈니스 로직 관련 클래스를 모아두는 패키지
//          -> 프로그램에 필요한 기능, 데이터 가공 처리, 데이터 저장 등

// VO(Value Object) : 값 저장용 객체
public class Student {
	// class : 객체의 특성(속성, 기능)에 대한 정의를 한 것

	// 속성
	// 이름, 학교명, 학년, 성별
	public String name;
	public String schoolName;
	public static int grade;
	public char gender;
	
	
	// 기능
	// 공부하기, 등교하기, 하교하기, 게임하기
	public void study() {
		System.out.println(name + "은 공부를 열심히 합니다.");
	}
	
	public void goToSchool() {
		System.out.println("등교하기");
	}
	
	public void goToHome() {
		System.out.println("집에 가기");
	}
	
	public void introduce() {
		// ex) 이름은 홍길동이고, KH고등학교 1학년 재학중인 남자입니다.
		System.out.printf("이름은 %s이고, %s %d학년 재학중인 %c자입니다.\n",
							name, schoolName, grade, gender);
	}
	
	
	
	
	/*public void playGame() {
		System.out.println("밥도 안먹고 게임하기");
	}*/
	// -> 학생이 공통적으로 가져야 할 기능이 아니다
	// == 불필요한 부분이다. --> 추상화를 통해 제거
	
	
	
	
}




