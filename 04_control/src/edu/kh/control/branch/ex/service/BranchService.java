package edu.kh.control.branch.ex.service;

import java.util.Scanner;

public class BranchService {

	// �б⹮
	// break : �ݺ����� �����Ű�� ����
	public void example1() {
		
		// 0�� �Էµ� �� ���� �Էµ� ��� ������ �� ���
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // �Է� ���� ���� ���� ������ ����
		
		while(true) { // ���� ����
			
			System.out.print("���� �Է�(����� 0) : ");
			int input = sc.nextInt();
			
			sum += input;
			
			if(input == 0) { // 0�� �Էµ� ��� �ݺ��� ����
				break;
			}
		}
		
		System.out.println("�հ� : " + sum);
	}
	
	public void example2() {
		
		// "end"��� �ܾ �Էµ� �� ���� ���ڿ��� �Է¹ް�
		// �ݺ��� ���� �� �� �ٷ� ���
		
		Scanner sc = new Scanner(System.in);
		
		String result = "";  // �� ���ڿ�
		
		while(true) {
			System.out.print("���ڿ� �Է�(����� end) : ");
			
			String input = sc.nextLine(); // ���� �Էµ� �� ���� ��� ����
			
			if(input.equals("end")) {
				// input.equals("end") : 
				// input�� ����� ���ڿ��� "end" ���ڿ��� �� ��ü�� ������ true
				break;
			}
			
			result += input + " ";
		}
		
		System.out.println("��� : " + result);
	}
	
	
	
	// continue : �ݺ��� �������� ��� �����ϸ�
	// 			  continue �ڵ� ���� ��
	//			  for�������� ����������, while�������� ���� �ݺ����� �ǳ� ��.
	
	public void example3() {
		// 1 ���� 100 ���� ���� �� 3�� ����� ������ ��� ���� ���� ���
		
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
			
			if(i % 3 == 0) { // i�� 3�� ������
				continue;
			}
			
			sum += i;
		}
		System.out.println("�հ� : " + sum);
	}
	
	
	
	/* ��ø �ݺ��� ������ �б⹮ ����ϱ�
	 * 
	 * ** �б⹮�� ���� ����� �ݺ������� ������ ��ħ.
	 * */
	public void example4() {
		
		// 2 ~ 9�ܱ��� ��� ���
		// ��, �������� ���� ¦���� ��츸 ���
		// + Ȧ�� �ܸ� ���
		// === 3�� ===
		// 3 x 2 = 6
		// 3 x 4 = 12
		// 3 x 6 = 18
		
		for(int dan=2 ; dan<=9 ; dan++) {
			
			if(dan % 2 == 0) { // ¦������ ���
				continue;
			}
			
			System.out.println("=== " + dan + "�� ===");
			
			for(int num=1 ; num<=9 ; num++) {

				if(num % 2 == 1) { // �������� ���� Ȧ���� ���
					continue;
				}
				
				System.out.printf("%d x %d = %d\n", dan, num, dan*num);
			}
			
		}

	}
	
	
	
	
	
	
	
	
	
	
}
