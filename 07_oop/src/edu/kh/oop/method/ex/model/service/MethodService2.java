package edu.kh.oop.method.ex.model.service;

import edu.kh.oop.method.ex.model.vo.Product;

public class MethodService2 {

	public void start() {
		// MehotdService1에 있는 기능(메소드)을 호출하는 메소드
		
		MethodService1 service = new MethodService1();
		service.example1();
		service.sum(45678, 12345, 11111);
		service.doublePlusMinus(3.14, 1.23, 2.34);
		
		
		int[] numbers = {1,2,3,4,5};
		// numbers에는 int[]을 참조할 수 있는 주소가 저장되어 있다.
		
		service.arrSum(numbers);
		// 매개변수로 참조 자료형이 전달되는 경우
		// 주소만 복사되서 전달된다 == 얕은 복사
	
	
		// Product 객체 생성
		Product prd1 = new Product("삼성모니터", 100000, "123-12-123");
		// MethodService2 객체의 start() 메소드 호출 시
		// VO 용도로 작성된 Product 클래스의 매개변수 있는 생성자를 이용하여
		// 필드값이 초기화 된 객체(인스턴스)를 생성하고
		// 생성된 객체의 주소를 참조변수 prd1에 저장한다.
		
		
		Product prd2 = new Product("LG모니터", 200000, "999-2-1234-789");
		Product prd3 = new Product("벤큐모니터", 300000, "777-888-666");
		
		// 반환된 String 바로 출력
		System.out.println( service.productString(prd1) );
		System.out.println( service.productString(prd2) );
		System.out.println( service.productString(prd3) );
		
		
		
		// 반환된 String을 String 변수에 저장
		String result2 = service.productString(prd2);
		System.out.println(result2);
		
		// 반환된 String 바로 출력
		System.out.println( service.productString(prd3) );
		
	}
	
	
	
	
}
