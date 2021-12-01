package edu.kh.poly.practice.model.service;

import java.util.Scanner;

import edu.kh.poly.practice.model.vo.Employee;
import edu.kh.poly.practice.model.vo.Person;
import edu.kh.poly.practice.model.vo.Student;

public class PracticeService implements QuestionInterface{

	private Scanner sc = new Scanner(System.in);
	
	private Person[] pArr = new Person[3]; 
				// Person 객체 참조변수 3개가 연달아 붙어있는 배열
				// 추상 클래스는 참조변수로는 사용 가능

	@Override
	public void displayMenu() {
		
		int sel = 0;
		
		do {
			System.out.println("===== 종합 문제 =====");
			System.out.println("1. Person 배열 pArr에 학생 또는 직원 등록하기.");
			System.out.println("2. pArr 배열에 저장되어있는 모든 요소 출력하기.");
			System.out.println("3. pArr배열에서 학생 정보만 출력하기");
			System.out.println("4. pArr배열에서 직원 정보만 출력하기");
			System.out.println("5. pArr배열에서 입력 받은 이름과 같은 사람 정보를 얻어와 출력하기");
			System.out.println("6. 모든 사람의 이름을 한 줄로된 문자열로 얻어와 출력하기");
			System.out.println("7. 모든 사람의 나이 합과, 최고/최저 연령 출력하기");
			System.out.println("8. 특정 인덱스에 있는 사람의 정보를 삭제하고, 삭제된 사람 정보를 얻어와 출력하기");
			System.out.println("9. 배열 크기를 1칸 늘리고, 늘어난 칸에 새로운 학생 또는 직원 등록하기");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >> ");
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
			//  Person 객체 참조 변수  =   Person객체 주소 또는 null 반환
				
				if(searchPerson == null) {
					System.out.println("일치하는 이름의 사람이 없습니다.");
				}else {
					System.out.println(searchPerson);
				}
			
			break;
			
			case 6: System.out.println( printName() );  break;
			case 7: printAge(); break;
			
			case 8: 
				Person dp = deletePerson();
				if(dp != null) {
					System.out.println(dp + " 정보가 삭제되었습니다.");
				}else {
					System.out.println("해당 인덱스에 삭제할 사람 정보가 없습니다.");
				}
				
				break;
				
			case 9:  addPerson();break;
			case 0: System.out.println("프로그램 종료"); break;

			
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			
			
		}while(sel != 0);
		
	}
	
	
	// 1. Person 배열 pArr에 학생 또는 직원 등록하기.
	// -> 숫자 1을 입력 받으면 학생 객체를 생성해 배열요소에 대입
	// -> 숫자 2를 입력 받으면 직원 객체를 생성해 배열 요소에 대입
	@Override
	public void insertPerson() {
		
		for(int i=0 ; i<pArr.length ; i++) {
			
			System.out.print("1.학생 / 2.직원 (선택) : ");
			int sel = sc.nextInt();
			sc.nextLine();
			
			if(sel == 1) { // 학생 정보(이름, 나이, 학년, 반) 입력 받기
				System.out.println("=== 학생 정보 입력 ===");
				
				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				System.out.print("학년 : ");
				int grade = sc.nextInt();
				
				System.out.print("반 : ");
				int classroom = sc.nextInt();
				
				pArr[i] = new Student(name, age, grade, classroom);
			//  Person 참조변수   =  Student 객체 (다형성 업캐스팅)
				
			}else if(sel == 2) { // 직원 정보(이름, 나이, 사번, 직급, 급여) 입력 받기
				System.out.println("=== 직원 정보 입력 ===");
				
				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				System.out.print("사번 : ");
				int empNo = sc.nextInt();
				
				System.out.print("직급 : ");
				String position = sc.next();
				
				System.out.print("급여: ");
				int salary = sc.nextInt();
				sc.nextLine();
				
				pArr[i] = new Employee(name, age, empNo, position, salary);
				
			} else { // 1,2 가 아닌 다른 숫자를 입력한 경우
				System.out.println("잘못 입력하셨습니다. 1 또는 2를 입력해주세요.");
				i--; // for문의 i++를 통해 i값이 증가하지 못하도록 반대로 1을 줄임
			}
		}
	}
	
