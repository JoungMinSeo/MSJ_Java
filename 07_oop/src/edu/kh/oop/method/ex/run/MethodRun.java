package edu.kh.oop.method.ex.run;

import edu.kh.oop.method.ex.model.service.MethodService2;

public class MethodRun {
	public static void main(String[] args) {
		
		new MethodService2().start();
		
		// 생성된 MethodService2 객체의 
		// start() 메소드를 호출하는 1회성 구문
		// -> start() 호출 후 생성된 MethodService2객체는
		//    재사용이 불가능함.
		
		
	}
	
	
	
	
	
}
