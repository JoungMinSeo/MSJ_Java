package edu.kh.oop.method.ex.model.service;

import edu.kh.oop.method.ex.model.vo.Product;

public class MethodService2 {

	public void start() {
		// MehotdService1�� �ִ� ���(�޼ҵ�)�� ȣ���ϴ� �޼ҵ�
		
		MethodService1 service = new MethodService1();
		service.example1();
		service.sum(45678, 12345, 11111);
		service.doublePlusMinus(3.14, 1.23, 2.34);
		
		
		int[] numbers = {1,2,3,4,5};
		// numbers���� int[]�� ������ �� �ִ� �ּҰ� ����Ǿ� �ִ�.
		
		service.arrSum(numbers);
		// �Ű������� ���� �ڷ����� ���޵Ǵ� ���
		// �ּҸ� ����Ǽ� ���޵ȴ� == ���� ����
	
	
		// Product ��ü ����
		Product prd1 = new Product("�Ｚ�����", 100000, "123-12-123");
		// MethodService2 ��ü�� start() �޼ҵ� ȣ�� ��
		// VO �뵵�� �ۼ��� Product Ŭ������ �Ű����� �ִ� �����ڸ� �̿��Ͽ�
		// �ʵ尪�� �ʱ�ȭ �� ��ü(�ν��Ͻ�)�� �����ϰ�
		// ������ ��ü�� �ּҸ� �������� prd1�� �����Ѵ�.
		
		
		Product prd2 = new Product("LG�����", 200000, "999-2-1234-789");
		Product prd3 = new Product("��ť�����", 300000, "777-888-666");
		
		// ��ȯ�� String �ٷ� ���
		System.out.println( service.productString(prd1) );
		System.out.println( service.productString(prd2) );
		System.out.println( service.productString(prd3) );
		
		
		
		// ��ȯ�� String�� String ������ ����
		String result2 = service.productString(prd2);
		System.out.println(result2);
		
		// ��ȯ�� String �ٷ� ���
		System.out.println( service.productString(prd3) );
		
	}
	
	
	
	
}
