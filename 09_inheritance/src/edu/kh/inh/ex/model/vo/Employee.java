package edu.kh.inh.ex.model.vo;

public class Employee extends Person {

	private int empNo;		// 사번
	private String position;// 직급
	private int salary;		// 급여
	
	public Employee() {	}

	public Employee(String name, int age, int empNo, String position, int salary) {
		super(name, age);
		//this.name = name;
		//this.age = age;
		
		this.empNo = empNo;
		this.position = position;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// 
	// Person으로 부터 상속 받은  toString() 오버라이딩
	// (오버라이딩 : 상속 받은 부모 메소드를 자식이 재정의 하는 것)
	@Override
	public String toString() {
		// 이름, 나이, 사번, 직급, 급여를 하나의 문자열로 반환
		// 상속 : 부모의 멤버를 자식이 자기 것 처럼 사용
		// super.toString() : 오버라이딩 전 상속 받은 부모(Person)의 toString() 호출
		
		return  //getName() + " / " + getAge() 
				super.toString() 
				+ " / " + empNo + " / " + position + " / " + salary;
	}
	
	
	
	
	
	
	
	
}
