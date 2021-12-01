package edu.kh.control.loop.practice.service;

import java.util.Scanner;

public class PracticeService {
	
	// �ǽ����� 3
	// 1���� ����ڿ��� �Է� ���� �������� �������� ���� for���� �̿��Ͽ� ����ϼ���.

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		int sum = 0; // ���� ���� ������ ����
		for(int i=1 ; i<=input ; i++ ) {
			
			System.out.print(i);
			sum += i;
			
			if(i < input) {
				System.out.print(" + ");
			}else {
				System.out.print(" = " + sum);
			}
		}
	}
	
	/* �ǽ����� 4
	����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
	���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
	*/
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		
		if(num1 > 0  &&  num2 >= 1) { // �Ѵ� 1 �̻�
		// 0�ʰ� == 1�̻�
			/*
			if(num1 > num2) { // ù ��° �Է¹��� ���ڰ� �� ��° �Է¹��� ���ں��� Ŭ ���
				
				for(int i=num2 ; i<=num1 ; i++) {
					System.out.print(i + " ");
				}
			
			}else {
				
				for(int i=num1 ; i<=num2 ; i++) {
					System.out.print(i + " ");
				}
			}
			*/
			
			int start = num1; // �ݺ��� �ʱ�� �ʱ�ȭ�� ����� ����
			int end = num2;	  // �ݺ��� ���ǽ� ���� ���ǿ� ����� ����
			
			if(num1 > num2) {
				end = num1;
				start = num2;
			}
			
			for(int i=start ; i<=end ; i++) {
				System.out.print(i + " ");
			}
			
		}else { // �� �� �ϳ� �̻� 1 �̸�
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
		
	}
	
	
	/* �ǽ����� 6
	����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
	��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.
	*/
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if( num <= 9 ) {
			
			for(int i=num ; i<=9 ; i++) { // �� �ݺ� �κ�
				System.out.println("===== " + i + "�� ===== ");
				
				for(int j=1 ; j<=9 ; j++) { // 1 ~ 9 �������� �� �ݺ�
					System.out.printf("%d x %d = %d\n", i , j, i*j );
				}
				
				System.out.println();
			}
		}else {
			System.out.println("9 ������ ���ڸ� �Է����ּ���");
		}
	}
	
	
	
	
	
	
	
}
