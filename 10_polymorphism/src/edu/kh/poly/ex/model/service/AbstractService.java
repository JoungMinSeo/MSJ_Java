package edu.kh.poly.ex.model.service;

import edu.kh.poly.ex.model.vo.Animal;
import edu.kh.poly.ex.model.vo.Chicken;
import edu.kh.poly.ex.model.vo.Dog;

public class AbstractService {
	
	public void example1() {
		
		//Animal a1 = new Animal();
		// Animal은 추상 클래스다
		// -> 추상 클래스는 미완성 클래스다
		// --> 미완성된 클래스로는 객체를 만들 수 없다.
		
		Chicken c1 = new Chicken("조류", "잡식", "우리집마당", 2);
		
		// Chicken 구현된 추상 메소드 호출
		c1.move();
		c1.eat();
		c1.breath();
		
		Dog d1 = new Dog("강아지과", "잡식", "우리집");
		d1.move();
		d1.eat();
		d1.breath();
		
		// 추상 클래스는 객체 생성은 불가능 하지만
		// 부모 타입 참조변수로는 사용할 수 있다.
		Animal[] arr = new Animal[3];
		// Animal 참조변수 2개를 가지고 있는 Animal 배열을 생성한 후
		// 그 주소를 arr이 참조한다.
		
		// (Animal 참조변수)
		//arr[0] = new Chicken(); // Chicken 객체
		arr[0] = c1; 
		arr[1] = d1;
		arr[2] = new Dog("강아지과", "쩝쩝 먹는다.", "헥헥 숨쉰다.");
		
		System.out.println("---------------------------");
		for(Animal a : arr) {
			// 참조변수 a가 Animal 타입이기 때문에
			// Animal이 가지고 있는 미완성 메소드 move(), eat(), breath()와
			// 연결이 되지만(정적바인딩) 에러가 발생하지 않음.
			// -> 왜? 실행 시 오버라이딩된 자식의 move(), eat(), breath()와
			//    연결이 되기 때문에 오류를 발생시키지 않는다. (동적바인딩)
			
			a.move(); 
			a.eat();
			a.breath();
		}
		
		
		
		
	}
	
	
	
	
	
}



