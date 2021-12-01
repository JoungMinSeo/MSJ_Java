package edu.kh.eh.model.service;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.eh.model.exception.SonjeolException;

public class ExceptionService {
	
	// ����(Exception) : �ҽ��ڵ� �������� �ذ� ������ ����(������ ����, ��Ÿ�� ����)
	
	public void example1() {
		// try : ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 ���ο� �ۼ��ؼ� �õ���.
		// catch : try�� �������� ���ܰ� �߻��ϸ� ��Ƴ��� ó����.
		// finally : try-catch ���� �� �������� ������ �����ؾ� �ϴ� �ڵ带 �ۼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �Է¹޾� ���� ���� ���");
		
		// �Է�1 / �Է�2 = ��
		System.out.print("�Է�  1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է�  2 : ");
		int num2 = sc.nextInt();
		
		try {
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			// java.lang.ArithmeticException: / by zero
			// 0���� ���� ��� ��� ���ܰ� �߻�
	
		} catch(ArithmeticException e) {
			// ArithmeticException e : �߻��� ���� ��ü�� ������ ���� ����
			
			System.out.println("0���� ���� �� �����ϴ�.");
			// -> ���� ó�� ����
		
		} finally {
			System.out.println("��� ����.");
		}
	}
	
	
	public void example2() {
		// �ϳ��� try ������ ���� catch�� �ۼ��ϱ�
		
		// 3ĭ¥�� int �迭�� �����Ͽ�
		// �Է� ���� ������ ��� �迭 ��Ҹ� �ʱ�ȭ�ϰ� ������� ���
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		try {
			for(int i=0 ; i<arr.length ; i++) {
				System.out.print(i + "��° �ε��� ��� : ");
				arr[i] = sc.nextInt();
				// java.util.InputMismatchException
				// �Է� ������ �߸��Ǿ� ���� �߻�
			}
			
			for(int i=0 ; i<=arr.length ; i++) {
						  // �迭 ���� �ʰ�
				System.out.println(arr[i]);
				// java.lang.ArrayIndexOutOfBoundsException: 3
				// �迭 ���� �ʰ� ���� �߻�
			}
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ������ �ʰ��ؼ� ������ �� �����ϴ�.");
		
		} catch(InputMismatchException e) {
			System.out.println("������ �ƴ� ������ �ԷµǾ����ϴ�.");
		}
		
	}
	
	
	public void example3() {
		// try-catch �ߺ� ���
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		try {
			for(int i=0 ; i<arr.length ; i++) {
				System.out.print(i + "��° �ε��� �Է� : ");
				
				try {
					arr[i] = sc.nextInt();
					// InputMismatchException �߻� ���ɼ��� ����
					// -> ���� ó�� �� �����ϴ� ���� �ƴ�
					//    �ٽ� �Է� �ް� �ϱ�
				}catch(InputMismatchException e) {
					System.out.println("������ �Է����ּ���.");
					i--;
					sc.nextLine(); // �Է� ���ۿ� �����ִ� ���ڿ��� ����
					// ��������� ó���ϸ� ���� �ݺ� ������ �߻�
					// ��?
					
					// �Է� ���� :   ++(����)
					
					// 0��° �ε��� �Է� : 10(����)
					// -> sc.nextInt(); // �Է� ���ۿ��� ���� ���� ���� ������ ����.
					
					// 1��° �ε��� �Է� : ++(����)
					// -> sc.nextInt(); // �Է� ���ۿ��� ���� ���� ���� ������ ����.
										// ���� �� ���ʹ� ����
					// -> ���� ������ �о���� ������ �ƴ� -> InputMisatchException �߻�
					// -> catch ���� ���� -> for�� ó������ �ٽ� ���ư�
					// ->  1��° �ε��� �Է� : ��� �� try���� �ٽ� ����
					// -> sc.nextInt(); // �Է� ���ۿ��� ���� ���� ���� ������ ����.
					// -> �Է� ���ۿ� ++(����)�� ���� �����־ �ٽ� InputMisatchException �߻�
					// -> �� ������ ������ �ݺ���
				}
			}
			
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� �ʰ��� ���α׷� ����");
		}
		
		
	}
	
	
	public void example4() {
		// catch���� �ۼ��Ǵ� ���� Ŭ������ ��� ����
		// - catch���� ���� �� �ۼ��ϴ� ��� ��� ���踦 ����ؾ� �Ѵ�.
		// -> ��? �߻��ϴ� ���ܵ鵵 ���� Ŭ������ �̿��� ������ ���� ��ü���̴�.
		// -> catch(������������) ������ �������������� ������ ���� ��ü�� �����Ѵ�.
		// --> ���ܿ��� ��� ���谡 �ִ� == �θ�, �ڽ� ���谡 �ִ� == �������� ����ȴ�.
		// ---> catch ������ ���� ���������� 
		//		�θ� Ÿ�� ���� ���������� �ۼ��ϸ�   �ڽ� ���� ��ü�� ��� ������ �� �ִ�.
		
		String[] arr = new String[3];
		
		arr[0] = "���";
		arr[1] = "�ٳ���";
		
		try {	
			for(int i=0 ; i<arr.length ; i++) {
				// �迭 ��ҿ� ����� �� �� ���� �ձ��ڸ� ���
				System.out.println( arr[i].charAt(0)  );
				// java.lang.NullPorinterException �߻�
			}
			
		//} catch(NullPointerException e) {
			
			// Exception e�� ��� ���ܸ� ó���ϸ� �Ǵ� �� �ƴѰ�?
			// -> ���� ��Ȳ���� �ٸ� ó���� �� �� ���� ��.
			
		}catch(NullPointerException e) {
			// try���� ���� �߻� ��
			// catch���� �ۼ� ������� �߻��� ���ܰ� �湮��
			// -> ���ܸ� ��Ƽ� ó���� �� ������ ó���ǰ�, ������ ���� catch�� �Ѿ
			
			// ��, �տ� �ۼ��� catch���� �Ű������� �θ�Ÿ�� ���������̸�
			// �ڿ� �ۼ��Ǵ� catch���� �Ű������� �ڽ�Ÿ���� �ۼ��� �� ����.
			// -> ������(��ĳ����) ������
			System.out.println("null�� ������ �� ����.");
			
		} catch(Exception e) { // NullPointerException -> Exception ����
			
			// NullPointerException e
			// == NullPointerException ��ü�� ������ ���� ����
			
			// Exception e == Exception ��ü�� ������ ���� ����
			// == ��� ���ܸ� ������ �� �ִ� �θ� Ÿ�� ���� ���� (������)
			// java.lang.Exception : ��� ������ �ֻ��� �θ�
			
			System.out.println("���� �߻�");
		}
		
		// shift + f2 : api ���� �˻�
	}
	
	
	