	// 2.pArr 배열에 저장되어있는 모든 요소 출력하기.
	// 배열요소에 값이 입력되지 않은 경우 "배열요소에 저장된 정보가 없습니다."
	@Override
	public void selectAll() {
		
		// 향상된 for문 : 매 반복마다 배열 요소를 순차적으로 하나씩 꺼내 
		// 참조변수(Person p)에 꺼낸 값을 대입해서 for문 내부에서 사용
		for(Person p : pArr) {
			// p = pArr[0]; // 주소만 복사됨 (얕은 복사)
			// p = pArr[1];
			// p = pArr[2];
			
			if(p != null) { // 배열요소가 참조하는 주소가 있다면
				System.out.println(p);
			}else {
				System.out.println("배열요소에 저장된 정보가 없습니다.");
			}
		}
	}
	
	
	// 3. pArr배열에서 학생 정보만 출력하기
	@Override
	public void selectStudent() {
		
		int count = 0; // 출력된 학생 수를 세는 변수
		
		for(Person p : pArr) {
			if(p != null &&  p instanceof Student) {
				// p가 null이 아니고(참조하는 객체 주소 있음)
				// p가 참조하는 객체가 Student일 때
				
				System.out.println(p);
				count++;
			}
		}
		
		if(count == 0) { // count가 0이다 == 학생 정보가 한번도 출력되지 않았다.
			System.out.println("학생 정보가 없습니다.");
		}
		
		
	}
	
	
	// 4. pArr배열에서 직원 정보만 출력하기
	@Override
	public void selectEmployee() {
		int count = 0; // 출력된 학생 수를 세는 변수
		
		for(Person p : pArr) {
			if(p != null &&  p instanceof Employee) {
				// p가 null이 아니고(참조하는 객체 주소 있음)
				// p가 참조하는 객체가 Student일 때
				
				System.out.println(p);
				count++;
			}
		}
		
		if(count == 0) { // count가 0이다 == 학생 정보가 한번도 출력되지 않았다.
			System.out.println("직원 정보가 없습니다.");
		}
	}

	// 5. pArr배열에서 입력 받은 이름과 같은 사람 정보를 얻어와 출력하기
	@Override
	public Person searchName() {
		// Person객체 참조 주소를 반환 == Person 자료형 반환
		
		System.out.print("검색할 이름 입력 : ");
		String inputName = sc.next();
		
		for(Person p : pArr) { // 향상된 for문으로 배열 요소를 하나씩 꺼내와봄
			
			if(  p != null &&  inputName.equals(p.getName())  ) {
				// 배열 요소 값이 null이 아니고
				// inputName의 값과 배열 요소의 name 값이 같을 때
				return p;
			}
		}
		
		return null;
	}

	// 6. 모든 사람의 이름을 한 줄로된 문자열로 얻어와 출력하기
	// ex)
	// 홍길동, 박영희, 김철수
	@Override
	public String printName() {
		
		String result = ""; // 빈문자열
		
		for(int i=0 ; i<pArr.length ; i++) {
			
			if(pArr[i] != null) { // pArr[i]이 참조하는 객체가 있을 경우
				result += pArr[i].getName();
				
				if(i < pArr.length -1) {
					// pArr.length -1 == 3 - 1 == 2
					// i < 2 == 0, 1
					// 인덱스 0과 1일 때만 합쳐진 문자열 끝에 ", " 를 추가
					result += ", ";
				}
			}
		}
		//result == 홍길동, 박영희, 김철수
		
		return result;
	}


	// 7. 모든 사람의 나이 합과, 최고/최저 연령 출력하기
	// ex)
	// 모든 사람의 나이 합 : 100
	// 최고 연령 : 50
	// 최저 연령 : 20
	@Override
	public void printAge() {
		
		int sum = 0;					// 합계 저장 변수
		int max = -1;		// 최대값 저장 변수
		int min = 10000;	// 최소값 저장 변수
		
		for(Person p : pArr) {
			
			if( p != null ) {
				
				// 합계 누적
				sum += p.getAge();
				
				// 최대값 비교
				if( p.getAge() > max ) {
					max = p.getAge();
				
					// 최소값 비교
				} else if( p.getAge() < min ) {
					min = p.getAge();
				}
			}
		}
		
		System.out.println("모든 사람의 나이 합 : " + sum);
		System.out.println("최고 연령  : " + max);
		System.out.println("최저 연령  : " + min);
		
	}

