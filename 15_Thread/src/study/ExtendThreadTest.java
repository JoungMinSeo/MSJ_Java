package study;

// Thread 클래스 상속
class ExtendThread extends Thread {
	// run()을 오버라이딩하여 재정의한다.
	public void run() {
		System.out.println("Thread 클래스를 상속");
	}
	
}

public class ExtendThreadTest {

	public static void main(String[] args) {
		
		Thread t = new ExtendThread();
		// start()를 이용하여 스레드 시작
		// 이후 ExtendThread의 run()이 실행되고
		// run()이 종료되면 ExtendThread가 소멸된다
		t.start();
	}
		
	// Thread 클래스를 상속해서 구현 -> white-box reuse라고 한다.
	// private으로 선언되지 않은 모든 변수와 메소드, 생성자가 하위 클래스에 노출된다.
	// 장점 : 오버라이딩을 통해 수퍼클래스의 구현을 손쉽게 재정의 할 수 있음.
	// 단점 : 1. 수퍼 클래스가 하위 클래스에 불필요하게 많은 부분이 노출된다. -> 캡슐화 위배, 수퍼 클래스 구현이 변경되면 하위 클래스도 변경 되야함.
	
	//		 2. 컴파일 시점에서 객체의 형식이 이미 결정됨. -> "A 클래스가 B 클래스의 수퍼 클래스이다"라는 정보가 컴파일 시점에서 결정되기 때문에
	// 											-> 런타임 시점에서 상속받은 수퍼 클래스의 구현을 변경 할 수 없어 시스템의 유연성이 떨어짐.
	
	//		 3. 시스템이 발전할수록 상속관계가 복잡해져서 그 시스템의 상속 트리를 정확하게 이해하고 있지 않다면 시스템의 수정을 손 댈 수 없는 상황까지 벌어짐.
	
	
}
