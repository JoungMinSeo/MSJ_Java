package edu.kh.oop.abstraction.model.vo;

// model : ����Ͻ� ���� ���� Ŭ������ ��Ƶδ� ��Ű��
//          -> ���α׷��� �ʿ��� ���, ������ ���� ó��, ������ ���� ��

// VO(Value Object) : �� ����� ��ü
public class Student {
	// class : ��ü�� Ư��(�Ӽ�, ���)�� ���� ���Ǹ� �� ��

	// �Ӽ�
	// �̸�, �б���, �г�, ����
	public String name;
	public String schoolName;
	public static int grade;
	public char gender;
	
	
	// ���
	// �����ϱ�, ��ϱ�, �ϱ��ϱ�, �����ϱ�
	public void study() {
		System.out.println(name + "�� ���θ� ������ �մϴ�.");
	}
	
	public void goToSchool() {
		System.out.println("��ϱ�");
	}
	
	public void goToHome() {
		System.out.println("���� ����");
	}
	
	public void introduce() {
		// ex) �̸��� ȫ�浿�̰�, KH����б� 1�г� �������� �����Դϴ�.
		System.out.printf("�̸��� %s�̰�, %s %d�г� �������� %c���Դϴ�.\n",
							name, schoolName, grade, gender);
	}
	
	
	
	
	/*public void playGame() {
		System.out.println("�䵵 �ȸ԰� �����ϱ�");
	}*/
	// -> �л��� ���������� ������ �� ����� �ƴϴ�
	// == ���ʿ��� �κ��̴�. --> �߻�ȭ�� ���� ����
	
	
	
	
}




