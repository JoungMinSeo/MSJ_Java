package edu.kh.eh.run;

import java.io.IOException;

import edu.kh.eh.model.service.ExceptionService;

public class ExceptionRun {
	public static void main(String[] args) throws IOException {
		ExceptionService service = new ExceptionService();
//		service.example1();
//		service.example2();
//		service.example3();
//		service.example4();
//		service.example5();
		
		//service.example6(); // IOException�� ������ ���� �� �ִ�. ���� �غ� �ؾ� �Ѵ�.
		
		service.example7();
		
		
	}
}
