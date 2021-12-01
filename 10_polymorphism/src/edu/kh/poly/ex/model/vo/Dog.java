package edu.kh.poly.ex.model.vo;

public class Dog extends Animal {

	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String type, String eatType, String habitation) {
		super(type, eatType, habitation);
	}
	
	
	@Override
	public void move() {
		System.out.println("네발로 움직이고 꼬리를 흔든다.");
	}

	@Override
	public void eat() {
		System.out.println("입으로 와구와구 씹어먹음.");
	}

	@Override
	public void breath() {
		System.out.println("코와 입으로 숨을 쉰다.");
	}

	
	
	
}
