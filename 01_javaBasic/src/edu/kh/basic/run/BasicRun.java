package edu.kh.basic.run;

import edu.kh.basic.service.BasicService;

public class BasicRun {
	
	// ��Ű�� : ���õ� Ŭ������ ��Ƶδ� ����
	// run ��Ű�� : ���� ���õ� Ŭ���� ��Ƶδ� ����
	// xxxRun Ŭ���� : ���� ���� �ҽ��ڵ带 ��Ƶδ� ����
	// main �޼ҵ� : �ڹ� ���α׷��� �����ϱ� ���� �޼ҵ�
	// �޼ҵ�(method) : ���
	
	public static void main(String[] args) {
		
		//System.out.println("BasicRun ����");
		// ���� ����Ű : ctrl + F11
		
		// �ٸ� Ŭ������ �ִ� �޼ҵ带 ���� �ϴ� ���
		// ���� ���� "�޼ҵ� ȣ��" �̶�� ��.
		// [ȣ���� �޼ҵ尡 �ִ� Ŭ������] [��Ī(������)] = new [ȣ���� �޼ҵ尡 �ִ� Ŭ������]();
		BasicService service = new BasicService();
		service.printMessage();
		
		service.printAdd();
	}
}

/* 1. ��Ŭ������ Run ��ư�� ������ ������Ʈ�� ����
 * 2. BasicRun Ŭ������ �ִ� main �޼ҵ尡 �����(Power On).
 * 3. main �޼ҵ� ���ο� �ۼ��� BasicService�� 
 * 	  pinrtMessage() �޼ҵ带 ȣ����(���⸦ �־���).
 * 	  (������ ����� ���� BasicService�� �����ؿ�(import))
 * 
 * 4. ȣ�� �Ǿ��� �� ������ ����� ����� Ŭ���� BasicServiceŬ������
 *    �޼ҵ尡 ȣ��Ǹ� �ش� ����� ������.
 *    (BasicRun���� BasicService�� �޼ҵ�� ���⸦ �־��ָ�
 *     ���⸦ ���� �޼ҵ尡 ����ϴ� ����� ����(����)��)
 * 
 * */





