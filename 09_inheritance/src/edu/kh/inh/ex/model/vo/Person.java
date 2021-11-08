package edu.kh.inh.ex.model.vo;

public class Person extends Object {
	private String name; // 이름
	private int age; // 나이
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	// 오버라이딩(Overriding)
	// - 자식 클래스가 상속 받은 부모 메소드를 재작성(재정의) 하는 것.
	
	// - 특징
	// 1) @Override 어노테이션을 작성한다
	// 2) 오버라이딩 시 접근제한자는 부모 것과 같거나 더 넓은 범위를 가질 수 있다.
	// 3) 오버라이딩 시 예외처리 클래스는 부모 것과 같거나 더 좁은 범위로 수정할 수 있다.
	
	// - 성립 조건
	// 1) 부모 클래스의 메소드와 메소드명이 동일
	// 2) 매개변수의 개수, 타입, 순서가 동일
	// 3) 리턴 타입(반환형)이 동일
	// 4) 부모의 private 메소드는 오버라이딩 불가능 하다.
	
	// Object의 toString() 오버라이딩
	// toString() : 객체가 가지고 있는 필드를 하나의 문자열로 나타낼 수 있도록
	//              클래스 작성 시 재정의해서 사용하는 것을 목적으로 만들어진 메소드.
	
	// @Override (Override Annotation)
	// - @Override 다음에 선언된 메소드는 재정의(오버라이딩) 되었음을 
	//   컴파일러 + 개발자 에게 알려주는 역할
	// - @Overrdie가 붙은 메소드가 성립 조건을 만족하지 못하면 에러를 발생 시킴
	
	@Override
	public String toString() {
		return name + " / " + age;
	}
	
	/*
	// 오버로딩 성립 조건
	// 메소드명 동일 + 매개변수 다름
	//@Override
	public String toString(int num) {
		// 매개변수가 다르지만 오버로딩이 성립되지 않음
		// 왜? 오버라이딩 성립 조건(매개변수가 동일해야 한다)을 위배했기 때문에 
		
		// 해결 방법 -> @Override 지우기
		// 왜?  @Override 역할은 오버라이딩이 되었음을 알려줌 + 오버라이딩 성립조건 검사
		return name + " / " + age;
	}
	*/
	
	
}
