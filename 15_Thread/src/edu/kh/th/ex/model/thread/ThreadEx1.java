package edu.kh.th.ex.model.thread;

// ���� ������ ������ ���� Ŭ����
// ���� ������ ���� == �ٸ� ������� ���ÿ� �ڵ尡 ����ȴ�
public class ThreadEx1 extends Thread{

		
	// ������ ���� ��� 1. Thread Ŭ���� ���
	// *** Thread ��� �� ��� ���� �޼ҵ� �� run() �޼ҵ带 �������̵� �ؾ��Ѵ�.
	
	@Override
	public void run() {
		// run() �޼ҵ� : �����尡 ���� �Ǽ� ������ �۾��ϰ��� �ϴ� �ڵ带 �ۼ��ϴ� �޼ҵ�
		
		for(int i=1 ; i<=200 ; i++) {
			System.out.print("O");
			
			// "O" ���ڰ� 20�� ��� �� �� ���� �ٹٲ�
			if(i % 20 == 0) {
				System.out.println();
			}
		}

		// Thread.setName("�������") : ������ �̸� ����
		setName("������1��"); // ��� ���� ���̱� ������ �ٷ� ��� ����!
		
		// Thread.getName() : ������ �̸� ��ȯ
		System.out.println( getName() + " ��� �Ϸ�");
		
	}
	
	
	
	
	
	
}



