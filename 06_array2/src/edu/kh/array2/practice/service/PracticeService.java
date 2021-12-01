package edu.kh.array2.practice.service;

import java.util.Scanner;

public class PracticeService {

	/*
	 * �ǽ����� 1 3�� 3��¥�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ� �ε��� 0�� 0������ 2�� 2������ ���ʴ�� �����Ͽ� ��(0, 0)���� ����
	 * �������� ���� �� ����ϼ���. ex. (0, 0)(0, 1)(0, 2) (1, 0)(1, 1)(1, 2) (2, 0)(2, 1)(2, 2)
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
	 * �ǽ����� 2 4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ� 1) 1 ~ 16���� ���� ���ʴ�� �����ϼ���. 2) ����� ������ ���ʴ��
	 * ����ϼ���.
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
	 * �ǽ����� 3 4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ� 1) 16 ~ 1�� ���� ���� �Ųٷ� �����ϼ���. 2) ����� ������ ���ʴ��
	 * ����ϼ���.
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

	/* �ǽ����� 4
	4�� 4�� 2���� �迭�� �����Ͽ�
	0�� 0������ 2�� 2�������� 1~10������ ������ ���� �� ���� ��
	�Ʒ��� ����ó�� ó���ϼ���.
	*/
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		final int LAST_ROW_INDEX = arr.length-1; //  ������ �� �ε���
		final int LAST_COL_INDEX = arr[0].length-1; //  ������ �� �ε���
		
		for(int row=0 ; row<LAST_ROW_INDEX ; row++) {
			for(int col=0 ; col<LAST_COL_INDEX ; col++) {
				
				// 1~10 ���� ������ �߻����� 2���� �迭 ��ҿ� ����
				arr[row][col] = (int)(Math.random() * 10 + 1);
				
				// ���� ���԰� ���ÿ� �� �� ������ �� �ε����� ���� �� ����
				arr[row][LAST_COL_INDEX] += arr[row][col]; 
				
				// ���� ���԰� ���ÿ� �� �� ������ �� �ε����� ���� �� ����
				arr[LAST_ROW_INDEX][col] += arr[row][col];
			}
		}
		
		//arr[3][3] += arr[0][3] + arr[1][3] + arr[2][3];
		//arr[3][3] += arr[3][0] + arr[3][1] + arr[3][2];
		
