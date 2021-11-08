package edu.kh.api.ex.model.vo;

public class Student {
	private String name;
	private int grade;
	private int classroom;
	
	// 기본 생성자
	public Student() {}

	
	
	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}



	// 매개변수 있는 생성자
	public Student(String name, int grade, int classroom) {
		this(name, grade);
		this.classroom = classroom;
	}
	
	// getter / setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	
	// Object.toString()
	// - java.lang 패키지에 존재
	
	// 객체가 가지고 있는 필드 값을 하나의 문자열로 반환할 수 있도록 하는 용도로
	// 자바에서 기본 제공하는 메소드(오버라이딩 해서 사용)
	
	// @Override : 컴파일러에게 오버라이딩 된것임을 알림.
	//				오버라이딩 성립 조건을 만족하는지 검사
	@Override
	public String toString() {
		return name + " / " + grade + " / " + classroom;
	}
	
	
	// 지역 변수 : 메소드나 제어문 내에서 만 사용 가능한 변수(Stack 영역에 생성)
	//	-> 특정 지역 내에서 잠시 사용하는 변수
	//  ex) 입력 받은 값을 임시저장  int num = sc.nextInt();
	//      반복문 제어용 변수  for(int i=0 ; i<10 ; i++){ }
	//  	알고리즘을 위한 변수 int sum=0;  /  boolean flag = false;
	
	// ----- 필드 (멤버 변수 + 클래스 변수) ----- 
	// 멤버 변수(인스턴스 변수) : 클래스 내에 작성된 변수 (Heap 영역에 생성)
	//  -> 객체가 생성되었을 때 객체가 가져야 하는 값을 저장하는 변수 (객체의 속성)
	//  ex) private String name;  private int age;
	
	// 클래스 변수(static 변수) : 클래스 내에 작성된 변수에 static 예약어가 붙은 것 (Static 영역에 생성)
	//  -> 프로그램 내에서 누구나 공통적으로 사용 가능하며, 
	//     한 번의 수정으로 사용되어진 모든 부분의 값을 일괄 수정하는 용도의 변수
	// ex) public static final double PI = 3.141592;
	//     public static int nationalCode = 81;
	
	
	// 기본자료형 변수  : 자료형이 기본자료형 8개 중 하나인 변수
	//				 할당된 메모리에 직접 값을 저장을 함.
	// 				 (byte short int long float double char boolean)
	// ex) int num = 10;
	//     private int age;
	//     for(int i=0 ; i<10 ; i++){}
	//     public void ex1(int input)
	
	// 참조 변수(참조 자료형 변수) : 기본 자료형을 제외한 모든 변수
	//			주소 저장을 위해 4byte가 할당되며, 객체의 주소를 저장하여 참조하는 형태.
	// ex) private String name;
	//     Student std = new Student();
	//     int[] arr = new int[3];
	//	   Person[] pArr new Person[3];
	//	   public boolean equals(Object obj){}
	
	// 클래스 == 객체를 만들기 위한 설계도
	// new 클래스명(); --> 클래스로 이용하여 객체가 생성
	// == 만들어진 객체는 어떤 클래스의 구조를 가지고 있다 
	// == 어떤 클래스의 형태를 가지고 있다.
	// 클래스 == 사용자 정의 자료형
	
	
	// 매개 변수 : 메소드 옆 () 내에 작성되는 변수
	//			메소드 호출 시 전달 받은 값을 저장할 매개체 역할의 변수
	//			매개 변수는 해당 메소드의 지역 변수 취급을 당함.
	// ex) public void int ex1(int num){}
	//     ex1(10);		// ex1 메소드를 호출하면서 매개 변수 int num에 10을 전달
	
	// 	   public boolean equals(Object obj){  }
	//     std1.equals( std2 );
	//	   // std1이 참조하고 있는 객체의 equals 메소드를 호출하면서
	//		  std2가 참조하고 있는 객체의 주소를 매개 변수 Object obj에 전달
	
	
	
	// Object.equals(Object obj)
	// 현재 객체와 전달 받은 객체(obj)가 동등한지 확인하는 메소드
	// (동등 : 객체가 가지고 있는 필드 값이 모두 같으면 동등)
	
	@Override
	public boolean equals(Object obj) {
		// Object obj : 비교할려는 다른 객체 참조 변수
		// 부모타입 참조 변수 = 자식 객체 참조; (다형성 업캐스팅)
		
		// obj가 null인 경우
		if(obj == null) {
			return false;
		}
		
		// obj가 현재 객체인 경우
		if(obj == this) {
			return true;
		}
		// 동일하면 동등한가 = true
		// 동등하면 동일한가 = true || false
		
		
		// this. (this 참조변수) : 현재 객체의 시작주소를 저장하는 참조 변수
		//						 객체내에 생성되어 있음.
		
		// this() (this 생성자) : 클래스에 작성된 다른 생성자를 호출하는 구문
		//						 클래스의 생성자 첫번째 줄에 작성되어 있음.
		
		
		if( !(obj instanceof Student) ) {
			// obj가 참조하는 객체가 Student 타입이 아닐떄
			return false;
		}
		
		// 위에 세 경우가 아니면 같은 타입의 서로 다른 객체이다.
		Student other = (Student)obj; // 다운 캐스팅 해야지만 
									  // 두 Student 객체의 값을 얻어와 비교 가능
		
		if( !this.name.equals(other.name) ) {
			// 현재 객체의 name과 다른 객체의 name이 같지 않은 경우
			return false;
		
		} else if( this.grade != other.grade) {
			// 현재 객체의 grade과 다른 객체의 grade가 같지 않은 경우
			return false;
			
		} else if( this.classroom != other.classroom) {
			// 현재 객체의 classroom과 다른 객체의 classroom이 같지 않은 경우
			return false;
		}
		
		// 모든 필드 값이 같음 == 동등하다
		return true;
	}
	
	
	
	// Object.hashCode()
	// - 동등한 객체 ( equals() 결과가 true인 두 객체 )는 동일한 hashCode를 반환해야 한다.
	//   --> 이러한 이유로 equals() 오버라이딩 시 hashCode()도 오버라이딩 함.
	
	// 왜 hashCode를 사용하는가?
	// -> 해시 테이블에 정렬될 수 있는 값을 생성해서 검색 속도를 향상 시킴
	//    Hash라고 이름붙은 객체에 효과적임. 
	//	  ex) HashSet, LinkedHashSet, HashMap 등
	
	@Override
	public int hashCode() {
		// 동등한 객체는 같은 값이 반환되어야 함
		// 몇변을 호출해도 같은 값이여야 한다.
		// 서로 다른 객체가 중복되는 hashCode를 가지는 경우를 최소화 한다.
		
		final int PRIME = 31; // prime : 소수
		int result = 1; 
		
		result = PRIME * result 
				+ ( name == null ? 0 : name.hashCode() ); 
		
		result = PRIME * result + grade;
		result = PRIME * result + classroom;
		
		return result;
	}
	
	
	
	
	
	
	
}
