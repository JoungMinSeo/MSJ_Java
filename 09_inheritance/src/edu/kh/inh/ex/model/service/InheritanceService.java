package edu.kh.inh.ex.model.service;

import edu.kh.inh.ex.model.vo.Employee;
import edu.kh.inh.ex.model.vo.Person;
import edu.kh.inh.ex.model.vo.Student;

public class InheritanceService extends Student {

	public void example1() {
		
		Person p = new Person();
		p.setName("ȫ�浿");
		p.setAge(20);
		
		Student std = new Student();
		std.setName("��ö��");
		std.setAge(15);
		std.setGrade(2);
		std.setClassroom(3);
		
		
		Employee emp = new Employee();
		emp.setName("������");
		emp.setAge(18);
		emp.setPosition("����");
		emp.setEmpNo(1);
		emp.setSalary(4000000);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		
		Student std2 = new Student("���̹�", 19, 3, 1);
		
		System.out.println(std2.getName());
		System.out.println(std2.getAge());
		System.out.println(std2.getGrade());
		System.out.println(std2.getClassroom());
	}
	
	
	public void example2() {
		Person p = new Person("ȫ�浿", 20);
		
		System.out.println(p.toString());
		System.out.println(p);
		// print ���� �޼ҵ��� �Ű������� ������������ �ۼ��� ���
		// �ڵ����� ���������� �����ϴ� ��ü�� toString() �޼ҵ带 ȣ���Ѵ�.
		
		Employee emp = new Employee("��浿", 40, 10, "����", 5000000);
		System.out.println(emp);
		
		Student std = new Student("���̹�", 19, 3, 5);
		System.out.println(std); // �������̵��� toString() Ȯ��
		
		// �����ε� Ȯ��
		std.test();
		std.test("����");
		System.out.println(std.test("����", "����"));
		
		System.out.println( test(10) );
		
	}
	
	
	public void example3() {
		
		// �ʵ� ���� �Ȱ��� Student ��ü 2���� �����ؼ�
		// ������ ��
		
		Student std1 = new Student("ȫ�浿", 18, 2, 7);
		Student std2 = new Student("ȫ�浿", 18, 2, 7);
		
		Student std3 = std1;
		
		// ���� ��
		// == �񱳵Ǵ� �� ��ü�� Ư�� �ϳ��� ��ü�ΰ�?
		// == �����ϴ� ��ü�� �ּҰ� ������?
		
		// �ּ� ��
		System.out.println(std1 == std2); // false(�������� �ʴ�)
		System.out.println(std1 == std3); // true(�����ϴ�)
		
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = str1;
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		// String �����(���� ���̳�)
		System.out.println("equals() : " + str1.equals(str2)  );
		
		// Student equals() Ȱ���ϱ�
		
		// * Object Ŭ������ equals()
		// ��� ���� Ŭ������ ������ ��ü���� ���� ��(���� ������)�� ����
		// �ڽ� Ŭ�������� ������(�������̵�)�ؼ� ����ϴ� �뵵�� �޼ҵ�.
		
		Student std4 = new Student("�����", 12, 5, 2);
		Student std5 = new Student("�����", 12, 5, 2);
		
		System.out.println(std4.equals(std5));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
