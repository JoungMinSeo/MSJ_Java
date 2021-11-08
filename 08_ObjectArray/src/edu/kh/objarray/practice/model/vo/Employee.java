package edu.kh.objarray.practice.model.vo;

public class Employee {

	private int empNo; // ���� ��ȣ(���)
	private String empName; // ������
	private String department; // �μ���
	private String position; // ����
	private int salary; // �޿� (����)
	
	// �⺻������
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// �Ű����� �ִ� ������
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
		return "��� : " + empNo + ", �̸� : " + empName + ", �μ� : " + department + ", ���� : " + position + ", �޿�  : " + salary; 
	}
}
