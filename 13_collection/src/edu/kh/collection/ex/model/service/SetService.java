package edu.kh.collection.ex.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetService {

	// Set(집합)
	// - 순서가 존재하지 않음 (== 인덱스가 없다)
	// - 중복 데이터 저장 불가능. (null도 하나만 저장 가능)
	//  -> 중복 확인을 위해서 equals()가 반드시 오버라이딩 되어 있어야 한다.
	
	public void example1() {
		// HashSet 
		// - 객체 저장 시 hashCode() (해시함수)를 이용해
		//   빠른 처리와 중복 검사가 가능한 Set
		// - equals() 뿐만 아니라 hashCode()도 오버라이딩 되어 있어야 하단.
		
		Set<String> set1 = new HashSet<String>();
		// String 같이 자바에서 제공해주는 클래스는
		// 대부분 equals(), hashCode() 오버라이딩 잘 되어있다.
		
		set1.add( new String("Apple") );
		set1.add( new String("Samsung") );
		set1.add( new String("LG") );
		set1.add( new String("Apple") );
		set1.add( new String("사과") );
		set1.add( new String("삼성") );
		set1.add( new String("엘지") );
		set1.add( new String("Hello") );
		set1.add( new String("World") );
		//set1.add( null );
		//set1.add( null );
		//set1.add( null );
		
		System.out.println(set1.toString());
		// 순서 유지 X, 중복 제거 O
		
		
		// Set에서 값 하나만 꺼내기
		// -> Set은 원하는 값 하나만 얻어 오는 것이 불가능하다.
		//  --> 하나씩 꺼내서 확인을 해야 함.
		
		// 1. Iterator 반복자
		// - 컬렉션 프레임워크에서 제공하는 
		//   컬렉션 객체 요소를 하나씩 반복 접근해 얻어오는 방법.
		
		Iterator<String> it = set1.iterator();
		// set1.iterator() : set1 집합에 저장된 내용을 하나씩 꺼내올수 있는 형태로 변형하는 메소드
		
		while(it.hasNext()) {
			// it.hasNext() : 꺼내올 다음 값이 있는지 검사. 있으면 true, 없으면 false
			
			String str = it.next();
			System.out.println(str);
			// it.next() : 다음 값 꺼내오기
		}
		
		System.out.println("--------------------");
		// 2. 향상된 for문을 이용
		for(String s :  set1){
			System.out.println(s);
		}
	}
	
	
	public void lotto1() {
		
		Set<Integer> lotto = new HashSet<Integer>(); 
		
		while(true) {
			
			int ran = (int)(Math.random() * 45 + 1);
			// 1 ~ 45 사이 난수
			
			lotto.add(ran); // AutoBoxing(int -> Integer)
			
			if(lotto.size() == 6) {
				// lotto에 중복 없이 6개가 저장된 경우
				break;
			}
		}
		System.out.println(lotto);
		
	}
	
	
	
	public void example2() {
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		// LinkedHashSet : 순서를 유지하는 HashSet
		
		for(int i=0 ; i<20 ; i++) {
			set1.add("a"+i); // a0, a1, a2 ...
			set2.add("a"+i);
		}
		
		System.out.println(set1);
		System.out.println(set2);
		
		// set1은 Iterator를 이용해 출력
		Iterator<String> it1 = set1.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("==================");
		
		// set2는 향상된 for문을 이용해 출력
		for(String s : set2) {
			System.out.println(s);
		}
		
	}
	
	
	public void lotto2() {
		// TreeSet을 이용한 정렬된 로또 번호 생성기
		// TreeSet : 이진 트리 자료 구조를 이용해 저장된 데이터가 자동 정렬되는 Set
		//			 (기본적으로 Set이기 때문에 데이터 중복 저장도 안된다)
		
		Set<Integer> lotto = new TreeSet<Integer>();
		
		
		while(true) {
			int ran = (int)(Math.random() * 45 + 1);
			
			lotto.add(ran); // AutoBoxing
			
			if(lotto.size() == 6) {
				break;
			}
		}
			
		System.out.println(lotto);
	}
	


	public void lotto3() {
		// List + Set 합친 로또 번호 생성기
	
		// 금액 입력 : 3000
		// [1,2,3,4,5,6]
		// [1,2,3,4,5,6]
		// [1,2,3,4,5,6]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 입력 : ");
		
		try {
			int money = sc.nextInt();
			
			if(money < 1000) {
				System.out.println("1000원 미만 금액이 입력되었습니다.");
				
				return; // -> 현재 메소드 강제종료 후 호출한 곳으로 돌아가기
				// (반환형이 void인 메소드 제일 마지막에 컴파일러가 자동 추가)
				
				// 현재 메소드를 종료하고 호출한 곳으로 오른쪽에 작성된 값을 가지고 반환한다.(돌아간다)
			
			}else if(money > 1000000) {
				System.out.println("1인 최대 구매 가능 금액은 10만원을 초과할 수 없습니다.");
				return;
			}
			
			// 생성된 로또 번호를 저장할 List
			List<Set<Integer>> lottoList = new ArrayList<Set<Integer>>();
			// -> Integer로 타입이 제한된 Set 객체만 저장하는 List
			
			for(int i=0 ; i<money/1000 ; i++) {
				
				// 로또 번호 한 줄 생성
				Set<Integer> lotto = new TreeSet<Integer>();
				while(true) {
					lotto.add(  (int)(Math.random() * 45 +1)  );
					
					if(lotto.size() == 6) break;
				}
				
				lottoList.add(lotto); // 리스트에 생성된 로또 번호 한 줄 추가
			}
			
			// 리스트에 저장된 로또 번호 모두 출력
			for( Set<Integer> lotto  : lottoList) {
				System.out.println(lotto);
			}
			
		}catch(InputMismatchException e) {
			System.out.println("정수가 아닌 문자가 입력되어 종료됩니다.");
		}
		
	
		// 보완해야 할 점
		// 1. 1000원 미만 입력
		// 2. 정수가 아닌 문자 입력  O
		// 3. 10만원 이하 까지만 구매 가능
		
		// 4. 1000원 단위가 아닌 입력
		
		// 추가할 기능
		// 1. 로또 당첨번호 생성
		// 2. 당첨 확인
	}
	
	
	
	
}
