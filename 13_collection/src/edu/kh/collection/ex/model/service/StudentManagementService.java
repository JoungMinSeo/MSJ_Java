package edu.kh.collection.ex.model.service;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.ex.model.vo.Student;

public class StudentManagementService {

	private Scanner sc = new Scanner(System.in);
	
	private List<Student> stdList = new LinkedList<Student>();
	// ArrayList, LinkedList, Vetor ��
	// ��� List�� ������ �ڽ� Ŭ������ ������ �޼ҵ带 ������ �ִ�.
	// == �θ�Ÿ�� ���������� �����ϰ� �ִ� ��� �ڽİ�ü�� ��ȯ�� ����.
	//  (�������̽� + ������ ��뼺 ��Ÿ���� ����)
	
	public void displayMenu() {
		
		int sel = 0;
		
		do {
			
			System.out.println("======== �л� ���� ���α׷� ========");
			System.out.println("1. �л� ��ü ��ȸ");
			System.out.println("2. �л� ���� �߰�"); // �̸�, ����, �г�
			System.out.println("3. �л� ���� ����"); // �̸�, ����, �г�
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �̸� �˻�");
			System.out.println("0. ����");
			
			System.out.print("�޴� ���� >> ");
			
			try {
				sel = sc.nextInt();
				sc.nextLine(); // ���๮�� ����
			
				
				switch(sel) {
				case 1 : selectAll(); break;
				case 2 : addStudent(); break;
				case 3 : updateStudent(); break;
				case 4 : deleteStudent(); break;
				case 5 : break;
				case 0 : System.out.println("���α׷� ����"); break;
				default : System.out.println("�޴��� �ִ� ��ȣ�� �Է����ּ���.");
				
				}

				
			}catch (InputMismatchException e) {
				System.out.println("������ �Է����ּ���.");
				sel = -1; // �� ó�� sel == 0 �ΰ�� �ٷ� ����Ǵ� ���� ����
				sc.nextLine(); // �Է¹��ۿ� �����ִ� �߸� �Է��� ���� ����
			}
			
		}while(sel != 0);
		
	}
	
	
	// 1. �л� ��ü ��ȸ
	private void selectAll() {
		System.out.println("[�л� ��ü ��ȸ]");
		
		// stdList�� �л� ������ ������
		// "�Էµ� �л��� �����ϴ�" ���
		
		// stdList�� �л� ������ ������
		// "1�� (�̸�) (����) (�г�)"
		// "2�� (�̸�) (����) (�г�)"
		// "3�� (�̸�) (����) (�г�)"
		// ...
		
		if( stdList.isEmpty() ) { // stdList�� ������� ��
			System.out.println("�Էµ� �л��� �����ϴ�.");
			
		} else {
			for(int i=0 ; i<stdList.size(); i++) {
				
				// stdList�� i��° �ε��� ��Ҹ� ���� s ���������� ����
				Student s = stdList.get(i);
				
				// "1�� (�̸�) (����) (�г�)"
				System.out.printf("%d��° %s %d %d\n", 
								i+1, s.getName(), s.getAge(), s.getGrade());
			}
		}
	}
	
	
	// 2. �л� ���� �߰�
	private void addStudent() throws InputMismatchException {
		System.out.println("[�л� ���� �߰�]");
		
		// �л� ������ �Է� �޾� stdList�� �߰�
		stdList.add( createStudent() );
	}
	
	
	// 3. �л� ���� ����
	private void updateStudent() throws InputMismatchException {
		System.out.println("[�л� ���� ����]");
		
		// �� �� �ε����� �������� �Է� �ް�
		// �Է� ���� �ε����� stdList ���� �� ������ Ȯ���Ͽ�
		// ������ �л� ������ �Է� �޾� 
		// �Է� ���� �ε�����° �л� ������ ����
		System.out.print("������ �ε��� �Է� : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if(!stdList.isEmpty() &&  index >= 0 && index < stdList.size()) {
			// stdList�� ������� �ʰ�, index�� stdList ���� �� ���� ���
			
			Student s = createStudent(); // �л� �ϳ� ����
			stdList.set(index, s);
			
			System.out.println("�����Ǿ����ϴ�.");
	
		}else {
			System.out.println("�л� ������ ���ų�, �ε����� �߸� �ԷµǾ����ϴ�.");
		}
		
	}
	
	
	// 2,3�� ���� ��� : �л� ������ �Է� �޾� �л� ��ü ���� �� ��ȯ�ϱ�
	private Student createStudent() throws InputMismatchException{
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("���� : ");
		int age = sc.nextInt(); 
		
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		sc.nextLine();
	
		return new Student(name, age, grade);
	}
	
	
	private void deleteStudent() throws InputMismatchException {
		System.out.println("[�л� ���� ����]");
		
		System.out.print("������ �ε��� �Է� : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if( !stdList.isEmpty() && index >=0 && index < stdList.size()) {
			
			System.out.println( stdList.remove(index) + " �����Ǿ����ϴ�." );
		}else {
			System.out.println("�л� ������ ���ų�, �ε����� �߸� �ԷµǾ����ϴ�.");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
