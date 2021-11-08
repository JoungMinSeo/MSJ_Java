package edu.kh.oop.field.ex.model.service;

import edu.kh.oop.field.ex.model.vo.Korean;

public class FieldService {

	/* static (정적인, 고정인)
	 * 
	 * JVM static 메모리 영역
	 * (== static 영역, 정적 메모리 영역, 공유 영역, method area, class area)
	 * 
	 * 
	 * * 필드 세분화
	 * 1) 멤버 변수(== 인스턴스 변수)
	 *  private int age;
	 *  
	 *  생성 : new 연산자를 통해 Heap 영역에 객체(인스턴스)가 생성 될 때
	 *  
	 *  소멸 : 객체가 소멸될 때 같이 소멸
	 *  		--> 객체 소멸은 어떠한 참조 변수에도 참조되지 않을 때
	 *  			일정 시간 후 GC에 의해서 소멸됨.
	 * 
	 * 2) 클래스 변수(== static 변수)
	 * - static 예약어가 붙은 변수
	 * public static int num;
	 * 
	 * 생성 : 프로그램 실행 시 static 영역에 생성됨.
	 * 
	 * 소멸 : 프로그램 종료 시 소멸.
	 */
	
	public void example1() {
		// 한국인 객체 3개 생성
		Korean k1 = new Korean();
		Korean k2 = new Korean();
		Korean k3 = new Korean();
		
		// k1, k2, k3에 이름, 주민번호 세팅
		k1.setName("홍길동");
		k1.setId("123456-1234567");
		
		k2.setName("이순신");
		k2.setId("991212-1231234");
		
		k3.setName("신사임당");
		k3.setId("010101-4123456");
		
		
		// 국가코드를 1로 변경
		//k1.setNationalCode(1);
		//k2.setNationalCode(1);
		//k3.setNationalCode(1);
		
		//Korean.nationalCode = 1; // 클래스변수(== static변수)
		
		
		
		// k1, k2, k3가 가지고 있는 필드 값을 모두 출력
		System.out.println(k1.toString());
		System.out.println(k2.toString());
		System.out.println(k3.toString());
		
		
		System.out.println(Math.PI);
		System.out.println(Korean.language);
		
		
	}
	
	
	
	
}
