package edu.kh.variable.practice1.service;

import java.util.Scanner;

public class VariablePractice1 {

	/* �ǽ����� 1
	�̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.

	[���� ���]
	�̸��� �Է��ϼ��� : �ƹ���
	������ �Է��ϼ���(����/����) : ����
	���̸� �Է��ϼ��� : 20
	Ű�� �Է��ϼ���(cm) : 180.5
	Ű 180.5cm�� 20�� ���� �ƹ����� �ݰ����ϴ�^^
	*/
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String inputName = sc.next();
		
		System.out.print("������ �Է��ϼ���(����/����) : ");
		String inputGender = sc.next();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int inputAge = sc.nextInt();
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double inputHeight = sc.nextDouble();
		
		// Ű 180.5cm�� 20�� ���� �ƹ����� �ݰ����ϴ�^^
		System.out.println("Ű " + inputHeight + "cm�� " + inputAge + "�� "
							+ inputGender + " " + inputName + "�� �ݰ����ϴ�^^" );
		
	}
	
	
	
	/* �ǽ�����2
	Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.

	[���� ���]
	ù ��° ���� : 23
	�� ��° ���� : 7
	
	���ϱ� ��� : 30
	���� ��� : 16
	���ϱ� ��� : 161
	������ �� ��� : 3
	*/
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int inputNum1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int inputNum2 = sc.nextInt();
		
		System.out.println(); // �ٹٲ�(����)
		
		System.out.println("���ϱ� ��� : " +   (inputNum1 + inputNum2) );
		System.out.println("���� ��� : " +    (inputNum1 - inputNum2) );
		System.out.println("���ϱ� ��� : " +   (inputNum1 * inputNum2) );
		System.out.println("������ �� ��� : " + (inputNum1 / inputNum2) );
		
	}
	
	/* �ǽ�����3
	Ű����� ����, ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
	��� ���� -> ���� : ���� * ����
		           �ѷ� : (���� + ����) * 2

	[���� ���]
	���� : 13.5
	���� : 41.7

	���� : 562.95
	�ѷ� : 110.4 */
	public void practice3() {  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double inputWidth = sc.nextDouble();
		
		System.out.print("���� : ");
		double inputHeight = sc.nextDouble();
		
		System.out.println("���� : " +  (inputWidth * inputHeight) );
		System.out.println("�ѷ� : " +  (inputWidth + inputHeight) * 2 );
		
	}
	
	
	
	
	
	
}
