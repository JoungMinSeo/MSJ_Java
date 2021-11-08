package edu.kh.poly.practice.model.vo;

public class Student extends Person {
	// Person 상속
	
	private int grade; // 학년
	private int classroom; // 반

	public Student() {
		// TODO Auto-generated constructor stub
	}



	public Student(String name, int age, int grade, int classroom) {
		super(name, age);
		this.grade = grade;
		this.classroom = classroom;
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

	@Override
	public String toString() {
		
		return super.toString() + " / " + grade + " / " + classroom;
	}
	
	
	
	
}
