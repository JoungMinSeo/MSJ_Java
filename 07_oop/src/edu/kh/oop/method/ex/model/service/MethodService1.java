package edu.kh.oop.method.ex.model.service;

import edu.kh.oop.method.ex.model.vo.Product;

public class MethodService1 {
	
	// 1. �Ű����� x, ��ȯ�� X �޼ҵ�
	public void example1() {
		// void : ��ȯ ���� ����.
		System.out.println("�Ű�����, ��ȯ�� ��� ���� �޼ҵ�");
	}
	
	// 2. �Ű����� O, ��ȯ�� X �޼ҵ�
	public void sum(int num1, int num2, int num3) {
		System.out.printf("%d + %d + %d = %d\n", 
						num1, num2, num3, num1+num2+num3); 
	}
	
	// 2-2. �Ǽ� 3���� ���� �޾� 
	// ù ��° + �� ��° - �� ��° �Ǽ� ����� ����Ͻÿ�.
	// �޼ҵ�� doublePlusMinus
	public void doublePlusMinus(double num1, double num2, double num3) {
		
		System.out.printf("%f + %f - %f = %f\n",
						num1 , num2, num3 ,num1+num2-num3);
	}
	
	
	// 3. �Ű����� O (�迭), ��ȯ�� X �޼ҵ�
	public void arrSum(int[] arr) {
		// ���� ���� int �迭 ����� ��ü ���� ���
		
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			
			sum += arr[i];
		}
		
		System.out.println("�հ� : " + sum);
	}
	
	
	// 4. �Ű����� O (Ŭ����) , ��ȯ�� O (String)
	public String productString(Product prd ) {
		// ���� ���� Product ��ü ���� �ּҸ� �̿���
		// Product ��ü�� ������ �ִ� ��� �ʵ� ���� �ϳ��� ���ڿ��� ��ȯ
		
		String result 
			= prd.getpName() + " / " + prd.getPrice() + " / " +
			  prd.getSerialNumber();
		
		return result;
		// return : ���� �޼ҵ带 �����ϰ� ȣ���� �޼ҵ�� 
		//          �����ʿ� �ۼ��� ���� ������ ���ư�.
	}
	
	
	
	
	
	
	
	
}
