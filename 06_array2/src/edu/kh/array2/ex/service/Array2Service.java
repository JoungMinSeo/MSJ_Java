package edu.kh.array2.ex.service;

import java.util.Scanner;

public class Array2Service {

	/* ������ �迭 : �ڷ����� ���� 1���� �迭�� ����.
	 * - ������ �迭�� �Ҵ�� �������� �ΰ��� �ε��� ��ȣ�� �ο� ����.
	 *  --> �� ��ȣ�� ��, �� ��ȣ�� ��
	 * */
	
	public void example1() {
		
		// ������ �迭�� ����
		int[][] arr; // 2���� �迭�� ������ ���� ���� arr�� ����
		// (���� ���� == ������ ���� == ���۷��� == ���۷��� ����)
		// --> ������ ������ �ּҸ� �Է¹ޱ� ���� 4byte ������ �Ҵ��.
		
		
		// ������ �迭 �Ҵ�
		arr = new int[3][2];
		
		// �ε����� �̿��� ���� �ʱ�ȭ
		/*arr[0][0] = 0;
		arr[0][1] = 1;
		// arr[0][2] = 2; 2���� �����Ƿ� �迭 ���� �ʰ� ���� �߻�.
		
		arr[1][0] = 2;
		arr[1][1] = 3;
		
		arr[2][0] = 4;
		arr[2][1] = 5;*/
		
		// 2���� �迭 ����� ���ÿ� �ʱ�ȭ
		
		int[][] arr2 = {		// 2���� �迭 ����  
						{0, 1}, // 0��
						{2, 3}, // 1��
						{4, 5} 	// 2��
					   };		// 2���� �迭 ��
		
		
		// for���� �̿��� �迭 �ʱ�ȭ
		// for�� 2��, arr �������迭, �ʱ�ȭ�� ���� ������ ���� 1��
		
		int num = 0; // �ʱ�ȭ�� ���� ������ ����(0 ~ 5)
		
		for(int row=0 ; row<arr.length ; row++ ) { // �� ����
			
			for(int col=0 ; col<arr[row].length ; col++) { // �� ����
				// == ���� ����(���� ����) == 2(���� ����)
			
				arr[row][col] = num;
				// 2���� �迭 arr�� row��° �� , col��° ���� num ����
				
				num++; // ���� for�� �ݺ� �� num���� 1 ������ �־�� ��.
				       // �׷��� �� ���� �� 1 ����
				
				//arr[row][col] = num++; // �̷��Ե� ����
			}
		}
		
		
		
		/*
		System.out.print(arr[0][0]);
		System.out.println(arr[0][1]);
		
		System.out.print(arr[1][0]);
		System.out.println(arr[1][1]);
		
		System.out.print(arr[2][0]);
		System.out.println(arr[2][1]);
		*/
		
		
		for(int i=0 ; i<arr.length ; i++) { // �� ����
			
			for(int j=0 ; j<arr[i].length ; j++) { // �� ����
				
				System.out.print(arr[i][j] + " "); // �� ���� ���� ��� ���
			}
			
			System.out.println(); // ���� �� ����� ���� �ٹٲ�
		}
	}
	
	
	public void example2() {
		
		// 2�� 3�� ¥�� int ������ �迭�� ���� �� �Ҵ��Ͽ�
		// �� ��ҿ� �Է� ���� ���� �����ϰ�
		// ��� �� 1��, 0�� ������� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][3];
		
		for(int row=0 ; row<arr.length ; row++ ) { // �� ����, row = 0,1
			for(int col=0 ; col<arr[row].length ; col++) { // �� ����, col = 0,1,2
				
				System.out.printf("arr[%d][%d] �Է� : ",row, col);
				
				arr[row][col] = sc.nextInt();
			}
		}
		
		// ���
		for(int row=arr.length-1 ; row>=0 ; row--) { // �� ����
			
			for(int col=0 ; col<arr[row].length ; col++) { // �� ����
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		System.out.print("1���� �ۼ��� �� : "); // 1���� �ۼ��� �� : 20 50
		
		for(int row=0 ; row<arr.length ; row++) { // �� ����
			System.out.print(arr[row][1] + " ");
		}
		
		System.out.println(); // �� �ٲ�
		
		System.out.print("0�࿡ �ۼ��� �� : "); // 0�࿡ �ۼ��� �� : 10 20 30
		
		for(int col=0 ; col<arr[0].length ; col++ ) { // �� ����
			System.out.print(arr[0][col] + " ");
		}
	}
	
	
	public void example3() {
		// 3�� 3�� ¥�� int ������ �迭�� ���� �� �Ҵ��Ͽ�
		// 1�� �ε��� �� ������ �� ��ҿ� �Է� ���� ���� �����ϰ�
		// 2�� �ε��� �࿡ �� ���� ���� �����ϰ� ��ü ���
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][3]; // 3�� 3�� �迭 ����
		
		for(int row=0 ; row<arr.length-1 ; row++) { // 0, 1�� ����
			
			for(int col=0 ; col<arr[row].length ; col++) { // 0,1,2 �� ����
				
				System.out.printf("arr[%d][%d] �Է� : ", row, col);
				arr[row][col] = sc.nextInt();
				
				arr[2][col] += arr[row][col];
			}
		}
		/*  1  2  3
		 *  4  5  6
		 *  5  7  9
		 * */
		
		// ������ �࿡ �� ���ϱ�
		/*for(int col=0; col<arr[0].length ; col++) { // 0,1,2 �� ����
							// 3
			for(int row=0 ; row<arr.length -1 ; row++) { // 0,1�� ����
									// 2
				arr[2][col] += arr[row][col];
				// �� ���� ������ �࿡ �� ���� ���� ����
			}
		}*/
		
		
		//���
		for(int row=0 ; row<arr.length ; row++) {
			
			for(int col=0 ; col<arr[row].length ; col++) {
			
				System.out.print(arr[row][col] + " ");
			}
			
			System.out.println();
		}
	}
	
	
	public void example4() {
		/* ���� �迭
		 * - ���� ������ ������ ������ ���� ������ �������� ���� 2���� �迭
		 * - �ڷ����� ���� 1���� �迭 ���������� ���� ���� == 2���� �迭
		 * - �� 1���� �迭 ���� ������ ũ�Ⱑ �ٸ� 1���� �迭�� ������ �� �ִ�.
		 * */
		
		int[][] arr = new int[3][]; // ���� �迭 �Ҵ�
		
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		
		int num = 0; 
		
		for(int row=0 ; row<arr.length ; row++ ) { // �� ����
			for(int col=0 ; col<arr[row].length ; col++) { // �� ����
				arr[row][col] = num;
				
				System.out.print(arr[row][col] + " ");
				
				num++;
			}
			
			System.out.println();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
