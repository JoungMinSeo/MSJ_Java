package edu.kh.array2.ex.service;

import java.util.Scanner;

public class Array2Service {

	/* 이차원 배열 : 자료형이 같은 1차원 배열의 묶음.
	 * - 이차원 배열은 할당된 공간마다 두개의 인덱스 번호를 부여 받음.
	 *  --> 앞 번호는 행, 뒷 번호는 열
	 * */
	
	public void example1() {
		
		// 이차원 배열의 선언
		int[][] arr; // 2차원 배열을 참조할 참조 변수 arr을 선언
		// (참조 변수 == 참조형 변수 == 레퍼런스 == 레퍼런스 변수)
		// --> 참조형 변수는 주소를 입력받기 위해 4byte 공간이 할당됨.
		
		
		// 이차원 배열 할당
		arr = new int[3][2];
		
		// 인덱스를 이용한 직접 초기화
		/*arr[0][0] = 0;
		arr[0][1] = 1;
		// arr[0][2] = 2; 2열이 없으므로 배열 길이 초과 에러 발생.
		
		arr[1][0] = 2;
		arr[1][1] = 3;
		
		arr[2][0] = 4;
		arr[2][1] = 5;*/
		
		// 2차원 배열 선언과 동시에 초기화
		
		int[][] arr2 = {		// 2차원 배열 시작  
						{0, 1}, // 0행
						{2, 3}, // 1행
						{4, 5} 	// 2행
					   };		// 2차원 배열 끝
		
		
		// for문을 이용한 배열 초기화
		// for문 2개, arr 이차원배열, 초기화할 값을 제어할 변수 1개
		
		int num = 0; // 초기화할 값을 제어할 변수(0 ~ 5)
		
		for(int row=0 ; row<arr.length ; row++ ) { // 행 선택
			
			for(int col=0 ; col<arr[row].length ; col++) { // 열 선택
				// == 열의 길이(열의 갯수) == 2(현재 예제)
			
				arr[row][col] = num;
				// 2차원 배열 arr의 row번째 행 , col번째 열에 num 대입
				
				num++; // 다음 for문 반복 시 num값이 1 증가해 있어야 함.
				       // 그래서 값 대입 후 1 증가
				
				//arr[row][col] = num++; // 이렇게도 가능
			}
		}
		
		
		
		/*
		System.out.print(arr[0][0]);
		System.out.println(arr[0][1]);
		
		System.out.print(arr[1][0]);
		System.out.println(arr[1][1]);
		
		System.out.print(arr[2][0]);
		System.out.println(arr[2][1]);
		*/
		
		
		for(int i=0 ; i<arr.length ; i++) { // 행 선택
			
			for(int j=0 ; j<arr[i].length ; j++) { // 열 선택
				
				System.out.print(arr[i][j] + " "); // 한 행의 값이 모두 출력
			}
			
			System.out.println(); // 다음 행 출력을 위해 줄바꿈
		}
	}
	
	
	public void example2() {
		
		// 2행 3열 짜리 int 이차원 배열을 선언 및 할당하여
		// 각 요소에 입력 받은 값을 저장하고
		// 출력 시 1행, 0행 순서대로 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][3];
		
		for(int row=0 ; row<arr.length ; row++ ) { // 행 선택, row = 0,1
			for(int col=0 ; col<arr[row].length ; col++) { // 열 선택, col = 0,1,2
				
				System.out.printf("arr[%d][%d] 입력 : ",row, col);
				
				arr[row][col] = sc.nextInt();
			}
		}
		
		// 출력
		for(int row=arr.length-1 ; row>=0 ; row--) { // 행 선택
			
			for(int col=0 ; col<arr[row].length ; col++) { // 열 선택
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		System.out.print("1열에 작성된 값 : "); // 1열에 작성된 값 : 20 50
		
		for(int row=0 ; row<arr.length ; row++) { // 행 선택
			System.out.print(arr[row][1] + " ");
		}
		
		System.out.println(); // 줄 바꿈
		
		System.out.print("0행에 작성된 값 : "); // 0행에 작성된 값 : 10 20 30
		
		for(int col=0 ; col<arr[0].length ; col++ ) { // 열 선택
			System.out.print(arr[0][col] + " ");
		}
	}
	
	
	public void example3() {
		// 3행 3열 짜리 int 이차원 배열을 선언 및 할당하여
		// 1번 인덱스 행 까지만 각 요소에 입력 받은 값을 저장하고
		// 2번 인덱스 행에 각 열의 합을 저장하고 전체 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][3]; // 3행 3열 배열 생성
		
		for(int row=0 ; row<arr.length-1 ; row++) { // 0, 1행 선택
			
			for(int col=0 ; col<arr[row].length ; col++) { // 0,1,2 열 선택
				
				System.out.printf("arr[%d][%d] 입력 : ", row, col);
				arr[row][col] = sc.nextInt();
				
				arr[2][col] += arr[row][col];
			}
		}
		/*  1  2  3
		 *  4  5  6
		 *  5  7  9
		 * */
		
		// 마지막 행에 합 구하기
		/*for(int col=0; col<arr[0].length ; col++) { // 0,1,2 열 선택
							// 3
			for(int row=0 ; row<arr.length -1 ; row++) { // 0,1행 선택
									// 2
				arr[2][col] += arr[row][col];
				// 각 열의 마지막 행에 각 열의 값을 누적
			}
		}*/
		
		
		//출력
		for(int row=0 ; row<arr.length ; row++) {
			
			for(int col=0 ; col<arr[row].length ; col++) {
			
				System.out.print(arr[row][col] + " ");
			}
			
			System.out.println();
		}
	}
	
	
	public void example4() {
		/* 가변 배열
		 * - 행의 개수는 정해져 있으나 열의 개수가 정해지지 않은 2차원 배열
		 * - 자료형이 같은 1차원 배열 참조변수를 묶은 것이 == 2차원 배열
		 * - 각 1차원 배열 참조 변수는 크기가 다른 1차원 배열을 참조할 수 있다.
		 * */
		
		int[][] arr = new int[3][]; // 가변 배열 할당
		
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		
		int num = 0; 
		
		for(int row=0 ; row<arr.length ; row++ ) { // 행 선택
			for(int col=0 ; col<arr[row].length ; col++) { // 열 선택
				arr[row][col] = num;
				
				System.out.print(arr[row][col] + " ");
				
				num++;
			}
			
			System.out.println();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
