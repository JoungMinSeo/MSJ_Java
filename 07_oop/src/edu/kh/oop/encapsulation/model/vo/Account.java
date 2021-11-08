package edu.kh.oop.encapsulation.model.vo;

public class Account {

	// 속성(== 필드 : 속성 작성 부분)
	// 필드에 작성 가능한 변수 : 멤버 변수 / 클래스 변수(static 변수)
	// Member 뜻 : 회원, 일원
	// 멤버 변수 : 해당 클래스에 소속된 변수
	
	// 접근 제한자
	// public : (공공의) 어디서든지 누구나 접근 가능
	//          -> 모든 패키지에서 import하여 사용 가능
	
	// private : (민간의, 비공개의) 해당 클래스(객체) 내부에서만 접근 가능
	
	private String name; // 이름
	private String accountNumber; // 계좌 번호
	private String password; // 비밀번호
	private int bankCode; // 은행 코드
	private int money; // 돈(잔액)
	
	
	// 기능(== 메소드 == 멤버 메소드)
	public void deposit() { // 입금
		
	}
	
	public void withdraw() { // 출금
		
	}
	
	// private으로 직접 접근이 제한된 멤버 변수에
	// 간접적으로 접근할 수 있는 기능(메소드)를 작성
	// --> 멤버변수 하나당 두개의 기능이 생성됨.
	// == getter / setter
	
	// name의 setter
	/* setter 작성 방법
	 * 
	 * public void set멤버변수명( 멤버변수자료형 멤버변수명 ){
	 *   this.멤버변수명 = 멤버변수명;
	 * }
	 * 
	 */
				// 매개변수(parameter) : 메소드 호출 시 전달 받은 값을 저장하는 변수
	public void setName(String name) {
		this.name = name;  // 전달 받은 매개변수 name 값을 멤버 변수 name에 저장
		// this. : 여기(현재 클래스)
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	/* getter 작성 방법
	 * 
	 * public 멤버변수자료형 get멤버변수명(){
	 *   return 멤버변수명;
	 * }
	 * 
	 * return : 메소드를 종료하고 오른쪽에 작성된 값을 호출부로 돌려보냄.
	 * */
	// private String name;
	public String getName() {
		// String -> return 하는 값의 자료형 == 반환형(return type)
		return name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getBankCode() {
		return bankCode;
	}
	
	public int getMoney() {
		return money;
	}
	
	
	
	
	
	
	
	
	
	
}
