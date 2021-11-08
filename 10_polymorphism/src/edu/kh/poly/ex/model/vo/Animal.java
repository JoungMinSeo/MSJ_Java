package edu.kh.poly.ex.model.vo;

// 강아지, 고양이, 호랑이, 사자, 닭, 비둘기, 금붕어, 도마뱀
// 거미, 사람, 고슴도치, 펭귄, 개미
public abstract class Animal {
	
	/* 추상 클래스(abstract class)
	 * 1. 추상 메소드를 포함한 클래스 
	 *    -> 미완성된 내용을 클래스가 포함하고 있음.
	 *      -> 미완성 부분은 상속 받은 자식이 반드시 오버라이딩 해야함.
	 *      
	 * 2. 추상 메소드를 포함하지 않아도
	 *    객체로 생성되면 안되는 클래스
	 * 
	 * 
	 * */
	
	
	// 종, 식성, 서식지 
	private String type;
	private String eatType;
	private String habitation;
	
	// 추상 클래스의 생성자
	// -> 상속 이후 자식 객체에 만들어질 부모 부분을 위한 것
	public Animal() {}
	
	public Animal(String type, String eatType, String habitation) {
		super();
		this.type = type;
		this.eatType = eatType;
		this.habitation = habitation;
	}

	// 움직인다 (move), 먹는다(eat), 호흡한다(breath)
	
	// abstract method (추상 메소드) : 메소드 몸통(정의부분)이 없는 메소드
	public abstract void move();

	public abstract void eat();
	
	public abstract void breath();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEatType() {
		return eatType;
	}

	public void setEatType(String eatType) {
		this.eatType = eatType;
	}

	public String getHabitation() {
		return habitation;
	}

	public void setHabitation(String habitation) {
		this.habitation = habitation;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", eatType=" + eatType + ", habitation=" + habitation + "]";
	}

	
	
	
	
	
	
}
