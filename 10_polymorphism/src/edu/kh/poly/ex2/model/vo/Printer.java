package edu.kh.poly.ex2.model.vo;

public interface Printer extends ElectronicProduct {
	// �������̽� - �������̽� ��� �� extends ���
	

	public abstract /*final*/ void print(); // ��� ���
	// �������̽��� ��� �޼ҵ�� ���������� public abstract
	
	//* abstract�� final Ű����� ���ÿ� ����� �� ����!!!!
	// -> ��? �������̵��� �����ϴ� abstract�� 
	//        �������̵��� ���� final�� ���� ��ݵǱ� ������ ���� ��� �Ұ�.
}
