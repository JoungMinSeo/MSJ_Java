package study;

class StopThread implements Runnable{
	
	private boolean stopped = false;
	public void run() {
		// stopped 플래그를 while문 조건으로 사용한다.
		
		while(!stopped) {
			System.out.println("Thread is alive ...");
			try {
				// sleep 메소드를 사용하는 이유는 Thread를 여유 없이
				// 수행하면 cpu에게 많은 부담을 주기 때문이다.
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread is dead..");
	}
	public void stop() {
		stopped = true;
	}
}

public class StopThreadTest {

	public static void main(String[] args) {
		System.out.println("# Start StopThreadTest.java");
		StopThreadTest stt = new StopThreadTest();
		stt.process();
		
		
	}

	private void process() {
		// StopThread 인스턴스를 생성한 후 이 인자를 파라미터로 받은
		// 스레드 인스턴스를 생성한 후에 출발시킨다.
		StopThread st = new StopThread();
		Thread thread = new Thread(st);
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// StopThread를 정지 시킨다.
		st.stop();
	}
	// 루프를 도는 시간이 너무 오래 걸리는 작업을 한다면 stop() 메소드로 스레드를 정지시켜도
	// 스레드가 정지되거나 한참 후에 정지되는 문제점이 발생한다.
	// 이 문제점을 해결하기 위해 interrupt()를 사용한다.
}
