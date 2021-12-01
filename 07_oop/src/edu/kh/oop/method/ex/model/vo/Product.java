package edu.kh.oop.method.ex.model.vo;

public class Product {
	private String pName; // ��ǰ��
	private int price; // ����
	private String serialNumber; // ��ǰ ���� ��ȣ
	
	// �⺻ ������
	public Product() {}
	
	// �Ű����� �ִ� ������
	public Product(String pName, int price, String serialNumber) {
		this.pName = pName;
		this.price = price;
		this.serialNumber = serialNumber;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	
	
}
