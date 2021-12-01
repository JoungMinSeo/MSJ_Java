package edu.kh.poly.ex2.model.vo;

public interface Printer extends ElectronicProduct {
	// 인터페이스 - 인터페이스 상속 시 extends 사용
	

	public abstract /*final*/ void print(); // 출력 기능
	// 인터페이스의 모든 메소드는 묵시적으로 public abstract
	
	//* abstract와 final 키워드는 동시에 사용할 수 없다!!!!
	// -> 왜? 오버라이딩을 강제하는 abstract와 
	//        오버라이딩을 막는 final은 서로 상반되기 때문에 동시 사용 불가.
}
