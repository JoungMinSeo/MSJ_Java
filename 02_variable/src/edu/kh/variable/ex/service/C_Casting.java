package edu.kh.variable.ex.service;

public class C_Casting {
	/* 형변환
	 * 
	 * 컴퓨터에서의 값 처리 원칙
	 * 1. 같은 종류의 자료형만 대입 가능
	 * 2. 같은 종류 자료형만 계산 가능
	 * 3. 계산의 결과도 같은 종류의 자료형이 나와야 함
	 * 
	 * -> 이 원칙이 지켜지지 않을 때 형변환이 필요하다.
	 * (자동 형변환, 강제 형변환)
	 * */
	
	// 자동 형변환 예시
	public void example1() {
		// 자동 형변환이란?
		// 값의 범위가 작은 자료형과 큰 자료형 간의 연산 시
		// 컴파일러가 자동으로 범위가 작은 자료형을 
		// 큰 자료형과 같은 형태로 변환시키는 것.
		
		// int(4byte) -> double(8byte)
		int iNum = 12;
		
		double dNum = 3.3;
		
		System.out.println(iNum + dNum); // 15.3
					// (int)iNum -> (double)iNum 자동 형변환
		
		double result = iNum + dNum;
		System.out.println("result : " + result); // result : 15.3
		
		
		
		// int(4byte) -> long(8byte)
		int iNum2 = 2147483647; // int 최대값
		long lNum2 = 1000000000L; // 10억
		
		long result2 = iNum2 + lNum2;
		//             (long)   (long)
		System.out.println("result2 : " + result2);
		
		
		// float(4byte) -> double(8byte)
		float fNum3 = 1.2f;
		double dNum3 = fNum3;
		
		
		
		// long(8byte) -> float(4byte)
		// float의 값의 범위가 long보다 더 크기 때문에 자동 형변환이 가능하다
		long lNum4 = Long.MAX_VALUE; // long의 최대값
		float fNum4 = lNum4;
				   // (long) -> (float) 
		
		System.out.println("lNum4 : " + lNum4);
		System.out.println("fNum4 : " + fNum4);
		
		
		// char(2byte) -> int(4byte)
		char ch5 = '가';
		int iNum5 = ch5;
		System.out.println("iNum5 : " + iNum5);
		
		char ch6 = 65;
		//		  (int)
		// 에러가 나지 않는 이유 :
		// char 자료형은 원래 0~65535 사이의 정수를 저장하는 변수
		// 그래서 char 자료형에 숫자를 대입하는게 문제가 되지 않는다.
		// 그런데 정수를 나타낼 수 있는 표기법이 int, long 두 개만 존재함.
		// 따라서 별도의 char 정수 표기법을 만들지 않고 대입 시
		// 작성되는 int 표기법을 char 자료형 정수로 인식하게 java에서 정해둠.
		System.out.println("ch6 : " + ch6);
	}
	
	
	
	// 강제 형변환 예시
	public void example2() {
		
		// 강제 형변환이란?
		// 값의 범위가 큰 자료형을  값의 범위가 작은 자료형으로 변환
		// -> 큰 데이터를 잘라서 넣어야 하기 때문에 
		//    자동으로 진행되지 못하고 강제로 수행 시켜야함.
		
		// 강제 형변환으로 인한 데이터 손실
		int iNum = 290;
		byte bNum = (byte)iNum; // iNum을 byte 자료형으로 강제 형변환
		System.out.println("iNum : " + iNum);
		System.out.println("bNum : " + bNum);
		
		
		// 실수형 -> 정수형 강제 형변환
		// --> 소수점 아래 버림 효과
		int iNum2 = 10;
		double dNum2 = 1.25;
		
		System.out.println(iNum2 * dNum2); // 12.5
		
		int result2 = (int)(iNum2 * dNum2);
		// iNum2 * dNum2를 계산한 결과의 자료형은 double
		// -> iNum2가 double형인 dNum2와 계산하기 위해서 double로 자동 형변환됨.
		
		// 계산 결과를 int형 변수 result2에 대입하기 위해서는 
		// 결과 값의 자료형이 int형 이여야 되므로 강제 형변환 진행.
		
		System.out.println("result2 : " + result2); // 12
		
		System.out.println(  iNum2  *  (int)dNum2 ); // 10
		
		
		// int -> char 강제 형변환
		int iNum3 = 65;
		
		char ch3 = 65; // char에 값 대입 시 int 리터럴 표기법을 사용할 수 있다.
		char ch4 = (char)iNum3; // char에 값 대입 시 int 자료형은 대입할 수 없다.
		
		System.out.println("ch3 : " + ch3);
		System.out.println("ch4 : " + ch4);
	}
	
	
	// 데이터 오버플로우
	public void example3() {
		
		int views = 2147483647;
		System.out.println("views : " + views);
		
		int views2 = views + 1;
		System.out.println("views2 : " + views2);
		
		// 데이터 오버플로우는 코드상으로는 문제가 발견되지 않음.
		// -> 서비스 중 문제가 발생하지 않도록
		//    기획, 설계 단계에서 예측을 잘해야함.
	}
	
	
	
	// printf() 출력메소드
	public void example4() {
		String name = "홍길동";
		int age = 20;
		double height = 180.45;
		
		// 홍길동님은 20세이며, 키는 180.45cm 입니다.
		System.out.println(name + "님은 " + age + "세이며, 키는 " + height +"cm 입니다.");
		
		System.out.printf("%-5s님은 %d세이며, 키는 %.2fcm 입니다.\n", name, age, height);
		
		// %s (String) : 문자열 형식
		// %5s : 5칸을 확보하고 오른쪽 정렬
		// %-5s : 5칸을 확보하고 왼쪽 정렬
		
		// %d (Decimal) : 10진 정수 형식
		// %o : 8진수  /  %x : 16진수
		// %f (Float) : 실수 형식
		// %.2f : 실수 형식, 소수점 아래 두자리 까지 표시
		//   -> 소수점 아래 셋째 자리에서 반올림
		
		
	}
	
	
	
	
	
	
	
	
	
}
