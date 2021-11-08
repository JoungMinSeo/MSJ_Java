package edu.kh.control.condition.ex.service;

import java.util.Scanner;

public class ConditionService {

	// ���
	// - ���α׷��� �帧�� �ٲٴ�(�����ϴ�) ������ �ϴ� �ڵ�
	
	// ���ǹ�
	// - ��� �� �ϳ��� ���ǿ� ���� �ٸ� ����(�ڵ�)�� ����ǵ��� �ϴ� �ڵ�
	
	
	// if�� ����  (if : ����,  else : �׹ۿ�)
	public void example1() {
		/* �ܵ� if��
		 * if(���ǽ�){
		 *  // ���ǽ��� true�� ��� ������ �ڵ�
		 * }
		 * */
		
		/* if - else��
		 * if(���ǽ�) {
		 *   // ���ǽ��� true�� ��� ������ �ڵ�
		 * } else {
		 * 	 // ���ǽ��� false�� ��� ������ �ڵ�
		 * }
		 * 
		 * */
		
		
		// �Է¹��� ������ �������, ����� �ƴ��� Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("���");
		} else {
			System.out.println("����� �ƴϴ�.");
		}
		
		/*
		if(input <= 0) {
			System.out.println("����� �ƴϴ�");
		}
		*/
	}
	
	
	public void example2() {
		
		// �Է� ���� ������ Ȧ������ ¦������ Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 1) {
			System.out.println("Ȧ��");
		}else {
			System.out.println("¦��");
		}
		
	}
	
	public void example3() {
		
		// �� ������ ������� �Է¹޾�
		// ���� �Է¹��� ���� ū�� / �۰ų� ������ Ȯ��
		
		// [����ȭ��]
		// ���� �Է�1 : 20
		// ���� �Է�2 : 10
		// 20�� 10���� ũ��.
		
		// [����ȭ��]
		// ���� �Է�1 : 5
		// ���� �Է�2 : 10
		// 5�� 10���� �۰ų� ����.
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("���� �Է�2 : ");
		int input2 = sc.nextInt();
		
		if(input1 > input2) {
			System.out.println( input1 + "��/�� " + input2 + "���� ũ��.");
		}else {
			System.out.println( input1 + "��/�� " + input2 + "���� �۰ų� ����.");
		}
	}
	
	
	/* if - else if - else��
	 * - ������ �ټ��� ��� ����ϴ� ���ǹ�
	 * 
	 * if(���ǽ� 1){
	 * 	// ���ǽ� 1�� true�� ��� ����
	 * } else if(���ǽ� 2){
	 * 	// ���ǽ� 2�� true�� ��� ����
	 * } else{
	 *  // �ռ� ���ǽ��� ��� �������� ���ϴ� ��� ����
	 * }
	 * */
	
	public void example4() {
		// �Է� ���� ������ ���, ����, 0 �� � ������ Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("���");
		}else if (input < 0) {
			System.out.println("����");
		}else {
			System.out.println("0�Դϴ�.");
		}
	}
	
	public void example5() {
		
		// 1~12 ������ ���ڸ� �Է� �޾� �ش� ���� ������ ���.
		// ��, 1~12 ���� ���ڸ� �Է����� ���� ��� "�߸� �Է��ϼ̽��ϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 12 ���� ���ڸ� �Է����ּ��� : ");
		
		int month = sc.nextInt();
		
		String result = null; // �Ʒ� if���� ���� ������ ��� ������ ������ ���� ����
		
		if( month >= 3 && month <= 5 ) { // 3 ~ 5
			result = "��";
			
		}else if( month >= 6 && month <= 8 ) { // 6 ~ 8
			result = "����";
		
		}else if( month >= 9 && month <= 11 ) { // 9 ~ 11
			result = "����";
		
		}else if( month == 12 || month == 1 || month == 2 ) { // 12, 1, 2
			result = "�ܿ�";
			
		}else {
			result = "�߸� �Է��ϼ̽��ϴ�.";
		}
		
		System.out.println(result);
	}
	
	
	public void example6() {
		// ���̸� �Է¹޾�
		// 13�� ���ϴ� ���, 19�� ���ϴ� û�ҳ�, 19�� �ʰ��� ���� ���� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		
		int age = sc.nextInt();
		
		String result = null; // null : �ƹ� ���ڿ��� �����ϰ� ���� �ʴ�. (�ӽ÷� �˾Ƶμ���)
		
		if(age <= 13) { // 13�� ����
			result = "���";
		
		} else if(age <= 19) {
			result = "û�ҳ�";
		
		} else {
			result = "����";
		}
		
		System.out.println(result);
	}
	
	
	public void example7() {
		// ���̸� �Է¹޾�
		// 13�� ���ϴ� ���, 19�� ���ϴ� û�ҳ�, 19�� �ʰ��� �������� ���
		// ��, 0 ���� �Է� �� "�߸� �Է��ϼ̽��ϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		String result = null;
		
		// 1. �Է� ���� ���̰� 0���� ū�� Ȯ��
		if(age > 0) {
			// 2.  13�� ���ϴ� ���, 19�� ���ϴ� û�ҳ�, 19�� �ʰ��� ����
			if(age <= 13) {
				result = "���";
			}else if( age <= 19) {
				result = "û�ҳ�";
			}else {
				result = "����";
			}
			
		} else { // age <= 0
			result = "�߸� �Է��ϼ̽��ϴ�.";
		}
		
		System.out.println(result);
		
	}
	
	
	/* switch��
	 * - �� �ϳ��� ���� ����� ���� ó���� ��� ���
	 * - ���� ��� ���� ��ġ�ϴ� case���� ����
	 * 
	 * switch(��) { x + 1
	 * case �����1 : �����ڵ� 1; break;
	 * case �����2 : �����ڵ� 2; break;
	 * case �����3 : �����ڵ� 3; break;
	 * ...
	 * default : �����ڵ�;
	 * 
	 * }
	 * 
	 */
	
	public void example8() {
		// ���� �ϳ��� �Է¹޾�
		// 1�� ��� "������"
		// 2�� ��� "��Ȳ��"
		// 3�� ��� "�����"
		// 1~3 ���� ������ �ƴ� ��� "�߸� �Է��ϼ̽��ϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		String res = null; 
		
		// 1) if�� ����
		/*
		if(input == 1) {
			res = "������";
		}else if(input == 2) {
			res = "��Ȳ��";
		}else if(input == 3) {
			res = "�����";
		}else {
			res = "�߸� �Է��ϼ̽��ϴ�.";
		}
		*/
		
		// 2) switch�� ����
		switch(input) {
		case 1 : res = "������"; break; // input�� 1�� ���
		case 2 : res = "��Ȳ��"; break; // input�� 2�� ���
		case 3 : res = "�����"; break; // input�� 3�� ���
		default : res = "�߸� �Է��ϼ̽��ϴ�.";
		}
		
		// switch������ case�� ���̿� break�� �������� ������
		// ���� case���� ������.
		
		System.out.println(res);
	}
	
	
	public void example9() {
		// 1~12 ���� ���ڸ� �Է� �޾� �˸��� ���� ���
		// ��, 1~12���� ���ڰ� �ƴ� ��� "�߸� �Է��ϼ̽��ϴ�" ���(switch)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ���� ���� �Է� : ");
		int month = sc.nextInt();
		
		String result = null;
		
		switch(month) {
		case 3 : case 4 : case 5 : result = "��"; break;
		case 6 : case 7 : case 8 : result = "����"; break;
		case 9 : case 10 : case 11 : result = "����"; break;
		case 12 : case 1 : case 2 : result = "�ܿ�"; break;
		default : result = "�߸� �Է��ϼ̽��ϴ�.";
		}
		
		System.out.println(result);
	}
	
	
	public void example10() {
		
		// �� ������ ��� �����ڸ� �Է¹޾�
		// �� ������ ���� ����� ���
		
		// [���� ȭ��]
		// �Է� 1 : 5
		// �Է� 2 : 2
		// ������ : *
		// 5 * 2 = 10
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� 1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("�Է� 2 : ");
		int input2 = sc.nextInt();
		
		System.out.print("������ : "); // + - * / %
		char op = sc.next().charAt(0);
		
		int result = 0; // input1�� input2 ���� ����� ������ ����
		switch(op) {
		case '+' : result = input1 + input2; break;
		case '-' : result = input1 - input2; break;
		case '*' : result = input1 * input2; break;
		case '/' : result = input1 / input2; break;
		case '%' : result = input1 % input2; break;
		}
		// 5 * 2 = 10
		System.out.printf("%d %c %d = %d\n", input1, op, input2, result);
		
	}
	
	
	
	
	
	
	
	
	
	
}
