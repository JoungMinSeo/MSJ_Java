package edu.kh.eh.model.vo;

import java.io.IOException;

public class Parent {
	
	public void ex1() throws RuntimeException {
		// ex1() 메소드 내부에서 
		// RuntimeException 또는
		// RuntimeException 자식 예외가 발생하는 경우
		// 호출한 곳으로 예외를 던지는 처리를 해라
	}
	
	public void ex2() throws RuntimeException, IOException{
		// RuntimeException 또는 IOException 발생 시
		// 호출한 곳으로 예외를 던지는 처리를 함.
		
	}
	
	
	
	
	
	
}
