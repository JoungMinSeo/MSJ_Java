package edu.kh.oop.field.ex.model.vo;

public class Korean {
	
	public static final String language = "한글"; // 언어
	//private String language = "한글"; // 언어
	private String id; // 주민등록번호
	private String name; // 이름
	//private int nationalCode = 82; // 국가번호
	public static int nationalCode = 82; // 국가번호 static 변수
	
	public void quickly() {
		System.out.println("빨리!빨리!");
	}
	
	// setter
	public void setNationalCode(int nationalCode) {
		this.nationalCode = nationalCode;
	}
	
	// getter
	public int getNationalCode() {
		return nationalCode;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	/*public void setLanguage(String language) {
		this.language = language;
	}*/
	
	public String getLanguage() {
		return language;
	}
	
	
	// 필드 값을 하나의 문자열로 반환하는 메소드
	public String toString() {
		
		String result = name + "/" + id + "/" + language + "/" + nationalCode;
		
		return result;
	}
	
	
	
	
	
	
	
	
	
}
