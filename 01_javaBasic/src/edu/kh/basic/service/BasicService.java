package edu.kh.basic.service;

public class BasicService {
	
	// service 패키지 : 기능을 제공하는 클래스를 모아둔 폴더
	// xxxService 클래스 : 실제 기능을 제공하는 코드를 모아둔 파일
	// 메소드(method): 기능
	
	// 메세지를 출력하는 기능
	public void printMessage() {
		System.out.println("BasicRun 실행");
	}
	
	
	// 두 수를 더한 값을 출력하는 기능
	public void printAdd() {
		System.out.println( 111 + 111 );
		// System : 입력, 출력 관련 기본 내용이 작성된 클래스
		// out : 출력 부분
		// print() : 괄호 안에 있는 문자열을 콘솔창에 출력하는 기능
		// println() : 괄호 안에 있는 문자열을 콘솔창에 출력하고 나서 줄바꿈하는 기능
		// ln == line
		
		// 컴파일러 : 사람이 볼수 있는 코드를 컴퓨터가 인지할 수 있도록
		//         이진코드(byte code, binary code)로 변환하는 장치(프로그램)
		// + 자바 컴파일러는 java.lang이 import 안되어 있으면 자동으로 추가해줌.
	}
	
	
	
	
}
