package edu.kh.poly.ex2.model.vo;

public abstract class AllinoneLaserPrint extends AllinonePrinter {
	// (부)추상 클래스 - 추상 클래스(자) 상속 시 extends 사용
	
	// (부)추상 클래스 - 클래스(자) 상속 시
	// 부모의 추상 메소드를 자식이 강제적으로 오버라이딩 하지만,
	
	// (부)추상 클래스 - 추상 클래스(자) 상속 시 
	// 자식이 부모의 추상 메소드를 물려 받지만,
	// 자식도 추상 클래스이기 때문에 추상 메소드를 보유할 수 있다. -> 오버라이딩 강제 X
	
	
	
	// 추상 클래스에서는 추상 메소드를 명시적으로 나타내 주어야 함.
	
	public abstract void laserPrint(); // 레이저 출력
}
