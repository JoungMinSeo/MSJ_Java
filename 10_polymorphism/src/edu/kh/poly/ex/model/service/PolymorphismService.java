package edu.kh.poly.ex.model.service;

import javax.print.PrintService;

import edu.kh.poly.ex.model.vo.Car;
import edu.kh.poly.ex.model.vo.ModelX;
import edu.kh.poly.ex.model.vo.Porter;
import edu.kh.poly.ex.model.vo.Spark;

public class PolymorphismService {

	public void example1() {
		
		Car c = new Car();
		// �θ� Ÿ�� �������� = �θ� Ÿ�� ��ü 
		
		// �θ� Ÿ�� ���� ������ 
		// �θ� ��ü�� �޼ҵ带 ������ �� �ִ�.
		c.setEngine("��������");
		c.setHandle("�����ڵ�");
		c.setWheel(4);
		
		Porter p = new Porter();
		// �ڽ� Ÿ�� �������� = �ڽ� Ÿ�� ��ü

		// �ڽ� Ÿ�� ���� ������ 
		// �ڽ� ��ü�� �޼ҵ带 ������ �� �ִ�.
		p.setEngine("��������");
		p.setHandle("ũ�� ���׶� �ڵ�");
		p.setWheel(8);
		p.setWeight(4.5);
		p.setBay("ū ��ĭ");
		
		
		// ������ ����
		
		// �θ� Ÿ�� �������� = �ڽ� Ÿ�� ��ü
		Car c2 = new Porter();
		// Car, Porter �ڷ����� �ٸ�
		// ��ǻ�ʹ� ���� �ڷ��� ������ ������ �����ϴ� -> �̸� ������ ���
		
		// �θ� Ÿ���� ���� �����δ�
		// �ƹ��� �ڽ� ��ü�� �����ϰ� �־
		// ��� ���� �θ� �κи� ���� �����ϴ�.
		c2.setEngine("��������");
		c2.setHandle("ũ�� ���׶� �ڵ�");
		c2.setWheel(8);
		
		System.out.println(c2.getEngine());
		System.out.println(c2.getHandle());
		System.out.println(c2.getWheel());
		
		System.out.println(c2.toString());
		
		Car c3 = new Spark();
		Car c4 = new ModelX();
		
		//Car c5 = new String("abc");
		// -> String�� Car�� ��� ���� �ʾƼ� ������(��ĳ����)�� ������� ����.
	}
	
	
	public void example2() {
		
		// �� ĳ���� : �θ� Ÿ�� ���� ������   �ڽ� ��ü �ּҸ� ����
		
		// �ٿ� ĳ���� : �θ� Ÿ���� ���� ������  �ڽ� Ÿ������ ����ȯ �Ͽ�
		// 		          �ڽ� ��ü�� ������ ������.
		
		
		// �� ĳ����
		Car c = new Spark("�ֹ�������", 4, "���� �ڵ�", "����");
		// �θ� Ÿ�� ���� ����         // �ڽ� ��ü
		
		System.out.println( c.getEngine() );
		System.out.println( c.getWheel() );
		System.out.println( c.getHandle() );
		// ����, ����, �ڵ��� �θ�� ���� ��� ���� ��
		
		//System.out.println( c.getColor() );
		// ������ �ڽĸ��� ��� --> �θ� ���� ������ ������ �� ����
		// --> �θ� ���� ������   �ڽ� ���� ������ ����ȯ!
		
		System.out.println(   ((Spark)c).getColor() );
		// (Spark) ����ȯ ������ ����  . �� �����ڰ� �켱 ���� ����
		// --> �θ� ���� ������ ����ȯ ������ (Spark)�� ��ȣ()�� ���� ���� ����ó����.
		
		Car c2 = new ModelX("���� ����", 4, "���ִ� �ڵ�", "��������");
		Car c3 = new Porter("��������", 12, "��û ū �ڵ�", 11, "¯ŭ");
		
		System.out.println( c2.getEngine() );
		System.out.println( c2.getHandle() );
		System.out.println( c2.getWheel() );
		
		// �ٿ� ĳ����
		System.out.println( ((ModelX)c2).getBattery()    );
		
		// Car Ÿ�� ���� ���� c3�� �ڽ��� Porter Ÿ�� ���� ������ �ٿ� ĳ�����Ͽ�
		// c3�� ����� �ּҸ� Porter �������� p�� ����
		Porter p = (Porter)c3;
		
		System.out.println( p.getEngine());
		System.out.println( p.getHandle() );
		System.out.println( p.getWheel() );
		System.out.println( p.getWeight()  );
		System.out.println( p.getBay() );
	}
	
	
	public void example3() {
		
		// ��ü�迭�� ������
		
		// �迭 : ���� �ڷ����� �ϳ��� �������� �ٷ�� ��
		// ��ü �迭 : ��ü ���� ���� ���� ���� �ϳ��� �������� �ٷ�� ��
		
		// ���� 5�� ���� ���α׷�
		//Porter[] porterArr = new Porter[5];
		//Spark[] sparkArr = new Spark[10];
		
		// �ڵ��� ���� ���α׷�
		Car[] carArr = new Car[5];
		// Car ���� ���� 5ĭ ¥�� �迭�� Heap�� �����ؼ� 
		// �ش� �ּҸ� Car�迭 �������� carArr�� �����Ͽ� �����ϰ���.
		
		carArr[0] = new Porter("����", 4, "�����ڵ�", 1, "����");
		// carArr[0] �� ���� carArr�� ��� �迭 ��Ҵ�
		// �θ� Ÿ�� ���� �����̱� ������ �ڽ� ��ü�� �����ϴ� �� ĳ������ �����ϴ�.
		
		carArr[1] = new Spark("����", 4, "���� �ڵ�", "��Ʈ");
		
		carArr[2] = new ModelX("����", 4, "���ִ� �ڵ�", "2021��� ��������");
		
		carArr[3] = new Car("��", 8, "Ŀ����");
		
		carArr[4] = new Porter("����", 20, "���� ŭ", 15, "����~ ŭ");
		
		
		// carArr �� �迭 ��Ұ� �����ϴ� ��ü ���� ��� ���
		System.out.println( ((Porter)carArr[0]).toString()  );
		// carArr[0]�� car ���� ����
		// carArr[0]�� �����ϰ� �ִ� ��ü�� Porter
		// ���� ���ϴ� �� : Porter�� �������̵��� toString() ȣ��
		// -> carArr[0]���� ȣ���ϸ� �������̵� �� �θ��� toString()�� ȣ��� �� ����.
		// --> carArr[0]�� Porter�� �ٿ�ĳ�����ؼ� ȣ���ϸ�
		//     �������̵��� toString()�� ȣ��� �� ����.
		
		System.out.println( ((Spark)carArr[1]).toString()  );
		System.out.println( ((ModelX)carArr[2]).toString()  );
		System.out.println( carArr[3].toString()  );
		System.out.println( carArr[4].toString()  );
		
		
		carArr[0].toString();
		// carArr[0]�� Car �������� �̹Ƿ� 
		// Car Ŭ������ ���ǵ� toString() �޼ҵ带 ȣ���ϰ� �ȴ�.
		// CarŬ������ toString() �޼ҵ�� carArr[0].toString()�� �����.
		// == ���� ���ε�
		//    ���α׷� ���� �� ������ �ܰ迡�� �޼ҵ�� �޼ҵ� ȣ��θ� ����
		
		// ���� �ڵ� ���� ��
		// carArr[0].toString() ������ Car Ŭ������ toString() �ƴ϶�
		// �������̵� �� Porter Ŭ������ toString()�� ȣ���ϰ� ��.
		// == ���� ���ε�
		//    ���α׷� ���� �� ���� ���ε��� �޼ҵ带 �����ϴ� ���� �ƴ�
		//    �����ϴ� ��ü�� �������̵��� �޼ҵ�� �����Ͽ� �����ϴ� ��.
		
		
		// for + ��ü�迭 + �������ε�
		System.out.println("---------------------------------");
		
		/*
		for(int i=0 ; i<carArr.length ; i++) {
			System.out.println(carArr[i].toString());
		}
		*/
		
		// + ���� for��, print�� Ư��
		/*for(Car car : carArr ) {
			System.out.println(car);
		}*/
		
		
		for(Car car : carArr)  System.out.println(car);
		// for, while, if�� ó�� �ڽŸ��� ���� {}�� ������ �ڵ忡 �ش�
		// {}��ȣ�� ������ 
		// for �ٷ� ������ ���� �� �� (�����ݷ� ; ������ �� ��) ������
		// �ݺ��ϰ� ��.
		
		// 1. ����, ����
		// 2. �ڵ� �帧(����, �Ű�����, ��ȯ��, � �޼ҵ� ȣ�� �ľ�)
		// 3. ����
	}
	
	
	public void example4() {
		ModelX m1 = new ModelX("�������", 6, "��������", "��������");
		Porter p1 = new Porter("����", 20, "ū", 20, "ū");
		Spark s1 = new Spark("�ֹ���", 4, "����", "��ũ");
		Car c1 = new Car("����6����", 4, "����");
		
		printCar(m1);
		printCar(p1);
		printCar(s1);
		printCar(c1);
		// printCar() �޼ҵ带 ȣ���ϱ� ���ؼ���
		// Car ��ü Ÿ���� �ּҸ� �����ϰų�
		// Car�� ��� ���迡 �ִ� ��ü Ÿ���� �ּҸ� �����ؾ� �Ѵ�.(������(��ĳ����))
		
	}
	
