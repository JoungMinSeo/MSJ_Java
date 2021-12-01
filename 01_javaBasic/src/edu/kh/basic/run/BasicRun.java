package edu.kh.basic.run;

import edu.kh.basic.service.BasicService;

public class BasicRun {
	
	// 패키지 : 관련된 클래스를 모아두는 폴더
	// run 패키지 : 실행 관련된 클래스 모아두는 폴더
	// xxxRun 클래스 : 실행 관련 소스코드를 모아두는 파일
	// main 메소드 : 자바 프로그램을 실행하기 위한 메소드
	// 메소드(method) : 기능
	
	public static void main(String[] args) {
		
		//System.out.println("BasicRun 실행");
		// 실행 단축키 : ctrl + F11
		
		// 다른 클래스에 있는 메소드를 실행 하는 방법
		// 같은 말로 "메소드 호출" 이라고 함.
		// [호출할 메소드가 있는 클래스명] [별칭(변수명)] = new [호출할 메소드가 있는 클래스명]();
		BasicService service = new BasicService();
		service.printMessage();
		
		service.printAdd();
	}
}

/* 1. 이클립스의 Run 버튼을 눌러서 프로젝트를 실행
 * 2. BasicRun 클래스에 있는 main 메소드가 실행됨(Power On).
 * 3. main 메소드 내부에 작성된 BasicService의 
 * 	  pinrtMessage() 메소드를 호출함(전기를 넣어줌).
 * 	  (수행할 기능을 가진 BasicService를 수입해옴(import))
 * 
 * 4. 호출 되었을 때 수행할 기능을 담당할 클래스 BasicService클래스의
 *    메소드가 호출되면 해당 기능을 수행함.
 *    (BasicRun에서 BasicService의 메소드로 전기를 넣어주면
 *     전기를 받은 메소드가 담당하는 기능을 수행(제공)함)
 * 
 * */





