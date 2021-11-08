package edu.kh.oop.cls.ex2;

import edu.kh.oop.cls.ex.ClassTest;
//import edu.kh.oop.cls.ex.ClassTest2;

public class Test2 {
	public void ex2() {
		// ClassTest / ClassTest2 객체 생성
		ClassTest test = new ClassTest();
		// ClassTest가 객체 생성이 가능했던 이유
		// --> class 선언부 접근 제한자가 public 이기 때문에
		//     어떤 패키지든지 import가 가능함. --> 어떤 패키지든지 접근 가능
		
		
		//ClassTest2 test2 = new ClassTest2();
		// ClassTest2가 객체 생성이 불가능 했던 이유
		// --> class 선언부 접근 제한자가 아무것도 작성되지 않았기 때문에
		//     == (default) 접근 제한자, () == 생략
		//  (default) 접근 제한자는 같은 패키지 내에서만 접근 가능.
		
		
		// (default) 접근 제한자가 적용된 클래스가 사용되지 않는건 아니지만
		// 극히 드문 상황에서만 사용하므로
		// 일반적으로 모든 클래스는 public 접근 제한자를 사용하는 것이 관례이다.
	}
	
	
	
}
