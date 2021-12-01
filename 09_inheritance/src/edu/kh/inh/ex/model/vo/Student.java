package edu.kh.inh.ex.model.vo;

public class Student extends Person {
	// extends Ű����
	// - 'Ȯ���ϴ�' ��� �ǹ̷�
	//  �θ��� ���(�ʵ�, �޼ҵ�)�� ���� �޾� �ڽ��� ����� ������ Ȯ��Ǵ� ���� �ǹ�
	
	
	private int grade;		// �г�
	private int classroom;	// ��
	
	public Student() {
		super();
		// super() (super������ or �θ� ������)
		// �ڽ� ��ü ���� �� ��ӹ��� �θ� ��ü�� ���� ���� �Ǿ�� �Ǳ� ������
		// �ڽ� ������ ���� ù �ٿ� �ۼ���.
		// �� ��, super() ���ۼ� �� �����Ϸ��� �̸� �ڵ� �߰� ����.
		
		// �����Ϸ��� ������ �ܰ迡�� �ڵ� �߰� ���ִ� �͵�
		// �⺻ ������
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
	
	
	// Person���κ��� ��� ���� toString() �������̵�
	@Override
	public String toString() {
		return super.toString()  
				+ " / " + grade + " / " + classroom;
	}
	
	
	// �����ε� �׽�Ʈ
	public void test() {
		System.out.println("���躸��");
	}
	
	public void test(String subject) {
		System.out.println(subject + "���� ���躸��");
	}
	
	public String test(String sub1, String sub2) {
		return sub1 + " / " + sub2 + " �� ���� ���躸��";
	}
	
	protected int test(int num) {
		return num + 10;
	}
	
	
	public final void study() {
		//  final method : ��� ���� �ڽ��� �������̵� �Ұ�
		System.out.println("�л��̶�� �����ؾ���");
	}
	
	
	// equals() �������̵�
	@Override
	public boolean equals(Object obj) {
		// ���� ��(���� ��� ������ Ȯ��)
		
		Student other = (Student)obj;
		
		if(  !this.getName().equals( other.getName() )   ) {
			// �����̵� Student ��ü (this)�� �̸�(name)��
			// �񱳴��� Student ��ü (other)�� �̸�(name)�� ���� ���� ��
			return false;
			// �̸��� �ٸ��� �� �̻� ���� �ʿ䵵 ���� ���� �ٸ� ��ü���� �� �� ����.
		
		} else if( this.getAge() != other.getAge()   ) {
			// �� Student�� ���̰� ���� ���� ���
			return false;
		
		} else if( this.grade != other.grade  ) {
			// �� Student�� �г��� ���� ���� ���
			return false;
			
		} else if (this.classroom != other.classroom) {
			// �� Student�� ���� ���� ���� ���
			return false;
		}
		
		// �� if���� �ϳ��� �������� ���Ѱ��
		// == ��� �ʵ尪�� ���� == �� ��ü�� �����ϴ�.
		return true; 
		
	}
	
	
	
	
	
	
	
	
}
