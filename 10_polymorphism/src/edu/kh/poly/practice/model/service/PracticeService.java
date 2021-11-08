package edu.kh.poly.practice.model.service;

import java.util.Scanner;

import edu.kh.poly.practice.model.vo.Employee;
import edu.kh.poly.practice.model.vo.Person;
import edu.kh.poly.practice.model.vo.Student;

public class PracticeService implements QuestionInterface{

	private Scanner sc = new Scanner(System.in);
	
	private Person[] pArr = new Person[3]; 
				// Person ��ü �������� 3���� ���޾� �پ��ִ� �迭
				// �߻� Ŭ������ ���������δ� ��� ����

	@Override
	public void displayMenu() {
		
		int sel = 0;
		
		do {
			System.out.println("===== ���� ���� =====");
			System.out.println("1. Person �迭 pArr�� �л� �Ǵ� ���� ����ϱ�.");
			System.out.println("2. pArr �迭�� ����Ǿ��ִ� ��� ��� ����ϱ�.");
			System.out.println("3. pArr�迭���� �л� ������ ����ϱ�");
			System.out.println("4. pArr�迭���� ���� ������ ����ϱ�");
			System.out.println("5. pArr�迭���� �Է� ���� �̸��� ���� ��� ������ ���� ����ϱ�");
			System.out.println("6. ��� ����� �̸��� �� �ٷε� ���ڿ��� ���� ����ϱ�");
			System.out.println("7. ��� ����� ���� �հ�, �ְ�/���� ���� ����ϱ�");
			System.out.println("8. Ư�� �ε����� �ִ� ����� ������ �����ϰ�, ������ ��� ������ ���� ����ϱ�");
			System.out.println("9. �迭 ũ�⸦ 1ĭ �ø���, �þ ĭ�� ���ο� �л� �Ǵ� ���� ����ϱ�");
			System.out.println("0. ����");
			
			System.out.print("�޴� ���� >> ");
			sel = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (sel) {
			case 1: insertPerson(); break;
			case 2: selectAll(); break;
			case 3: selectStudent(); break;
			case 4: selectEmployee(); break;
			case 5:   
				Person searchPerson = searchName();  
			//  Person ��ü ���� ����  =   Person��ü �ּ� �Ǵ� null ��ȯ
				
				if(searchPerson == null) {
					System.out.println("��ġ�ϴ� �̸��� ����� �����ϴ�.");
				}else {
					System.out.println(searchPerson);
				}
			
			break;
			
			case 6: System.out.println( printName() );  break;
			case 7: printAge(); break;
			
			case 8: 
				Person dp = deletePerson();
				if(dp != null) {
					System.out.println(dp + " ������ �����Ǿ����ϴ�.");
				}else {
					System.out.println("�ش� �ε����� ������ ��� ������ �����ϴ�.");
				}
				
				break;
				
			case 9:  addPerson();break;
			case 0: System.out.println("���α׷� ����"); break;

			
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
			
			
		}while(sel != 0);
		
	}
	
	
	// 1. Person �迭 pArr�� �л� �Ǵ� ���� ����ϱ�.
	// -> ���� 1�� �Է� ������ �л� ��ü�� ������ �迭��ҿ� ����
	// -> ���� 2�� �Է� ������ ���� ��ü�� ������ �迭 ��ҿ� ����
	@Override
	public void insertPerson() {
		
		for(int i=0 ; i<pArr.length ; i++) {
			
			System.out.print("1.�л� / 2.���� (����) : ");
			int sel = sc.nextInt();
			sc.nextLine();
			
			if(sel == 1) { // �л� ����(�̸�, ����, �г�, ��) �Է� �ޱ�
				System.out.println("=== �л� ���� �Է� ===");
				
				System.out.print("�̸� : ");
				String name = sc.next();
				
				System.out.print("���� : ");
				int age = sc.nextInt();
				
				System.out.print("�г� : ");
				int grade = sc.nextInt();
				
				System.out.print("�� : ");
				int classroom = sc.nextInt();
				
				pArr[i] = new Student(name, age, grade, classroom);
			//  Person ��������   =  Student ��ü (������ ��ĳ����)
				
			}else if(sel == 2) { // ���� ����(�̸�, ����, ���, ����, �޿�) �Է� �ޱ�
				System.out.println("=== ���� ���� �Է� ===");
				
				System.out.print("�̸� : ");
				String name = sc.next();
				
				System.out.print("���� : ");
				int age = sc.nextInt();
				
				System.out.print("��� : ");
				int empNo = sc.nextInt();
				
				System.out.print("���� : ");
				String position = sc.next();
				
				System.out.print("�޿�: ");
				int salary = sc.nextInt();
				sc.nextLine();
				
				pArr[i] = new Employee(name, age, empNo, position, salary);
				
			} else { // 1,2 �� �ƴ� �ٸ� ���ڸ� �Է��� ���
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 1 �Ǵ� 2�� �Է����ּ���.");
				i--; // for���� i++�� ���� i���� �������� ���ϵ��� �ݴ�� 1�� ����
			}
		}
	}
	
	// 2.pArr �迭�� ����Ǿ��ִ� ��� ��� ����ϱ�.
	// �迭��ҿ� ���� �Էµ��� ���� ��� "�迭��ҿ� ����� ������ �����ϴ�."
	@Override
	public void selectAll() {
		
		// ���� for�� : �� �ݺ����� �迭 ��Ҹ� ���������� �ϳ��� ���� 
		// ��������(Person p)�� ���� ���� �����ؼ� for�� ���ο��� ���
		for(Person p : pArr) {
			// p = pArr[0]; // �ּҸ� ����� (���� ����)
			// p = pArr[1];
			// p = pArr[2];
			
			if(p != null) { // �迭��Ұ� �����ϴ� �ּҰ� �ִٸ�
				System.out.println(p);
			}else {
				System.out.println("�迭��ҿ� ����� ������ �����ϴ�.");
			}
		}
	}
	
	
	// 3. pArr�迭���� �л� ������ ����ϱ�
	@Override
	public void selectStudent() {
		
		int count = 0; // ��µ� �л� ���� ���� ����
		
		for(Person p : pArr) {
			if(p != null &&  p instanceof Student) {
				// p�� null�� �ƴϰ�(�����ϴ� ��ü �ּ� ����)
				// p�� �����ϴ� ��ü�� Student�� ��
				
				System.out.println(p);
				count++;
			}
		}
		
		if(count == 0) { // count�� 0�̴� == �л� ������ �ѹ��� ��µ��� �ʾҴ�.
			System.out.println("�л� ������ �����ϴ�.");
		}
		
		
	}
	
	
	// 4. pArr�迭���� ���� ������ ����ϱ�
	@Override
	public void selectEmployee() {
		int count = 0; // ��µ� �л� ���� ���� ����
		
		for(Person p : pArr) {
			if(p != null &&  p instanceof Employee) {
				// p�� null�� �ƴϰ�(�����ϴ� ��ü �ּ� ����)
				// p�� �����ϴ� ��ü�� Student�� ��
				
				System.out.println(p);
				count++;
			}
		}
		
		if(count == 0) { // count�� 0�̴� == �л� ������ �ѹ��� ��µ��� �ʾҴ�.
			System.out.println("���� ������ �����ϴ�.");
		}
	}

	// 5. pArr�迭���� �Է� ���� �̸��� ���� ��� ������ ���� ����ϱ�
	@Override
	public Person searchName() {
		// Person��ü ���� �ּҸ� ��ȯ == Person �ڷ��� ��ȯ
		
		System.out.print("�˻��� �̸� �Է� : ");
		String inputName = sc.next();
		
		for(Person p : pArr) { // ���� for������ �迭 ��Ҹ� �ϳ��� �����ͺ�
			
			if(  p != null &&  inputName.equals(p.getName())  ) {
				// �迭 ��� ���� null�� �ƴϰ�
				// inputName�� ���� �迭 ����� name ���� ���� ��
				return p;
			}
		}
		
		return null;
	}

	// 6. ��� ����� �̸��� �� �ٷε� ���ڿ��� ���� ����ϱ�
	// ex)
	// ȫ�浿, �ڿ���, ��ö��
	@Override
	public String printName() {
		
		String result = ""; // ���ڿ�
		
		for(int i=0 ; i<pArr.length ; i++) {
			
			if(pArr[i] != null) { // pArr[i]�� �����ϴ� ��ü�� ���� ���
				result += pArr[i].getName();
				
				if(i < pArr.length -1) {
					// pArr.length -1 == 3 - 1 == 2
					// i < 2 == 0, 1
					// �ε��� 0�� 1�� ���� ������ ���ڿ� ���� ", " �� �߰�
					result += ", ";
				}
			}
		}
		//result == ȫ�浿, �ڿ���, ��ö��
		
		return result;
	}


	// 7. ��� ����� ���� �հ�, �ְ�/���� ���� ����ϱ�
	// ex)
	// ��� ����� ���� �� : 100
	// �ְ� ���� : 50
	// ���� ���� : 20
	@Override
	public void printAge() {
		
		int sum = 0;					// �հ� ���� ����
		int max = -1;		// �ִ밪 ���� ����
		int min = 10000;	// �ּҰ� ���� ����
		
		for(Person p : pArr) {
			
			if( p != null ) {
				
				// �հ� ����
				sum += p.getAge();
				
				// �ִ밪 ��
				if( p.getAge() > max ) {
					max = p.getAge();
				
					// �ּҰ� ��
				} else if( p.getAge() < min ) {
					min = p.getAge();
				}
			}
		}
		
		System.out.println("��� ����� ���� �� : " + sum);
		System.out.println("�ְ� ����  : " + max);
		System.out.println("���� ����  : " + min);
		
	}

	// 8. Ư�� �ε����� �ִ� ����� ������ �����ϰ�, 
	// ������ ��� ������ ���� ����ϱ� 
	// ex) 
	// ������ �ε��� : 0
	// ȫ�浿 / 20 / 3 / 5 ������ �����Ǿ����ϴ�.
	@Override
	public Person deletePerson() {
		
		// ��� ���� ���� == Person ��ü�� ���� == Person ��ü�� �������� ���� == null
		
		System.out.print("������ �ε��� : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		// pArr �迭���� �Էµ� �ε��� ��Ҵ� null ���ؾ� ������
		// ��ȯ�� �Ǿ� �Ǳ� ������ null�� �ٲٱ� �� �ٸ� ���������� ����
		
		Person p = null; // ��ȯ�� ���� �ӽ� Person ���� ����
		
		if( index >= 0 && index < pArr.length) {
			// �Էµ� index�� �迭 �ε��� ���� ���� ���� ���
			
			if( pArr[index] != null ) {
				// pArr[index] ��Ұ� �����ϴ� �ּҰ��� ����Ǿ� ���� ���
				
				p = pArr[index]; // �ӽ� Person ���� ������ ������ index �ּҸ� ����
				pArr[index] = null; // �Էµ� index ��° ��Ҹ� null�� ��ȯ
			}
			
		}
		
		return p; // �ӽ� ���� ������ ��ȯ
	}

	
	// 9. �迭 ũ�⸦ 1ĭ �ø���, �þ ĭ�� ���ο� �л� �Ǵ� ���� ����ϱ�
	@Override
	public void addPerson() {
		
		// �迭�� ���� : �ڷ����� 1��, �ѹ� ������ �迭 ũ�⸦ ��ȭ�� �� ����.
		
		// 1) ���� �迭 pArr���� ũ�Ⱑ 1 �� ū ���ο� �迭 ����
		Person[] newArr = new Person[pArr.length + 1];
		
		// 2) ���� pArr �迭 ����� ���� ���� �ε��� newArr ��ҿ� ���� (���� ����)
		/*for(int i=0 ; i<pArr.length ; i++) {
			newArr[i] = pArr[i];
		}*/
		
		System.arraycopy(pArr, 0, newArr, 0, pArr.length);
		
		// 3) pArr ���������� newArr �������� ���� ����
		//   == pArr�� ���ο� �迭�� �ּҸ� ���� (���� ����)
		pArr = newArr;
		
		int sel = 0; // ��ȣ ���ÿ� ����
		
		do {
			// ���ο� �л� �Ǵ� ���� ���
			System.out.print("1.�л� / 2.���� (����) : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			
			if(sel == 1) { // �л� ����(�̸�, ����, �г�, ��) �Է� �ޱ�
				System.out.println("=== �л� ���� �Է� ===");
				
				System.out.print("�̸� : ");
				String name = sc.next();
				
				System.out.print("���� : ");
				int age = sc.nextInt();
				
				System.out.print("�г� : ");
				int grade = sc.nextInt();
				
				System.out.print("�� : ");
				int classroom = sc.nextInt();
				sc.nextLine();
				
				pArr[newArr.length - 1] = new Student(name, age, grade, classroom);
				
			}else if(sel == 2) { // ���� ����(�̸�, ����, ���, ����, �޿�) �Է� �ޱ�
				System.out.println("=== ���� ���� �Է� ===");
				
				System.out.print("�̸� : ");
				String name = sc.next();
				
				System.out.print("���� : ");
				int age = sc.nextInt();
				
				System.out.print("��� : ");
				int empNo = sc.nextInt();
				
				System.out.print("���� : ");
				String position = sc.next();
				
				System.out.print("�޿�: ");
				int salary = sc.nextInt();
				sc.nextLine();
				
				pArr[newArr.length - 1] = new Employee(name, age, empNo, position, salary);
				
			}else { // �ٸ� ���ڸ� �Է��� ���
				System.out.println("�߸��Է��ϼ̽��ϴ�. ");
			}
			
		}while( !(sel == 1 || sel == 2) );
		// 1 �Ǵ� 2�� �ƴ� �� true --> �ݺ�
		
		
	}
	
	
	
	
	
	
	
}
