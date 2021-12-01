package edu.kh.oop.constructor.ex.model.vo;

public class User {
	/* 클래스 구조
	 * 
	 * public class 클래스명{
	 *  필드
	 *  생성자
	 *  메소드
	 * }
	 * 
	 * */
	
	private String userId; 		// 사용자 ID
	private String userPwd; 	// 사용자 비밀번호
	private String userName; 	// 사용자 이름
	private int age; 			// 사용자 나이
	private char gender;		// 사용자 성별
	
	
	// 생성자
	/* 
	 * - new 연산자를 통해 객체 생성 시
	 *   생성된 객체에 값을 초기화 하고, 지정된 기능을 수행 하는 것이 목적.
	 * 
	 * - 생성자 작성 시 주의 사항
	 * 1) 생성자명은 반드시 클래스명과 동일해야 한다.
	 * 2) 반환형이 존재하지 않는다.
	 * 3) 매개변수 있는 생성자 작성 시
	 *    기본 생성자가 컴파일러에 의해 자동으로 생성되지 않으므로
	 *    기본 생성자를 반드시 작성해야한다.
	 *    
	 *    -> 클래스 내에 생성자가 아무것도 작성되어 있지 않으면 
	 *       컴파일러가 기본 생성자를 자동으로 추가해주지만,
	 *       
	 *       생성자가 하나라도 작성된 경우
	 *       컴파일러가 기본 생성자를 자동 추가해주지 않는다.
	 * */
	
	// 기본 생성자
	// [접근제한자] 클래스명(){ }
	// *** 기본 생성자가 작성되지 않은 경우
	//     컴파일러에 의해서 자동으로 기본 생성자가 추가된다!
	public User() {
		System.out.println("User() 기본 생성자에 의해서 User 객체가 생성됨.");
	}
	
	
	// 매개변수 있는 생성자 
	// * 매개변수(parameter) : 메소드 호출 시 전달되는 값을 저장할 변수(매개체 역할)
	// 생성자 역할 + setter 역할
	// -> 객체 생성 시 매개변수로 전달 받은 값을 이용해서 필드 값을 초기화 하는 생성자
	public User(String userId, String userPwd, String userName,
				int age, char gender) {
		
		/* this() 생성자
		 * - 같은 클래스 내에 있는 다른 생성자를 호출할 때 사용
		 * - 생성자 내부에서만 작성할 수 있고, 반드시 첫 번째 줄에 작성 되어야 한다.
		 * 
		 * this() 생성자 사용 이유
		 * - 반복되는 생성자 구문의 소스 코드 중복을 해결하기 위하여
		 *  == 코드의 재사용성 증가
		 * */
		this(userId, userPwd);
		
		//this.userId = userId;
		//this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}
	
	// 아이디, 비밀번호만 초기화하는 생성자
	// (메소드명이 같고, 매개변수 개수가 다르므로 오버로딩 성립)
	public User(String userId, String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	// 아이디, 이름만 초기화 하는 생성자
	// -> 오버로딩 시 주의 사항
	//   매개변수의 순서를 바꾸게 될 경우
	//   매개변수명이 중요한게 아니라, 자료형을 봐야한다!
	//   -> 오버로딩 성립조건에서 말하는 매개변수의 순서는 
	//      자료형의 순서를 의미함!!!
	/*public User(String userName, String userId) {
		
	}*/
	
	
	// 이름, 나이
	// (매개변수 개수가 동일하지만 타입이 다르므로 오버로딩 성립)
	public User(String userName, int age) {
		this.userName = userName;
		this.age = age;
	}
	
	// 나이, 이름
	// (매개변수의 개수, 타입이 동일하지만 순서가 다르므로 오버로딩 성립)
	public User(int age, String userName) {
		this.userName = userName;
		this.age = age;
	}
	
	
	
	
	// 오버로딩(OverLoading, 과적)
	// 한 클래스 내에 동일한 이름의 메소드를 여러 개 작성하는 기법
	// -> 원래 -> 메소드명 하나 == 수행 기능 하나
	//    오버로딩 적용 시  -> 메소드명 하나 == 수행 기능 여러 개
	
	// 오버로딩 성립 조건
	// 1. 메소드명이 같아야 한다.
	// 2. 매개변수의 타입, 개수, 순서 중 하나라도 달라야 한다.
	
	
	
	// getter/setter
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// alt + shift + s -> r  : getter/setter 자동 완성 기능
	
	
	// 객체의 필드 정보를 하나의 문자열로 반환하는 메소드
	public String toString() {
		
		String result = userId + "/" + userPwd + "/" +
						userName + "/" + age + "/" + gender;
		
		return result;
	}
	
	
	
	
	
	
	
	
	
}
