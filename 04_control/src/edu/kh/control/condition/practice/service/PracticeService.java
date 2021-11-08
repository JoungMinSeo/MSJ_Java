package edu.kh.control.condition.practice.service;

import java.util.Scanner;

public class PracticeService {

	/*
	 * 실습문제 6 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요. 평가 비율은 중간고사 20%,
	 * 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고 이 때, 출석 비율은 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만
	 * 따진 값으로 계산하세요. 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
	 */

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		int midTerm = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int finalTerm = sc.nextInt();

		System.out.print("과제 점수 : ");
		int homework = sc.nextInt();

		System.out.print("출석 횟수 : ");
		int attendance = sc.nextInt();

		// 점수 비율을 적용하여 별도 변수에 저장
		double mid = midTerm * 0.2;
		double fin = finalTerm * 0.3;
		double hw = homework * 0.3;
		double att = attendance * 5 * 0.2;

		System.out.println("=============== 결과 ===============");
		if (attendance >= 20 * 0.7) {
			
			double total = mid + fin + hw + att; // 비율이 적용된 점수 합계
			
			// 비율이 적용된 점수 출력
			System.out.println("중간 고사 점수(20) : " + mid);
			System.out.println("기말 고사 점수(30) : " + fin);
			System.out.println("과제 점수(30) : " + hw);
			System.out.println("출석 점수(20) : " + att);
			System.out.println("총점 : " + total);
			
			if(total >= 70) { // 출석 만족, pass
				System.out.println("PASS");
			} else { // 출석 만족, 점수 미달 fail
				System.out.println("FIAL [점수 미달]");
			}
			
		} else {
			// 출석 횟수 부족
			System.out.printf("FAIL [출석 횟수 부족] (%d/20)\n", attendance);
		}
	}
	
	
	
}
