package study;

public class NomalThreadTest {

	public static void main(String[] args) {
		// 스레드를 생성한다.
		Thread t = new Thread() {
			public void run() {
				try {
					Thread.sleep(500);
					System.out.println("Thread 종료");
				} catch (Exception e) {
				}
			}
		};
		t.start();
		
		System.out.println("main() 종료");
	}
	// 자바에서는 모든 스레드가 종료되어야 JVM이 종료된다.
	// 상황에 따라 분리된 스레드로 백그라운드 작업을 해야하는 경우도 있다. ex) 가바지 컬렉션
	// 이런 백그라운드 작업이 일반 스레드라면 강제 종료 하지않는 이상 영원히 정지하지 않을것이다.
	// 그렇기 때문에 데몬스레드라는 개념이 도입되었다.
	
	
}
