package edu.kh.array2.practice.service;

import java.util.Scanner;

public class PracticeService {

	/*
	 * 실습문제 1 3행 3열짜리 문자열 배열을 선언 및 할당하고 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은
	 * 형식으로 저장 후 출력하세요. ex. (0, 0)(0, 1)(0, 2) (1, 0)(1, 1)(1, 2) (2, 0)(2, 1)(2, 2)
	 * 
	 */
	public void practice1() {
		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	/*
	 * 실습문제 2 4행 4열짜리 정수형 배열을 선언 및 할당하고 1) 1 ~ 16까지 값을 차례대로 저장하세요. 2) 저장된 값들을 차례대로
	 * 출력하세요.
	 * 
	 * ex. 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
	 */
	public void practice2() {
		int[][] arr = new int[4][4];

		int value = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	/*
	 * 실습문제 3 4행 4열짜리 정수형 배열을 선언 및 할당하고 1) 16 ~ 1과 같이 값을 거꾸로 저장하세요. 2) 저장된 값들을 차례대로
	 * 출력하세요.
	 * 
	 * ex. 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
	 */
	public void practice3() {
		int[][] arr = new int[4][4];

		int value = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	/* 실습문제 4
	4행 4열 2차원 배열을 생성하여
	0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
	아래의 내용처럼 처리하세요.
	*/
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		final int LAST_ROW_INDEX = arr.length-1; //  마지막 행 인덱스
		final int LAST_COL_INDEX = arr[0].length-1; //  마지막 열 인덱스
		
		for(int row=0 ; row<LAST_ROW_INDEX ; row++) {
			for(int col=0 ; col<LAST_COL_INDEX ; col++) {
				
				// 1~10 사이 난수를 발생시켜 2차원 배열 요소에 대입
				arr[row][col] = (int)(Math.random() * 10 + 1);
				
				// 난수 대입과 동시에 각 행 마지막 열 인덱스에 난수 값 누적
				arr[row][LAST_COL_INDEX] += arr[row][col]; 
				
				// 난수 대입과 동시에 각 열 마지막 행 인덱스에 난수 값 누적
				arr[LAST_ROW_INDEX][col] += arr[row][col];
			}
		}
		
		//arr[3][3] += arr[0][3] + arr[1][3] + arr[2][3];
		//arr[3][3] += arr[3][0] + arr[3][1] + arr[3][2];
		
		// 출력용 2중 for문
		for(int row=0 ; row<arr.length ; row++) {
			for(int col=0 ; col<arr[row].length ; col++) {
				System.out.printf("%4d",  arr[row][col]);
				
				// 2중 for문 반복 중 마지막 행 또는 열에 접근한 경우
				if(row == LAST_ROW_INDEX || col == LAST_COL_INDEX) {
					
					// 마지막 행, 열 번째 요소는 누적하지 않게 하기 위한 조건문
					if(!(row == LAST_ROW_INDEX && col == LAST_COL_INDEX) ) { 
						arr[LAST_ROW_INDEX][LAST_COL_INDEX] += arr[row][col];
					}
				}
			}
			System.out.println();
		}
	}

	/* 실습문제 5 
	 * 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 
	 * 1~10사이 숫자가 아니면 “반드시 1~10 사이의 정수를 입력해야 합니다.” 
	 * 출력 후 다시 정수를 받게 하세요. 
	 * 크기가 정해진 이차원 배열 안에는 
	 * 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
	 * (char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자)
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("행 크기 : ");
			int rowSize = sc.nextInt();
			System.out.print("열 크기 : ");
			int colSize = sc.nextInt();

			if ((rowSize < 1 && rowSize > 10) || (colSize < 1 && colSize > 10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");

			} else {
				char[][] arr = new char[rowSize][colSize];

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						//arr[i][j] = (char) ((int) (Math.random() * 26 + 65));
						arr[i][j] = (char) ((int) (Math.random() * 26 + 'A'));
					}
				}

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}

				break;
			}

		}
	}

	/* 실습문제 6 
	 * 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 
	 * 열의 크기도 받아 문자형 가변 배열을 선언 및 할당하세요. 
	 * 그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
	 */

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("행의 크기 : ");
		int rowSize = sc.nextInt();

		char[][] arr = new char[rowSize][];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 크기 : ");
			int colSize = sc.nextInt();

			arr[i] = new char[colSize];
		}

		// 값 초기화
		char value = 'a';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j] + " ");
				
				//System.out.print( (arr[i][j] = value++) + " ");
				
			}
			System.out.println();
		}

	}
	
	/* 실습문제 7
	1차원 문자열 배열에 학생 이름 초기화되어 있다.
	3행 2열 짜리 2차원 문자열 배열 2개를 새로 선언 및 할당하여
	학생 이름을 2차원 배열에 순서대로 저장하고 아래와 같이 출력하시오.
	(첫 번째 2차원 배열이 모두 저장된 경우 두 번째 2차원 배열에 저장 진행)
	*/
	public void practice7() {
		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		int count = 0;
		// 1분단이 끝나고 2분단이 시작될 때도 이어서 들어가야하기 때문에
		// 학생을 이어서 셀 수 있도록 count 변수 생성

		// 1분단 학생 대입
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = students[count++];
			}
		}

		// 2분단 학생 대입
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = students[count++];
			}
		}

		// 출력
		System.out.println("== 1분단 ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}

	}

	/* 실습문제 8
	위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여
	해당 학생이 어느 자리에 앉았는지 출력하세요.
	*/
	public void practice8() {
		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		int count = 0;
		// 1분단이 끝나고 2분단이 시작될 때도 이어서 들어가야하기 때문에
		// 학생을 이어서 셀 수 있도록 count 변수 생성

		// 1분단 학생 대입
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = students[count++];
			}
		}

		// 2분단 학생 대입
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = students[count++];
			}
		}

		// 출력
		System.out.println("== 1분단 ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==================================");

		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 학생 이름을 입력하세요: ");
		String name = sc.nextLine();

		String part = ""; // 분단
		int row = 0; // 몇번째 줄
		String col = ""; // 왼쪽 오른쪽

		for (int i = 0; i < seat1.length; i++) {

			for (int j = 0; j < seat1[i].length; j++) {

				if (seat1[i][j].equals(name)) {

					part = "1분단";
					row = i + 1;

					if (j == 0) {
						col = "왼쪽";
					} else {
						col = "오른쪽";
					}
				}
			}
		}

		for (int i = 0; i < seat2.length; i++) {

			for (int j = 0; j < seat2[i].length; j++) {

				if (seat2[i][j].equals(name)) {

					part = "2분단";
					row = i + 1;

					if (j == 0) {
						col = "왼쪽";
					} else {
						col = "오른쪽";
					}
				}
			}
		}

		if (part.equals("")) {
			System.out.println("검색하신 학생은 없습니다.");
		} else {
			System.out.println("검색하신 " + name + " 학생은 " + part + " " + row + "번째 줄 " + col + "에 있습니다.");
		}

	}

	/* 실습문제 9
	String 2차원 배열 6행 6열을 만들고 행의 맨 위와 제일 앞 열은 각 인덱스를 저장하세요.
	그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하세요.
	*/
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[][] board = new String[6][6]; // char형 5행 5열 2차원 배열 생성

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}

		for (int i = 0; i < board.length - 1; i++) {
			board[0][i + 1] = i + "";
			board[i + 1][0] = i + "";
		}

		System.out.print("행 인덱스 입력 : ");
		int rowIndex = sc.nextInt();

		System.out.print("열 인덱스 입력 : ");
		int colIndex = sc.nextInt();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i == rowIndex && j == colIndex) { // 사용자가 입력한 행과 열의 인덱스 값이 같을 때
					board[i + 1][j + 1] = "X";
				}
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 실습 문제 10
	// 실습문제9와 내용은 같으나 행 입력 시 99가 입력되지 않으면 무한 반복이 되도록 구현하세요.
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		String[][] board = new String[6][6]; // char형 5행 5열 2차원 배열 생성

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}

		for (int i = 0; i < board.length - 1; i++) {
			board[0][i + 1] = i + "";
			board[i + 1][0] = i + "";
		}

		int rowIndex = 0;
		int colIndex = 0;
		do {
			System.out.print("행 인덱스 입력 : ");
			rowIndex = sc.nextInt();

			if (rowIndex != 99) {
				System.out.print("열 인덱스 입력 : ");
				colIndex = sc.nextInt();

				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						if (i == rowIndex && j == colIndex) { // 사용자가 입력한 행과 열의 인덱스 값이 같을 때
							board[i + 1][j + 1] = "X";
						}
						System.out.print(board[i][j] + " ");
					}
					System.out.println();
				}
			}
		} while (rowIndex != 99);
		System.out.println("프로그램 종료");
	}

}
