package edu.kh.th.ex.model.thread;

// 별도 스레드 생성을 위한 클래스
// 별도 스레드 생성 == 다른 스레드와 동시에 코드가 수행된다
public class ThreadEx1 extends Thread{

		
	// 스레드 생성 방법 1. Thread 클래스 상속
	// *** Thread 상속 시 상속 받은 메소드 중 run() 메소드를 오버라이딩 해야한다.
	
	@Override
	public void run() {
		// run() 메소드 : 스레드가 생성 되서 별도로 작업하고자 하는 코드를 작성하는 메소드
		
		for(int i=1 ; i<=200 ; i++) {
			System.out.print("O");
			
			// "O" 문자가 20번 출력 될 때 마다 줄바꿈
			if(i % 20 == 0) {
				System.out.println();
			}
		}

		// Thread.setName("스레드명") : 스레드 이름 지정
		setName("스레드1번"); // 상속 받은 것이기 때문에 바로 사용 가능!
		
		// Thread.getName() : 스레드 이름 반환
		System.out.println( getName() + " 출력 완료");
		
	}
	
	
}