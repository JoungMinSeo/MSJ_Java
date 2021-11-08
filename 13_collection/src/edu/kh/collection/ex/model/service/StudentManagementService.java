package edu.kh.collection.ex.model.service;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.ex.model.vo.Student;

public class StudentManagementService {

	private Scanner sc = new Scanner(System.in);
	
	private List<Student> stdList = new LinkedList<Student>();
	// ArrayList, LinkedList, Vetor 등
	// 모두 List를 구현한 자식 클래스로 동일한 메소드를 가지고 있다.
	// == 부모타입 참조변수로 참조하고 있는 경우 자식객체의 교환이 쉽다.
	//  (인터페이스 + 다형성 사용성 나타나는 이점)
	
	public void displayMenu() {
		
		int sel = 0;
		
		do {
			
			System.out.println("======== 학생 관리 프로그램 ========");
			System.out.println("1. 학생 전체 조회");
			System.out.println("2. 학생 정보 추가"); // 이름, 나이, 학년
			System.out.println("3. 학생 정보 수정"); // 이름, 나이, 학년
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름 검색");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >> ");
			
			try {
				sel = sc.nextInt();
				sc.nextLine(); // 개행문자 제거
			
				
				switch(sel) {
				case 1 : selectAll(); break;
				case 2 : addStudent(); break;
				case 3 : updateStudent(); break;
				case 4 : deleteStudent(); break;
				case 5 : break;
				case 0 : System.out.println("프로그램 종료"); break;
				default : System.out.println("메뉴에 있는 번호만 입력해주세요.");
				
				}

				
			}catch (InputMismatchException e) {
				System.out.println("정수만 입력해주세요.");
				sel = -1; // 맨 처음 sel == 0 인경우 바로 종료되는 것을 방지
				sc.nextLine(); // 입력버퍼에 남아있는 잘못 입력한 내용 제거
			}
			
		}while(sel != 0);
		
	}
	
	
	// 1. 학생 전체 조회
	private void selectAll() {
		System.out.println("[학생 전체 조회]");
		
		// stdList에 학생 정보가 없으면
		// "입력된 학생이 없습니다" 출력
		
		// stdList에 학생 정보가 있으면
		// "1번 (이름) (나이) (학년)"
		// "2번 (이름) (나이) (학년)"
		// "3번 (이름) (나이) (학년)"
		// ...
		
		if( stdList.isEmpty() ) { // stdList가 비어있을 때
			System.out.println("입력된 학생이 없습니다.");
			
		} else {
			for(int i=0 ; i<stdList.size(); i++) {
				
				// stdList의 i번째 인덱스 요소를 얻어와 s 참조변수에 저장
				Student s = stdList.get(i);
				
				// "1번 (이름) (나이) (학년)"
				System.out.printf("%d번째 %s %d %d\n", 
								i+1, s.getName(), s.getAge(), s.getGrade());
			}
		}
	}
	
	
	// 2. 학생 정보 추가
	private void addStudent() throws InputMismatchException {
		System.out.println("[학생 정보 추가]");
		
		// 학생 정보를 입력 받아 stdList에 추가
		stdList.add( createStudent() );
	}
	
	
	// 3. 학생 정보 수정
	private void updateStudent() throws InputMismatchException {
		System.out.println("[학생 정보 수정]");
		
		// 몇 번 인덱스를 수정할지 입력 받고
		// 입력 받은 인덱스가 stdList 범위 내 값인지 확인하여
		// 맞으면 학생 정보를 입력 받아 
		// 입력 받은 인덱스번째 학생 정보를 수정
		System.out.print("수정할 인덱스 입력 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if(!stdList.isEmpty() &&  index >= 0 && index < stdList.size()) {
			// stdList가 비어있지 않고, index가 stdList 범위 내 값일 경우
			
			Student s = createStudent(); // 학생 하나 생성
			stdList.set(index, s);
			
			System.out.println("수정되었습니다.");
	
		}else {
			System.out.println("학생 정보가 없거나, 인덱스가 잘못 입력되었습니다.");
		}
		
	}
	
	
	// 2,3번 공통 기능 : 학생 정보를 입력 받아 학생 객체 생성 후 반환하기
	private Student createStudent() throws InputMismatchException{
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt(); 
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		sc.nextLine();
	
		return new Student(name, age, grade);
	}
	
	
	private void deleteStudent() throws InputMismatchException {
		System.out.println("[학생 정보 삭제]");
		
		System.out.print("삭제할 인덱스 입력 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if( !stdList.isEmpty() && index >=0 && index < stdList.size()) {
			
			System.out.println( stdList.remove(index) + " 삭제되었습니다." );
		}else {
			System.out.println("학생 정보가 없거나, 인덱스가 잘못 입력되었습니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
