package edu.kh.variable.ex.service;

import java.util.Scanner;

public class B_KeyboardInput {

	// Scanner Ŭ���� ����ϱ�
	public void inputExample1() {

		// Scanner Ŭ����
		// Ű����� ���� ����, �Ǽ�, ���ڿ��� �Է¹޴� ����� �����ϴ� Ŭ����
		// java.util ��Ű���� ������.

		// Scanner ��ü ����
		Scanner sc = new Scanner(System.in);
		// System.in : Ű���尡 �⺻������ �����Ǿ�����.

		// �̸��� �Է¹޾� ������ ������ ����
		String inputName;

		// �ܼ�â�� "�̸��� �Է����ּ��� : " ���ڿ� ���
		System.out.print("�̸��� �Է����ּ��� : ");

		// Scanner�� �̿��Ͽ� �̸��� �Է� �޾� inputName�� ����.
		inputName = sc.next();
		// sc.next() : ����ڰ� �Է��� ���� �ܾ �о��(�Է� ����);
		// --> Ű���� �Է� �� ���� �Ǵ� ���͵Ǳ� ���� ������ �о��.

		// "OOO�� ȯ���մϴ�." ���
		System.out.println(inputName + "�� ȯ���մϴ�.");
	}

	// ������ �Է� �ޱ�
	public void inputExample2() {
		// �̸�, ����, Ű�� �Է� �޾� ������ ������ ��
		// "OOO���� XX�� �̸�, Ű�� @@@.@@@cm �Դϴ�." �� ���

		// 1. �Է��� ���� Scanner ��ü ����
		Scanner sc = new Scanner(System.in);

		// 2. "�̸� �Է� : " ������ ����� ��
		// Ű����� �̸��� �Է� �޾� ������ ����
		System.out.print("�̸� �Է� : ");
		String inputName = sc.next();

		// 3. "���� �Է� : " ������ ����� ��
		// Ű����� ���̸� �Է¹޾� ������ ����
		System.out.print("���� �Է� : ");
		int inputAge = sc.nextInt();
		// sc.nextInt() : ����ڰ� �Է��� ���� ������ �о��.

		// 4. "Ű �Է� : " ������ ����� ��
		// Ű����� Ű�� �Է¹޾� ������ ����
		System.out.print("Ű �Է� : ");
		double inputHeight = sc.nextDouble();
		// sc.nextDouble() : ����ڰ� �Է��� ���� �Ǽ��� �о��.

		// 5. "OOO���� XX�� �̸�, Ű�� @@@.@@@cm �Դϴ�." �� ���
		System.out.println(inputName + "���� " + inputAge + "�� �̸�, Ű�� " + inputHeight + "cm �Դϴ�.");
	
	
	}

	
	// ������ �Է� �ޱ�
	public void inputExample3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸�, ����, Ű �Է� : ");
		String inputName = sc.next();
		int inputAge = sc.nextInt();
		double inputHeight = sc.nextDouble();

		System.out.println("\"" + inputName + "\"���� " + inputAge + "�� �̸�, Ű�� " + inputHeight + "cm �Դϴ�.");
	}

	
	
	

}
