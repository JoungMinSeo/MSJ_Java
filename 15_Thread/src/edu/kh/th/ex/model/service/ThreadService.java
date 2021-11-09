package edu.kh.th.ex.model.service;

import java.util.Scanner;

import edu.kh.th.ex.model.thread.ThreadEx1;
import edu.kh.th.ex.model.thread.ThreadEx2;
import edu.kh.th.ex.model.thread.ThreadEx3;
import edu.kh.th.ex.model.thread.ThreadEx4;

public class ThreadService {

	public void example1() {
		
		// Thread 클래스를 상속 받은 객체를 생성
		ThreadEx1 th1 = new ThreadEx1();
		//th1.run(); 
		// Thread를 상속 받은 객체를 별도의 스레드에서 실행하기 위해서는
		// 변수명.start(); 메소드를 호출해야 한다.
		// -> start() 호출 시 별도 스레드가 생성되며 run()에 작성된 내용이 실행된다.
		th1.start();
		
		
		// Runnable 인터페이스를 상속 받은 객체 생성
		ThreadEx2 th2 = new ThreadEx2();
		//th2.run();
		// Runnable 인터페이스를 구현한 객체는 start() 메소드가 존재하지 않음.
		// 왜? start()는 Thread 클래스의 메소드
		// -> Thread 클래스 객체를 생성할 때 생성자 매개변수로
		//    Runnable 인터페이스를 구현한 객체를 추가하여 생성하면 start() 가능
		
		Thread thread = new Thread(th2, "스레드2");
										// -> 스레드 이름 지정
		thread.start();
	}
	
	
	public void example2() {
		// 스레드 우선 순위 확인
		
		// for문을 20번 반복해서 ThreadEx3를 이용해 만든 Thread 객체 20개 생성
		// --> main 스레드 1개 + 생성된 스레드 20 == 총 21개 스레드
		
		for(int i=1 ; i<= 20; i++) {
			ThreadEx3 th3 = new ThreadEx3(); // 이상태로는 start() 불가능
			Thread thread = new Thread(th3 , "스레드" + i );
			
			if(i == 10) { // 10번째로 만들어진 스레드가 최우선 순위를 가질 수 있도록 설정
				thread.setPriority(Thread.MAX_PRIORITY); // == 10
			
			}else {
				thread.setPriority(Thread.MIN_PRIORITY); // == 1
			}
			
			thread.start();
		}
	}
	
	
	public void example3() {
		// 스레드 컨트롤(sleep() , interrupt() )
		
		Thread t1 = new Thread(new ThreadEx4(3), "1번");
		Thread t2 = new Thread(new ThreadEx4(7), "2번");
		Thread t3 = new Thread(new ThreadEx4(20), "3번");
		
		System.out.println("시작");
		//t1.start();
		//t2.start();
		t3.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 값이나 입력하세요 : ");
		String input = sc.next();
		// 키보드 입력이 될 때 까지 main스레드는 무한 대기 상태
		// -> 값 입력 시 아래 코드가 수행되기 시작
		
		t3.interrupt(); // 아무 값이나 입력 받으면 t3 스레드 동작을 멈춤
		
		// boolean isInterrupted() : 
		// 현재 스레드가 interrupt() 메소드에 의해서 멈췄는지 확인
		// 멈췄으면 true / 아니면 false
		System.out.println(t1.isInterrupted() ); // false
		System.out.println(t2.isInterrupted() ); // false
		System.out.println(t3.isInterrupted() ); // true
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}