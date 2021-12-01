package edu.kh.poly.ex2.model.vo;

public interface ElectronicProduct {
	
	/* 인터페이스
	 * - 상수형 필드와 추상 메소드만을 작성할 수 있는 추상 클래스의 변형체
	 * 
	 * 인터페이스 사용 목적
	 * 1. 일관된 인터페이스를 제공
	 *   == 상속 받은 자식에게 메소드의 통일성을 제공
	 *     -> 메소드 이름은 같은데 각자 오버라이딩해서 다른 기능을 수행함.
	 * 
	 * 2. 클래스간의 관계 형성
	 *   -> 인터페이스가 상위 타입 역할을 하여 상속 받은 자식을 참조함.
	 *      -> 다형성(업캐스팅) 특징 활용
	 * */
	
	
	// 필드
	// -> 인터페이스에서 필드는 묵시적으로 public static final이다.
	public static final int KOREA_VOLT = 220;
	/*public*/ static final int JAPAN_VOLT = 110;
	// -> public을 쓰지 않아도 public으로 인식됨.
	
	int USA_VOLT1 = 115;
	static int USA_VOLT2 = 230;
	
	
	
	// 메소드
	// -> 인터페이스에서 모든 메소드는 묵시적으로 public abstract 이다.
	public abstract void powerOn();
	
	void powerOff();


	//   부모               자식
	// 인터페이스 - 인터페이스 상속
	// 인터페이스, 인터페이스 - 인터페이스 상속
	// 추상 클래스 - 추상 클래스 상속
	// 인터 페이스 - 추상 클래스 상속
	// 추상 클래스 - 클래스 상속
	// 인터페이스  - 클래스 상속
	// 인터페이스 ,인터페이스 - 클래스 상속
	// 추상클래스,인터페이스 - 클래스 상속
	
	
	
	
	
	

	
	
	
	
}
