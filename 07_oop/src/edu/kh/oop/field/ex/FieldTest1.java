package edu.kh.oop.field.ex;

public class FieldTest1 {

	/* 접근 제한자
	 * 
	 * public(+) : 모든 패키지에서 접근 가능(import 해서 사용 가능)
	 * protected(#) : 같은 패키지 + 상속 받은 후손 클래스 내부에서 접근 가능
	 * (default)(~) : 같은 패키지 내부에서 접근 가능
	 * private(-) : 해당 클래스 내부에서만 접근 가능
	 * 
	 * 각 선언부에 사용 가능한 접근제한자
	 * class : public, (default)
	 * field : 4개 다
	 * method : 4개 다
	 * */
	
	public int temp1 = 10;
	protected int temp2 = 20;
	int temp3 = 30;
	private int temp4 = 40;
	
	public void ex1() {
		System.out.println(temp1); // 10
		System.out.println(temp2); // 20
		System.out.println(temp3); // 30
		System.out.println(temp4); // 40
	}
	
	// temp4 getter 작성
	public int getTemp4() {
		 // --> 반환형
		return temp4;
	}
	
	
	
	
	
}



