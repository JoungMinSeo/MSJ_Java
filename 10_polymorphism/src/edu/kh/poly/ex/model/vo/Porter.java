package edu.kh.poly.ex.model.vo;

public class Porter extends Car{
	private double weight;  // ÇÏÁß
	private String bay; // ÁüÄ­

	public Porter() {}

	public Porter(String engine, int wheel, String handle, double weight, String bay) {
		super(engine, wheel, handle);
		this.weight = weight;
		this.bay = bay;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getBay() {
		return bay;
	}

	public void setBay(String bay) {
		this.bay = bay;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + weight + " / " + bay;
	}
	
	
	
}
