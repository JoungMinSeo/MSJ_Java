package edu.kh.th.ex.model.thread;

public class ThreadEx4 implements Runnable{

	// Thread.sleep(지연시간(ms)) : 지정된 시간동안 스레드를 일시 정지 시키는 메소드
	// - static으로 선언 되어 있어서 Thread.sleep(지연시간(ms)) 모양으로 호출
	// - sleep()은 인터럽트 동작(다른 행위를 무시하고 최우선 동작) 중 하나로
	//   InterruptedException을 발생할 가능성이 있다. -> 예외 처리 필요
	
	private int count; // 필드 선언
	 
	public ThreadEx4(int count) { // 매개변수 있는 생성자
		super();
		this.count = count;
	}


	@Override
	public void run() {
		// count에 지정되 수 만큼 for문 반복
		// 1회 반복당 1초 딜레이
		
		try {
			
			for(int i=1 ; i<=count ; i++) {
				Thread.sleep(1000); // 1000ms == 1초
				// sleep()으로 스레드가 일시 정지 되어있는 동안
				// interrupt() 메소드에 의해 정지하라는 기능이 동작하면
				// sleep() 이 InterruptedException을 발생시킴
				
				System.out.println( Thread.currentThread().getName()  + " : " + i + "초"   );                      
			}
			
			System.out.println(Thread.currentThread().getName() + " 스레드 종료" );
			
		}catch (InterruptedException e) {
			//e.printStackTrace();
			
			Thread.currentThread().interrupt();
			// interrupt()를 이용해 정상적으로 스레드를 멈춤.
			
			System.out.println("@@@ " + Thread.currentThread().isInterrupted()); // true
		}
		
		
		
	}
	
	
}