		// ��¿� 2�� for��
		for(int row=0 ; row<arr.length ; row++) {
			for(int col=0 ; col<arr[row].length ; col++) {
				System.out.printf("%4d",  arr[row][col]);
				
				// 2�� for�� �ݺ� �� ������ �� �Ǵ� ���� ������ ���
				if(row == LAST_ROW_INDEX || col == LAST_COL_INDEX) {
					
					// ������ ��, �� ��° ��Ҵ� �������� �ʰ� �ϱ� ���� ���ǹ�
					if(!(row == LAST_ROW_INDEX && col == LAST_COL_INDEX) ) { 
						arr[LAST_ROW_INDEX][LAST_COL_INDEX] += arr[row][col];
					}
				}
			}
			System.out.println();
		}
	}

	/* �ǽ����� 5 
	 * 2���� �迭�� ��� ���� ũ�⸦ ����ڿ��� ���� �Է¹޵�, 
	 * 1~10���� ���ڰ� �ƴϸ� ���ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.�� 
	 * ��� �� �ٽ� ������ �ް� �ϼ���. 
	 * ũ�Ⱑ ������ ������ �迭 �ȿ��� 
	 * ���� �빮�ڰ� �������� ���� �� �� ����ϼ���.
	 * (char���� ���ڸ� ���ؼ� ���ڸ� ǥ���� �� �ְ� 65�� A�� ��Ÿ��, ���ĺ��� �� 26����)
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("�� ũ�� : ");
			int rowSize = sc.nextInt();
			System.out.print("�� ũ�� : ");
			int colSize = sc.nextInt();

			if ((rowSize < 1 && rowSize > 10) || (colSize < 1 && colSize > 10)) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");

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

	/* �ǽ����� 6 
	 * ����ڿ��� ���� ũ�⸦ �Է� �ް� �� ����ŭ�� �ݺ��� ���� 
	 * ���� ũ�⵵ �޾� ������ ���� �迭�� ���� �� �Ҵ��ϼ���. 
	 * �׸��� �� �ε����� ��a������ �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.
	 */

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ũ�� : ");
		int rowSize = sc.nextInt();

		char[][] arr = new char[rowSize][];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "���� ũ�� : ");
			int colSize = sc.nextInt();

			arr[i] = new char[colSize];
		}

		// �� �ʱ�ȭ
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
	
	/* �ǽ����� 7
	1���� ���ڿ� �迭�� �л� �̸� �ʱ�ȭ�Ǿ� �ִ�.
	3�� 2�� ¥�� 2���� ���ڿ� �迭 2���� ���� ���� �� �Ҵ��Ͽ�
	�л� �̸��� 2���� �迭�� ������� �����ϰ� �Ʒ��� ���� ����Ͻÿ�.
	(ù ��° 2���� �迭�� ��� ����� ��� �� ��° 2���� �迭�� ���� ����)
	*/
	public void practice7() {
		String[] students = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		int count = 0;
		// 1�д��� ������ 2�д��� ���۵� ���� �̾ �����ϱ� ������
		// �л��� �̾ �� �� �ֵ��� count ���� ����

		// 1�д� �л� ����
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = students[count++];
			}
		}

		// 2�д� �л� ����
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = students[count++];
			}
		}

		// ���
		System.out.println("== 1�д� ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2�д� ==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}

	}

	/* �ǽ����� 8
	�� �������� �ڸ� ��ġ�� ���� ������ �л� �̸��� �˻��Ͽ�
	�ش� �л��� ��� �ڸ��� �ɾҴ��� ����ϼ���.
	*/
	public void practice8() {
		String[] students = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		int count = 0;
		// 1�д��� ������ 2�д��� ���۵� ���� �̾ �����ϱ� ������
		// �л��� �̾ �� �� �ֵ��� count ���� ����

		// 1�д� �л� ����
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = students[count++];
			}
		}

		// 2�д� �л� ����
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = students[count++];
			}
		}

		// ���
		System.out.println("== 1�д� ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2�д� ==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==================================");

		Scanner sc = new Scanner(System.in);

		System.out.print("�˻��� �л� �̸��� �Է��ϼ���: ");
		String name = sc.nextLine();

		String part = ""; // �д�
		int row = 0; // ���° ��
		String col = ""; // ���� ������

		for (int i = 0; i < seat1.length; i++) {

			for (int j = 0; j < seat1[i].length; j++) {

				if (seat1[i][j].equals(name)) {

					part = "1�д�";
					row = i + 1;

					if (j == 0) {
						col = "����";
					} else {
						col = "������";
					}
				}
			}
		}

		for (int i = 0; i < seat2.length; i++) {

			for (int j = 0; j < seat2[i].length; j++) {

				if (seat2[i][j].equals(name)) {

					part = "2�д�";
					row = i + 1;

					if (j == 0) {
						col = "����";
					} else {
						col = "������";
					}
				}
			}
		}

		if (part.equals("")) {
			System.out.println("�˻��Ͻ� �л��� �����ϴ�.");
		} else {
			System.out.println("�˻��Ͻ� " + name + " �л��� " + part + " " + row + "��° �� " + col + "�� �ֽ��ϴ�.");
		}

	}

	/* �ǽ����� 9
	String 2���� �迭 6�� 6���� ����� ���� �� ���� ���� �� ���� �� �ε����� �����ϼ���.
	�׸��� ����ڿ��� ��� ���� �Է� �޾� �ش� ��ǥ�� ���� 'X'�� ��ȯ�� 2���� �迭�� ����ϼ���.
	*/
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[][] board = new String[6][6]; // char�� 5�� 5�� 2���� �迭 ����

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}

		for (int i = 0; i < board.length - 1; i++) {
			board[0][i + 1] = i + "";
			board[i + 1][0] = i + "";
		}

		System.out.print("�� �ε��� �Է� : ");
		int rowIndex = sc.nextInt();

		System.out.print("�� �ε��� �Է� : ");
		int colIndex = sc.nextInt();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i == rowIndex && j == colIndex) { // ����ڰ� �Է��� ��� ���� �ε��� ���� ���� ��
					board[i + 1][j + 1] = "X";
				}
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	// �ǽ� ���� 10
	// �ǽ�����9�� ������ ������ �� �Է� �� 99�� �Էµ��� ������ ���� �ݺ��� �ǵ��� �����ϼ���.
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		String[][] board = new String[6][6]; // char�� 5�� 5�� 2���� �迭 ����

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
			System.out.print("�� �ε��� �Է� : ");
			rowIndex = sc.nextInt();

			if (rowIndex != 99) {
				System.out.print("�� �ε��� �Է� : ");
				colIndex = sc.nextInt();

				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						if (i == rowIndex && j == colIndex) { // ����ڰ� �Է��� ��� ���� �ε��� ���� ���� ��
							board[i + 1][j + 1] = "X";
						}
						System.out.print(board[i][j] + " ");
					}
					System.out.println();
				}
			}
		} while (rowIndex != 99);
		System.out.println("���α׷� ����");
	}

}