	// �Ű������� ������ ����
	// ��ĳ���� : �θ� Ÿ�� ���� ������ �ڽ� ��ü �ּҸ� �����ϴ� ��
	// ���� ���ε� : �θ� Ÿ�� ���� ������ �޼ҵ� ȣ�� �� �������̵��� �ڽ� �޼ҵ�� ����Ǿ� ����Ǵ� ��.
	// ���� : �Ű������� Ÿ���� �޸��ϴ� �޼ҵ带 �ۼ��� �ʿ䰡 ����. (�ڵ� ���� ����, ���뼺)
	
	public void printCar(Car car) { // �Ű������� Car Ÿ�� ��ü �ּҸ� ���� ����
		// (Car car) : Car Ÿ�� ��ü �ּҸ� ���� �޴� �Ű����� 
		//			   && Car Ÿ�� ���� ���� 
		//			   && Porter, Spark, ModelX�� �θ� Ÿ�� ���� ����
		//System.out.println(car);
		
		
		//*** instanceof ������
		// 1. ���������� �����ϴ� ��ü�� Ư�� �ڷ��� ��ü�� �´°�
		// 2. ���������� �����ϴ� ��ü�� Ư�� �ڷ����� ��� �޾Ҵ°�
		//    -> true == Ư�� �ڷ������� ��ĳ���� �Ǵ´ٿ�ĳ������ ������ ����
		
		

		
		// car�� �����ϴ� ��ü�� Porter�� ���
		// "OO������ ����ϴ� OO�� ���ʹ� OO��ĭ�� OO���� ����, OO�ڵ��� ����Ѵ�."
		if(car instanceof Porter) {
			Porter p = (Porter)car; // ���� ���� car�� Porter Ÿ������ �ٿ� ĳ����
			
			System.out.printf("%s������ ����ϴ� %.1f�� ���ʹ� %s��ĭ�� %d���� ����, %s�ڵ��� ����Ѵ�.\n",
						p.getEngine(), p.getWeight(), p.getBay(), p.getWheel(), p.getHandle());
			
		}
		
		// car�� �����ϴ� ��ü�� Spark�� ���
		// "OO�� ����ũ�� OO������ ����ؼ� ���� ����."
		else if(car instanceof Spark) {
			
			Spark s = (Spark)car; // Car -> Spark �ٿ� ĳ����
			
			System.out.printf("%s�� ����ũ�� %s������ ����ؼ� ���� ����.\n",
							  s.getColor() , s.getEngine());
		
		}
		
		// car�� �����ϴ� ��ü�� ModelX�� ���
		// "�׽��󿡼� ���� ModelX�� OO���͸���, OO������ ����Ѵ�."
		else if(car instanceof ModelX) {
			
			ModelX x = (ModelX)car;
			
			System.out.printf("�׽��󿡼� ���� ModelX�� %s���͸���, %s������ ����Ѵ�.\n",
								x.getBattery() , x.getEngine());
		}
		
		
		// car�� �����ϴ� ��ü�� Car�� ���
		// "������ ������ OO����, ���� O��, OOO�ڵ��� �ִ�."
		//else if(car instanceof Car) {
		else {
			
			System.out.printf("������ ������ %s����, ���� %d��, %s�ڵ��� �ִ�.\n",
						car.getEngine(), car.getWheel(), car.getHandle());
		}
		
		
	}
	
