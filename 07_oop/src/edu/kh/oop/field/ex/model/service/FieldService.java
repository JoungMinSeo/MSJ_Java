package edu.kh.oop.field.ex.model.service;

import edu.kh.oop.field.ex.model.vo.Korean;

public class FieldService {

	/* static (������, ������)
	 * 
	 * JVM static �޸� ����
	 * (== static ����, ���� �޸� ����, ���� ����, method area, class area)
	 * 
	 * 
	 * * �ʵ� ����ȭ
	 * 1) ��� ����(== �ν��Ͻ� ����)
	 *  private int age;
	 *  
	 *  ���� : new �����ڸ� ���� Heap ������ ��ü(�ν��Ͻ�)�� ���� �� ��
	 *  
	 *  �Ҹ� : ��ü�� �Ҹ�� �� ���� �Ҹ�
	 *  		--> ��ü �Ҹ��� ��� ���� �������� �������� ���� ��
	 *  			���� �ð� �� GC�� ���ؼ� �Ҹ��.
	 * 
	 * 2) Ŭ���� ����(== static ����)
	 * - static ���� ���� ����
	 * public static int num;
	 * 
	 * ���� : ���α׷� ���� �� static ������ ������.
	 * 
	 * �Ҹ� : ���α׷� ���� �� �Ҹ�.
	 */
	
	public void example1() {
		// �ѱ��� ��ü 3�� ����
		Korean k1 = new Korean();
		Korean k2 = new Korean();
		Korean k3 = new Korean();
		
		// k1, k2, k3�� �̸�, �ֹι�ȣ ����
		k1.setName("ȫ�浿");
		k1.setId("123456-1234567");
		
		k2.setName("�̼���");
		k2.setId("991212-1231234");
		
		k3.setName("�Ż��Ӵ�");
		k3.setId("010101-4123456");
		
		
		// �����ڵ带 1�� ����
		//k1.setNationalCode(1);
		//k2.setNationalCode(1);
		//k3.setNationalCode(1);
		
		//Korean.nationalCode = 1; // Ŭ��������(== static����)
		
		
		
		// k1, k2, k3�� ������ �ִ� �ʵ� ���� ��� ���
		System.out.println(k1.toString());
		System.out.println(k2.toString());
		System.out.println(k3.toString());
		
		
		System.out.println(Math.PI);
		System.out.println(Korean.language);
		
		
	}
	
	
	
	
}
