package study;

class AdvancedStopThread implements Runnable{

	public void run() {
		try {
			
			// isInterrupted() 메소드를 while문 조건으로 사용한다.
			// 만약, 이 스레드에서 interrupt() 메소드를 호출하면
			// isInterrupted() 메소드는 true를 리턴해서 while문을 빠져나가게 된다.
			
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("Thread is alive ...");
				Thread.sleep(500);
			}
			
		} catch (Exception e) {
		}finally {
			System.out.println("Thread is dead ...");
		}
	}
}

public class AdvancedStopThreadTest {
	
	public static void main(String[] args) {
		System.out.println("# Start AdvancedStopThreadTest.java");
		AdvancedStopThreadTest astt = new AdvancedStopThreadTest();
		astt.process();
	}
	
	public void process() {
		// AdvancedStopThread 인스턴스를 생성한 후 인자를 파라미터로 받는
		// 스레드 인스턴스를 생성한 후에 실행
		
		
		AdvancedStopThread ast = new AdvancedStopThread();
		Thread thread = new Thread(ast);
		thread.start();
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// AdvancedThread를 정지시킨다.
		thread.interrupt();
		
		// 이전과는 다르게 플래그 대신 isInterrupted() 메소드로 스레드가 일시 정지 되었다.
		// isInterrupt() 메소드를 호출한 즉시 스레드를 중지 시키고 finally문에서 안정되게 작업을 마무리할 수 있다.
		
	}
	
}
