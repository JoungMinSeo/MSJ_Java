package edu.kh.inh.ex.model.vo;

public class Person extends Object {
	private String name; // �̸�
	private int age; // ����
	
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
	
	
	// �������̵�(Overriding)
	// - �ڽ� Ŭ������ ��� ���� �θ� �޼ҵ带 ���ۼ�(������) �ϴ� ��.
	
	// - Ư¡
	// 1) @Override ������̼��� �ۼ��Ѵ�
	// 2) �������̵� �� ���������ڴ� �θ� �Ͱ� ���ų� �� ���� ������ ���� �� �ִ�.
	// 3) �������̵� �� ����ó�� Ŭ������ �θ� �Ͱ� ���ų� �� ���� ������ ������ �� �ִ�.
	
	// - ���� ����
	// 1) �θ� Ŭ������ �޼ҵ�� �޼ҵ���� ����
	// 2) �Ű������� ����, Ÿ��, ������ ����
	// 3) ���� Ÿ��(��ȯ��)�� ����
	// 4) �θ��� private �޼ҵ�� �������̵� �Ұ��� �ϴ�.
	
	// Object�� toString() �������̵�
	// toString() : ��ü�� ������ �ִ� �ʵ带 �ϳ��� ���ڿ��� ��Ÿ�� �� �ֵ���
	//              Ŭ���� �ۼ� �� �������ؼ� ����ϴ� ���� �������� ������� �޼ҵ�.
	
	// @Override (Override Annotation)
	// - @Override ������ ����� �޼ҵ�� ������(�������̵�) �Ǿ����� 
	//   �����Ϸ� + ������ ���� �˷��ִ� ����
	// - @Overrdie�� ���� �޼ҵ尡 ���� ������ �������� ���ϸ� ������ �߻� ��Ŵ
	
	@Override
	public String toString() {
		return name + " / " + age;
	}
	
	/*
	// �����ε� ���� ����
	// �޼ҵ�� ���� + �Ű����� �ٸ�
	//@Override
	public String toString(int num) {
		// �Ű������� �ٸ����� �����ε��� �������� ����
		// ��? �������̵� ���� ����(�Ű������� �����ؾ� �Ѵ�)�� �����߱� ������ 
		
		// �ذ� ��� -> @Override �����
		// ��?  @Override ������ �������̵��� �Ǿ����� �˷��� + �������̵� �������� �˻�
		return name + " / " + age;
	}
	*/
	
	
}
