package edu.kh.inh.ex.model.vo;

public class Employee extends Person {

	private int empNo;		// ���
	private String position;// ����
	private int salary;		// �޿�
	
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
	// Person���� ���� ��� ����  toString() �������̵�
	// (�������̵� : ��� ���� �θ� �޼ҵ带 �ڽ��� ������ �ϴ� ��)
	@Override
	public String toString() {
		// �̸�, ����, ���, ����, �޿��� �ϳ��� ���ڿ��� ��ȯ
		// ��� : �θ��� ����� �ڽ��� �ڱ� �� ó�� ���
		// super.toString() : �������̵� �� ��� ���� �θ�(Person)�� toString() ȣ��
		
		return  //getName() + " / " + getAge() 
				super.toString() 
				+ " / " + empNo + " / " + position + " / " + salary;
	}
	
	
	
	
	
	
	
	
}
