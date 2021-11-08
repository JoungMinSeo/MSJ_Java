package edu.kh.poly.ex.model.service;

import edu.kh.poly.ex.model.vo.Animal;
import edu.kh.poly.ex.model.vo.Chicken;
import edu.kh.poly.ex.model.vo.Dog;

public class AbstractService {
	
	public void example1() {
		
		//Animal a1 = new Animal();
		// Animal�� �߻� Ŭ������
		// -> �߻� Ŭ������ �̿ϼ� Ŭ������
		// --> �̿ϼ��� Ŭ�����δ� ��ü�� ���� �� ����.
		
		Chicken c1 = new Chicken("����", "���", "�츮������", 2);
		
		// Chicken ������ �߻� �޼ҵ� ȣ��
		c1.move();
		c1.eat();
		c1.breath();
		
		Dog d1 = new Dog("��������", "���", "�츮��");
		d1.move();
		d1.eat();
		d1.breath();
		
		// �߻� Ŭ������ ��ü ������ �Ұ��� ������
		// �θ� Ÿ�� ���������δ� ����� �� �ִ�.
		Animal[] arr = new Animal[3];
		// Animal �������� 2���� ������ �ִ� Animal �迭�� ������ ��
		// �� �ּҸ� arr�� �����Ѵ�.
		
		// (Animal ��������)
		//arr[0] = new Chicken(); // Chicken ��ü
		arr[0] = c1; 
		arr[1] = d1;
		arr[2] = new Dog("��������", "���� �Դ´�.", "���� ������.");
		
		System.out.println("---------------------------");
		for(Animal a : arr) {
			// �������� a�� Animal Ÿ���̱� ������
			// Animal�� ������ �ִ� �̿ϼ� �޼ҵ� move(), eat(), breath()��
			// ������ ������(�������ε�) ������ �߻����� ����.
			// -> ��? ���� �� �������̵��� �ڽ��� move(), eat(), breath()��
			//    ������ �Ǳ� ������ ������ �߻���Ű�� �ʴ´�. (�������ε�)
			
			a.move(); 
			a.eat();
			a.breath();
		}
		
		
		
		
	}
	
	
	
	
	
}



