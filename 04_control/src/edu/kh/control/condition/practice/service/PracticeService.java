package edu.kh.control.condition.practice.service;

import java.util.Scanner;

public class PracticeService {

	/*
	 * �ǽ����� 6 �߰����, �⸻���, ��������, �⼮Ƚ���� �Է��ϰ� Pass �Ǵ� Fail�� ����ϼ���. �� ������ �߰���� 20%,
	 * �⸻��� 30%, ���� 30%, �⼮ 20%�� �̷���� �ְ� �� ��, �⼮ ������ �⼮ Ƚ���� �� ���� Ƚ�� 20ȸ �߿��� �⼮�� ����
	 * ���� ������ ����ϼ���. 70�� �̻��� ��� Pass, 70�� �̸��̰ų� ��ü ���ǿ� 30% �̻� �Ἦ �� Fail�� ����ϼ���.
	 */

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�߰� ��� ���� : ");
		int midTerm = sc.nextInt();

		System.out.print("�⸻ ��� ���� : ");
		int finalTerm = sc.nextInt();

		System.out.print("���� ���� : ");
		int homework = sc.nextInt();

		System.out.print("�⼮ Ƚ�� : ");
		int attendance = sc.nextInt();

		// ���� ������ �����Ͽ� ���� ������ ����
		double mid = midTerm * 0.2;
		double fin = finalTerm * 0.3;
		double hw = homework * 0.3;
		double att = attendance * 5 * 0.2;

		System.out.println("=============== ��� ===============");
		if (attendance >= 20 * 0.7) {
			
			double total = mid + fin + hw + att; // ������ ����� ���� �հ�
			
			// ������ ����� ���� ���
			System.out.println("�߰� ��� ����(20) : " + mid);
			System.out.println("�⸻ ��� ����(30) : " + fin);
			System.out.println("���� ����(30) : " + hw);
			System.out.println("�⼮ ����(20) : " + att);
			System.out.println("���� : " + total);
			
			if(total >= 70) { // �⼮ ����, pass
				System.out.println("PASS");
			} else { // �⼮ ����, ���� �̴� fail
				System.out.println("FIAL [���� �̴�]");
			}
			
		} else {
			// �⼮ Ƚ�� ����
			System.out.printf("FAIL [�⼮ Ƚ�� ����] (%d/20)\n", attendance);
		}
	}
	
	
	
}
