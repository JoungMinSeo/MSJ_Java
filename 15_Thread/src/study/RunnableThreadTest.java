package study;

// Runnable �������̽��� �����Ѵ�.
class RunnableThread implements Runnable{
	// run()�� �������̵��ؼ� �������Ѵ�.
	public void run() {
		System.out.println("Runnable �������̽��� ����");
	}
	
}
public class RunnableThreadTest {

	public static void main(String[] args) {
		// Thread �����ڿ� RunnableThread �ν��Ͻ��� �Ķ���ͷ� �����Ѵ�.
		Thread t = new Thread(new RunnableThread());
		t.start();
	}
	
		// Runnable �������̽��� �����ϴ� Ŭ������ ����, �ռ� ������ Ŭ������ �Ķ���ͷ� �ѱ� -> black-box reuse��� �Ѵ�.
		// ���� : 1. ��ü�� �ٸ� ��ü�� �����ڸ� ��� ������� ��Ÿ�� �ÿ� �������� �̷������.
		//		 2. ��ü�� �������̽��� �ٶ󺸱� ������ ĸ��ȭ�� �� �̷���� �� ����.
		// ���� : 1. ��ü ���� ���谡 ���� ���谡 �ƴ� ���� ���谡 �ȴ�.
		// 		 2. Ŭ�������� ��Ű���� �����ϰ� �и��ؾ��ϰ� ���� ��� �뵵�� ��Ȯ�ϰ� �巯������ �������̽��� �� �����ؾ���.
	
	
	
}
