package edu.kh.eh.model.vo;

import java.io.IOException;

public class Child extends Parent{

	// �������̵� ���� ����
	// - ���� �����ڴ� ���ų� �� ���� ����
	// - ��ȯ��, �޼ҵ��, �Ű������� ��� ���ƾ� �Ѵ�.
	// - ����ó�� ����(throws) ���� ���� ������� ó�� ������ ���ų� �ļ�(���ƾ�)�̾�� �Ѵ�.
	@Override
	public void ex1() throws ArithmeticException {
		// ArithmeticException�� RuntimeException�� �ڽ�
	}
	
	
	@Override
	public void ex2() throws /*Exception*/ IOException{
								// -> �������̵� �� �θ�Ÿ������ �����ϸ� 
								//   �������̵� ���� ������ ���� ��Ű�� ���� �����߻�.
		
		// �������̵� �� throws�� �ۼ��� ���ܸ� 
		// ������ ���� �Ǵ� �ۼ����� ���� �� �ִ�.
		// -> �ڽ��� �������̵� �Ͽ� ���ܸ� ó���� �� �ְų�(try-catch)
		//    �Ǵ� �������� �ڵ尡 ���ܸ� �߻���Ű�� ���� �� �ִ�.
		
		try {
			
		}catch (RuntimeException e) {
			// TODO: handle exception
		}
	}
	
	
	
}
