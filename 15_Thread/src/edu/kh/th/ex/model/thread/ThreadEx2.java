package edu.kh.th.ex.model.thread;

public class ThreadEx2 implements Runnable {

	// 스레드 생성 방법 2. Runnable 인터페이스 상속
	// -> 인터페이스 상속 -> 오버라이딩을 강제화
	// -> 인터페이스 사용 시 코드 일관성 증가
	
	
	@Override
	public void run() {
		// run() 메소드 : 스레드가 생성 되서 별도로 작업하고자 하는 코드를 작성하는 메소드
		
		for(int i=1 ; i<=200 ; i++) {
			System.out.print("X");
			
			// "X" 문자가 20번 출력 될 때 마다 줄바꿈
			if(i % 20 == 0) {
				System.out.println();
			}
		}

		
		// Thread.currentThread() : 현재 실행중인 스레드를 반환 
		System.out.println(Thread.currentThread().getName() + " 출력 완료");		
		// 현재 실행중인 스레드의 이름을 얻어와 출력
		
	}
	
	
	
	
	
	
}
