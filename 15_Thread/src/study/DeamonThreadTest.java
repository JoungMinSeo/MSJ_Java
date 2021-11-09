package study;

//데몬스레드는 "어플리케이션 내부의 모든 스레드가 종료되지 않으면 JVM이 종료되지 않는다"
// 라는 조건에서 예외처리를 해주기 위함이다.

public class DeamonThreadTest {

	
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println("Thread 종료");
				} catch (Exception e) {
				}
			}
			
		};
		// 데몬스레드로 설정한다.
		t.setDaemon(true);
		t.start();
		
		System.out.println("main() 종료");
	}
	// 스레드를 데몬스레드로 설정했기 때문에 main() 메소드를 전부 수행하면서 어플리케이션이 종료됨.
	
	
}
