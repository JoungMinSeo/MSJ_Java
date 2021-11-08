package edu.kh.objarray.practice.model.service;

import java.util.Scanner;

import edu.kh.objarray.practice.model.vo.Employee;

public class EmployeeService {

	private Employee[] employees = new Employee[3]; // ��� ������ ������ Employee �迭
	private Scanner sc = new Scanner(System.in); 

	
	public void displayMenu() {
		
		int sel = 0;
		do {
			
			System.out.println("=== ���� ���� ���α׷� ===");
			System.out.println("1. ���� ���� �Է�(3��)");
			System.out.println("2. ��� ���� ���� ���");
			System.out.println("3. Ư�� ���� ���� ���(�̸� �˻�)");
			System.out.println("4. Ư�� ���� �޿�/���� ���(��� �˻�)");
			System.out.println("5. ��� ���� �޿� ��/���� �� ���");
			System.out.println("6. ��� ������ �޿��� ���� ���� ������ �̸�, �μ�, �޿� ���");
			System.out.println("0. ����");
			System.out.print("�޴� ���� >> ");
			sel = sc.nextInt();
			sc.nextLine();
			
			switch (sel) {
			case 1: initEmployee(); break;
			case 2: System.out.println( allEmployeesInformation() ); break;
			case 3: System.out.println( searchEmployee() ); break;
			case 4: System.out.println(salaryCheck()); break;
			case 5: 
//				=== ��� ��� �޿� ��/���� �� ===
//				�� ���� �޿� �� : 10500000
//				�� ���� ���� �� : 126000000
				System.out.println("=== ��� ��� �޿� ��/���� �� ===");
				System.out.println("�� ���� �޿� �� : " + allSalaryCheck());
				System.out.println("�� ���� ���� �� : " + allSalaryCheck() * 12 );
				break;
			case 6: topSalaryEmployee(); break;
			case 0: System.out.println("���α׷� ����."); break;

			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}while(sel != 0);
		
	}
	
	// 3���� ���� ������ �Է¹޾� �迭�� �� ��ҿ� �ʱ�ȭ  
	public void initEmployee() {
		// ���, �̸�, �μ�, ����, �޿� ������ �Է¹ޱ�
		
		for(int i=0 ; i<employees.length ; i++) {
			System.out.println("=== " + (i+1) + "��° ��� ���� �Է� ===" );
			System.out.print("��� : ");
			int empNo = sc.nextInt();
			
			System.out.print("�̸� : ");
			String empName = sc.next();
			sc.nextLine(); // �Է� ���� ���๮�� ����
			
			System.out.print("�μ� : ");
			String department = sc.nextLine();
			
			System.out.print("���� : ");
			String position = sc.nextLine();
			
			System.out.print("�޿� : ");
			int salary = sc.nextInt();
			sc.nextLine(); // �Է� ���� ���๮�� ����
			
			System.out.println();
			
			employees[i] = new Employee(empNo, empName, department, position, salary);
		}
	}
	
	
	// ��� ���� ������ �ϳ��� ���ڿ��� ��ȯ
	public String allEmployeesInformation() {
		
		String result = ""; // �� ���ڿ� != null
		
		for(Employee emp : employees) {
			result += emp.toString() + "\n";
		}
		
		return result;
	}
	
	
	// Ư�� ��� ���� ��ȯ �޼ҵ�(�̸� �˻�)
	// ��ġ�ϴ� �̸��� ���� ��� "��ġ�ϴ� �̸��� ����� �����ϴ�." ��ȯ
	public String searchEmployee() {
		
		System.out.println("=== Ư�� ��� ���� ���(�̸� �˻�) ===");
		
		System.out.print("�̸� �Է� : ");
		String inputName = sc.next();
		
		for(Employee emp : employees) {
			
			if( emp.getEmpName().equals(inputName) ) {
				// �̸��� ��ġ�ϴ� ������ ���� ���
				return emp.toString();
				// return : �޼ҵ带 �����ϰ� �����ʿ� �ۼ��� ���� ȣ���� ������ ��ȯ
			}
		}
		
		// for�� ������ return�� �ȵ� ��� == �̸��� ��ġ�ϴ� ������ ���� ���
		return "��ġ�ϴ� �̸��� ����� �����ϴ�.";
	}
	
	
	// �Է¹��� ����� ��ġ�ϴ� ������ �޿�, ���� ���� ��ȯ(���� == �޿� * 12)
	// ��ġ���� �ʴ� ��� "����� ��ġ�ϴ� ���� �����ϴ�." ��ȯ
	public String salaryCheck() {
		System.out.println("=== �޿�/���� ��ȸ ===");
		
		System.out.print("��� �Է� : ");
		int inputEmpNo = sc.nextInt();
		sc.nextLine();
		
		for(Employee emp : employees) {
			
			if( emp.getEmpNo()  == inputEmpNo ) {
				// ����� ��ġ�ϴ� ������ ���� ���
				return "�޿� : " + emp.getSalary() + " ���� : " + emp.getSalary() * 12;
				// return : �޼ҵ带 �����ϰ� �����ʿ� �ۼ��� ���� ȣ���� ������ ��ȯ
			}
		}
		
		// for�� ������ return�� �ȵ� ��� == ����� ��ġ�ϴ� ������ ���� ���
		return "����� ��ġ�ϴ� ���� �����ϴ�.";
	}
	
	
	// ��� ��� �޿� �� ��ȯ
	public int allSalaryCheck() {
		
		int sum = 0;
		
		for(Employee emp : employees) {
			sum += emp.getSalary();
		}
		
		return sum;
	}
	
	
	// ��� ���� �� �޿��� ���� ���� ���� ���
	// (������ �޿��� ��� ����� ���� ����� ���)
	public void topSalaryEmployee() {
		
		int maxSalary = 0; // �ִ� �޿��� ����
		int empNo = 0; // �ִ� �޿��� �޴� ������ ����� ����
		
		// �ݺ����� �̿��ؼ� ��� ��� �� �޿��� ���� ���� ��� ã��
		for(Employee emp : employees) {
			if(emp.getSalary() > maxSalary  ) {
				// ���� ������ �޿��� �ռ� ����� �ִ� �޿����� Ŭ ���
				
				maxSalary = emp.getSalary();
				// �ִ� �޿��� ���� ������ �޿��� ����
				
				empNo = emp.getEmpNo();
				// �ִ� �޿��� �޴� ������ ����� ����
			
			} else if(emp.getSalary() == maxSalary) {
				// ���� ������ �޿��� �ִ� �޿��� ������ ���
				
				if(emp.getEmpNo() < empNo) {
					// ���� ���� ����� �ռ� ����� empNo���� ���� ���
					empNo = emp.getEmpNo();
				}
			}
		}
		
		
		// empNo���� �ִ� �޿����� ����� ����Ǿ� ����
		// == ����� �̿��� �ִ� �޿���(����)�� ��ȸ�� �� �ִ�.
		for(Employee emp : employees) {
			
			if(emp.getEmpNo() == empNo) {
				// ���� ������ ���� ��ü�� ����� empNo�� ���ٸ�
				
				System.out.printf("�̸� : %s, �μ� : %s, �޿� : %d\n",
							emp.getEmpName(), emp.getDepartment(), emp.getSalary());
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
}