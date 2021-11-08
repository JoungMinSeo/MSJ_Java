package edu.kh.op.ex.service;

import java.util.Scanner;

public class OperatorService2 {
	
	// 논리 연산자
	public void example1() {
		/* - 논리 값 두 개를 비교하는 연산자
		 * 
		 * &&(AND) : 논리 값 두 개가 모두 true일 때만 true를 반환
		 * -> true && true == true
		 * --> 그리고(~이고), ~면서, ~이면서, ~부터, ~까지, ~사이
		 * 
		 * ||(OR) : 논리 값 두 개가 모두 false일 때만 false를 반환
		 * ->  false || false == false
		 * --> 또는, ~거나, ~이거나
		 * 
		 * */
		
		// 입력받은 정수가 1에서 100 사이 숫자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		boolean result = (1 <= input)  &&  (input <= 100);
			// input은 1보다 크거나 같다.   그리고     input은 100보다 작거나 같다.
				
		System.out.println("입력받은 정수는 1~100사이 숫자인가? : " + result);
	}
	
	
	public void example2() {
		
		// 입력받은 알파벳이 대문자  A ~ Z 사이의 문자인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 하나 입력 : ");
		char input = sc.next().charAt(0);
		// 문자열(String).charAt(0) : 문자열에서 0번째 문자 하나를 꺼내옴
		
		boolean result = ('A' <= input) && (input <= 'Z');
		
		System.out.println("입력받은 알파벳은 A~Z 사이가 맞는가? : " + result);
	}
	
	
	public void example3() {
		// 입력받은 정수가 0 미만 또는 100 초과인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		boolean result = (input < 0)  ||  (input > 100);
		//boolean result =  !((0 <= input) && (input <= 100)) ;
		//boolean result =  ((0 <= input) && (input <= 100))  != true  ;
		
		System.out.println("입력받은 수가 0미만 또는 100 초과인가? " + result);
	}
	
	
	public void example4() {
		// 입력받은 문자 하나가 'Y'인지 확인(대소문자 구분 X)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char input = sc.next().charAt(0);
		
		boolean result = (input == 'Y') || (input == 'y');
		
		System.out.println("Y 또는 y가 맞는지 확인 : " + result);
	}
	
	
	
	// 복합 대입 연산자
	public void example5() {
		
		int num = 10;
		num = num + 10;
		
		int num2 = 10;
		num2 += 10; // == num2 = num2 + 10  같은의미
		
		int num3 = 1;
		
		// num3를 1 증가 시켜서 출력
		num3++;
		System.out.println("num3 : " + num3); // 2
		
		// num3를 2 증가 시켜서 출력
		num3 += 2;
		System.out.println("num3 : " + num3); // 4
		//System.out.println("num3 : " + (num3 += 2)); // 4
		
		num3 += 2;
		System.out.println("num3 : " + num3); // 6
		
		num3 += 2;
		System.out.println("num3 : " + num3); // 8
	}
	
	
	// 삼항 연산자
	public void example6() {
		/* 조건식 ? 식1 : 식2;
		 * 
		 * 조건식 : 결과가 true 또는 false인 식
		 * 
		 * - 조건식이 true일 경우 식1 수행
		 * - 조건식이 false인 경우 식2 수행
		 * */
		
		// 정수를 입력받아 양수인지 음수인지 검사
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		String result = input > 0  ? "양수이다." : "음수이다.";
		//"양수이다"  / "음수이다"
			
		System.out.println(input + "은/는 " + result);
	}
	
	
	public void example7() {
		// 정수를 입력받아 양수, 0, 음수인지 검사
		// 양수일 경우 '+' 음수일 경우 '-', 0일 경우 '0' 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 삼항 연산자 중복 사용
		char result = (input > 0) ? '+' :  (input == 0) ? '0' : '-'  ;
		
		//(input == 0) ? '0' : '-'
		
		System.out.println(result);
	}
	
	
	
	public void example8() {
		// 주민등록번호를 입력받아 남자(1,3)인지 여자(2,4)인지 구분하여 출력.
		// ex) 입력 : 990101-1234567 
		//     남자
		// ex) 입력 : 010303-4234567
		//     여자
		
		// ex) 입력 : 021112-7234567
		//     잘못 입력하셨습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		
		// 입력된 주민등록번호에서 성별부분만 추출
		char input = sc.next().charAt(7); 
		
		String result = (input == '1' || input == '3') ? "남자" 
				: (input == '2' || input == '4') ? "여자" : "잘못 입력하셨습니다." ;
		
		System.out.println(result);
	}
	
	
	
	
	
	
	
	
	
	
	
}
