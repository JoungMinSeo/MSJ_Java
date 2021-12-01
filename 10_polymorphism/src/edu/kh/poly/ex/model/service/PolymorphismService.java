package edu.kh.poly.ex.model.service;

import javax.print.PrintService;

import edu.kh.poly.ex.model.vo.Car;
import edu.kh.poly.ex.model.vo.ModelX;
import edu.kh.poly.ex.model.vo.Porter;
import edu.kh.poly.ex.model.vo.Spark;

public class PolymorphismService {

	public void example1() {
		
		Car c = new Car();
		// 부모 타입 참조변수 = 부모 타입 객체 
		
		// 부모 타입 참조 변수로 
		// 부모 객체의 메소드를 접근할 수 있다.
		c.setEngine("엔진있음");
		c.setHandle("보통핸들");
		c.setWheel(4);
		
		Porter p = new Porter();
		// 자식 타입 참조변수 = 자식 타입 객체

		// 자식 타입 참조 변수로 
		// 자식 객체의 메소드를 접근할 수 있다.
		p.setEngine("경유엔진");
		p.setHandle("크고 동그란 핸들");
		p.setWheel(8);
		p.setWeight(4.5);
		p.setBay("큰 짐칸");
		
		
		// 다형성 적용
		
		// 부모 타입 참조변수 = 자식 타입 객체
		Car c2 = new Porter();
		// Car, Porter 자료형이 다름
		// 컴퓨터는 같은 자료형 끼리만 연산이 가능하다 -> 이를 위배한 모양
		
		// 부모 타입의 참조 변수로는
		// 아무리 자식 객체를 참조하고 있어도
		// 상속 받은 부모 부분만 참조 가능하다.
		c2.setEngine("경유엔진");
		c2.setHandle("크고 동그란 핸들");
		c2.setWheel(8);
		
		System.out.println(c2.getEngine());
		System.out.println(c2.getHandle());
		System.out.println(c2.getWheel());
		
		System.out.println(c2.toString());
		
		Car c3 = new Spark();
		Car c4 = new ModelX();
		
		//Car c5 = new String("abc");
		// -> String은 Car를 상속 받지 않아서 다형성(업캐스팅)이 적용되지 않음.
	}
	
	
	public void example2() {
		
		// 업 캐스팅 : 부모 타입 참조 변수로   자식 객체 주소를 참조
		
		// 다운 캐스팅 : 부모 타입의 참조 변수를  자식 타입으로 형변환 하여
		// 		          자식 객체를 온전히 참조함.
		
		
		// 업 캐스팅
		Car c = new Spark("휘발유엔진", 4, "작은 핸들", "검정");
		// 부모 타입 참조 변수         // 자식 객체
		
		System.out.println( c.getEngine() );
		System.out.println( c.getWheel() );
		System.out.println( c.getHandle() );
		// 엔진, 바퀴, 핸들은 부모로 부터 상속 받은 것
		
		//System.out.println( c.getColor() );
		// 색상은 자식만의 멤버 --> 부모 참조 변수로 참조할 수 없다
		// --> 부모 참조 변수를   자식 참조 변수로 형변환!
		
		System.out.println(   ((Spark)c).getColor() );
		// (Spark) 형변환 연산자 보다  . 점 연산자가 우선 순위 높음
		// --> 부모 참조 변수와 형변환 연산자 (Spark)를 괄호()로 묶어 먼저 연산처리함.
		
		Car c2 = new ModelX("전기 모터", 4, "멋있는 핸들", "수소전지");
		Car c3 = new Porter("경유엔진", 12, "엄청 큰 핸들", 11, "짱큼");
		
		System.out.println( c2.getEngine() );
		System.out.println( c2.getHandle() );
		System.out.println( c2.getWheel() );
		
		// 다운 캐스팅
		System.out.println( ((ModelX)c2).getBattery()    );
		
		// Car 타입 참조 변수 c3를 자식인 Porter 타입 참조 변수로 다운 캐스팅하여
		// c3에 저장된 주소를 Porter 참조변수 p에 대입
		Porter p = (Porter)c3;
		
		System.out.println( p.getEngine());
		System.out.println( p.getHandle() );
		System.out.println( p.getWheel() );
		System.out.println( p.getWeight()  );
		System.out.println( p.getBay() );
	}
	
	
	public void example3() {
		
		// 객체배열과 다형성
		
		// 배열 : 같은 자료형을 하나의 묶음으로 다루는 것
		// 객체 배열 : 객체 참조 변수 여러 개를 하나의 묶음으로 다루는 것
		
		// 포터 5대 관리 프로그램
		//Porter[] porterArr = new Porter[5];
		//Spark[] sparkArr = new Spark[10];
		
		// 자동차 관리 프로그램
		Car[] carArr = new Car[5];
		// Car 참조 변수 5칸 짜리 배열을 Heap에 생성해서 
		// 해당 주소를 Car배열 참조변수 carArr에 대입하여 참조하게함.
		
		carArr[0] = new Porter("경유", 4, "보통핸들", 1, "작음");
		// carArr[0] 과 같이 carArr의 모든 배열 요소는
		// 부모 타입 참조 변수이기 때문에 자식 객체를 참조하는 업 캐스팅이 가능하다.
		
		carArr[1] = new Spark("무연", 4, "작은 핸들", "민트");
		
		carArr[2] = new ModelX("모터", 4, "멋있는 핸들", "2021년식 수소전지");
		
		carArr[3] = new Car("모름", 8, "커보임");
		
		carArr[4] = new Porter("경유", 20, "완전 큼", 15, "완전~ 큼");
		
		
		// carArr 각 배열 요소가 참조하는 객체 정보 모두 출력
		System.out.println( ((Porter)carArr[0]).toString()  );
		// carArr[0]은 car 참조 변수
		// carArr[0]이 참조하고 있는 객체는 Porter
		// 지금 원하는 것 : Porter에 오버라이딩된 toString() 호출
		// -> carArr[0]으로 호출하면 오버라이딩 전 부모의 toString()이 호출될 것 같다.
		// --> carArr[0]을 Porter로 다운캐스팅해서 호출하면
		//     오버라이딩된 toString()이 호출될 것 같다.
		
		System.out.println( ((Spark)carArr[1]).toString()  );
		System.out.println( ((ModelX)carArr[2]).toString()  );
		System.out.println( carArr[3].toString()  );
		System.out.println( carArr[4].toString()  );
		
		
		carArr[0].toString();
		// carArr[0]은 Car 참조변수 이므로 
		// Car 클래스에 정의된 toString() 메소드를 호출하게 된다.
		// Car클래스의 toString() 메소드와 carArr[0].toString()이 연결됨.
		// == 정적 바인딩
		//    프로그램 실행 전 컴파일 단계에서 메소드와 메소드 호출부를 연결
		
		// 실제 코드 실행 시
		// carArr[0].toString() 구문이 Car 클래스의 toString() 아니라
		// 오버라이딩 된 Porter 클래스의 toString()을 호출하게 됨.
		// == 동적 바인딩
		//    프로그램 실행 시 정적 바인딩된 메소드를 실행하는 것이 아닌
		//    참조하는 객체에 오버라이딩된 메소드와 연결하여 실행하는 것.
		
		
		// for + 객체배열 + 동적바인딩
		System.out.println("---------------------------------");
		
		/*
		for(int i=0 ; i<carArr.length ; i++) {
			System.out.println(carArr[i].toString());
		}
		*/
		
		// + 향상된 for문, print문 특성
		/*for(Car car : carArr ) {
			System.out.println(car);
		}*/
		
		
		for(Car car : carArr)  System.out.println(car);
		// for, while, if문 처럼 자신만의 지역 {}를 가지는 코드에 해당
		// {}기호가 없으면 
		// for 바로 다음에 오는 한 줄 (세미콜론 ; 까지가 한 줄) 까지를
		// 반복하게 함.
		
		// 1. 정의, 개념
		// 2. 코딩 흐름(변수, 매개변수, 반환값, 어떤 메소드 호출 파악)
		// 3. 로직
	}
	
	
	public void example4() {
		ModelX m1 = new ModelX("전기모터", 6, "간지좔좔", "수소전지");
		Porter p1 = new Porter("경유", 20, "큰", 20, "큰");
		Spark s1 = new Spark("휘발유", 4, "작은", "핑크");
		Car c1 = new Car("경유6기통", 4, "보통");
		
		printCar(m1);
		printCar(p1);
		printCar(s1);
		printCar(c1);
		// printCar() 메소드를 호출하기 위해서는
		// Car 객체 타입의 주소를 전달하거나
		// Car와 상속 관계에 있는 객체 타입의 주소를 전달해야 한다.(다형성(업캐스팅))
		
	}
	
