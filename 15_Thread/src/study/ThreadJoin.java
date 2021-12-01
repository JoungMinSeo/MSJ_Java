package study;

// main 스레드가 생성해서 실행시킨 스레드가 종료될때까지
// main 스레드가 기다려야하는 상황일 경우 join() 메소드 사용
public class ThreadJoin {

	public static void main(String[] args) {
		// 스레드 생성
		Thread t = new Thread() {
			public void run() {
				try {
					Thread.sleep(2000);
					System.out.println("Thread 종료");
					Thread.sleep(3000);
				} catch (Exception e) {
				}
			}
		};
		t.start();
		try {
			// join() 메소드를 실행한다.
			// t 스레드가 종료될 때까지 main 메소드가 기다린다.
			t.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main() 종료");
	}

	// join() 메소드를 사용하면 A 스레드가 B 스레드를 시작시켰을 때
	// A 스레드는 B 스레드의 실행이 완전히 끝날때까지 기다린 후 나머지 작업을 실행한다.
	
}
