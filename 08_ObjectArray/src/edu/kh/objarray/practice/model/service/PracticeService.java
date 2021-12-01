package edu.kh.objarray.practice.model.service;

import java.util.Scanner;

import edu.kh.objarray.practice.model.vo.Student;

public class PracticeService {

	public void start() {
		// 1) 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		Student[] students = new Student[10];
							// Student 참조변수 10개를 묶어둔 배열 생성
		
		
		// 2)while문을 사용하여 학생들의 정보를 계속 입력 받고
		Scanner sc = new Scanner(System.in);
		
		// 한 명씩 추가 될 때마다 카운트함
		int count = 0;
		
		while(true) {
			
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			
			System.out.print("반 : ");
			int classroom = sc.nextInt(); 
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			
			students[count] = new Student(grade, classroom, name, kor, eng, math);
			count++;
			
			if(count == 10) {
				// 10명 모두 입력된 경우 더 이상 학생 정보를 입력하지 못하도록 반복을 종료
				break;
			}
			
			// 계속 추가할 것인지 물어보고, ‘y’이면 계속 객체 추가
			// 3) 10명을 입력한 경우 모두 입력하거나, 계속 추가할 것인지 물어볼 때 ‘n’을 입력한 경우
			// 학생 정보 입력을 멈춤
			// 4) 'y' 또는 'n'을 입력하지 않은 경우
			// "잘못 입력하셨습니다. 다시 입력해 주세요" 출력 후
			// 다시 계속 추가할지 여부를 물어봄.
			
			char input = ' ';
			while( !(input == 'y' || input == 'n')  ) { // 'y' 또는 'n'이 아닐 때 true
				//  input != 'y' && input != 'n'
				
				System.out.print("계속 입력 하시겠습니까 ? (y/n) :");
				input = sc.next().charAt(0);
				
				if( !(input == 'y' || input == 'n') ) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
				}
			}
			
			if(input == 'n') { // 'n'이 입력된 경우 더 이상 학생 정보를 입력 받지 않도록 반복을 멈춤
				break;
			}
			
		}
		
		
		// 5) 입력된 모든 학생들의 정보 + 평균 점수를 출력
		// 1. 일반 for문 + count 이용 방법
		/*
		for(int i=0 ; i<count ; i++) {
			
			int avg = (students[i].getKor() + students[i].getEng() + students[i].getMath() )
						/ 3;
			
			System.out.println(students[i].toString() + ", 평균 : " + avg);
		}
 		*/
		// 2. 향상된 for문 + break 이용 방법
		for(Student std : students ) {
			// 향상된 for문 : 배열 요소 처음부터 끝까지 순차 접근하며 반복
			
			if(std == null) { // NullPointerException 방지
				// 배열에서 순차적으로 얻어온 값이 null인 경우
				break;
			}
			
			int avg = (std.getKor() + std.getEng() + std.getMath() )/ 3;
		
			System.out.println(std.toString() + ", 평균 : " + avg);
		}
		
	}
}
