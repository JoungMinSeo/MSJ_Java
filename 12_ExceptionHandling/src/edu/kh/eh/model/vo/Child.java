package edu.kh.eh.model.vo;

import java.io.IOException;

public class Child extends Parent{

	// 오버라이딩 성립 조건
	// - 접근 제한자는 같거나 더 넓은 범위
	// - 반환형, 메소드명, 매개변수는 모두 같아야 한다.
	// - 예외처리 구문(throws) 예외 개수 상관없이 처리 범위가 같거나 후손(좁아야)이어야 한다.
	@Override
	public void ex1() throws ArithmeticException {
		// ArithmeticException은 RuntimeException의 자식
	}
	
	
	@Override
	public void ex2() throws /*Exception*/ IOException{
								// -> 오버라이딩 시 부모타입으로 변경하면 
								//   오버라이딩 성립 조건을 만족 시키지 못해 에러발생.
		
		// 오버라이딩 시 throws에 작성된 예외를 
		// 개수를 적게 또는 작성하지 않을 수 있다.
		// -> 자식이 오버라이딩 하여 예외를 처리할 수 있거나(try-catch)
		//    또는 재정의한 코드가 예외를 발생시키지 않을 수 있다.
		
		try {
			
		}catch (RuntimeException e) {
			// TODO: handle exception
		}
	}
	
	
	
}
