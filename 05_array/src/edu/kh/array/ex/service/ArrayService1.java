package edu.kh.array.ex.service;

import java.util.Scanner;

public class ArrayService1 {

	// 배열
	// - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	// - 묶어둔 변수를 index를 통해 구분함. (index 시작은 0)
	
	public void example1() {
		
		// 1. 배열 선언
		int[] arr; 
		// Stack 영역에 int[] 자료형을 참조할 수 있는 변수 arr을 선언.
		// -> int[] 참조 변수 arr 선언
		
		double arr2[];
		// Stack 영역에 double[] 자료형을 참조할 수 있는 변수 arr2을 선언.
		// -> double[] 참조 변수 arr2 선언
		
		
		// 2. 배열 할당 (할당 : 메모리상에 데이터 저장 공간을 확보하는 것)
		arr = new int[4];
		// 1) Heap 영역에 새로운 int 자료형 공간 4칸을 할당.
		// -> 각 칸은 int 자료형, 4칸을 묶으면 int[] 자료형
		
		// 2) 새로 생성된 int[]의 시작 주소를 arr 참조 변수에 대입
		// -> arr변수의 자료형은 int[]로  
		//    새로 생성된 int[]과 자료형이 일치함 --> 대입 연산 가능.
		
		
		// 3. 배열 초기화 & 사용 방법
		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 5;
		
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		// arr[3]은 별도의 값으로 초기화 하지 않았으므로
		// int 기본값 0이 출력됨.
		
		// System.out.println("arr[4] : " + arr[4]);
		// ArrayIndexOutOfBoundsException : 배열 index 범위 초과
		
		System.out.println(arr);
		
		
		for(int i=0 ; i<=3 ; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
	}
	
	
	public void example2() {
		
		// for문을 이용한 배열 초기화
		// -> 초기화할 값이 규칙적이라면 for문을 이용하여 초기화 할 수 있다.
		
		// int형 배열 arr을 선언 후 5칸을 할당하여 각 인덱스에 0,1,2,3,4를 초기화
		
		int[] arr = new int[5];
		
		// arr.length == arr 변수가 참조하고 있는 배열의 길이 == 5
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = i; // 각 인덱스에 0,1,2,3,4를 초기화
		}
		
		for(int i=0 ; i<arr.length ; i++ ) {
			System.out.printf("arr[%d] : %d\n",i , arr[i]);
		}
		
		
		
		
		// int형 배열 arr2를 선언 후 7칸을 할당하여 
		// 각 인덱스에 0,2,4,6,8,10,12 를 초기화 후 역순으로 출력
		int[] arr2 = new int[7];
		
		
		// 배열 정방향 반복
		for(int i=0 ; i<arr2.length ; i++) {
			//   i = 0 1 2 3 4 5 6
			arr2[i] = i * 2;
		}

		
		// 배열 역방향 반복
		for(int i=arr2.length - 1 ; i>=0 ; i--) {
			System.out.printf("arr2[%d] : %d\n", i ,arr2[i]);
		}
		
	}
	
	
	public void example3() {
		
		// double[] arr 을 선언한 후 3칸 할당
		// 실수 3개를 입력받아 arr 각 인덱스에 저장 후
		// 저장된 값을 순서대로 출력, + 합계도 출력
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[3];
		/*
		System.out.print("입력 : ");
		arr[0] = sc.nextDouble();
		
		System.out.print("입력 : ");
		arr[1] = sc.nextDouble();
		
		System.out.print("입력 : ");
		arr[2] = sc.nextDouble();
		*/
		
		for(int i=0 ; i<arr.length ; i++) {
			// int i 역할 : 배열의 각 인덱스 요소에 순서대로 접근할 수 있는 숫자를 제공
		
			System.out.print("입력 : ");
			arr[i] = sc.nextDouble();
		}
		
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		
		double sum = 0.0; // 각 인덱스에 저장된 모든 값의 합을 저장할 변수
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
			
			sum += arr[i];
		}
		
