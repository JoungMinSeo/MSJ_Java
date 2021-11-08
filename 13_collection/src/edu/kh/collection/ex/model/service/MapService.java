package edu.kh.collection.ex.model.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.ex.model.vo.Student;

public class MapService {

	// Map : Key와 Value 한 쌍이 하나의 데이터가 되어 이를 모아둔 객체
	
	// Key는 중복을 허용하지 않고, 순서가 없어서 Map 내부에 뒤죽박죽 정렬된다.
	// == Set의 특징
	
	// Value는 Key에 의해서 중복되는 값이 저장되어도 구분이 된다.
	// == List의 특징
	
	public void example1() {
		//Map<String, Student> map = new HashMap<String, Student>();
		Map<String, Student> map = new LinkedHashMap<String, Student>();
		// Map은 K,V 한 쌍으로 이루어 져있고, K,V 모두 객체이어야 한다.
		
		// HashMap
		// - Key에 해당되는 객체가 hashCode(), equals() 오버라이딩이 되어있어야 한다.
		
		Student std1 = new Student("홍길동", 17, 1);
		
		// 학생 std1에 학번을 추가하여 map에 저장
		// put(key, value) : Map에 데이터를 추가하는 메소드
		map.put("H001", std1);
		map.put("M001", new Student("신사임당", 15, 2));
		map.put("H002", new Student("김유신", 19, 3));
		map.put("E001", new Student("강감찬", 13, 6));
		map.put("M002", new Student("이순신", 16, 3));
		
		System.out.println(map.toString());
		
		
		// Iterator로 한 줄 씩 출력하기
		// Set<E> keySet() : Map 데이터 중 Key만 하나의 집합(Set)으로 만들어 반환
		Set<String> set = map.keySet(); // map의 Key에 해당하는 학번만 모두 담김.
		
		Iterator<String> it = set.iterator();
		// 학번을 하나씩 반복 접근
		
		while(it.hasNext()) {
			// 다음 반복 접근할 값이 있다면
			
			String key = it.next(); // 꺼내온 학번(key)를 변수 key에 저장
			
			// E get(Object key) : Map에서 key값이 일치하는 데이터의 value를 반환
			Student value = map.get(key); // Student("홍길동", 17, 1)
			
			// K = V 형식으로 출력
			System.out.println(key + " = " + value);
		}
		
	}
	
	public void example2() {
		
		Map<Integer, String> map = new HashMap<>();
		// -> 타입 추론 : 객체 생성 구문에 제네릭이 비어 있어도
		//			   참조 변수에 작성된 제넥으로 타입 제한이 되는 것.
		
		int number = 1;
		map.put(number++ , "김밥"); // 1
		map.put(number++ , "라면"); // 2
		map.put(number++ , "피자"); 
		map.put(number++ , "삼겹살"); 
		map.put(number++ , "샐러드"); 
		map.put(number++ , "곱창"); 
		map.put(number++ , "샌드위치"); 
		map.put(number++ , "굶기"); 
		
		System.out.println(map);
		
		
		map.put(1, "고추김밥");
		System.out.println(map);
		
		// Map은 중복되는 키를 가진 데이터가 들어오면
		// 중복으로 판단해 제거하는 것이 아닌
		// 키는 유지하되, Value만 새로운 데이터로 변경

		
		// Iterator를 이용하여 하나씩 반복 접근하기
		// Set<Map.Entry<K,V>> entrySet()
		// -> Map을 키와 값 쌍으로 구성된 Map.Entry를 Set객체에 담아 반환
		// ( Map.Entry == K,V 쌍을 한번에 나타는 객체 )
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		// 반복 접근 하면서 Map.Entry를 하나씩 꺼내옴
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			// entrySet에 저장된 Map.Entry 객체를 하나 얻어와 entry 변수에 저장
			
			// entry에는 key와 value가 모두 담겨있다.
			System.out.println( entry.getKey() + " = " + entry.getValue() );
			// entry.getKey() : entry에 있는 key를 반환
			// entry.getValue() : entry에 있는 value를 반환
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
