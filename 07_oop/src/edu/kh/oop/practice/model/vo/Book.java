package edu.kh.oop.practice.model.vo;

public class Book {

	// �ʵ� 
	private String title; // ������
	private int price; // ����
	private double discountRate; // ������
	private String author; // ���ڸ�
	
	// ������
	public Book() {} // �⺻ ������
	
	// �Ű����� �ִ� ������
	// -> �� ���� : ���� ���� �Ű������� ������ ��ü�� �ʵ� ���� �ʱ�ȭ
	public Book(String title, int price,
				double discountRate, String author) {
		
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	
	// �޼ҵ�
	public String toString() {
		String result = 
			title + " / " + price +  " / "
			+ discountRate + " / " + author;
		
		return result;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
	
	
	
	
}
