package edu.kh.inh.ex.model.vo;

public class Student extends Person {
	// extends 키워드
	// - '확장하다' 라는 의미로
	//  부모의 멤버(필드, 메소드)를 물려 받아 자식의 멤버의 개수가 확장되는 것을 의미
	
	
	private int grade;		// 학년
	private int classroom;	// 반
	
	public Student() {
		super();
		// super() (super생성자 or 부모 생성자)
		// 자식 객체 생성 시 상속받은 부모 객체가 먼저 생성 되어야 되기 때문에
		// 자식 생성자 가장 첫 줄에 작성됨.
		// 이 때, super() 미작성 시 컴파일러가 이를 자동 추가 해줌.
		
		// 컴파일러가 컴파일 단계에서 자동 추가 해주는 것들
		// 기본 생성자
		// super()
		// import java.lang.*;
		// extends Object
		
	}

	public Student(String name, int age, int grade, int classroom) {
		super(name, age);
		//this.name = name;
		//this.age = age;
		
		super.setName(name);
		super.setAge(age);
		this.grade = grade;
		this.classroom = classroom;
		
		
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
	
	
	// Person으로부터 상속 받은 toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString()  
				+ " / " + grade + " / " + classroom;
	}
	
	
	// 오버로딩 테스트
	public void test() {
		System.out.println("시험보기");
	}
	
	public void test(String subject) {
		System.out.println(subject + "과목 시험보기");
	}
	
	public String test(String sub1, String sub2) {
		return sub1 + " / " + sub2 + " 두 과목 시험보기";
	}
	
	protected int test(int num) {
		return num + 10;
	}
	
	
	public final void study() {
		//  final method : 상속 받은 자식이 오버라이딩 불가
		System.out.println("학생이라면 열공해야지");
	}
	
	
	// equals() 오버라이딩
	@Override
	public boolean equals(Object obj) {
		// 동등 비교(값이 모두 같은지 확인)
		
		Student other = (Student)obj;
		
		if(  !this.getName().equals( other.getName() )   ) {
			// 기준이된 Student 객체 (this)의 이름(name)과
			// 비교대상된 Student 객체 (other)의 이름(name)이 같지 않을 때
			return false;
			// 이름이 다르면 더 이상 비교할 필요도 없이 값이 다른 객체임을 알 수 있음.
		
		} else if( this.getAge() != other.getAge()   ) {
			// 두 Student의 나이가 같지 않을 경우
			return false;
		
		} else if( this.grade != other.grade  ) {
			// 두 Student의 학년이 같이 않을 경우
			return false;
			
		} else if (this.classroom != other.classroom) {
			// 두 Student의 반이 같이 않을 경우
			return false;
		}
		
		// 위 if문을 하나도 만족하지 못한경우
		// == 모든 필드값이 같다 == 두 객체는 동등하다.
		return true; 
		
	}
	
	
	
	
	
	
	
	
}