	// 매개변수에 다형성 적용
	// 업캐스팅 : 부모 타입 참조 변수로 자식 객체 주소를 참조하는 것
	// 동적 바인딩 : 부모 타입 참조 변수로 메소드 호출 시 오버라이딩된 자식 메소드와 연결되어 실행되는 것.
	// 이점 : 매개변수의 타입을 달리하는 메소드를 작성할 필요가 없다. (코드 길이 감소, 재사용성)
	
	public void printCar(Car car) { // 매개변수로 Car 타입 객체 주소를 전달 받음
		// (Car car) : Car 타입 객체 주소를 전달 받는 매개변수 
		//			   && Car 타입 참조 변수 
		//			   && Porter, Spark, ModelX의 부모 타입 참조 변수
		//System.out.println(car);
		
		
		//*** instanceof 연산자
		// 1. 참조변수가 참조하는 객체가 특정 자료형 객체가 맞는가
		// 2. 참조변수가 참조하는 객체가 특정 자료형을 상속 받았는가
		//    -> true == 특정 자료형으로 업캐스팅 또는다운캐스팅이 가능한 상태
		
		

		
		// car가 참조하는 객체가 Porter일 경우
		// "OO엔진을 사용하는 OO톤 포터는 OO짐칸과 OO개의 바퀴, OO핸들을 사용한다."
		if(car instanceof Porter) {
			Porter p = (Porter)car; // 전달 받은 car를 Porter 타입으로 다운 캐스팅
			
			System.out.printf("%s엔진을 사용하는 %.1f톤 포터는 %s짐칸과 %d개의 바퀴, %s핸들을 사용한다.\n",
						p.getEngine(), p.getWeight(), p.getBay(), p.getWheel(), p.getHandle());
			
		}
		
		// car가 참조하는 객체가 Spark일 경우
		// "OO색 스파크는 OO엔진을 사용해서 연비가 좋다."
		else if(car instanceof Spark) {
			
			Spark s = (Spark)car; // Car -> Spark 다운 캐스팅
			
			System.out.printf("%s색 스파크는 %s엔진을 사용해서 연비가 좋다.\n",
							  s.getColor() , s.getEngine());
		
		}
		
		// car가 참조하는 객체가 ModelX일 경우
		// "테슬라에서 만든 ModelX는 OO배터리와, OO엔진을 사용한다."
		else if(car instanceof ModelX) {
			
			ModelX x = (ModelX)car;
			
			System.out.printf("테슬라에서 만든 ModelX는 %s배터리와, %s엔진을 사용한다.\n",
								x.getBattery() , x.getEngine());
		}
		
		
		// car가 참조하는 객체가 Car일 경우
		// "차종은 모르지만 OO엔진, 바퀴 O개, OOO핸들이 있다."
		//else if(car instanceof Car) {
		else {
			
			System.out.printf("차종은 모르지만 %s엔진, 바퀴 %d개, %s핸들이 있다.\n",
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
	
	
	// 반환형에 다형성 적용 + 매개변수에 다형성 적용
	public Car searchCar(Car c) {
		
		// Car[] 객체배열 3칸을 선언해서
		// 각 인덱스에 Porter, Car, Spark 객체를 초기화
		
		// 전달받은 c와 타입이 같은 객체가 Car[] 객체 배열에 존재하면
		// 해당 객체를 반환
		// 없으면 null 반환
		
		Car[] carArr = new Car[3];
		carArr[0] = new Porter("경유", 8, "중", 5, "중");
		carArr[1] = new Car("모름", 4, "큰");
		carArr[2] = new Spark("무연", 4, "작은", "레드");
		
		
		if(c instanceof Porter) { 
			// 전달 받은 c가 참조하는 객체가 Porter 타입인 경우
			return carArr[0];
			
		}else if(c instanceof Spark) {
			// 전달 받은 c가 참조하는 객체가  Spark 타입인 경우
			return carArr[2];
			
		}else if(c instanceof Car) {
			// 전달 받은 c가 참조하는 객체가  Car 타입인 경우
			// --> Car, ModelX 두 객체가 해당 조건을 만족함.
			
			if(c instanceof ModelX ) {
				// 전달 받은 c가 참조하는 객체가  ModelX 타입인 경우
				return null;
			}else {
				// 전달 받은 c가 참조하는 객체가  Car 타입인 경우
				return carArr[1];
			}
		}
		
		// 전달 받은 c가 아무것도 참조하지 않는 null일 경우
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
