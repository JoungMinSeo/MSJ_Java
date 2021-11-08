package edu.kh.oop.method.ex.model.service;

import edu.kh.oop.method.ex.model.vo.Product;

public class MethodService1 {
	
	// 1. 매개변수 x, 반환형 X 메소드
	public void example1() {
		// void : 반환 값이 없음.
		System.out.println("매개변수, 반환형 모두 없는 메소드");
	}
	
	// 2. 매개변수 O, 반환형 X 메소드
	public void sum(int num1, int num2, int num3) {
		System.out.printf("%d + %d + %d = %d\n", 
						num1, num2, num3, num1+num2+num3); 
	}
	
	// 2-2. 실수 3개를 전달 받아 
	// 첫 번째 + 두 번째 - 세 번째 실수 결과를 출력하시오.
	// 메소드명 doublePlusMinus
	public void doublePlusMinus(double num1, double num2, double num3) {
		
		System.out.printf("%f + %f - %f = %f\n",
						num1 , num2, num3 ,num1+num2-num3);
	}
	
	
	// 3. 매개변수 O (배열), 반환형 X 메소드
	public void arrSum(int[] arr) {
		// 전달 받은 int 배열 요소의 전체 합을 출력
		
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			
			sum += arr[i];
		}
		
		System.out.println("합계 : " + sum);
	}
	
	
	// 4. 매개변수 O (클래스) , 반환형 O (String)
	public String productString(Product prd ) {
		// 전달 받은 Product 객체 참조 주소를 이용해
		// Product 객체가 가지고 있는 모든 필드 값을 하나의 문자열로 반환
		
		String result 
			= prd.getpName() + " / " + prd.getPrice() + " / " +
			  prd.getSerialNumber();
		
		return result;
		// return : 현재 메소드를 종료하고 호출한 메소드로 
		//          오른쪽에 작성된 값을 가지고 돌아감.
	}
	
	
	
	
	
	
	
	
}
