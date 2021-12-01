package edu.kh.inh.ex.model.vo;

// final class : 상속 불가 클래스
public final class HighSchoolStudent extends Student {
	/* 상속 계층도
	 * 
	 * Object
	 * ㄴPerson
	 *   ㄴStudent
	 *     ㄴHighSchoolStudent
	 * */
	
	private String line; // 학교 계열
	
	public HighSchoolStudent() { }

	public HighSchoolStudent(String name, int age, 
							 int grade, int classroom, String line) {
		super(name, age, grade, classroom);
		this.line = line;
	}
	
	public String getLine() {
		return line;
	}
	
	public void setLine(String line) {
		this.line = line;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + line;
	}
	
	
	/*@Override
	public void study() {
		// Cannot override the final method from Student
		System.out.println("관심있는 분야 열공합시다.");
	}*/
	
	
	
	
}
