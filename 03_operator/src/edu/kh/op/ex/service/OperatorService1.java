package edu.kh.op.ex.service;

public class OperatorService1 {

	// 논리 부정 연산자( ! )
	// 논리값(true / false)를 반대로 바꾸는 연산자
	public void example1() {
		System.out.println(true);
		System.out.println(!true);
		
		boolean isTrue = true;
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("!isTrue : " + !isTrue);
	}
	
	
	// 증감 연산자( ++ , -- )
	// 피연산자를 1 증가 또는 감소 시키는 연산자
	public void example2() {
		int num = 10;
		num++;
		System.out.println("num : " + num); // num : 11
		
		// 전위 연산 
		// 먼저 1을 증감시킨 후 다른 연산을 진행
		int a1 = 10;
		int b1 = ++a1;
		
		System.out.println( a1 + " / " + b1 );
						//  11		     11	
		
		// 후위 연산
		// 다른 연산 수행 후 1을 증감시킴
		int a2 = 10;
		int b2 = a2++;
		
		System.out.println( a2 + " / " + b2);
		//					11           10
		
		
		int a3 = 3;
		int b3 = 5;
		int c3 = a3++ + --b3;
		//  c3 = 3++ + --5;
		//  c3 = 3 + 4;      (a3++ 후위연산 해야됨...)
		//  c3 = 7
		
		// a3 = 4
		// b3 = 4
		// c3 = 7
		System.out.println(a3 + " / " + b3 + " / " + c3);
	}
	
	
	
	// 산술 연산자 ( + - * / % )
	public void example3() {
		int num1 = 5;
		int num2 = 2;
		
		System.out.println("몫 : " + (num1 / num2) );
		System.out.println("나머지 : " + (num1 % num2) );
		
		// 5 / 2 를 했을 때 2.5가 출력되게 하는 방법
		
		//  5.0  /  2.0  = 2.5
		// int / int = int 
		
		System.out.println(   (double)num1 / (double)num2   ); // 2.5 
		System.out.println(   (double)num1 / num2   ); // 2.5
		System.out.println(   num1 / (double)num2   ); // 2.5
		System.out.println(   (double)(num1 / num2)   ); // 2.0
		
		// 값의 범위가 큰 자료형과 연산 시 작은 자료형은 자동으로 큰 자료형으로 형변환이 된다.
		// * 정수 / 정수 연산의 결과를 실수 값으로 얻고자 할 때 
		// 큰 자료형으로의 강제 형변환이 많이 발생함.
	}
	
	
	// 비교 연산자
	public void example4() {
		/* a == b : a와 b는 같다
		 * a != b : a와 b는 같지 않다. (a와 b는 다르다)
		 * a > b  : a는 b보다 크다(초과). (b는 a보다 작다(미만)) 
		 * a < b  : a는 b보다 작다(미만). (b는 a보다 크다(초과))
		 * a >= b : a는 b보다 크거나 같다.(이상) (b는 a보다 작거나 같다(이하))
		 * a <= b : a는 b보다 작거나 같다.(이하) (b는 a보다 크거나 같다(이상))
		 * 
		 * *** 비교 연산자의 연산 결과는 무조건 true 또는 false 이다.
		 * boolean(논리형)							
		 * 
		 * */
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 == num2); // false
		System.out.println(num1 != num2); // true
		System.out.println( !(num1 == num2) ); // true
		System.out.println( (num1 == num2) == true ); // false
		
		System.out.println("\n--------------------------------\n");
		
		System.out.println(num1 > num2); // false
		System.out.println( num1 > (num2 - num1)  ); // false
		System.out.println( (num1 > num2) != (num2 >= num1)  ); // true
		
		System.out.println("\n--------------------------------\n");
		
		// %, == 또는 != 를 이용해서 짝수, 홀수, 배수 판별
		
		int a = 5;
		System.out.println("a는 짝수인가? " + ( a % 2 == 0 ));
		System.out.println("a는 짝수인가? " + ( a % 2 != 1 ));
		
		System.out.println("a는 홀수인가? : " + ( a % 2 == 1 ) );
		System.out.println("a는 홀수인가? : " + ( a % 2 != 0 ) );
		
		System.out.println("a는 5의 배수인가? : " + ( a % 5 == 0 ) );
		
	}
	
	
}
