package edu.kh.control.loop.practice.service;

import java.util.Scanner;

public class PracticeService {
	
	// 실습문제 3
	// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0; // 정수 합을 저장할 변수
		for(int i=1 ; i<=input ; i++ ) {
			
			System.out.print(i);
			sum += i;
			
			if(i < input) {
				System.out.print(" + ");
			}else {
				System.out.print(" = " + sum);
			}
		}
	}
	
	/* 실습문제 4
	사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	*/
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		
		if(num1 > 0  &&  num2 >= 1) { // 둘다 1 이상
		// 0초과 == 1이상
			/*
			if(num1 > num2) { // 첫 번째 입력받은 숫자가 두 번째 입력받은 숫자보다 클 경우
				
				for(int i=num2 ; i<=num1 ; i++) {
					System.out.print(i + " ");
				}
			
			}else {
				
				for(int i=num1 ; i<=num2 ; i++) {
					System.out.print(i + " ");
				}
			}
			*/
			
			int start = num1; // 반복문 초기식 초기화에 사용할 변수
			int end = num2;	  // 반복문 조건식 종료 조건에 사용할 변수
			
			if(num1 > num2) {
				end = num1;
				start = num2;
			}
			
			for(int i=start ; i<=end ; i++) {
				System.out.print(i + " ");
			}
			
		}else { // 둘 중 하나 이상 1 미만
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}
	
	
	/* 실습문제 6
	사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
	단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
	*/
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if( num <= 9 ) {
			
			for(int i=num ; i<=9 ; i++) { // 단 반복 부분
				System.out.println("===== " + i + "단 ===== ");
				
				for(int j=1 ; j<=9 ; j++) { // 1 ~ 9 곱해지는 수 반복
					System.out.printf("%d x %d = %d\n", i , j, i*j );
				}
				
				System.out.println();
			}
		}else {
			System.out.println("9 이하의 숫자만 입력해주세요");
		}
	}
	
	
	
	
	
	
	
}
