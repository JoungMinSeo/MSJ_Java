package edu.kh.objarray.run;

import edu.kh.objarray.model.service.ObjectArrayService;

public class ObjectArrayRun {
	public static void main(String[] args) {
		
		ObjectArrayService service = new ObjectArrayService();
		// ObjectArrayService Ŭ�������� �����ڰ� �ۼ��Ǿ� ���� ����.
		// -> ������ �ܰ迡�� �����Ϸ��� �⺻�����ڸ� �ڵ����� �߰�����. (�׷��� ���� ����)
		
		service.displayMenu();
		
		
		/*
		service.init1();
		//service.init2();
		
		service.printBooks();
		// NullPointerException : 
		// �ƹ��͵� �����ϰ� ���� ���� ���� ������ �̿��� ��ü�� �ʵ� �Ǵ� ����� ȣ���� ���
		// �߻��ϴ� ����
		
		
		System.out.println(service.printTitle());
		
		
		//System.out.println(service.searchAuthor());
		
		// ���� ����
		service.priceCut(30);
		
		service.printBooks();
		*/
		
	}
	
}






