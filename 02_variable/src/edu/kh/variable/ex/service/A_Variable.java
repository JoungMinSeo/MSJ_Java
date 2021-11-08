package edu.kh.variable.ex.service;

public class A_Variable {
	
	
	// 변수를 사용하지 않는 경우
	public void example1() {
		
		System.out.println("변수 사용 X");
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
		System.out.println(); // 줄바꿈(개행)
	}
	
	
	// 변수를 사용하는 경우
	public void example2() {
		
		double pi = 3.141592653589793; // 원주율
		int radius = 5; // 반지름
		int height = 20; // 높이
		
		System.out.println("\n변수 사용 O"); // \n : 개행문자
		System.out.println(2 * pi * radius); // 원의 둘레
		System.out.println(pi * radius * radius); // 원의 넓이
		System.out.println(pi * radius * radius * height); // 원기둥의 부피
		System.out.println("\n\n\n");
		
		System.out.println(4 * pi * radius * radius); // 구의 겉넓이
		
		// 가독성, 재사용성, 유지보수성
	}
	
	/* 변수의 장점
	 * 1. 값(data)에 의미를 부여함. + 가독성 증가
	 * 2. 변수에 한번 값을 저장하면 반복적으로 사용할 수 있다. -> 재사용성 증가
	 * 3. 변수에 저장된 값은 언제든지 수정 가능하다. -> 유지보수성 증가
	 * */
	
	
	
	// 변수 선언, 초기화 예제
	public void example3() {
		// 변수 선언 : 메모리(RAM) 공간에 데이터를 저장할 수 있는 공간을 할당(확보) 하는 것.
		// -> 선언된 변수의 종류에 따라 저장할 수 있는 데이터의 형태와 크기가 달라짐.
		
		// 직접 작성되거나, 변수에 대입되는 값 자체를 '리터럴' 이라고 함.
		// + 자료형마다 리터럴을 표시하는 방법('리터럴 표기법')이 다름.
		
		// 1. 논리형
		boolean isTrue; // 1byte
		isTrue = true; // boolean 자료형의 리터럴 표기법은 true/false
		
		
		// 2. 정수형
		byte byteNumber; // 1byte
		byteNumber = 1;
		// 대입 연산자( = ) : '=' 기호 기준으로 오른쪽에 있는 값을 
		//					왼쪽 변수에 저장(대입)하라는 연산자.
		
		short shortNumber; // 2byte
		shortNumber = 2;
		
		int intNumber; // 4byte + 정수 기본형
		intNumber = 4;
		
		long longNumber; // 8byte
		longNumber = 8L; // 8l(소문자L)도 가능 
		
		
		// 3. 실수형
		float floatNumber; // 4byte
		floatNumber = 1.23f; // 1.23F도 가능
		
		double doubleNumber; // 8byte -> 실수 기본형
		doubleNumber = 3.14;
		

		// 4. 문자형(문자 하나)
		char ch; // 2byte(자바)
		ch = 'A'; // '' 홀따옴표 기호가 char 자료형의 리터럴 표기법.
		
		
		// 5. 문자열(참조형) -> 기본자료형 X
		String str; // 4byte
		str = "문자열"; // "" 쌍따옴표 기호가 String 자료형의 리터럴 표기법.
		
		
		// 한 줄 복사 : ctrl + alt + 방향키 위 또는 아래
		System.out.println(isTrue);
		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(intNumber);
		System.out.println(longNumber);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println(ch);
		System.out.println(str);
		
		
		
		// 변수 명명 규칙
		// 1. 의미 있는 단어를 사용
		// 2. 변수명의 첫 글자는 무조건 영어 소문자
		//   + 여러 단어가 연결될 경우 연결되는 뒤쪽 단어의 첫 글자는 대문자.
		//     -> 카멜표기법
		// 3. 대소문자가 구분되며 길이 제한이 없다.
		// 4. 숫자로 시작되면 안된다.
		// 5. 특수문자는 '_', '$' 만 허용.
		// 6. 예약어(keyword)를 사용할 수 없다.
		// 7. 한글 변수명 가능.
	}
	
	
	// 상수 예제
	public void example4() {
		
		// 상수 : 값을 한 번만 저장할 수 있는 변수
		
		int age = 32; // 변수 선언과 동시에 초기화
		
		final int AGE = 32; // 상수 선언과 동시에 초기화
		// final 예약어 : 마지막이라는 의미를 가진 예약어
		// * 상수명은 모두 대문자로 작성 + 연결되는 단어는 '_'로 구분
		final int INT_NUMBER = 100;
		
		
		// 변수/상수에 다른 값을 대입
		age = 33;
		//AGE = 33; // 상수는 값 변경이 불가능하여 에러가 발생함.
		
		final double PI = 3.141592;
		
		
		//final int KOREA = 82;
		//final int LEFT = -20;
	}
	
	
	// 문자열 출력 예제
	public void example5() {
		String name = "백동현"; // String 변수 선언 및 초기화
		int age = 32;
		
		// 이름 : 백동현
		// 나이 : 32
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
		
		// name, age 변경
		name = "홍길동";
		age = 20;
		
		
		// 백동현님의 나이는 32세 입니다.
		System.out.println(name + "님의 나이는 " + age + "세 입니다.");

		// 문자열과 다른 자료형 사이에 '+' 기호는 이어쓰기를 의미한다.
		
		System.out.println(age + 10);
		System.out.println(age + "10");
		
		System.out.println(age + 10.1 + "123");
		System.out.println(age + "123" + 10);
		
		System.out.println("123" + age + 10);
		
		System.out.println("123" + (age + 10) );
		
		// 숫자(정수,실수)와 문자열이 혼합되어 있는 경우
		// 사칙연산 순서에 맞게 앞에서 부터 계산이 진행됨.
	}
	

}
