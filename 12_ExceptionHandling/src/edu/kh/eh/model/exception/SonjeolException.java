package edu.kh.eh.model.exception;

public class SonjeolException extends Exception{
	// 사용자 정의 예외를 만드는 방법!
	// - 아무 Exception 클래스 중 하나를 상속받으면 된다!
	// - 생성자 작성
	
	public SonjeolException() {
		super("감소가 3번되서 손절예외 발생");
		// 자식 객체 생성 시 부모 객체 부분도 만들어 져야 하는데
		// 이 때 부모 부분을 매개변수 있는 생성자로 생성함.
		// -> 부모 부분 필드에 "감소가 3번되서 손절예외 발생" 문자열이 초기화됨.
	}
	
	public SonjeolException(String msg) {
		super(msg);
	}
	
}