	/*
	public void printCar(Porter p) { 
		System.out.println(p);
	}
	
	public void printCar(Spark s) { 
		System.out.println(s);
	}
	
	public void printCar(ModelX x) { 
		System.out.println(x);
	}*/
	
	
	// ��ȯ���� ������ ���� + �Ű������� ������ ����
	public Car searchCar(Car c) {
		
		// Car[] ��ü�迭 3ĭ�� �����ؼ�
		// �� �ε����� Porter, Car, Spark ��ü�� �ʱ�ȭ
		
		// ���޹��� c�� Ÿ���� ���� ��ü�� Car[] ��ü �迭�� �����ϸ�
		// �ش� ��ü�� ��ȯ
		// ������ null ��ȯ
		
		Car[] carArr = new Car[3];
		carArr[0] = new Porter("����", 8, "��", 5, "��");
		carArr[1] = new Car("��", 4, "ū");
		carArr[2] = new Spark("����", 4, "����", "����");
		
		
		if(c instanceof Porter) { 
			// ���� ���� c�� �����ϴ� ��ü�� Porter Ÿ���� ���
			return carArr[0];
			
		}else if(c instanceof Spark) {
			// ���� ���� c�� �����ϴ� ��ü��  Spark Ÿ���� ���
			return carArr[2];
			
		}else if(c instanceof Car) {
			// ���� ���� c�� �����ϴ� ��ü��  Car Ÿ���� ���
			// --> Car, ModelX �� ��ü�� �ش� ������ ������.
			
			if(c instanceof ModelX ) {
				// ���� ���� c�� �����ϴ� ��ü��  ModelX Ÿ���� ���
				return null;
			}else {
				// ���� ���� c�� �����ϴ� ��ü��  Car Ÿ���� ���
				return carArr[1];
			}
		}
		
		// ���� ���� c�� �ƹ��͵� �������� �ʴ� null�� ���
		return null;
	}
	
	
	public void example5() {
		
		Spark s1 = new Spark();
		System.out.println(  searchCar(s1)    );
		
		
		System.out.println( searchCar(new Porter())  );
		System.out.println( searchCar(new Car())  );
		System.out.println( searchCar(new ModelX())  );
		System.out.println( searchCar(null)  );
		
		Car c1 = searchCar(new Spark());
		
		System.out.println("c1 : " + c1);
		
	}
	
	
	
	
	
	
	
	
	
	

	
}
