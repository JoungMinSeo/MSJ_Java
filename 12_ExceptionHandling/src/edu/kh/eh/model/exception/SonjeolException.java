package edu.kh.eh.model.exception;

public class SonjeolException extends Exception{
	// ����� ���� ���ܸ� ����� ���!
	// - �ƹ� Exception Ŭ���� �� �ϳ��� ��ӹ����� �ȴ�!
	// - ������ �ۼ�
	
	public SonjeolException() {
		super("���Ұ� 3���Ǽ� �������� �߻�");
		// �ڽ� ��ü ���� �� �θ� ��ü �κе� ����� ���� �ϴµ�
		// �� �� �θ� �κ��� �Ű����� �ִ� �����ڷ� ������.
		// -> �θ� �κ� �ʵ忡 "���Ұ� 3���Ǽ� �������� �߻�" ���ڿ��� �ʱ�ȭ��.
	}
	
	public SonjeolException(String msg) {
		super(msg);
	}
	
}