		System.out.println("합계 :  " + sum  );
	}
	
	
	
	public void example4() {
		// 배열 선언과 동시에 초기화
		
		// int[] arr을 선언하고 5칸 할당한 후
		// 각 인덱스를 1,2,3,4,5로 초기화
		int[] arr = {10, 21, 33, 44, 55};
		
		System.out.println(arr[2]); // 3
		System.out.println(arr[4]); // 5
		//System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
		
		
		String[] fruit = {"딸기", "바나나", "사과", "오렌지", 
						  "토마토", "아보카도", "케일"};
		
		System.out.println("fruit.length : " + fruit.length); // 7
		
		System.out.println(fruit[2] + fruit[6] + " 쥬스");
	}
	
	
	public void challenge1() {
		
		// 정수 5개를 입력받은 후
		// 1~5 사이 숫자 하나를 선택하여
		// 해당 번째에 입력 받은 수를 출력
		
		// [실행화면]
		// 입력 1 : 10
		// 입력 2 : 7
		// 입력 3 : 55
		// 입력 4 : 13
		// 입력 5 : 25
		
		// 1~5 사이 숫자 하나 입력 : 4
		// 4번째 입력한 수 : 13
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5]; // int 배열 선언 및 5칸 할당
		
		for(int i=0 ; i<arr.length ; i++) { // 입력받은 값으로 배열 초기화
			
			System.out.print("입력 " + (i+1) + " : "); // 입력 1 : 
			arr[i] = sc.nextInt();
		}
		
		while(true) {
			
			System.out.print("1~5 사이 숫자 하나 입력 : ");
			int input = sc.nextInt();
			
			if(input >= 1 && input <= 5) {
				System.out.printf("%d번째 입력한 수 : %d\n", input, arr[input-1]);
				break;
			}else {
				System.out.println("1~5 사이 숫자를 입력해주세요.");
			}
		}
	}
	

	public void example5() {
		
		// 5명의 키를 입력받아 배열에 저장한 후
		// 5명 키 평균과 최장신, 최단신 출력
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5];
		
		// 입력 받는 용도
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print("키 입력 : ");
			arr[i] = sc.nextDouble();
		}
		
		
		// 평균, 최대값, 최소값
		// 평균 = 모든 값을 더한값 / 개수
		double sum = 0;
		
		double max = arr[0]; // 한없이 작은 값 또는 입력되어 있는 값 중 하나로 초기화
		double min = Double.MAX_VALUE;
		// Double.MAX_VALUE : double 최대값
		
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
			
			if(arr[i] > max ) { // 최대값 비교
				// 현재 얻어온 값 arr[i]가 max보다 크다면
				max = arr[i];
			}
			
			if(arr[i] < min) { // 최소값 비교 
				min = arr[i];
			}
		}
		
		System.out.println("평균 : " + sum / arr.length);
		System.out.println("최장신 : " + max);
		System.out.println("최단신 : " + min);
	}
	
	
	public void example6() {
		
		// 인원 수를 입력 받아 
		// 입력 된 인원 수 만큼의 배열을 할당하고
		// 점수를 입력 받아 배열에 초기화 한 후
		// 입력 역순으로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.printf("%d번째 인덱스 입력 : ", i); // 0번째 인덱스 입력
			arr[i] = sc.nextInt();
		}
		
		for(int i=arr.length-1 ; i>=0 ; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void example7() {
		
		// 배열의 단점 :
		// 1) 한번 크기가 정해지면 바꿀 수 없다.
		// 2) 한 가지 자료형만 저장할 수 있다.
		
		int[] arr = new int[3];
		System.out.println("arr 배열의 길이  : " + arr.length);
		
		arr = new int[6];
		System.out.println("arr 배열의 길이  : " + arr.length);
		
		// int[] 참조 변수 arr이 
		// 처음에는 길이가 3인 int 배열을 참조하고 있다가
		// 길이가 6이 int 배열을 새로 생성하여 arr이 이를 참조하게함.
		// (arr이 기존 배열 주소에서 새로 생성된 배열 주소를 참조함.)
		
	}
	
	
	public void example8() {
		
		// 입력 받은 문자열에 특정 단어가 몇번 존재하는지 확인
		
		// 문자열 입력 : apple
		// 검색할 문자 : p
		// p은/는 2번 작성되어있습니다.
		
		// String은 char(문자)가 여러 개 모여있는 문자 배열의 형태이다.
		// --> 그렇다고 char[]과 같지는 않다.
		// --> 배열과 비슷하게 사용할 수 있다.
		//     단, 사용하기 위한 문법 모양은 다르다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		
		System.out.print("검색할 문자 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0; // 검색된 문자의 개수를 세는 용도의 변수
		
		// 문자열을 처음부터 끝까지 한 글자씩 접근
		for(int i=0 ; i<input.length() ; i++ ) {
			// input.length() : input에 저장된 문자열의 길이
			
			if( input.charAt(i) == ch ) {
				// input 에서 꺼내온 한 글자가 ch와 같다면
				count++; // count 1증가
			}
		}
		
		System.out.println(ch + "은/는 " + count + "번 작성되었습니다.");
		
	}
	
	
	
	
	
}
