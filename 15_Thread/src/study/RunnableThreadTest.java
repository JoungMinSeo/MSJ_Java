package study;

// Runnable 인터페이스를 구현한다.
class RunnableThread implements Runnable{
	// run()을 오버라이딩해서 재정의한다.
	public void run() {
		System.out.println("Runnable 인터페이스를 구현");
	}
	
}
public class RunnableThreadTest {

	public static void main(String[] args) {
		// Thread 생성자에 RunnableThread 인스턴스를 파라미터로 전달한다.
		Thread t = new Thread(new RunnableThread());
		t.start();
	}
	
		// Runnable 인터페이스를 구현하는 클래스를 생성, 앞서 구현한 클래스를 파라미터로 넘김 -> black-box reuse라고 한다.
		// 장점 : 1. 객체가 다른 객체의 참조자를 얻는 방식으로 런타임 시에 동적으로 이루어진다.
		//		 2. 객체의 인터페이스를 바라보기 때문에 캡슐화가 잘 이루어질 수 있음.
		// 단점 : 1. 객체 간의 관계가 수직 관계가 아닌 수평 관계가 된다.
		// 		 2. 클래스들을 패키지로 적절하게 분리해야하고 각각 사용 용도가 명확하게 드러나도록 인터페이스를 잘 설계해야함.
	
	
	
}
