package edu.kh.oop.field.ex;

public class FieldTest2 {

	public void ex2() {
		
		// FieldTest1 객체 생성
		FieldTest1 test1 = new FieldTest1();
		
		// FieldTest2 는 FieldTest1과 같은 패키지, 다른 클래스
		
		// FieldTest1에 있는 필드 temp1~4 출력
		System.out.println(test1.temp1);
		System.out.println(test1.temp2);
		System.out.println(test1.temp3);
		//System.out.println(test1.temp4);
		// The field FieldTest1.temp4 is not visible
		// --> temp4가 안보인다 --> 왜? private으로 외부 접근을 차단해서
		
		// 만약 temp4를 얻어 오고 싶다면 어떻게 해야되는가?
		// FieldTest1 클래스에 getter 메소드를 작성
		System.out.println(test1.getTemp4());
	}
	
	
	
	
}



