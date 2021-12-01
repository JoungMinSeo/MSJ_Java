package edu.kh.poly.ex2.model.vo;

public interface Scanner extends ElectronicProduct, Sasung {
	// (부)인터페이스 2개 - (자)인터페이스 상속
	// -> 클래스의 다중 상속은 불가능하지만
	//    *** 인터페이스의 다중 상속은 가능하다.
	
	// Sasung 인터페이스를 상속 받음. -> 마커 인터페이스
	
	
	public abstract void scan(); // 스캔 기능
}
