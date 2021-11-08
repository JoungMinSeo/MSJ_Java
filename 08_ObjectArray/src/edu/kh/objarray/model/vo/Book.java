package edu.kh.objarray.model.vo;

// VO 설계 방법
// 1. 필요한 멤버 변수 추상화
// 2. 캡슐화 원칙에 맞게 private 선언 + getter/setter
// 3. 기본 생성자 작성(만에 하나 절대 필요 없는 경우는 작성하지 않음)
// 4. 필요 시 toString() 작성

public class Book {
	
	// 필드
	// 제목, 내용, 저자, 출판사, 가격
	private String title;
	private String content;
	private String author;
	private String publisher;
	private int price;
	
	// 생성자
	public Book() { } // 기본 생성자
	
	// 매개변수 있는 생성자
	public Book(String title, String content, String author,
				 String publisher, int price) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	
	// 메소드
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
		
		String result = "제목 : " + title 
					  + ", 내용 : " + content
					  + ", 저자 : " + author
					  + ", 출판사 : " + publisher
					  + ", 가격 : " + price + "원";
					   
		return result;
	}
	
	
	
	
}
