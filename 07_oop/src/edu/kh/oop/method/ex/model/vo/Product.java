package edu.kh.oop.method.ex.model.vo;

public class Product {
	private String pName; // 상품명
	private int price; // 가격
	private String serialNumber; // 상품 고유 번호
	
	// 기본 생성자
	public Product() {}
	
	// 매개변수 있는 생성자
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
