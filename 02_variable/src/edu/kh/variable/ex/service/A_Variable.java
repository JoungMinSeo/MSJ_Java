package edu.kh.variable.ex.service;

public class A_Variable {
	
	
	// ������ ������� �ʴ� ���
	public void example1() {
		
		System.out.println("���� ��� X");
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
		System.out.println(); // �ٹٲ�(����)
	}
	
	
	// ������ ����ϴ� ���
	public void example2() {
		
		double pi = 3.141592653589793; // ������
		int radius = 5; // ������
		int height = 20; // ����
		
		System.out.println("\n���� ��� O"); // \n : ���๮��
		System.out.println(2 * pi * radius); // ���� �ѷ�
		System.out.println(pi * radius * radius); // ���� ����
		System.out.println(pi * radius * radius * height); // ������� ����
		System.out.println("\n\n\n");
		
		System.out.println(4 * pi * radius * radius); // ���� �ѳ���
		
		// ������, ���뼺, ����������
	}
	
	/* ������ ����
	 * 1. ��(data)�� �ǹ̸� �ο���. + ������ ����
	 * 2. ������ �ѹ� ���� �����ϸ� �ݺ������� ����� �� �ִ�. -> ���뼺 ����
	 * 3. ������ ����� ���� �������� ���� �����ϴ�. -> ���������� ����
	 * */
	
	
	
	// ���� ����, �ʱ�ȭ ����
	public void example3() {
		// ���� ���� : �޸�(RAM) ������ �����͸� ������ �� �ִ� ������ �Ҵ�(Ȯ��) �ϴ� ��.
		// -> ����� ������ ������ ���� ������ �� �ִ� �������� ���¿� ũ�Ⱑ �޶���.
		
		// ���� �ۼ��ǰų�, ������ ���ԵǴ� �� ��ü�� '���ͷ�' �̶�� ��.
		// + �ڷ������� ���ͷ��� ǥ���ϴ� ���('���ͷ� ǥ���')�� �ٸ�.
		
		// 1. ����
		boolean isTrue; // 1byte
		isTrue = true; // boolean �ڷ����� ���ͷ� ǥ����� true/false
		
		
		// 2. ������
		byte byteNumber; // 1byte
		byteNumber = 1;
		// ���� ������( = ) : '=' ��ȣ �������� �����ʿ� �ִ� ���� 
		//					���� ������ ����(����)�϶�� ������.
		
		short shortNumber; // 2byte
		shortNumber = 2;
		
		int intNumber; // 4byte + ���� �⺻��
		intNumber = 4;
		
		long longNumber; // 8byte
		longNumber = 8L; // 8l(�ҹ���L)�� ���� 
		
		
		// 3. �Ǽ���
		float floatNumber; // 4byte
		floatNumber = 1.23f; // 1.23F�� ����
		
		double doubleNumber; // 8byte -> �Ǽ� �⺻��
		doubleNumber = 3.14;
		

		// 4. ������(���� �ϳ�)
		char ch; // 2byte(�ڹ�)
		ch = 'A'; // '' Ȧ����ǥ ��ȣ�� char �ڷ����� ���ͷ� ǥ���.
		
		
		// 5. ���ڿ�(������) -> �⺻�ڷ��� X
		String str; // 4byte
		str = "���ڿ�"; // "" �ֵ���ǥ ��ȣ�� String �ڷ����� ���ͷ� ǥ���.
		
		
		// �� �� ���� : ctrl + alt + ����Ű �� �Ǵ� �Ʒ�
		System.out.println(isTrue);
		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(intNumber);
		System.out.println(longNumber);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println(ch);
		System.out.println(str);
		
		
		
		// ���� ��� ��Ģ
		// 1. �ǹ� �ִ� �ܾ ���
		// 2. �������� ù ���ڴ� ������ ���� �ҹ���
		//   + ���� �ܾ ����� ��� ����Ǵ� ���� �ܾ��� ù ���ڴ� �빮��.
		//     -> ī��ǥ���
		// 3. ��ҹ��ڰ� ���еǸ� ���� ������ ����.
		// 4. ���ڷ� ���۵Ǹ� �ȵȴ�.
		// 5. Ư�����ڴ� '_', '$' �� ���.
		// 6. �����(keyword)�� ����� �� ����.
		// 7. �ѱ� ������ ����.
	}
	
	
	// ��� ����
	public void example4() {
		
		// ��� : ���� �� ���� ������ �� �ִ� ����
		
		int age = 32; // ���� ����� ���ÿ� �ʱ�ȭ
		
		final int AGE = 32; // ��� ����� ���ÿ� �ʱ�ȭ
		// final ����� : �������̶�� �ǹ̸� ���� �����
		// * ������� ��� �빮�ڷ� �ۼ� + ����Ǵ� �ܾ�� '_'�� ����
		final int INT_NUMBER = 100;
		
		
		// ����/����� �ٸ� ���� ����
		age = 33;
		//AGE = 33; // ����� �� ������ �Ұ����Ͽ� ������ �߻���.
		
		final double PI = 3.141592;
		
		
		//final int KOREA = 82;
		//final int LEFT = -20;
	}
	
	
	// ���ڿ� ��� ����
	public void example5() {
		String name = "�鵿��"; // String ���� ���� �� �ʱ�ȭ
		int age = 32;
		
		// �̸� : �鵿��
		// ���� : 32
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		
		
		// name, age ����
		name = "ȫ�浿";
		age = 20;
		
		
		// �鵿������ ���̴� 32�� �Դϴ�.
		System.out.println(name + "���� ���̴� " + age + "�� �Դϴ�.");

		// ���ڿ��� �ٸ� �ڷ��� ���̿� '+' ��ȣ�� �̾�⸦ �ǹ��Ѵ�.
		
		System.out.println(age + 10);
		System.out.println(age + "10");
		
		System.out.println(age + 10.1 + "123");
		System.out.println(age + "123" + 10);
		
		System.out.println("123" + age + 10);
		
		System.out.println("123" + (age + 10) );
		
		// ����(����,�Ǽ�)�� ���ڿ��� ȥ�յǾ� �ִ� ���
		// ��Ģ���� ������ �°� �տ��� ���� ����� �����.
	}
	

}
