package edu.kh.collection.ex.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.ex.model.vo.Student;

public class ListService {
	
	// Collection이란?
	// - 자바에서 제공하는 자료구조를 담당하는 프레임워크
	
	// Collection의 장점 (== 배열 단점 보완)
	// 1. 크기 제약이 없다.
	// 2. 추가, 삭제, 검색, 정렬 등의 기능이 내장되어 있음.
	// 3. 여러 데이터 타입을 저장할 수 있다.
	//    (단, 기본 자료형은 Wrapper Class로 변형해서 저장)
	
	
	// List 
	// - 순서가 유지되며, 중복 데이터 저장이 가능하다
	//   (데이터가 순차적으로 나열된 배열과 비슷한 모양)
	
	public void example1() {
		
		// ArrayList
		// - List의 후손
		// - 배열처럼 사용 가능하지만 배열의 단점이 보완되어있다.
		
		ArrayList list = new ArrayList(); // 초기용량 10
		ArrayList list2 = new ArrayList(3); // 초기용량 3
		
		
		// 1. add(E e) : 리스트의 끝에 인스턴스 데이터를 추가하는 메소드
		//  E == Object			   (객체 참조 주소)
		list2.add( new String("Hello World") );
		list2.add( new String("배고파요") );
		
		// 컬렉션은 데이터 타입의 제한이 없다
		list2.add( new Integer(10) );
		
		// 2. toString() : 리스트에 저장된 모든 요소를 한 줄로 보여지도록 오버라이딩 되어있음.
		System.out.println( list2.toString() );
		
		// 지정된 ArrayList의 크기보다 초과된 데이터를 추가
		list2.add( new Double(3.14) ); // 크기의 제한이 없음. (알아서 늘고 줄고 함)
		
		System.out.println( list2 );
	
		// 향상된 for문으로 출력
		// -> 배열, 컬렉션 객체에 저장된 요소를 순서대로 하나씩 꺼내오는 for문
		for(Object o : list2) {
			System.out.println(o);
		}
		
		System.out.println("------------------------");
		System.out.println("[일반 for문 출력]");
		
		// 3. size() : List에 저장된 데이터의 개수 반환
		System.out.println("size() : " + list2.size());
		
		// 4. get(int index) : List에 저장된 index번째 요소 반환
		for(int i=0 ; i<list2.size() ; i++ ) {
			System.out.println( list2.get(i) );
		}
		
		// 5. Object set(int index, E e) : List 내의 index번째 요소를 e로 변경
		Object obj = list2.set(1, new Student("홍길동", 17, 1));
		
		System.out.println("반환된 Object : " + obj);
		System.out.println(list2);
		
		// 6. Object remove(int index) : 
		// List 내의 index번째 요소를 제거 하고, 제거된 요소를 반환함. 
		// 중간에 빈칸이 없도록 index번째 뒤에 요소들을 한 칸씩 당김.
		Object obj2 = list2.remove(2);
		
		System.out.println("제거된 2번 인덱스 내용 : " + obj2);
		System.out.println(list2);
		
		
		// 향상된 for문을 이용하여 list2에 저장된 모든 요소 출력
		// 단, 자료형이 String이면 "String : ",
		// Student이면 "Student : ",
		// Double이면 "Double : " 이라고 앞에 출력
		// 그리고 학생은 이름만 출력
		for(Object o : list2) { // 다형성(업캐스팅)
			
			if( o instanceof String ) {
				System.out.println("String : " + o.toString());
				
			} else if(o instanceof Double) {
				System.out.println("Double : " + o);
				
			} else if(o instanceof Student) {
				System.out.println("Student : " + ((Student)o).getName()   );
			}								// 업 캐스팅 상태라 참조 불가 -> 다운 캐스팅
			
		}
		
	}
	
	
	public void example2() {
		// Generics(제네릭, 제네릭스, 지네릭) :  <E>
		// 클래스, 메소드, 컬렉션 내부에 사용될 클래스 타입을
		// 한 종류로 제한하는 기능.
		
		// 컬렉션에 여러 타입이 저장되면
		// 필요 시 마다 타입검사, 형변환이 수시로 일어나게 된다. -> 굉장히 번거롭고 복잡함.
		// -> 제네릭을 이용해 컬렉션을 하나의 타입만 저장할 수 있게 제한
		
		// 제네릭의 이점 
		// 1) 하나의 타입으로 제한되기 때문에 타입검사, 형변환이 필요 없다.
		//    -> 컴파일 단계에서 강력한 타입 체크 가능
		
		// 2) 하나의 코드로 여러 타입 처리가 가능하다.
		
		// List에 다형성 + 제네릭 적용
		List<Student> list = new ArrayList<Student>();
		
		// List는 인터페이스
		// ArrayList는 List를 상속받아 구현한 클래스
		// (부모타입참조변수) List list = (자식타입객체)new ArrayList();
		//	 --> 업캐스팅
		
		// List<Student> list  
		// -> 타입이 Student로 제한된 List 자식 객체를 참조하는 참조변수
		
		// new ArrayList<Student>()
		// -> 타입이 Student로 제한된 ArrayList 객체 생성
		
		// ArrayList<Student>
		// add(Student e)
		list.add( new Student("홍길동", 17, 1) );
		list.add( new Student("김유신", 19, 3) );
		list.add( new Student("신사임당", 15, 2) );
		
		// 향상된 for문으로 출력
		for( Student std : list ) {
			System.out.println(std.getName());
			// instanceof 같은 타입 검사 필요 X
			// 다운캐스팅 필요 X
		}
		
		
		// list에서 김유신 학생이 있는 1번 인덱스 삭제
		Student removeStudent = list.remove(1);
		
		System.out.println("removeStudent : " + removeStudent);
		
		for(Student std : list) {
			System.out.println(std);
		}
		
		
		// 7. int indexOf(Object o)
		// -> o가 참조하는 객체와 같은(동등) 객체가 List에 있는지 확인하여
		//    있으면 같은 객체의 index, 없으면 -1을 반환
		//  --> 동등 비교를 위해 equlas가 오버라이딩 되어있어야 함.
		
		// 신사임당이 있는 인덱스 검색
		int index = list.indexOf( new Student("신사임당", 15, 2) );
		
		System.out.println("신사임당의 index : " + index);
		
		
		// 8. boolean isEmpty() : List가 비어있으면 true, 아니면 false 반환
		
		System.out.println("list는 비어있는가? " + list.isEmpty()); // false
		
		
		// 9. void clear() : List 내의 모든 요소를 삭제
		list.clear();
		
		System.out.println("clear() 후 list는 비어있는가? " + list.isEmpty());
		
	}
	
	
	
	
	
}