	public void example5() {
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		do {
			try {
				System.out.println("[������ �޼ҵ� ���� (1,2)]");
				System.out.print("��ȣ �Է� : ");
				
				sel = sc.nextInt();
				
				switch(sel) {
				case 1 : methodA(); break;
				case 2 : methodB(); break; // methodB() ȣ�� == methodB ȣ���
				case 0 : System.out.println("���α׷� ����"); break;
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				// -> 1,2,0�� �ƴ� ��� ����
				}
			
			} catch (InputMismatchException e) {
				// -> ������ �ƴ� �Է�. ex) "+" "a" "abc" "Hello world"
				System.out.println("���� 1,2,0 �� �Է����ּ���.");
				sc.nextLine(); // �Է� ���ۿ� �����ִ� �߸� �Է��� ���ڿ� ����
				sel = -1; // ù �޴� ��� �� ������ �߻��� ��� 
						  // sel == 0�� ���� �̹Ƿ� �ٸ� ���� �����Ͽ� �ݺ����� ��� ������.
			
			} catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
		
			} catch(Exception e) { // ��� ���� ó�� ����
				System.out.println("���� �𸣰����� ����ó����");
				// -> ��� ���� ���ܰ� �߻��ߴ��� ��
				e.printStackTrace();
				// -> �߻��� ���ܰ� �����̰�, � �޼ҵ带 ���������� ȣ���ߴ��� ���
			}
			
		}while(sel != 0);
		
	}

	
	public void methodA() throws ArithmeticException{
		//  throws : ���� �޼ҵ忡�� �߻��� ���ܸ�  ȣ��η� ������.
		
		System.out.println( 2/0 );
		// -> ArithmeticException : / by zero
		
	}
	
	
	public void methodB() throws IOException{
		// IOException ���� �߻�
		throw new IOException();
		// throw : ���� ���� �߻� ����
		// throws : �޼ҵ忡�� �߻��� ���ܸ� ȣ��η� ����
	}
	
	
	
	public void example6() throws IOException{
		// CheckedException : �ݵ�� ����ó�� ������ �ۼ��ؾߵǴ� Exception
		// (���� �߻� -> ���� ó�� ��� ���)
		// -> �ҽ��ڵ� �Ǵ� if������ �ذ� �Ұ���
		//   -> ���� ó�� ������ ������ �ۼ��ؾ� ��.
		
		// throw new RuntimeException(); // == UnChekcedException
		// -> ���� ó�� ������ �������� �ʾƼ� �������� �ȳ�Ÿ��.
		
		// throw new IOException(); // == CheckedException
		// -> ������ �߻��� ���ɼ��� �ֱ� ������
		//    ���� ��Ȳ�� ���� ��ġ�� �ݵ�� �ۼ��ؾ� �Ѵ�.
		// == ���� ó���� ������. (������ ��)
		
		
		// UnCheckedException : ����ó�� ������ �ۼ����� �ʾƵ� �Ǵ� Exception
		// (�Ǽ�)
		// --> UnCheckedException�� ��� RunctimeException�� �ڽ��̴�!!!!!
		// --> �����ڰ� �ڵ� �ۼ��� �Ǵ� ����ڰ� ���α׷� �̿� �� �Ǽ��� ���� �߻��ϴ� ����
		//    --> �ҽ��ڵ� ���� �Ǵ� if������ �ذ� ����
		//        == ���� ���� ó�� ������ �������� ����.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� 1 : ");
		int num1 =  sc.nextInt();
		
		System.out.print("�Է� 2 : ");
		int num2 =  sc.nextInt();
		
		if(num2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}else {
			System.out.println( num1 / num2 );
		}
		
	}
	
	
	
	public void example7() {
		// ����� ���� ���� 
		// - Java���� �����ϴ� Exception Class������ ó���� �� ���� ���ܸ�
		//   ����ڰ� �ʿ信 ���ؼ� ����� Exception Class.
		
		double money = 1000000.0;
		
		int count = 0; // �϶� Ƚ�� ī��Ʈ
		
		try {
			for(int i=0 ; i<10 ;i++) {
				// 1 �Ǵ� 0
				int ran =  (int)Math.round( Math.random() );
				//System.out.println(ran);
				
				int sign = 0; 
				
				if(ran == 1) {
					sign = +1;
				}else {
					sign = -1;
				}
				
				// 1 ~ 20 ����
				int ran2 = (int)(Math.random() * 20 + 1);
				// 1% ~ 20% ���� �Ǵ� ����
				
				money = money + (money * ( sign* (ran2/100.0) )  );
				
				System.out.println(money);
				
				
				if(sign == -1) {
					count++;
					
					if(count == 3) { // 3ȸ �϶� ��
						
						throw new SonjeolException();
						// ���� ���� ���� �߻�
						
						// ���� ����� ���� ���ܸ� ����ߴ°�?
						// - ���ܴ� if���� ���ǹ����� �������� ���ϴ�
						// - ���� ó���� �̿��ϸ� Ư�� ����̳� �޼ҵ带 ���� ������ �� �ִ�.
					}
				}
				
				
			}
			
		}catch(SonjeolException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
