package edu.kh.th.ex.model.thread;

public class ThreadEx3 implements Runnable {
	// �켱 ���� ����� ������ �����층

	
	@Override
	public void run() {
		
		// �ǹ� ���� 2�� for�� 
		// �� ������°�? ó�� �ð� ���� (�켱 ���� Ȯ���� ���� ���� ȿ��)
		int sum = 0;
		for(int i=0 ; i<1000000000 ; i++) {
			sum += i;
			
			int sum2 = 0;
			for(int j=0 ; j<1000000000 ; j++) {
				sum2 +=j;
			}
		}
		
		// ������ �̸� ���
		System.out.println( Thread.currentThread().getName() );
		
		// �켱 ������ ���� == ���� ���� ���� �� �ֵ��� �Ҵ�Ǵ� �ð��� �ڿ��� ����.
		// == �������� ���� ���� ������ ������ �̸��� ���� ��µȴ�.
		
	}
	
	
}
