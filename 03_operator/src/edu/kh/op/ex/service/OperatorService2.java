package edu.kh.op.ex.service;

import java.util.Scanner;

public class OperatorService2 {
	
	// �� ������
	public void example1() {
		/* - �� �� �� ���� ���ϴ� ������
		 * 
		 * &&(AND) : �� �� �� ���� ��� true�� ���� true�� ��ȯ
		 * -> true && true == true
		 * --> �׸���(~�̰�), ~�鼭, ~�̸鼭, ~����, ~����, ~����
		 * 
		 * ||(OR) : �� �� �� ���� ��� false�� ���� false�� ��ȯ
		 * ->  false || false == false
		 * --> �Ǵ�, ~�ų�, ~�̰ų�
		 * 
		 * */
		
		// �Է¹��� ������ 1���� 100 ���� �������� Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		boolean result = (1 <= input)  &&  (input <= 100);
			// input�� 1���� ũ�ų� ����.   �׸���     input�� 100���� �۰ų� ����.
				
		System.out.println("�Է¹��� ������ 1~100���� �����ΰ�? : " + result);
	}
	
	
	public void example2() {
		
		// �Է¹��� ���ĺ��� �빮��  A ~ Z ������ �������� Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ĺ� �ϳ� �Է� : ");
		char input = sc.next().charAt(0);
		// ���ڿ�(String).charAt(0) : ���ڿ����� 0��° ���� �ϳ��� ������
		
		boolean result = ('A' <= input) && (input <= 'Z');
		
		System.out.println("�Է¹��� ���ĺ��� A~Z ���̰� �´°�? : " + result);
	}
	
	
	public void example3() {
		// �Է¹��� ������ 0 �̸� �Ǵ� 100 �ʰ����� Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		boolean result = (input < 0)  ||  (input > 100);
		//boolean result =  !((0 <= input) && (input <= 100)) ;
		//boolean result =  ((0 <= input) && (input <= 100))  != true  ;
		
		System.out.println("�Է¹��� ���� 0�̸� �Ǵ� 100 �ʰ��ΰ�? " + result);
	}
	
	
	public void example4() {
		// �Է¹��� ���� �ϳ��� 'Y'���� Ȯ��(��ҹ��� ���� X)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		char input = sc.next().charAt(0);
		
		boolean result = (input == 'Y') || (input == 'y');
		
		System.out.println("Y �Ǵ� y�� �´��� Ȯ�� : " + result);
	}
	
	
	
	// ���� ���� ������
	public void example5() {
		
		int num = 10;
		num = num + 10;
		
		int num2 = 10;
		num2 += 10; // == num2 = num2 + 10  �����ǹ�
		
		int num3 = 1;
		
		// num3�� 1 ���� ���Ѽ� ���
		num3++;
		System.out.println("num3 : " + num3); // 2
		
		// num3�� 2 ���� ���Ѽ� ���
		num3 += 2;
		System.out.println("num3 : " + num3); // 4
		//System.out.println("num3 : " + (num3 += 2)); // 4
		
		num3 += 2;
		System.out.println("num3 : " + num3); // 6
		
		num3 += 2;
		System.out.println("num3 : " + num3); // 8
	}
	
	
	// ���� ������
	public void example6() {
		/* ���ǽ� ? ��1 : ��2;
		 * 
		 * ���ǽ� : ����� true �Ǵ� false�� ��
		 * 
		 * - ���ǽ��� true�� ��� ��1 ����
		 * - ���ǽ��� false�� ��� ��2 ����
		 * */
		
		// ������ �Է¹޾� ������� �������� �˻�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		String result = input > 0  ? "����̴�." : "�����̴�.";
		//"����̴�"  / "�����̴�"
			
		System.out.println(input + "��/�� " + result);
	}
	
	
	public void example7() {
		// ������ �Է¹޾� ���, 0, �������� �˻�
		// ����� ��� '+' ������ ��� '-', 0�� ��� '0' ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		// ���� ������ �ߺ� ���
		char result = (input > 0) ? '+' :  (input == 0) ? '0' : '-'  ;
		
		//(input == 0) ? '0' : '-'
		
		System.out.println(result);
	}
	
	
	
	public void example8() {
		// �ֹε�Ϲ�ȣ�� �Է¹޾� ����(1,3)���� ����(2,4)���� �����Ͽ� ���.
		// ex) �Է� : 990101-1234567 
		//     ����
		// ex) �Է� : 010303-4234567
		//     ����
		
		// ex) �Է� : 021112-7234567
		//     �߸� �Է��ϼ̽��ϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		
		// �Էµ� �ֹε�Ϲ�ȣ���� �����κи� ����
		char input = sc.next().charAt(7); 
		
		String result = (input == '1' || input == '3') ? "����" 
				: (input == '2' || input == '4') ? "����" : "�߸� �Է��ϼ̽��ϴ�." ;
		
		System.out.println(result);
	}
	
	
	
	
	
	
	
	
	
	
	
}
