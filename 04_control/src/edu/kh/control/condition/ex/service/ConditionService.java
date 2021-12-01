package edu.kh.control.condition.ex.service;

import java.util.Scanner;

public class ConditionService {

	// 제어문
	// - 프로그램의 흐름을 바꾸는(제어하는) 역할을 하는 코드
	
	// 조건문
	// - 제어문 중 하나로 조건에 따라 다른 문장(코드)가 실행되도록 하는 코드
	
	
	// if문 예제  (if : 만약,  else : 그밖에)
	public void example1() {
		/* 단독 if문
		 * if(조건식){
		 *  // 조건식이 true일 경우 수행할 코드
		 * }
		 * */
		
		/* if - else문
		 * if(조건식) {
		 *   // 조건식이 true일 경우 수행할 코드
		 * } else {
		 * 	 // 조건식이 false일 경우 수행할 코드
		 * }
		 * 
		 * */
		
		
		// 입력받은 정수가 양수인지, 양수가 아닌지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수");
		} else {
			System.out.println("양수가 아니다.");
		}
		
		/*
		if(input <= 0) {
			System.out.println("양수가 아니다");
		}
		*/
	}
	
	
	public void example2() {
		
		// 입력 받은 정수가 홀수인지 짝수인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
	}
	
	public void example3() {
		
		// 두 정수를 순서대로 입력받아
		// 먼저 입력받은 수가 큰지 / 작거나 같은지 확인
		
		// [실행화면]
		// 정수 입력1 : 20
		// 정수 입력2 : 10
		// 20은 10보다 크다.
		
		// [실행화면]
		// 정수 입력1 : 5
		// 정수 입력2 : 10
		// 5는 10보다 작거나 같다.
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수 입력2 : ");
		int input2 = sc.nextInt();
		
		if(input1 > input2) {
			System.out.println( input1 + "은/는 " + input2 + "보다 크다.");
		}else {
			System.out.println( input1 + "은/는 " + input2 + "보다 작거나 같다.");
		}
	}
	
	
	/* if - else if - else문
	 * - 조건이 다수일 경우 사용하는 조건문
	 * 
	 * if(조건식 1){
	 * 	// 조건식 1이 true일 경우 수행
	 * } else if(조건식 2){
	 * 	// 조건식 2가 true일 경우 수행
	 * } else{
	 *  // 앞선 조건식을 모두 만족하지 못하는 경우 수행
	 * }
	 * */
	
	public void example4() {
		// 입력 받은 정수가 양수, 음수, 0 중 어떤 것인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수");
		}else if (input < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0입니다.");
		}
	}
	
	public void example5() {
		
		// 1~12 사이의 숫자를 입력 받아 해당 달의 계절을 출력.
		// 단, 1~12 사이 숫자를 입력하지 않은 경우 "잘못 입력하셨습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 12 사이 숫자를 입력해주세요 : ");
		
		int month = sc.nextInt();
		
		String result = null; // 아래 if문을 통해 결정된 출력 내용을 저장할 변수 선언
		
		if( month >= 3 && month <= 5 ) { // 3 ~ 5
			result = "봄";
			
		}else if( month >= 6 && month <= 8 ) { // 6 ~ 8
			result = "여름";
		
		}else if( month >= 9 && month <= 11 ) { // 9 ~ 11
			result = "가을";
		
		}else if( month == 12 || month == 1 || month == 2 ) { // 12, 1, 2
			result = "겨울";
			
		}else {
			result = "잘못 입력하셨습니다.";
		}
		
		System.out.println(result);
	}
	
	
	public void example6() {
		// 나이를 입력받아
		// 13세 이하는 어린이, 19세 이하는 청소년, 19세 초과는 성인 으로 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		
		int age = sc.nextInt();
		
		String result = null; // null : 아무 문자열도 참조하고 있지 않다. (임시로 알아두세요)
		
		if(age <= 13) { // 13세 이하
			result = "어린이";
		
		} else if(age <= 19) {
			result = "청소년";
		
		} else {
			result = "성인";
		}
		
		System.out.println(result);
	}
	
	
	public void example7() {
		// 나이를 입력받아
		// 13세 이하는 어린이, 19세 이하는 청소년, 19세 초과는 성인으로 출력
		// 단, 0 이하 입력 시 "잘못 입력하셨습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result = null;
		
		// 1. 입력 받은 나이가 0보다 큰지 확인
		if(age > 0) {
			// 2.  13세 이하는 어린이, 19세 이하는 청소년, 19세 초과는 성인
			if(age <= 13) {
				result = "어린이";
			}else if( age <= 19) {
				result = "청소년";
			}else {
				result = "성인";
			}
			
		} else { // age <= 0
			result = "잘못 입력하셨습니다.";
		}
		
		System.out.println(result);
		
	}
	
	
	/* switch문
	 * - 식 하나로 많은 경우의 수를 처리할 경우 사용
	 * - 식의 결과 값과 일치하는 case문을 수행
	 * 
	 * switch(식) { x + 1
	 * case 결과값1 : 수행코드 1; break;
	 * case 결과값2 : 수행코드 2; break;
	 * case 결과값3 : 수행코드 3; break;
	 * ...
	 * default : 수행코드;
	 * 
	 * }
	 * 
	 */
	
	public void example8() {
		// 정수 하나를 입력받아
		// 1인 경우 "빨강색"
		// 2인 경우 "주황색"
		// 3인 경우 "노랑색"
		// 1~3 사이 정수가 아닌 경우 "잘못 입력하셨습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String res = null; 
		
		// 1) if문 버전
		/*
		if(input == 1) {
			res = "빨강색";
		}else if(input == 2) {
			res = "주황색";
		}else if(input == 3) {
			res = "노랑색";
		}else {
			res = "잘못 입력하셨습니다.";
		}
		*/
		
		// 2) switch문 버전
		switch(input) {
		case 1 : res = "빨강색"; break; // input이 1일 경우
		case 2 : res = "주황색"; break; // input이 2일 경우
		case 3 : res = "노랑색"; break; // input이 3일 경우
		default : res = "잘못 입력하셨습니다.";
		}
		
		// switch문에서 case문 사이에 break가 존재하지 않으면
		// 다음 case문을 실행함.
		
		System.out.println(res);
	}
	
	
	public void example9() {
		// 1~12 사이 숫자를 입력 받아 알맞은 계절 출력
		// 단, 1~12사이 숫자가 아닌 경우 "잘못 입력하셨습니다" 출력(switch)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이 숫자 입력 : ");
		int month = sc.nextInt();
		
		String result = null;
		
		switch(month) {
		case 3 : case 4 : case 5 : result = "봄"; break;
		case 6 : case 7 : case 8 : result = "여름"; break;
		case 9 : case 10 : case 11 : result = "가을"; break;
		case 12 : case 1 : case 2 : result = "겨울"; break;
		default : result = "잘못 입력하셨습니다.";
		}
		
		System.out.println(result);
	}
	
	
	public void example10() {
		
		// 두 정수와 산술 연산자를 입력받아
		// 두 정수의 연산 결과를 출력
		
		// [실행 화면]
		// 입력 1 : 5
		// 입력 2 : 2
		// 연산자 : *
		// 5 * 2 = 10
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.print("연산자 : "); // + - * / %
		char op = sc.next().charAt(0);
		
		int result = 0; // input1과 input2 연산 결과를 저장할 변수
		switch(op) {
		case '+' : result = input1 + input2; break;
		case '-' : result = input1 - input2; break;
		case '*' : result = input1 * input2; break;
		case '/' : result = input1 / input2; break;
		case '%' : result = input1 % input2; break;
		}
		// 5 * 2 = 10
		System.out.printf("%d %c %d = %d\n", input1, op, input2, result);
		
	}
	
	
	
	
	
	
	
	
	
	
}
