package edu.kh.oop.encapsulation.model.service;

import edu.kh.oop.encapsulation.model.vo.Account;

public class EncapsulationService {

	public void example1() {
		
		// Account ��ü �ϳ� ����
		Account ac = new Account();
		
		/* ĸ��ȭ ��Ģ�� ���� private���� ��� ������ ����Ǹ� ���� ������ �� �� ����.
		 * 
		ac.name = "�鵿��";
		ac.accountNumber = "1234-56-789";
		ac.password = "qwer1234";
		ac.bankCode = 1;
		ac.money = 1000000;
		*/
		
		// setter�� �̿��� ���� ����
		ac.setName("�鵿��");
		ac.setAccountNumber("1234-56-789");
		ac.setPassword("qwer1234");
		ac.setBankCode(1);
		ac.setMoney(1000000);
		
		
		
		// --------------------------------
		// ĸ��ȭ�� �Ǿ����� ���� ��
		//System.out.println(ac.money); 
		// ac�� �����ϴ� Account ��ü�� ��� ���� money�� ���� �����Ͽ� ���� ����.
		
		//System.out.println(ac.password);
		// ac�� �����ϴ� Account ��ü�� ��� ���� password�� ���� �����Ͽ� ���� ����.
		
		// ��� ������ ���� ������ �����Ͽ� ������ ���� �����.
		
		// --------------------------------
		// ĸ��ȭ�� ����Ǿ� ���� �� ���� �������� ������ ���
		System.out.println(ac.getName());
		// ac�� �����ϴ� Account ��ü���� name ���� ��ȯ �޾ƿ��� �޼ҵ� getName() ȣ��
		System.out.println(ac.getAccountNumber());
		System.out.println(ac.getPassword());
		System.out.println(ac.getBankCode());
		System.out.println(ac.getMoney());
		
		String name = ac.getName(); // "�鵿��"
		
		System.out.println("name : " + name);
		
		int result = ac.getMoney() + ac.getBankCode();
		
		System.out.println(result);
		
		
	}
	
}
