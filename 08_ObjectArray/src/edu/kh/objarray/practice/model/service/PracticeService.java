package edu.kh.objarray.practice.model.service;

import java.util.Scanner;

import edu.kh.objarray.practice.model.vo.Student;

public class PracticeService {

	public void start() {
		// 1) �ִ� 10���� �л� ������ ����� �� �ְ� �迭�� �Ҵ��Ѵ�.
		Student[] students = new Student[10];
							// Student �������� 10���� ����� �迭 ����
		
		
		// 2)while���� ����Ͽ� �л����� ������ ��� �Է� �ް�
		Scanner sc = new Scanner(System.in);
		
		// �� �� �߰� �� ������ ī��Ʈ��
		int count = 0;
		
		while(true) {
			
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			
			System.out.print("�� : ");
			int classroom = sc.nextInt(); 
			
			System.out.print("�̸� : ");
			String name = sc.next();
			
			System.out.print("�������� : ");
			int kor = sc.nextInt();
			
			System.out.print("�������� : ");
			int eng = sc.nextInt();
			
			System.out.print("�������� : ");
			int math = sc.nextInt();
			
			students[count] = new Student(grade, classroom, name, kor, eng, math);
			count++;
			
			if(count == 10) {
				// 10�� ��� �Էµ� ��� �� �̻� �л� ������ �Է����� ���ϵ��� �ݺ��� ����
				break;
			}
			
			// ��� �߰��� ������ �����, ��y���̸� ��� ��ü �߰�
			// 3) 10���� �Է��� ��� ��� �Է��ϰų�, ��� �߰��� ������ ��� �� ��n���� �Է��� ���
			// �л� ���� �Է��� ����
			// 4) 'y' �Ǵ� 'n'�� �Է����� ���� ���
			// "�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���" ��� ��
			// �ٽ� ��� �߰����� ���θ� ���.
			
			char input = ' ';
			while( !(input == 'y' || input == 'n')  ) { // 'y' �Ǵ� 'n'�� �ƴ� �� true
				//  input != 'y' && input != 'n'
				
				System.out.print("��� �Է� �Ͻðڽ��ϱ� ? (y/n) :");
				input = sc.next().charAt(0);
				
				if( !(input == 'y' || input == 'n') ) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				}
			}
			
			if(input == 'n') { // 'n'�� �Էµ� ��� �� �̻� �л� ������ �Է� ���� �ʵ��� �ݺ��� ����
				break;
			}
			
		}
		
		
		// 5) �Էµ� ��� �л����� ���� + ��� ������ ���
		// 1. �Ϲ� for�� + count �̿� ���
		/*
		for(int i=0 ; i<count ; i++) {
			
			int avg = (students[i].getKor() + students[i].getEng() + students[i].getMath() )
						/ 3;
			
			System.out.println(students[i].toString() + ", ��� : " + avg);
		}
 		*/
		// 2. ���� for�� + break �̿� ���
		for(Student std : students ) {
			// ���� for�� : �迭 ��� ó������ ������ ���� �����ϸ� �ݺ�
			
			if(std == null) { // NullPointerException ����
				// �迭���� ���������� ���� ���� null�� ���
				break;
			}
			
			int avg = (std.getKor() + std.getEng() + std.getMath() )/ 3;
		
			System.out.println(std.toString() + ", ��� : " + avg);
		}
		
	}
}
