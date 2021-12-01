package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	/* 실습문제 1
	길이가 9인 배열을 선언하고 1부터 9까지의 값을 반복문을 이용하여 
	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 
	짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	*/
	public void practice1() {

		int[] arr = new int[9];
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) { 
			arr[i] = i+1; 
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 0) { // 짝수 번째 인덱스
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
		
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* 실습문제 2
	길이가 9인 배열을 선언하고 9부터 1까지의 값을 반복문을 이용하여 
	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 
	홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	*/
	public void practice2() {

		int[] arr = new int[9];
		
		int sum = 0;
		for(int i=arr.length-1; i>=0; i--) { 
			arr[i] = i+1; 
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 1) { // 홀수 번째 인덱스
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);
		
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* 실습문제 3
	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
	ex.
	양의 정수 : 5
	1 2 3 4 5 
	*/
	public void practice3() {
		// 1. 사용자에게 정수 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		// 2. 배열을 할당할 껀데 사용자가 입력한 정수(size)만큼의 크기로 할당
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* 실습문제 4
	정수 5개를 입력 받아 배열을 초기화 하고 
	검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
	배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
	 */
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length ; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = true;
		
		for(int i=0; i<arr.length ; i++) {
			if(arr[i] == search) {
				System.out.print("인덱스 : " + i);
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
		
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* 실습문제 5
	문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
	개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
	ex.
	문자열 : application
	문자 : i
	application에 i가 존재하는 위치(인덱스) : 4 8
	i 개수 : 2
	*/
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		int count = 0; 	// 검색할 문자가 문자열에 몇개가 들어있는지를 세어줄 변수
						// 문자열에서 동일한 문자가 발생할 때마다 1씩 증가
		
		// 반복문 수행전 문자열 출력
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		// 인덱스마다 접근하기 위해 반복문 사용
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우 
				System.out.print(i + " ");	// 해당 인덱스 이어서 출력
				
				count++;	// 그리고 count 1증가
			}
		}
		
		System.out.println();	// 줄바꿈
		System.out.println(ch + "개수 : " + count);
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* 실습문제 6
	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
	*/
	public void practice6() {
		// 1. 사용자에게 값을 입력받고 그 값만큼의 배열 선언 및 할당
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		// 2. 그 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		// 3. 전체 값 나열 및 총 합 출력
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* 실습문제 7
	주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
	단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
	*/
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			
			if(i <= 7) { // 7번 인덱스 이하까지는
				System.out.print(str.charAt(i));
			}else { // 그 이후부터는 *값 들어가도록
				System.out.print("*");
			}
		}
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* 실습문제 8
	3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
	다시 정수를 받도록 하세요.
	*/
	public void practice8() {
		
		// 1. 사용자에게 3이상의 정수값을 입력받자
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 == 1) { // 3이상이거나 홀수인 경우 (즉, 잘 입력한 경우)
				
				// 사용자가 입력한 정수 크기 만큼의 배열 만듦
				int[] arr = new int[num];
				
				// 값을 출력용 변수 --> 오름차순일 경우 1씩 증가, 내림차순일 경우 1씩 감소
				int count = 0;
				
				// 값 넣기
				for(int i=0; i<arr.length; i++) {
					
					if(i <= arr.length / 2) { // 배열의 중간까지는 증가
						count++;
					}else { // 중간 이후부터 감소
						count--;
					}
					
					arr[i] = count;
					
					System.out.print(arr[i]);
					
					if(i < arr.length-1) {
						System.out.print(", ");
					}
				}
				
				break; // 제대로 실행 하고 무한 반복문 빠져나가기
				
			}else { // 잘못 입력한 경우
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* 실습문제 9
	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
	*/
	public void practice9() {
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화한 후 출력
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* 실습문제 10
	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	1~10 사이의 난수를 발생시켜 배열에 초기화 후
	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
	*/
	public void practice10() {
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화 후 출력
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(); // 개행
		
		// 3. 반복문을 통해 최대값 최소값 알아내기
		int max = 1;  // 최소값을 담아줄 변수 , 1은 난수에서 발생할 수 있는 제일 작은 값
		int min = 10; // 최대값을 담아줄 변수 , 10은 난수에서 발생할 수 있는 제일 큰 값
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > max) { // 해당 인덱스의 값이 max 보다 큰 경우
				max = arr[i]; // 해당 값을 max 변수에 담아줌
			}
			
			if(arr[i] < min) { // 해당 인덱스의  값이 min 보다 작은 경우
				min = arr[i]; // 해당 값을 min 변수에 담아줌
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
				
	}
	//-----------------------------------------------------------------------------------------
	
	
	/* 실습문제 11
	10개의 값을 저장할 수  있는 정수형 배열을 선언 및 할당하고
	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
	*/
	public void practice11() {
	
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 각 인덱스 값에 1부터 10 사이의 난수를 발생시키는데 이때 중복이 없도록
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j=0; j<i; j++) { // 중복 제거
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	//-----------------------------------------------------------------------------------------
	
	/* 실습문제 12
	로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
	*/
	
	public void practice12() {
		// 1. 크기가 6인 정수형 배열 선언 및 할당
		int[] lotto = new int[6];
		
		// 2. 배열에 중복값없이 1부터 45사이의 난수 초기화
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j=0; j<i; j++) { // 중복 제거
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. 오름차순 정렬
		Arrays.sort(lotto);
		
		// 4. 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	//-----------------------------------------------------------------------------------------
	
	/* 실습문제 13
	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	문자의 개수와 함께 출력하세요.
	ex.
	문자열 : application
	문자열에 있는 문자 : a, p, l, i, c, t, o, n
	문자 개수 : 8
	*/
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		int count = 0; // 문자 개수 카운트
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i=0; i<str.length(); i++) {
			
			boolean flag = true; // 중복 체크용 flag
			
			for(int j=0; j<i; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					flag = false; // 중복이발생했을 때
					break;
				}
			}
			
			if(flag) { // 중복이 발생하지 않았을 경우
				
				if(i == 0) {
					System.out.print(str.charAt(i));					
				}else {
					System.out.print(", " + str.charAt(i));					
				}
				
				count++;
			}
			
		}
		
		System.out.println();
		System.out.println("문자 개수 : " + count);
		
		
	}
	
	//-----------------------------------------------------------------------------------------
	
}
