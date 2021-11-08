package edu.kh.oop.encapsulation.model.service;

import edu.kh.oop.encapsulation.model.vo.Account;

public class EncapsulationService {

	public void example1() {
		
		// Account 객체 하나 생성
		Account ac = new Account();
		
		/* 캡슐화 원칙에 의해 private으로 멤버 변수가 선언되면 직접 접근을 할 수 없다.
		 * 
		ac.name = "백동현";
		ac.accountNumber = "1234-56-789";
		ac.password = "qwer1234";
		ac.bankCode = 1;
		ac.money = 1000000;
		*/
		
		// setter를 이용한 간접 접근
		ac.setName("백동현");
		ac.setAccountNumber("1234-56-789");
		ac.setPassword("qwer1234");
		ac.setBankCode(1);
		ac.setMoney(1000000);
		
		
		
		// --------------------------------
		// 캡슐화가 되어있지 않을 때
		//System.out.println(ac.money); 
		// ac가 참조하는 Account 객체의 멤버 변수 money를 직접 접근하여 값을 얻어옴.
		
		//System.out.println(ac.password);
		// ac가 참조하는 Account 객체의 멤버 변수 password를 직접 접근하여 값을 얻어옴.
		
		// 멤버 변수의 직접 접근이 가능하여 정보가 쉽게 유출됨.
		
		// --------------------------------
		// 캡슐화가 적용되어 있을 때 간접 접근으로 얻어오는 방법
		System.out.println(ac.getName());
		// ac가 참조하는 Account 객체에서 name 값을 반환 받아오는 메소드 getName() 호출
		System.out.println(ac.getAccountNumber());
		System.out.println(ac.getPassword());
		System.out.println(ac.getBankCode());
		System.out.println(ac.getMoney());
		
		String name = ac.getName(); // "백동현"
		
		System.out.println("name : " + name);
		
		int result = ac.getMoney() + ac.getBankCode();
		
		System.out.println(result);
		
		
	}
	
}
