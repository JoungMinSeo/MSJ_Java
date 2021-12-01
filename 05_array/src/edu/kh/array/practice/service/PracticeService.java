package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	/* �ǽ����� 1
	���̰� 9�� �迭�� �����ϰ� 1���� 9������ ���� �ݺ����� �̿��Ͽ� 
	������� �迭�� �� �ε��� ��ҿ� �����ϰ� ����� �� 
	¦�� ��° �ε��� ���� ���� ����ϼ���. (0 ��° �ε����� ¦���� ���)
	*/
	public void practice1() {

		int[] arr = new int[9];
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) { 
			arr[i] = i+1; 
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 0) { // ¦�� ��° �ε���
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("¦�� ��° �ε��� �� : " + sum);
		
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* �ǽ����� 2
	���̰� 9�� �迭�� �����ϰ� 9���� 1������ ���� �ݺ����� �̿��Ͽ� 
	������� �迭�� �� �ε��� ��ҿ� �����ϰ� ����� �� 
	Ȧ�� ��° �ε��� ���� ���� ����ϼ���. (0 ��° �ε����� ¦���� ���)
	*/
	public void practice2() {

		int[] arr = new int[9];
		
		int sum = 0;
		for(int i=arr.length-1; i>=0; i--) { 
			arr[i] = i+1; 
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 1) { // Ȧ�� ��° �ε���
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("Ȧ�� ��° �ε��� �� : " + sum);
		
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* �ǽ����� 3
	����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
	1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
	ex.
	���� ���� : 5
	1 2 3 4 5 
	*/
	public void practice3() {
		// 1. ����ڿ��� ���� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int size = sc.nextInt();
		
		// 2. �迭�� �Ҵ��� ���� ����ڰ� �Է��� ����(size)��ŭ�� ũ��� �Ҵ�
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* �ǽ����� 4
	���� 5���� �Է� �޾� �迭�� �ʱ�ȭ �ϰ� 
	�˻��� ������ �ϳ� �Է� �޾� �迭���� ���� ���� �ִ� �ε����� ã�� ���.
	�迭�� ���� ���� ���� ��� ����ġ�ϴ� ���� �������� �ʽ��ϴ١� ���
	 */
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length ; i++) {
			System.out.print("�Է� " + i + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int search = sc.nextInt();
		
		boolean flag = true;
		
		for(int i=0; i<arr.length ; i++) {
			if(arr[i] == search) {
				System.out.print("�ε��� : " + i);
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("��ġ�ϴ� ���� �������� �ʽ��ϴ�.");
		}
		
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* �ǽ����� 5
	���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ���
	������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���.
	ex.
	���ڿ� : application
	���� : i
	application�� i�� �����ϴ� ��ġ(�ε���) : 4 8
	i ���� : 2
	*/
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		
		int count = 0; 	// �˻��� ���ڰ� ���ڿ��� ��� ����ִ����� ������ ����
						// ���ڿ����� ������ ���ڰ� �߻��� ������ 1�� ����
		
		// �ݺ��� ������ ���ڿ� ���
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		
		// �ε������� �����ϱ� ���� �ݺ��� ���
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) { // �ش� �ε��� ���� �˻��� ���ڿ� ���� ��� 
				System.out.print(i + " ");	// �ش� �ε��� �̾ ���
				
				count++;	// �׸��� count 1����
			}
		}
		
		System.out.println();	// �ٹٲ�
		System.out.println(ch + "���� : " + count);
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* �ǽ����� 6
	����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
	�迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���.
	�׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ����ϼ���.
	*/
	public void practice6() {
		// 1. ����ڿ��� ���� �Է¹ް� �� ����ŭ�� �迭 ���� �� �Ҵ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		// 2. �� �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ
		for(int i=0; i<arr.length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
		}
		
		// 3. ��ü �� ���� �� �� �� ���
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("�� �� : " + sum);
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* �ǽ����� 7
	�ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ����ϼ���.
	��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϼ���.
	*/
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			
			if(i <= 7) { // 7�� �ε��� ���ϱ�����
				System.out.print(str.charAt(i));
			}else { // �� ���ĺ��ʹ� *�� ������
				System.out.print("*");
			}
		}
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* �ǽ����� 8
	3�̻��� Ȧ���� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
	�߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
	��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
	�ٽ� ������ �޵��� �ϼ���.
	*/
	public void practice8() {
		
		// 1. ����ڿ��� 3�̻��� �������� �Է¹���
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 == 1) { // 3�̻��̰ų� Ȧ���� ��� (��, �� �Է��� ���)
				
				// ����ڰ� �Է��� ���� ũ�� ��ŭ�� �迭 ����
				int[] arr = new int[num];
				
				// ���� ��¿� ���� --> ���������� ��� 1�� ����, ���������� ��� 1�� ����
				int count = 0;
				
				// �� �ֱ�
				for(int i=0; i<arr.length; i++) {
					
					if(i <= arr.length / 2) { // �迭�� �߰������� ����
						count++;
					}else { // �߰� ���ĺ��� ����
						count--;
					}
					
					arr[i] = count;
					
					System.out.print(arr[i]);
					
					if(i < arr.length-1) {
						System.out.print(", ");
					}
				}
				
				break; // ����� ���� �ϰ� ���� �ݺ��� ����������
				
			}else { // �߸� �Է��� ���
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* �ǽ����� 9
	10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
	1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ����ϼ���.
	*/
	public void practice9() {
		// 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] arr = new int[10];
		
		// 2. �� �ε����� 1���� 10 ������ ������ �߻����� �ʱ�ȭ�� �� ���
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* �ǽ����� 10
	10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
	1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ ��
	�迭 ��ü ���� �� �� �߿��� �ִ밪�� �ּҰ��� ����ϼ���.
	*/
	public void practice10() {
		// 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] arr = new int[10];
		
		// 2. �� �ε����� 1���� 10 ������ ������ �߻����� �ʱ�ȭ �� ���
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(); // ����
		
		// 3. �ݺ����� ���� �ִ밪 �ּҰ� �˾Ƴ���
		int max = 1;  // �ּҰ��� ����� ���� , 1�� �������� �߻��� �� �ִ� ���� ���� ��
		int min = 10; // �ִ밪�� ����� ���� , 10�� �������� �߻��� �� �ִ� ���� ū ��
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > max) { // �ش� �ε����� ���� max ���� ū ���
				max = arr[i]; // �ش� ���� max ������ �����
			}
			
			if(arr[i] < min) { // �ش� �ε�����  ���� min ���� ���� ���
				min = arr[i]; // �ش� ���� min ������ �����
			}
		}
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
				
	}
	//-----------------------------------------------------------------------------------------
	
	
	/* �ǽ����� 11
	10���� ���� ������ ��  �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
	1~10 ������ ������ �߻����� �ߺ��� ���� ���� �迭�� �ʱ�ȭ�� �� ����ϼ���.
	*/
	public void practice11() {
	
		// 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] arr = new int[10];
		
		// 2. �� �ε��� ���� 1���� 10 ������ ������ �߻���Ű�µ� �̶� �ߺ��� ������
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j=0; j<i; j++) { // �ߺ� ����
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. ���
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	//-----------------------------------------------------------------------------------------
	
	/* �ǽ����� 12
	�ζ� ��ȣ �ڵ� ������ ���α׷��� �ۼ��ϴµ� �ߺ� �� ���� ������������ �����Ͽ� ����ϼ���.
	*/
	
	public void practice12() {
		// 1. ũ�Ⱑ 6�� ������ �迭 ���� �� �Ҵ�
		int[] lotto = new int[6];
		
		// 2. �迭�� �ߺ������� 1���� 45������ ���� �ʱ�ȭ
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j=0; j<i; j++) { // �ߺ� ����
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. �������� ����
		Arrays.sort(lotto);
		
		// 4. ���
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* �ǽ����� 13
	���ڿ��� �Է� �޾� ���ڿ��� � ���ڰ� ������ �迭�� �����ϰ�
	������ ������ �Բ� ����ϼ���.
	ex.
	���ڿ� : application
	���ڿ��� �ִ� ���� : a, p, l, i, c, t, o, n
	���� ���� : 8
	*/
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		int count = 0; // ���� ���� ī��Ʈ
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		
		for(int i=0; i<str.length(); i++) {
			
			boolean flag = true; // �ߺ� üũ�� flag
			
			for(int j=0; j<i; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					flag = false; // �ߺ��̹߻����� ��
					break;
				}
			}
			
			if(flag) { // �ߺ��� �߻����� �ʾ��� ���
				
				if(i == 0) {
					System.out.print(str.charAt(i));					
				}else {
					System.out.print(", " + str.charAt(i));					
				}
				
				count++;
			}
			
		}
		
		System.out.println();
		System.out.println("���� ���� : " + count);
		
		
	}
	
	//-----------------------------------------------------------------------------------------
	
}
