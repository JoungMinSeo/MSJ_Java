package edu.kh.objarray.run;

import edu.kh.objarray.model.service.ObjectArrayService;

public class ObjectArrayRun {
	public static void main(String[] args) {
		
		ObjectArrayService service = new ObjectArrayService();
		// ObjectArrayService 클래스에는 생성자가 작성되어 있지 않음.
		// -> 컴파일 단계에서 컴파일러가 기본생성자를 자동으로 추가해줌. (그래서 에러 없음)
		
		service.displayMenu();
		
		
		/*
		service.init1();
		//service.init2();
		
		service.printBooks();
		// NullPointerException : 
		// 아무것도 참조하고 있지 않은 참조 변수를 이용해 객체의 필드 또는 기능을 호출한 경우
		// 발생하는 에러
		
		
		System.out.println(service.printTitle());
		
		
		//System.out.println(service.searchAuthor());
		
		// 가격 인하
		service.priceCut(30);
		
		service.printBooks();
		*/
		
	}
	
}






