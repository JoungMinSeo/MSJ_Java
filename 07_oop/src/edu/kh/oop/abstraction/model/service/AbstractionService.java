package edu.kh.oop.abstraction.model.service;

import java.util.Scanner;

import edu.kh.oop.abstraction.model.vo.Student;

public class AbstractionService {

	// Ŭ������ �ݵ�� �Ӽ�, ��� �Ѵ� �ۼ��� �ʿ�� ����
	
	// ��? �ڹٿ��� ��ü�� new �����ڸ� ���� Heap �޸� ������ �Ҵ�� ���� ��ü�� ��.
	
	// ���ǿ��� ��ü�� �Ӽ�, ����� �Ѵ� ������ ������
	// �ڹٿ��� ��ü�� �Ӽ�, ����� ���� �� �ִ� ��
	
	public void example1() { // ���� 1�� ���(�޼ҵ�)
		
		// �л� ��ü�� �ϳ� �����ؼ� �̸�, �б���, �г�, ������ �Է��ϰ� ���
		// + �л� ��� ����
		
		Student std = new Student();
		// Student ��ü�� ������ ���� std�� �����ϰ�
		// new �����ڿ� ���� ������ Student ��ü�� �ּҸ�
		// std ������ ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		std.name = sc.next(); // ȫ�浿
		
		System.out.print("�б��� : ");
		std.schoolName = sc.next(); // KH����б�
		
		System.out.print("�г� : ");
		std.grade = sc.nextInt(); // 1
		
		System.out.print("���� : ");
		std.gender = sc.next().charAt(0); // ��
		
		
		// ���ο� �л� ��ü�� �����ؼ� ������ �Է� �޾� ����
		Student std2 = new Student();
		
		System.out.println("---�� ��° �л� ���� �Է�---");
		System.out.print("�̸� : ");
		std2.name = sc.next(); // ȫ�浿
		
		System.out.print("�б��� : ");
		std2.schoolName = sc.next(); // KH����б�
		
		System.out.print("�г� : ");
		std2.grade = sc.nextInt(); // 1
		
		System.out.print("���� : ");
		std2.gender = sc.next().charAt(0); // ��
		
		
		// ���
		/*System.out.println(std.name);
		System.out.println(std.schoolName);
		System.out.println(std.grade);
		System.out.println(std.gender);*/
		
		// �л� �Ұ� ����� �̿��Ͽ� �Է� ���� �� ���
		std.introduce();
		std2.introduce();
		
		
		// �л� ��� ���� == Student ��ü�� ������ �ִ� �޼ҵ带 ȣ���ض�
		std.goToSchool();
		std.study();
		std.goToHome();
		
		
	}
	
	
	
	
	
	
	
	
}
