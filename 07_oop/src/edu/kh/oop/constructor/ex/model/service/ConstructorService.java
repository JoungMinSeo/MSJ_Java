package edu.kh.oop.constructor.ex.model.service;

import edu.kh.oop.constructor.ex.model.vo.User;

public class ConstructorService {
	
	
	public void example1() {
		// User ��ü �ϳ� ����
		User u1 = new User();
		
		// ������ User��ü�� �Ӽ�(������)�� ���� --> ��ü���� ��ü
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("������");
		u1.setAge(20);
		u1.setGender('��');
		
		System.out.println("u1 : " + u1.toString());
		
		// User ��ü�� �ϳ� ����� ���� ���� u2�� �����ϰ�
		// �� �ʵ� ���� �ʱ�ȭ �� ���("user02", "pass02", "������", 30, '��') 
		User u2 = new User();
		
		u2.setUserId("user02");
		u2.setUserPwd("pass02");
		u2.setUserName("������");
		u2.setAge(30);
		u2.setGender('��');
		
		System.out.println("u2 : " + u2.toString());
		
		
		// User ��ü�� �ϳ� ����� ���� ���� u3�� �����ϰ�
		// �� �ʵ� ���� �ʱ�ȭ �� ���("user03", "pass03", "������", 25, '��') 
		
		// �Ű����� �ִ� ������ ���
		//User u3 = new User("user03", "pass03", "������", 25, '��');
		//System.out.println("u3 : " + u3.toString());
		
		User u4 = new User();
		
		
	}
	
	
	
	
	
}
