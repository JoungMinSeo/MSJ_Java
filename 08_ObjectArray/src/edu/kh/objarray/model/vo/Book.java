package edu.kh.objarray.model.vo;

// VO ���� ���
// 1. �ʿ��� ��� ���� �߻�ȭ
// 2. ĸ��ȭ ��Ģ�� �°� private ���� + getter/setter
// 3. �⺻ ������ �ۼ�(���� �ϳ� ���� �ʿ� ���� ���� �ۼ����� ����)
// 4. �ʿ� �� toString() �ۼ�

public class Book {
	
	// �ʵ�
	// ����, ����, ����, ���ǻ�, ����
	private String title;
	private String content;
	private String author;
	private String publisher;
	private int price;
	
	// ������
	public Book() { } // �⺻ ������
	
	// �Ű����� �ִ� ������
	public Book(String title, String content, String author,
				 String publisher, int price) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	
	// �޼ҵ�
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String toString() {
		
		String result = "���� : " + title 
					  + ", ���� : " + content
					  + ", ���� : " + author
					  + ", ���ǻ� : " + publisher
					  + ", ���� : " + price + "��";
					   
		return result;
	}
	
	
	
	
}
