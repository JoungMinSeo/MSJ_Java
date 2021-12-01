package edu.kh.poly.ex2.model.vo;

// 사성, 레이저 프린터 + 스캐너 + 팩스 되는 전가제품 SuperAllinonePrinter
public class SuperAllinonePrinter extends AllinoneLaserPrint implements Fax{
	// (부)추상클래스 또는 인터페이스 - 클래스(자)
	// 부모가 상속을 받았으나 미구현(오버라이딩 안한) 메소드를
	// 자식 클래스가 모두 오버라이딩 해야함.

	// (부)추상 클래스 또는 클래스 + 인터페이스   -  추상 클래스 또는 클래스(자) 
	// -> 클래스 상속은 extends , 인터페이스 상속은 implements
	
	
	@Override
	public void print() {
		
	}

	@Override
	public void powerOn() {
		
	}

	@Override
	public void powerOff() {
		
	}

	@Override
	public void scan() {
		
	}

	@Override
	public void laserPrint() {
		
	}

	@Override
	public void test() {
		
	}

	@Override
	public void sendFax() {
		
	}

	@Override
	public void receiveFax() {
		
	}

}
