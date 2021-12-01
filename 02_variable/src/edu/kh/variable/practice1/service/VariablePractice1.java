package edu.kh.variable.practice1.service;

import java.util.Scanner;

public class VariablePractice1 {

	/* 실습문제 1
	이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.

	[실행 결과]
	이름을 입력하세요 : 아무개
	성별을 입력하세요(남자/여자) : 남자
	나이를 입력하세요 : 20
	키를 입력하세요(cm) : 180.5
	키 180.5cm인 20살 남자 아무개님 반갑습니다^^
	*/
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String inputName = sc.next();
		
		System.out.print("성별을 입력하세요(남자/여자) : ");
		String inputGender = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		int inputAge = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		double inputHeight = sc.nextDouble();
		
		// 키 180.5cm인 20살 남자 아무개님 반갑습니다^^
		System.out.println("키 " + inputHeight + "cm인 " + inputAge + "살 "
							+ inputGender + " " + inputName + "님 반갑습니다^^" );
		
	}
	
	
	
	/* 실습문제2
	키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.

	[실행 결과]
	첫 번째 정수 : 23
	두 번째 정수 : 7
	
	더하기 결과 : 30
	빼기 결과 : 16
	곱하기 결과 : 161
	나누기 몫 결과 : 3
	*/
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int inputNum1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int inputNum2 = sc.nextInt();
		
		System.out.println(); // 줄바꿈(개행)
		
		System.out.println("더하기 결과 : " +   (inputNum1 + inputNum2) );
		System.out.println("빼기 결과 : " +    (inputNum1 - inputNum2) );
		System.out.println("곱하기 결과 : " +   (inputNum1 * inputNum2) );
		System.out.println("나누기 몫 결과 : " + (inputNum1 / inputNum2) );
		
	}
	
	/* 실습문제3
	키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	계산 공식 -> 면적 : 가로 * 세로
		           둘레 : (가로 + 세로) * 2

	[실행 결과]
	가로 : 13.5
	세로 : 41.7

	면적 : 562.95
	둘레 : 110.4 */
	public void practice3() {  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double inputWidth = sc.nextDouble();
		
		System.out.print("세로 : ");
		double inputHeight = sc.nextDouble();
		
		System.out.println("면적 : " +  (inputWidth * inputHeight) );
		System.out.println("둘레 : " +  (inputWidth + inputHeight) * 2 );
		
	}
	
	
	
	
	
	
}
