package edu.kh.th.ex.model.thread;

public class ThreadEx2 implements Runnable {

	// ������ ���� ��� 2. Runnable �������̽� ���
	// -> �������̽� ��� -> �������̵��� ����ȭ
	// -> �������̽� ��� �� �ڵ� �ϰ��� ����
	
	
	@Override
	public void run() {
		// run() �޼ҵ� : �����尡 ���� �Ǽ� ������ �۾��ϰ��� �ϴ� �ڵ带 �ۼ��ϴ� �޼ҵ�
		
		for(int i=1 ; i<=200 ; i++) {
			System.out.print("X");
			
			// "X" ���ڰ� 20�� ��� �� �� ���� �ٹٲ�
			if(i % 20 == 0) {
				System.out.println();
			}
		}

		
		// Thread.currentThread() : ���� �������� �����带 ��ȯ 
		System.out.println(Thread.currentThread().getName() + " ��� �Ϸ�");		
		// ���� �������� �������� �̸��� ���� ���
		
	}
	
	
	
	
	
	
}
