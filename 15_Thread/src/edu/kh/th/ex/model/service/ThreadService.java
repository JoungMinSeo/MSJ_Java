package edu.kh.th.ex.model.service;

import java.util.Scanner;

import edu.kh.th.ex.model.thread.ThreadEx1;
import edu.kh.th.ex.model.thread.ThreadEx2;
import edu.kh.th.ex.model.thread.ThreadEx3;
import edu.kh.th.ex.model.thread.ThreadEx4;

public class ThreadService {

	public void example1() {
		
		// Thread Ŭ������ ��� ���� ��ü�� ����
		ThreadEx1 th1 = new ThreadEx1();
		//th1.run(); 
		// Thread�� ��� ���� ��ü�� ������ �����忡�� �����ϱ� ���ؼ���
		// ������.start(); �޼ҵ带 ȣ���ؾ� �Ѵ�.
		// -> start() ȣ�� �� ���� �����尡 �����Ǹ� run()�� �ۼ��� ������ ����ȴ�.
		th1.start();
		
		
		// Runnable �������̽��� ��� ���� ��ü ����
		ThreadEx2 th2 = new ThreadEx2();
		//th2.run();
		// Runnable �������̽��� ������ ��ü�� start() �޼ҵ尡 �������� ����.
		// ��? start()�� Thread Ŭ������ �޼ҵ�
		// -> Thread Ŭ���� ��ü�� ������ �� ������ �Ű�������
		//    Runnable �������̽��� ������ ��ü�� �߰��Ͽ� �����ϸ� start() ����
		
		Thread thread = new Thread(th2, "������2");
										// -> ������ �̸� ����
		thread.start();
	}
	
	
	public void example2() {
		// ������ �켱 ���� Ȯ��
		
		// for���� 20�� �ݺ��ؼ� ThreadEx3�� �̿��� ���� Thread ��ü 20�� ����
		// --> main ������ 1�� + ������ ������ 20 == �� 21�� ������
		
		for(int i=1 ; i<= 20; i++) {
			ThreadEx3 th3 = new ThreadEx3(); // �̻��·δ� start() �Ұ���
			Thread thread = new Thread(th3 , "������" + i );
			
			if(i == 10) { // 10��°�� ������� �����尡 �ֿ켱 ������ ���� �� �ֵ��� ����
				thread.setPriority(Thread.MAX_PRIORITY); // == 10
			
			}else {
				thread.setPriority(Thread.MIN_PRIORITY); // == 1
			}
			
			thread.start();
		}
	}
	
	
	public void example3() {
		// ������ ��Ʈ��(sleep() , interrupt() )
		
		Thread t1 = new Thread(new ThreadEx4(3), "1��");
		Thread t2 = new Thread(new ThreadEx4(7), "2��");
		Thread t3 = new Thread(new ThreadEx4(20), "3��");
		
		System.out.println("����");
		//t1.start();
		//t2.start();
		t3.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ƹ� ���̳� �Է��ϼ��� : ");
		String input = sc.next();
		// Ű���� �Է��� �� �� ���� main������� ���� ��� ����
		// -> �� �Է� �� �Ʒ� �ڵ尡 ����Ǳ� ����
		
		t3.interrupt(); // �ƹ� ���̳� �Է� ������ t3 ������ ������ ����
		
		// boolean isInterrupted() : 
		// ���� �����尡 interrupt() �޼ҵ忡 ���ؼ� ������� Ȯ��
		// �������� true / �ƴϸ� false
		System.out.println(t1.isInterrupted() ); // false
		System.out.println(t2.isInterrupted() ); // false
		System.out.println(t3.isInterrupted() ); // true
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
