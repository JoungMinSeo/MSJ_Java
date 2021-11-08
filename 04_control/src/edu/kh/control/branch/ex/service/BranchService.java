package edu.kh.control.branch.ex.service;

import java.util.Scanner;

public class BranchService {

	// 분기문
	// break : 반복문을 종료시키는 구문
	public void example1() {
		
		// 0이 입력될 때 까지 입력된 모든 정수의 합 출력
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 입력 받은 값의 합을 저장할 변수
		
		while(true) { // 무한 루프
			
			System.out.print("정수 입력(종료는 0) : ");
			int input = sc.nextInt();
			
			sum += input;
			
			if(input == 0) { // 0이 입력된 경우 반복문 종료
				break;
			}
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void example2() {
		
		// "end"라는 단어가 입력될 때 까지 문자열을 입력받고
		// 반복문 종료 시 한 줄로 출력
		
		Scanner sc = new Scanner(System.in);
		
		String result = "";  // 빈 문자열
		
		while(true) {
			System.out.print("문자열 입력(종료는 end) : ");
			
			String input = sc.nextLine(); // 다음 입력된 한 줄을 모두 얻어옴
			
			if(input.equals("end")) {
				// input.equals("end") : 
				// input에 저장된 문자열과 "end" 문자열의 값 자체가 같으면 true
				break;
			}
			
			result += input + " ";
		}
		
		System.out.println("결과 : " + result);
	}
	
	
	
	// continue : 반복문 내에서만 사용 가능하며
	// 			  continue 코드 수행 시
	//			  for문에서는 증감식으로, while문에서는 다음 반복으로 건너 뜀.
	
	public void example3() {
		// 1 부터 100 사이 정수 중 3의 배수를 제외한 모든 수의 합을 출력
		
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
			
			if(i % 3 == 0) { // i가 3의 배수라면
				continue;
			}
			
			sum += i;
		}
		System.out.println("합계 : " + sum);
	}
	
	
	
	/* 중첩 반복문 내에서 분기문 사용하기
	 * 
	 * ** 분기문은 가장 가까운 반복문에만 영향을 미침.
	 * */
	public void example4() {
		
		// 2 ~ 9단까지 모두 출력
		// 단, 곱해지는 수가 짝수인 경우만 출력
		// + 홀수 단만 출력
		// === 3단 ===
		// 3 x 2 = 6
		// 3 x 4 = 12
		// 3 x 6 = 18
		
		for(int dan=2 ; dan<=9 ; dan++) {
			
			if(dan % 2 == 0) { // 짝수단일 경우
				continue;
			}
			
			System.out.println("=== " + dan + "단 ===");
			
			for(int num=1 ; num<=9 ; num++) {

				if(num % 2 == 1) { // 곱해지는 수가 홀수인 경우
					continue;
				}
				
				System.out.printf("%d x %d = %d\n", dan, num, dan*num);
			}
			
		}

	}
	
	
	
	
	
	
	
	
	
	
}
