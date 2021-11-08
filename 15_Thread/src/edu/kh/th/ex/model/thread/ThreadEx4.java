package edu.kh.th.ex.model.thread;

public class ThreadEx4 implements Runnable{

	// Thread.sleep(�����ð�(ms)) : ������ �ð����� �����带 �Ͻ� ���� ��Ű�� �޼ҵ�
	// - static���� ���� �Ǿ� �־ Thread.sleep(�����ð�(ms)) ������� ȣ��
	// - sleep()�� ���ͷ�Ʈ ����(�ٸ� ������ �����ϰ� �ֿ켱 ����) �� �ϳ���
	//   InterruptedException�� �߻��� ���ɼ��� �ִ�. -> ���� ó�� �ʿ�
	
	private int count; // �ʵ� ����
	 
	public ThreadEx4(int count) { // �Ű����� �ִ� ������
		super();
		this.count = count;
	}


	@Override
	public void run() {
		// count�� ������ �� ��ŭ for�� �ݺ�
		// 1ȸ �ݺ��� 1�� ������
		
		try {
			
			for(int i=1 ; i<=count ; i++) {
				Thread.sleep(1000); // 1000ms == 1��
				// sleep()���� �����尡 �Ͻ� ���� �Ǿ��ִ� ����
				// interrupt() �޼ҵ忡 ���� �����϶�� ����� �����ϸ�
				// sleep() �� InterruptedException�� �߻���Ŵ
				
				System.out.println( Thread.currentThread().getName()  + " : " + i + "��"   );                      
			}
			
			System.out.println(Thread.currentThread().getName() + " ������ ����" );
			
		}catch (InterruptedException e) {
			//e.printStackTrace();
			
			Thread.currentThread().interrupt();
			// interrupt()�� �̿��� ���������� �����带 ����.
			
			System.out.println("@@@ " + Thread.currentThread().isInterrupted()); // true
		}
		
		
		
	}
	
	
}
