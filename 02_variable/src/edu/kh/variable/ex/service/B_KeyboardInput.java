package edu.kh.variable.ex.service;

import java.util.Scanner;

public class B_KeyboardInput {

	// Scanner 클래스 사용하기
	public void inputExample1() {

		// Scanner 클래스
		// 키보드로 부터 정수, 실수, 문자열을 입력받는 기능을 제공하는 클래스
		// java.util 패키지에 존재함.

		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		// System.in : 키보드가 기본값으로 설정되어있음.

		// 이름을 입력받아 저장할 변수를 선언
		String inputName;

		// 콘솔창에 "이름을 입력해주세요 : " 문자열 출력
		System.out.print("이름을 입력해주세요 : ");

		// Scanner를 이용하여 이름을 입력 받아 inputName에 대입.
		inputName = sc.next();
		// sc.next() : 사용자가 입력한 다음 단어를 읽어옴(입력 받음);
		// --> 키보드 입력 시 띄어쓰기 또는 엔터되기 이전 까지를 읽어옴.

		// "OOO님 환영합니다." 출력
		System.out.println(inputName + "님 환영합니다.");
	}

	// 여러번 입력 받기
	public void inputExample2() {
		// 이름, 나이, 키를 입력 받아 변수에 저장한 후
		// "OOO님은 XX세 이며, 키는 @@@.@@@cm 입니다." 를 출력

		// 1. 입력을 위해 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);

		// 2. "이름 입력 : " 구문을 출력한 후
		// 키보드로 이름을 입력 받아 변수에 대입
		System.out.print("이름 입력 : ");
		String inputName = sc.next();

		// 3. "나이 입력 : " 구문을 출력한 후
		// 키보드로 나이를 입력받아 변수에 대입
		System.out.print("나이 입력 : ");
		int inputAge = sc.nextInt();
		// sc.nextInt() : 사용자가 입력한 다음 정수를 읽어옴.

		// 4. "키 입력 : " 구문을 출력한 후
		// 키보드로 키를 입력받아 변수에 대입
		System.out.print("키 입력 : ");
		double inputHeight = sc.nextDouble();
		// sc.nextDouble() : 사용자가 입력한 다음 실수를 읽어옴.

		// 5. "OOO님은 XX세 이며, 키는 @@@.@@@cm 입니다." 를 출력
		System.out.println(inputName + "님은 " + inputAge + "세 이며, 키는 " + inputHeight + "cm 입니다.");
	
	
	}

	
	// 여러번 입력 받기
	public void inputExample3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름, 나이, 키 입력 : ");
		String inputName = sc.next();
		int inputAge = sc.nextInt();
		double inputHeight = sc.nextDouble();

		System.out.println("\"" + inputName + "\"님은 " + inputAge + "세 이며, 키는 " + inputHeight + "cm 입니다.");
	}

	
	
	

}
