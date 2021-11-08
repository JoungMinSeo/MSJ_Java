package edu.kh.objarray.practice.model.vo;

public class Employee {

	private int empNo; // 직원 번호(사번)
	private String empName; // 직원명
	private String department; // 부서명
	private String position; // 직급
	private int salary; // 급여 (월급)
	
	// 기본생성자
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 있는 생성자
	public Employee(int empNo, String empName, String department, String position, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.department = department;
		this.position = position;
		this.salary = salary;
	}

	// getter/setter
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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
	
	
	// toString()
	public String toString() {
		return "사번 : " + empNo + ", 이름 : " + empName + ", 부서 : " + department + ", 직급 : " + position + ", 급여  : " + salary; 
	}
}
