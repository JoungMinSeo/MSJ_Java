package edu.kh.oop.constructor.ex.model.service;

import edu.kh.oop.constructor.ex.model.vo.User;

public class ConstructorService {
	
	
	public void example1() {
		// User 객체 하나 생성
		User u1 = new User();
		
		// 생성된 User객체에 속성(데이터)를 대입 --> 구체적인 객체
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("유저일");
		u1.setAge(20);
		u1.setGender('여');
		
		System.out.println("u1 : " + u1.toString());
		
		// User 객체를 하나 만들어 참조 변수 u2에 저장하고
		// 각 필드 값을 초기화 후 출력("user02", "pass02", "유저이", 30, '남') 
		User u2 = new User();
		
		u2.setUserId("user02");
		u2.setUserPwd("pass02");
		u2.setUserName("유저이");
		u2.setAge(30);
		u2.setGender('남');
		
		System.out.println("u2 : " + u2.toString());
		
		
		// User 객체를 하나 만들어 참조 변수 u3에 저장하고
		// 각 필드 값을 초기화 후 출력("user03", "pass03", "유저삼", 25, '여') 
		
		// 매개변수 있는 생성자 사용
		//User u3 = new User("user03", "pass03", "유저삼", 25, '여');
		//System.out.println("u3 : " + u3.toString());
		
		User u4 = new User();
		
		
	}
	
	
	
	
	
}
