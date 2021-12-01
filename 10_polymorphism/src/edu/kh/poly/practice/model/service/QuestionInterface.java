package edu.kh.poly.practice.model.service;

import edu.kh.poly.practice.model.vo.Person;

public interface QuestionInterface {
	
	
	// 메뉴 출력
	public abstract void displayMenu();
	
	// 1. Person 배열 pArr에 학생 또는 직원 등록하기.
	// -> 숫자 1을 입력 받으면 학생 객체를 생성해 배열요소에 대입
	// -> 숫자 2를 입력 받으면 직원 객체를 생성해 배열 요소에 대입
	public abstract void insertPerson();
	
	
	// 2.pArr 배열에 저장되어있는 모든 요소 출력하기.
	// 배열요소에 값이 입력되지 않은 경우 "배열요소에 저장된 정보가 없습니다."
	public abstract void selectAll();
	
	// 3. pArr배열에서 학생 정보만 출력하기
	public abstract void selectStudent();
	
	// 4. pArr배열에서 직원 정보만 출력하기
	public abstract void selectEmployee();
	
	// 5. pArr배열에서 입력 받은 이름과 같은 사람 정보를 얻어와 출력하기
	public abstract Person searchName();
	
	
	// 6. 모든 사람의 이름을 한 줄로된 문자열로 얻어와 출력하기
	// ex)
	// 홍길동, 박영희, 김철수
	public abstract String printName();
	
	
	// 7. 모든 사람의 나이 합과, 최고/최저 연령 출력하기
	// ex)
	// 모든 사람의 나이 합 : 100
	// 최고 연령 : 50
	// 최저 연령 : 20
	public abstract void printAge();
	
	
	// 8. 특정 인덱스에 있는 사람의 정보를 삭제하고, 
	// 삭제된 사람 정보를 얻어와 출력하기 
	// ex) 
	// 삭제할 인덱스 : 0
	// 0번 인덱스에 있던 홍길동 / 20 / 3 / 5 정보가 삭제되었습니다.
	public abstract Person deletePerson();
	
	
	// 9. 배열 크기를 1칸 늘리고, 늘어난 칸에 새로운 학생 또는 직원 등록하기
	public abstract void addPerson();
	
	
		
}