	// 8. 특정 인덱스에 있는 사람의 정보를 삭제하고, 
	// 삭제된 사람 정보를 얻어와 출력하기 
	// ex) 
	// 삭제할 인덱스 : 0
	// 홍길동 / 20 / 3 / 5 정보가 삭제되었습니다.
	@Override
	public Person deletePerson() {
		
		// 사람 정보 삭제 == Person 객체를 삭제 == Person 객체를 참조하지 않음 == null
		
		System.out.print("삭제할 인덱스 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		// pArr 배열에서 입력된 인덱스 요소는 null 변해야 되지만
		// 반환도 되야 되기 때문에 null로 바꾸기 전 다른 참조변수에 저장
		
		Person p = null; // 반환을 위한 임시 Person 참조 변수
		
		if( index >= 0 && index < pArr.length) {
			// 입력된 index가 배열 인덱스 범위 내의 값인 경우
			
			if( pArr[index] != null ) {
				// pArr[index] 요소가 참조하는 주소값이 저장되어 있을 경우
				
				p = pArr[index]; // 임시 Person 참조 변수에 삭제할 index 주소를 대입
				pArr[index] = null; // 입력된 index 번째 요소를 null로 변환
			}
			
		}
		
		return p; // 임시 참조 변수를 반환
	}

	
	// 9. 배열 크기를 1칸 늘리고, 늘어난 칸에 새로운 학생 또는 직원 등록하기
	@Override
	public void addPerson() {
		
		// 배열의 단점 : 자료형이 1개, 한번 지정된 배열 크기를 변화할 수 없다.
		
		// 1) 기존 배열 pArr보다 크기가 1 더 큰 새로운 배열 생성
		Person[] newArr = new Person[pArr.length + 1];
		
		// 2) 기존 pArr 배열 요소의 값을 같은 인덱스 newArr 요소에 저장 (깊은 복사)
		/*for(int i=0 ; i<pArr.length ; i++) {
			newArr[i] = pArr[i];
		}*/
		
		System.arraycopy(pArr, 0, newArr, 0, pArr.length);
		
		// 3) pArr 참조변수에 newArr 참조변수 값을 저장
		//   == pArr이 새로운 배열의 주소를 참조 (얕은 복사)
		pArr = newArr;
		
		int sel = 0; // 번호 선택용 변수
		
		do {
			// 새로운 학생 또는 직원 등록
			System.out.print("1.학생 / 2.직원 (선택) : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			
			if(sel == 1) { // 학생 정보(이름, 나이, 학년, 반) 입력 받기
				System.out.println("=== 학생 정보 입력 ===");
				
				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				System.out.print("학년 : ");
				int grade = sc.nextInt();
				
				System.out.print("반 : ");
				int classroom = sc.nextInt();
				sc.nextLine();
				
				pArr[newArr.length - 1] = new Student(name, age, grade, classroom);
				
			}else if(sel == 2) { // 직원 정보(이름, 나이, 사번, 직급, 급여) 입력 받기
				System.out.println("=== 직원 정보 입력 ===");
				
				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				System.out.print("사번 : ");
				int empNo = sc.nextInt();
				
				System.out.print("직급 : ");
				String position = sc.next();
				
				System.out.print("급여: ");
				int salary = sc.nextInt();
				sc.nextLine();
				
				pArr[newArr.length - 1] = new Employee(name, age, empNo, position, salary);
				
			}else { // 다른 숫자를 입력한 경우
				System.out.println("잘못입력하셨습니다. ");
			}
			
		}while( !(sel == 1 || sel == 2) );
		// 1 또는 2가 아닐 떄 true --> 반복
		
		
	}
	
	
	
	
	
	
	
}
