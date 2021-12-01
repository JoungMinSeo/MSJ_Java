package edu.kh.oop.encapsulation.model.vo;

public class Account {

	// �Ӽ�(== �ʵ� : �Ӽ� �ۼ� �κ�)
	// �ʵ忡 �ۼ� ������ ���� : ��� ���� / Ŭ���� ����(static ����)
	// Member �� : ȸ��, �Ͽ�
	// ��� ���� : �ش� Ŭ������ �Ҽӵ� ����
	
	// ���� ������
	// public : (������) ��𼭵��� ������ ���� ����
	//          -> ��� ��Ű������ import�Ͽ� ��� ����
	
	// private : (�ΰ���, �������) �ش� Ŭ����(��ü) ���ο����� ���� ����
	
	private String name; // �̸�
	private String accountNumber; // ���� ��ȣ
	private String password; // ��й�ȣ
	private int bankCode; // ���� �ڵ�
	private int money; // ��(�ܾ�)
	
	
	// ���(== �޼ҵ� == ��� �޼ҵ�)
	public void deposit() { // �Ա�
		
	}
	
	public void withdraw() { // ���
		
	}
	
	// private���� ���� ������ ���ѵ� ��� ������
	// ���������� ������ �� �ִ� ���(�޼ҵ�)�� �ۼ�
	// --> ������� �ϳ��� �ΰ��� ����� ������.
	// == getter / setter
	
	// name�� setter
	/* setter �ۼ� ���
	 * 
	 * public void set���������( ��������ڷ��� ��������� ){
	 *   this.��������� = ���������;
	 * }
	 * 
	 */
				// �Ű�����(parameter) : �޼ҵ� ȣ�� �� ���� ���� ���� �����ϴ� ����
	public void setName(String name) {
		this.name = name;  // ���� ���� �Ű����� name ���� ��� ���� name�� ����
		// this. : ����(���� Ŭ����)
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	/* getter �ۼ� ���
	 * 
	 * public ��������ڷ��� get���������(){
	 *   return ���������;
	 * }
	 * 
	 * return : �޼ҵ带 �����ϰ� �����ʿ� �ۼ��� ���� ȣ��η� ��������.
	 * */
	// private String name;
	public String getName() {
		// String -> return �ϴ� ���� �ڷ��� == ��ȯ��(return type)
		return name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getBankCode() {
		return bankCode;
	}
	
	public int getMoney() {
		return money;
	}
	
	
	
	
	
	
	
	
	
	
}
