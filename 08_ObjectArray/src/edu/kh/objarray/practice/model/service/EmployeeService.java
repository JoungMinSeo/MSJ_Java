package edu.kh.objarray.practice.model.service;

import java.util.Scanner;

import edu.kh.objarray.practice.model.vo.Employee;

public class EmployeeService {

	private Employee[] employees = new Employee[3]; // 사원 정보를 저장할 Employee 배열
	private Scanner sc = new Scanner(System.in); 

	
	public void displayMenu() {
		
		int sel = 0;
		do {
			
			System.out.println("=== 직원 관리 프로그램 ===");
			System.out.println("1. 직원 정보 입력(3명)");
			System.out.println("2. 모든 직원 정보 출력");
			System.out.println("3. 특정 직원 정보 출력(이름 검색)");
			System.out.println("4. 특정 직원 급여/연봉 출력(사번 검색)");
			System.out.println("5. 모든 직원 급여 합/연봉 합 출력");
			System.out.println("6. 모든 직원중 급여가 가장 높은 직원의 이름, 부서, 급여 출력");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >> ");
			sel = sc.nextInt();
			sc.nextLine();
			
			switch (sel) {
			case 1: initEmployee(); break;
			case 2: System.out.println( allEmployeesInformation() ); break;
			case 3: System.out.println( searchEmployee() ); break;
			case 4: System.out.println(salaryCheck()); break;
			case 5: 
//				=== 모든 사원 급여 합/연봉 합 ===
//				전 직원 급여 합 : 10500000
//				전 직원 연봉 합 : 126000000
				System.out.println("=== 모든 사원 급여 합/연봉 합 ===");
				System.out.println("전 직원 급여 합 : " + allSalaryCheck());
				System.out.println("전 직원 연봉 합 : " + allSalaryCheck() * 12 );
				break;
			case 6: topSalaryEmployee(); break;
			case 0: System.out.println("프로그램 종료."); break;

			default: System.out.println("잘못 입력하셨습니다.");
			}
			
		}while(sel != 0);
		
	}
	
	// 3명의 직원 정보를 입력받아 배열에 각 요소에 초기화  
	public void initEmployee() {
		// 사번, 이름, 부서, 직급, 급여 순서로 입력받기
		
		for(int i=0 ; i<employees.length ; i++) {
			System.out.println("=== " + (i+1) + "번째 사원 정보 입력 ===" );
			System.out.print("사번 : ");
			int empNo = sc.nextInt();
			
			System.out.print("이름 : ");
			String empName = sc.next();
			sc.nextLine(); // 입력 버퍼 개행문자 제거
			
			System.out.print("부서 : ");
			String department = sc.nextLine();
			
			System.out.print("직급 : ");
			String position = sc.nextLine();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine(); // 입력 버퍼 개행문자 제거
			
			System.out.println();
			
			employees[i] = new Employee(empNo, empName, department, position, salary);
		}
	}
	
	
	// 모든 직원 정보를 하나의 문자열로 반환
	public String allEmployeesInformation() {
		
		String result = ""; // 빈 문자열 != null
		
		for(Employee emp : employees) {
			result += emp.toString() + "\n";
		}
		
		return result;
	}
	
	
	// 특정 사원 정보 반환 메소드(이름 검색)
	// 일치하는 이름이 없을 경우 "일치하는 이름의 사원이 없습니다." 반환
	public String searchEmployee() {
		
		System.out.println("=== 특정 사원 정보 출력(이름 검색) ===");
		
		System.out.print("이름 입력 : ");
		String inputName = sc.next();
		
		for(Employee emp : employees) {
			
			if( emp.getEmpName().equals(inputName) ) {
				// 이름이 일치하는 직원이 있을 경우
				return emp.toString();
				// return : 메소드를 종료하고 오른쪽에 작성된 값을 호출한 곳으로 반환
			}
		}
		
		// for문 끝나도 return이 안된 경우 == 이름이 일치하는 직원이 없는 경우
		return "일치하는 이름의 사원이 없습니다.";
	}
	
	
	// 입력받은 사번과 일치하는 직원의 급여, 연봉 정보 반환(연봉 == 급여 * 12)
	// 일치하지 않는 경우 "사번이 일치하는 직원 없습니다." 반환
	public String salaryCheck() {
		System.out.println("=== 급여/연봉 조회 ===");
		
		System.out.print("사번 입력 : ");
		int inputEmpNo = sc.nextInt();
		sc.nextLine();
		
		for(Employee emp : employees) {
			
			if( emp.getEmpNo()  == inputEmpNo ) {
				// 사번이 일치하는 직원이 있을 경우
				return "급여 : " + emp.getSalary() + " 연봉 : " + emp.getSalary() * 12;
				// return : 메소드를 종료하고 오른쪽에 작성된 값을 호출한 곳으로 반환
			}
		}
		
		// for문 끝나도 return이 안된 경우 == 사번이 일치하는 직원이 없는 경우
		return "사번이 일치하는 직원 없습니다.";
	}
	
	
	// 모든 사원 급여 합 반환
	public int allSalaryCheck() {
		
		int sum = 0;
		
		for(Employee emp : employees) {
			sum += emp.getSalary();
		}
		
		return sum;
	}
	
	
	// 모든 직원 중 급여가 가장 높은 직원 출력
	// (동일한 급여인 경우 사번이 낮은 사람이 출력)
	public void topSalaryEmployee() {
		
		int maxSalary = 0; // 최대 급여를 저장
		int empNo = 0; // 최대 급여를 받는 직원의 사번을 저장
		
		// 반복문을 이용해서 모든 사원 중 급여가 가장 높은 사원 찾기
		for(Employee emp : employees) {
			if(emp.getSalary() > maxSalary  ) {
				// 현재 직원의 급여가 앞서 저장된 최대 급여보다 클 경우
				
				maxSalary = emp.getSalary();
				// 최대 급여를 현재 직원의 급여로 변경
				
				empNo = emp.getEmpNo();
				// 최대 급여를 받는 직원의 사번을 저장
			
			} else if(emp.getSalary() == maxSalary) {
				// 현재 직원의 급여와 최대 급여가 동일한 경우
				
				if(emp.getEmpNo() < empNo) {
					// 현재 직원 사번이 앞서 저장된 empNo보다 낮은 경우
					empNo = emp.getEmpNo();
				}
			}
		}
		
		
		// empNo에는 최대 급여자의 사번이 저장되어 있음
		// == 사번을 이용해 최대 급여자(직원)을 조회할 수 있다.
		for(Employee emp : employees) {
			
			if(emp.getEmpNo() == empNo) {
				// 현재 접근한 직원 객체의 사번이 empNo와 같다면
				
				System.out.printf("이름 : %s, 부서 : %s, 급여 : %d\n",
							emp.getEmpName(), emp.getDepartment(), emp.getSalary());
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
}