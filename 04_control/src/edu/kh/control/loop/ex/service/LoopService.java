package edu.kh.control.loop.ex.service;

import java.util.Scanner;

public class LoopService {

	/* for��
	 * 
	 * for(�ʱ�� ; ���ǽ� ; ������){
	 * 	// �ݺ� ������ �ڵ�
	 * }
	 * 
	 * �ʱ�� : for�� ������ �ݺ��� �����ϱ� ���� ����ϴ� ������ �ۼ��ϴ� �κ�
	 * 
	 * ���ǽ� : for���� �ݺ� ���θ� �����ϴ� �κ�
	 * 
	 * ������ : �ʱ�Ŀ� �ۼ��� ������ for���� ������ �� ���� ���� �Ǵ� ���� ��Ű�� �κ�
	 * */
	
	public void example1() {
		
		for( int i=1 ; i <= 10 ; i++ ) {
			System.out.println(i + " ���");
		}
		
		/* 1. �ʱ�Ŀ� �ۼ��� ������ ���� (int i=1)
		 * 
		 * 2. �ۼ��� ������ ���� ���ǽĿ� �������� �� true���� Ȯ��
		 * 
		 * 3. (���ǽ��� true�� ���) for�� ���� �ڵ带 1ȸ ����
		 * 
		 * 4. �������� 1ȸ ���� (i++)
		 * 
		 * 5. ���������� ��ȭ�� �� i�� ���ǽĿ� ����
		 * 
		 * -> true�� ��� 2~5�� �ݺ�,  false�� ��� for�� ����
		 * 
		 * */
	}
	
	
	public void example2() {
		
		// 5 ~ 1 ���� 1�� ����, �Ųٷ� �ݺ� ���
		for(int i = 5 ; i > 0  ; i-- ) {
			
			System.out.println(i);
		}
	}
	
	
	public void example3() {
		
		// 2���� 20 ���� ¦���� ���
		// 2 4 6 8 10 12 14 16 18 20
		
		for(int i=2 ; i <= 20 ; i += 2 ) {
			System.out.print(i + " ");
		}
		
		System.out.println(); // �ٹٲ�
		
		// 1���� 20 ������ ���� �� 2�� ����� ����ϼ���.
		for(int i=1 ; i <= 20 ; i++) {
			
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	
	public void example4() {
		// 1.0 ~ 10.0 ���� 0.5�� �����ϱ�
		// 1.0 1.5 2.0 2.5 3.0 3.5 .... 9.5 10.0
		
		for(double i = 1 ;  i <= 10  ; i += 0.5 ) {
			System.out.print(i + " ");
		}
	}
	
	
	public void example5() {
		// 'A' ~ 'Z' ����ϱ�
		for(char ch = 'A' ; ch <= 'Z' ; ch++) {
			System.out.print(ch);
		}
	}
	
	
	public void example6() {
		// 5���� ������ �Է¹޾� ��� �� ���ϱ�(�Ҽ��� �Ʒ� 1�ڸ�)
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // �ԷµǴ� ���� ��� ���� ���� ���� �� 0���� �ʱ�ȭ
		
		for(int i=1 ; i <= 5 ; i++ ) {
			System.out.print("�Է�" + i + " : "); // �Է� 1 : 
			sum += sc.nextInt(); // sum ������ �ԷµǴ� ���� ����
		}
		
		System.out.printf("��� : %.1f \n", sum/5.0   );
		
	}
	
	
	public void challenge1() {
		// 2~9 ���� ������ �Է¹޾� 
		// �Է� ���� ���� �������� ���
		// ��, 2~9 ���� ���ڰ� �ƴ� ��� "�߸� �Է��ϼ̽��ϴ�" ���
		
		// [���� ȭ��]
		// �� �Է� : 2
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 4 = 8
		// ... (�߷�)
		// 2 x 9 = 18
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) { // 2 ~ 9 ����
			// ������ ���
			for(int i=1 ; i<=9 ; i++) { // i == 1 ~ 9, 1�� ����
				
				// 2 x 1 = 2
				// 2 x 2 = 4
				// 2 x 3 = 6
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}
			
		} else {
			System.out.println( "�߸� �Է��ϼ̽��ϴ�");
		}
	}

	
	public void example7() {
		// 1~10 ���� ���� 10�� �߻� ���� ���
		
		// java.lang.Math Ŭ����
		// - ���а� ���õ� ����� �����ϴ� Ŭ����
		// (java.lang ��Ű���� ������ �� �ڵ����� import �ȴ�)
		
		// Math.random() �޼ҵ�
		// - ������ �߻���Ű�� ���
		// ���� �߻� ���� :  0.0 <= ���� < 1.0
		
		for(int i=1 ; i<=10 ; i++ ) {
			int random =  (int)(Math.random() * 10 + 1) ;
			//  0.0 <=   Math.random()   < 1.0
			//  0.0 <=   Math.random() * 10  < 10.0
			//  1.0 <=   Math.random() * 10 + 1  < 11.0
			//  1 <=   (int)(Math.random() * 10 + 1)  < 11
			
			System.out.println(random);	
		}
	}
		
	
	public void example8() {
		
		// 1 ~ 20 ������ ���� 5���� �߻����� ����ϰ�
		// �߻��� ������ �հ踦 ���.
		
		int sum = 0; // �߻��� ������ �հ踦 ������ ����
		for(int i=1 ; i<=5 ; i++ ) {
			
			// 1 ~ 20 ���� ���� �߻�
			int random =  (int)(Math.random() * 20 + 1);
			System.out.println(random); // ���� ���
			sum += random; // �߻��� ���� ����
		}
		
		System.out.println("�հ� : " + sum);
	}
	
	
	public void example9() {
		
		// �� ������ �Է¹޾� 
		// �� ���� ������ ��� ���� ���� ���
		// ��, �Է� 1�� �Է� 2���� Ŭ ��� "�Է� 1�� �Է�2���� Ů�ϴ�" ���
		
		// [����ȭ��]
		// �Է� 1 : 2
		// �Է� 2 : 4
		// �հ� : 9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� 1 : ");
		int num1 = sc.nextInt(); //3
		
		System.out.print("�Է� 2 : ");
		int num2 = sc.nextInt(); //5
		
		if(num1 > num2) { // �Է� 1�� �Է� 2���� Ŭ ���
			System.out.println("�Է� 1�� �Է� 2���� Ů�ϴ�.");
		
		} else { // �Է� 1�� �Է� 2���� �۰ų� ���� ���
			
			// 3 + 4 + 5 = 12
			int sum = 0;
			for(int i=num1 ; i<=num2 ; i++ ) {  // i= 3, 4, 5
				sum += i;
			}
			
			System.out.println("�հ� : " + sum);
		}
	}
	
	
	
	// ���ڿ� �Է� �ϱ�, ���ڿ� ���ϱ�
	public void example10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		String input = sc.next();
		
		sc.nextLine(); // �Է� ���ۿ� �����ִ� \n �� ����
		
		System.out.print("�Է� : ");
		String input2 = sc.nextLine();
		
		// sc.next() : ���� �ԷµǴ� �ܾ� �ϳ��� ����. (�ܾ� ���� ���� == ����)
		// sc.nextLine() : ���� �ԷµǴ� �� ��(����)�� ���ͱ��� ����.
		
		System.out.println(input);
		System.out.println(input2);
		
		// Ű���� �Է� ��     Ű���� -> �Է� ���� -> ���α׷�(�ܼ�)  ������ �Էµ�.
		
		// �Է� ���� ex)
		// �����(����)�߱�(����)���빮��(\n)
		
		// sc.next() 1ȸ : �����    /  (����)�߱�(����)���빮��(\n)
		// sc.next() 2ȸ : �߱�       /  (����)���빮��(\n)
		// sc.next() 3ȸ : ���빮�� /  (\n)
		// sc.next() 4ȸ : (\n)  /   empty
		
		
		// ����(\n)
		// sc.next() : ����    	/  (\n)
		// sc.nextLine() : (\n) /  empty
		
		// * nextLine() �տ�  next(), nextInt(), nextDouble() ���� ����ϸ�
		// �Է� ���ۿ� �����ִ� ���๮��(\n)�� �ٷ� ������ ������ �Է��� ���ϴ� ���� �߻�.
		
		
		// �Է¹��� input, input2 �� ���� ���ڿ��� ��
		
		//if(input.equals(input2)) {
		if(input == input2) {
			// input.equals(input2) : 
			// input�� �����ϴ� ���ڿ����� input2�� �����ϴ� ���ڿ����� ������?
			// -> ������ true, �ƴϸ� false
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
	}
	
	
	
	
	/* ��ø �ݺ���
	 * - �ݺ��� ���ο� �ݺ����� ��ø�Ǿ� �ۼ���.
	 * */
	public void example11() {
		// 0�� 0�� ���� 59�� 59�ʱ��� ���
		for(int min=0 ; min < 60 ; min++) { // 0 ~ 59�� �ݺ� == 1�ð�
			
			for(int sec=0 ; sec < 60 ; sec++) { // 0 ~ 59 �� �ݺ� == 1��
				
				System.out.printf("%02d�� %02d��\n", min, sec);
			}
		}
	}
	
	
	public void example12() {
		
		// 2�� for���� Ȱ���ؼ� �Ʒ� ����� ���
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		
		for(int i=1 ; i<=5 ; i++) {
			
			for(int j=1 ; j<=5 ; j++) {
				System.out.print(j);
			}
			
			System.out.println(); // �ٹٲ�
		}
	}
	
	
	public void example13() {
		
		// 2�� for���� Ȱ���ؼ� �Ʒ� ����� ���
		// 54321
		// 54321
		// 54321
		
		for(int i=1 ; i<=3 ; i++) { // i = 1,2,3
			
			System.out.print(i + "��° : ");
			
			for(int j=5 ; j>=1 ; j--) { // j = 5,4,3,2,1
				System.out.print(j);
			}
			
			System.out.println(); // �ٹٲ�
		}
	}
	
	
	public void example14() {
		// 2�ܺ��� 9�ܱ��� ��� ���
		
		for(int dan=2 ; dan<=9 ; dan++) { // 2 ~ 9��
			
			for(int num=1 ; num<=9 ; num++) { // 1 ~ 9 �������� ��
			
				System.out.printf("%d x %d = %-2d\n", dan, num, dan*num );      
			}
			
			System.out.println(); // �ٹٲ�
			
		}
	}
	
	
	public void example15() {
		// 9 ~ 2�ܱ��� �Ųٷ� ���
		
		// === 9�� ===
		// 9 x 9 = 81
		// 9 x 8 = 72
		// ...
		
		// === 2�� ===
		// 2 x 9 = 18
		// ...
		// 2 x 2 = 2
		
		for(int dan=9 ; dan>=2 ; dan--) {
			
			System.out.println("=== " + dan +"�� ===");
			
			for(int num=9 ; num>=1 ; num--) {
				System.out.printf("%d x %d = %-2d\n",dan, num ,dan*num);
			}
			
			System.out.println();
		}
	}
	
	
	public void example16() {
		
		// 2�� for���� Ȱ���ؼ� �Ʒ� ����� ���
		
		// 1
		// 12
		// 123
		// 1234
		
		for(int i=1 ; i<=4 ; i++) { // i = 1,2,3,4
			
			for(int j=1 ; j<=i ; j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
	public void example17() {
		
		/*
		���� �Է� : 5
		1
		12
		123
		1234
		12345
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		for(int i=1 ; i<=input ; i++) {
			
			for(int j=1 ; j<=i ; j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	public void challenge2() {
		/*
		���� �Է� : 5
		12345
		1234
		123
		12
		1
		*/
		
		
	}
	
	
	// ----------------------------------------------------------------
	
	/* while��
	 * 
	 * while(���ǽ�){
	 * 	// ���ǽ��� true�� ��� ������ �ڵ�
	 *
	 * }
	 * 
	 * for�� : �ʱ�Ŀ��� ����� ������ �̿��Ͽ� 
	 *  	    �ݺ��� ���� �Ҽ� ����.
	 *        == ���� �����ؼ� ���� ������ ������ ����.
	 *        
	 *        
	 * while�� : ������ �ʱ���� �������� �ʾƼ�      	
	 *          �ݺ� ���� ������ �����Ӱ� ����.
	 *          == ���� ������ ��.
	 * */
	
	public void example18() {
		
		// 9�� �Էµ� �� ���� ��� �޴� ���
		// 9�� �ԷµǸ� "���α׷� ����"�� ��� �� ��¥ ����
		Scanner sc = new Scanner(System.in);
		
		int input = 0; // while�� ������ �Է¹��� ���� ������ ����
		
		while(input != 9) {
			System.out.println("--------------");
			System.out.println("1. ��ȸ");
			System.out.println("2. �ۼ�");
			System.out.println("3. ����");
			System.out.println("4. ����");
			System.out.println("9. ����");
			
			System.out.print("���� >> ");
			input = sc.nextInt();
		}
		System.out.println("���α׷� ����");
	}
	
	
	
	public void example19() {
		
		// �ԷµǴ� ��� ���� �հ� ���ϱ�
		// (0 �Է� �� ����)
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // �ԷµǴ� ��� ���� �հ踦 ������ 	����
		
		int input = -1; // while�� ������ �Է� ���� ���� ������ ����
		// input�� -1�� �ʱ�ȭ�� ���� : 0���� �ϸ� while���� �ٷ� ����Ǵϱ�
		
		while(input != 0) { // input�� 0�� �ƴ� ��� �ݺ�
			System.out.print("�Է� : ");
			input = sc.nextInt();
			sum += input;
		}
		
		System.out.println("�հ� : " + sum);
	}
	
	
	
	public void example20() {
		/* do ~ while��
		 * - {} ���� �ڵ带 ������ 1ȸ�� �����ϴ� while��
		 * 
		 * do{
		 * 	// �ݺ� ������ �ڵ� �ۼ�
		 * 
		 * }while(���ǽ�);
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = 0;
		
		do {
			System.out.print("�Է� : ");
			input = sc.nextInt();
			sum += input;
			
		}while(input != 0);
		
		System.out.println("�հ� : " + sum);
	}
	
	
	
	
	
	
	
	
} // class end


