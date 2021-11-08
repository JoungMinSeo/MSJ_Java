package edu.kh.oop.field.ex;

public class FieldTest1 {

	/* ���� ������
	 * 
	 * public(+) : ��� ��Ű������ ���� ����(import �ؼ� ��� ����)
	 * protected(#) : ���� ��Ű�� + ��� ���� �ļ� Ŭ���� ���ο��� ���� ����
	 * (default)(~) : ���� ��Ű�� ���ο��� ���� ����
	 * private(-) : �ش� Ŭ���� ���ο����� ���� ����
	 * 
	 * �� ����ο� ��� ������ ����������
	 * class : public, (default)
	 * field : 4�� ��
	 * method : 4�� ��
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
	
	// temp4 getter �ۼ�
	public int getTemp4() {
		 // --> ��ȯ��
		return temp4;
	}
	
	
	
	
	
}



