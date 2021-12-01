package edu.kh.poly.practice.model.vo;

public class Employee extends Person {
	// Person 상속
	
	private int empNo; // 사번
	private String position; // 직급
	private int salary; // 급여(월급)
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	public Employee(String name, int age, int empNo, String position, int salary) {
		super(name, age);
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

	@Override
	public String toString() {
		return super.toString() + " / " + empNo + " / " + position + " / " + salary;
	}
	
	

}
