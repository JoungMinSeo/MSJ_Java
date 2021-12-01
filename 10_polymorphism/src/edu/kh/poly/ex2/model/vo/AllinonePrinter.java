package edu.kh.poly.ex2.model.vo;

public abstract class AllinonePrinter implements Printer, Scanner{ // 복합기
	
	// (부)인터페이스 - 추상클래스 또는 클래스(자) 상속 시 extends (X)
	// implements(구현) 키워드를 사용
	// -> "부모의 미완성 메소드를 구현해라" 라고 해석
	
	// (부)인터페이스 여러개 - 추상 클래스 또는 클래스(자) 다중 상속 가능
	

	public abstract void test(); 
	
}
