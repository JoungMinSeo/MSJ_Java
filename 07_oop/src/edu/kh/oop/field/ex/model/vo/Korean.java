package edu.kh.oop.field.ex.model.vo;

public class Korean {
	
	public static final String language = "�ѱ�"; // ���
	//private String language = "�ѱ�"; // ���
	private String id; // �ֹε�Ϲ�ȣ
	private String name; // �̸�
	//private int nationalCode = 82; // ������ȣ
	public static int nationalCode = 82; // ������ȣ static ����
	
	public void quickly() {
		System.out.println("����!����!");
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
	
	
	// �ʵ� ���� �ϳ��� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public String toString() {
		
		String result = name + "/" + id + "/" + language + "/" + nationalCode;
		
		return result;
	}
	
	
	
	
	
	
	
	
	
}
