package edu.kh.oop.abstraction.run;

import edu.kh.oop.abstraction.model.service.AbstractionService;

public class AbstractionRun {
	public static void main(String[] args) {
		
		AbstractionService service = new AbstractionService();
		// AbstractionService 객체를 참조할 변수 service 
		// == 주소를 저장하는 참조 변수 != AbstractionService 객체
		
		
		service.example1();
	}
}
