package edu.kh.poly.ex.model.vo;

// ������, �����, ȣ����, ����, ��, ��ѱ�, �ݺؾ�, ������
// �Ź�, ���, ����ġ, ���, ����
public abstract class Animal {
	
	/* �߻� Ŭ����(abstract class)
	 * 1. �߻� �޼ҵ带 ������ Ŭ���� 
	 *    -> �̿ϼ��� ������ Ŭ������ �����ϰ� ����.
	 *      -> �̿ϼ� �κ��� ��� ���� �ڽ��� �ݵ�� �������̵� �ؾ���.
	 *      
	 * 2. �߻� �޼ҵ带 �������� �ʾƵ�
	 *    ��ü�� �����Ǹ� �ȵǴ� Ŭ����
	 * 
	 * 
	 * */
	
	
	// ��, �ļ�, ������ 
	private String type;
	private String eatType;
	private String habitation;
	
	// �߻� Ŭ������ ������
	// -> ��� ���� �ڽ� ��ü�� ������� �θ� �κ��� ���� ��
	public Animal() {}
	
	public Animal(String type, String eatType, String habitation) {
		super();
		this.type = type;
		this.eatType = eatType;
		this.habitation = habitation;
	}

	// �����δ� (move), �Դ´�(eat), ȣ���Ѵ�(breath)
	
	// abstract method (�߻� �޼ҵ�) : �޼ҵ� ����(���Ǻκ�)�� ���� �޼ҵ�
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
