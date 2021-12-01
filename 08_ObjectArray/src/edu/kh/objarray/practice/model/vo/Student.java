package edu.kh.objarray.practice.model.vo;

public class Student {
	private int grade; // 학년
	private int classroom; // 반
	private String name; // 이름
	private int kor; // 국어점수
	private int eng; // 영어점수
	private int math; // 수학점수
	
	// 기본생성자 자동 완성 : ctrl + space -> enter
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	// 매개변수 있는 생성자 자동 완성 : alt + shift + s -> o 
	public Student(int grade, int classroom, String name, int kor, int eng, int math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getClassroom() {
		return classroom;
	}


	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}
	
	
	public String toString() {
		// 3학년 5반 홍길동 >> 국어 : 100, 영어 : 50, 수학 :70
		return  grade + "학년 " + classroom + "반 " + name 
				+ " >> 국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math;
	}
	
	
	
	
	
	
	
}
