package edu.kh.th.ex.model.thread;

public class ThreadEx3 implements Runnable {
	// 우선 순위 방식의 스레드 스케쥴링

	
	@Override
	public void run() {
		
		// 의미 없는 2중 for문 
		// 왜 만들었는가? 처리 시간 지연 (우선 순위 확인을 위한 지연 효과)
		int sum = 0;
		for(int i=0 ; i<1000000000 ; i++) {
			sum += i;
			
			int sum2 = 0;
			for(int j=0 ; j<1000000000 ; j++) {
				sum2 +=j;
			}
		}
		
		// 스레드 이름 출력
		System.out.println( Thread.currentThread().getName() );
		
		// 우선 순위가 높다 == 일을 빨리 끝낼 수 있도록 할당되는 시간과 자원이 많다.
		// == 스레드의 일이 빨리 끝나서 스레드 이름이 빨리 출력된다.
		
	}
	
	
}
