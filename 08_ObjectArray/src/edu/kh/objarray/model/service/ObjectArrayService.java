package edu.kh.objarray.model.service;

import java.util.Scanner;
import edu.kh.objarray.model.vo.Book;

public class ObjectArrayService {

	private Book[] books = null;
	// null : 아무것도 참조하고 있지 않은 상태
	
	private Scanner sc = new Scanner(System.in);
	// Scanner를 멤버 변수 선언 및 초기화 하였기 때문에
	// 해당 클래스(객체) 내에서 공용으로 사용 가능.
	
	public void displayMenu() {
		// 종료가 입력될 때 까지 기능을 골라서 수행할 수 있는 메뉴를 무한 반복
		
		int sel = 0; // 메뉴 선택용 변수
		
		// do - while() : 무조건 한번 이상은 반복하는 반복문
		
		do {
			System.out.println("=======================");
			System.out.println("1. 초기화 1");
			System.out.println("2. 초기화 2");
			System.out.println("3. 모든 책 정보 출력");
			System.out.println("4. 모든 책 제목만 출력");
			System.out.println("5. 저자 검색");
			System.out.println("6. 10%씩 가격 인하");
			System.out.println("0. 프로그램 종료");
			System.out.println("=======================");
			System.out.print("메뉴 선택 >> ");
			sel = sc.nextInt();
			sc.nextLine();
			
			// 같은 클래스 내부의 필드, 메소드는 
			// 단순히 이름을 작성하는 것으로 호출이 가능하다.
			switch(sel) {
			case 1 : init1(); break; 
			case 2 : init2(); break;
			case 3 : printBooks(); break;
			case 4 : System.out.println( printTitle() );   break;
			case 5 : System.out.println( searchAuthor() ); break;
			case 6 : priceCut(10);  break;
			
			case 0 : System.out.println("프로그램을 종료합니다."); break;
			
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
		}while(sel != 0);
	}
	
	
	
	
	
	public void init1() {
		// 3칸짜리 Book 배열을 생성하여 각 배열 요소를 초기화
		
		// Book[] 객체 생성
		books = new Book[3];
		
		// Book[]의 각 요소(Book 참조 변수)에 
		// 새로운 Book 객체를 생성해서 참조 하도록 함.
		books[0] = new Book();
		
		books[0].setTitle("자바의 정석");
		books[0].setContent("자바에 대한 내용이 적혀있음.");
		books[0].setAuthor("남궁 성");
		books[0].setPublisher("도우출판");
		books[0].setPrice(30000);
		
		
		books[1] = new Book("어린왕자", "어린왕자의 이야기", "생택쥐베리", "교학사", 10000);
		books[2] = new Book("삼국지", "도원결의하고 이러쿵 저러쿵", "이문열", "알에이치코리아", 130000);
	}
	
	
	public void init2() {
		// 5칸 짜리 Book 배열을 생성한 후
		// 책 정보를 5번 입력 받아 객체에 저장한 후 books 각 요소에 대입
		
		// 5칸 짜리 Book 배열 생성
		books = new Book[5];
		
		// 책 정보를 5번 입력 받아 Book 객체  생성 및 초기화 후 books 각 요소에 대입
	
		for(int i=0 ; i<books.length ; i++) {
			
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("내용 : ");
			String content = sc.nextLine();
			
			System.out.print("저자 : " );
			String author = sc.nextLine();
			
			System.out.print("출판사 : " );
			String publisher = sc.nextLine();
			
			System.out.print("가격 : " );
			int price = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남아있는 개행문자 제거
			
			books[i] = new Book(title, content, author, publisher, price);
			
		}
		
	}
	
	
	
	
	
	public void printBooks() {
		// Book[] 객체 배열에 저장된 모든 값을 출력
		
		// 1) 인덱스를 하나 하나 작성하는 방법
		/*System.out.println(books[0].toString());
		System.out.println(books[1].toString());
		System.out.println(books[2].toString());*/
		
		// 2) for문을 이용한 출력
		/*for(int i=0 ; i<books.length ; i++) {
			System.out.println(books[i].toString());
		}*/
		
		// 3) 향상된 for문(for each문)
		// -> 처음부터 끝까지 배열,컬렉션 등의 모든 요소를 접근할 때 사용
		
		/* for(배열에서 얻어온 값을 저장할 변수 : 배열명){
		 * 	// 반복 수행할 구문
		 * }
		 * */
		
		for(Book book : books) {
			System.out.println(book.toString());
		}
	}
	
	
	public String printTitle() {
		// books에 저장된 책의 제목만 문자열 형태로 반환
		/* 반환될 문자열의 형태
		 * 
		 * 자바의정석
		 * 어린왕자
		 * 삼국지
		 * 
		 * */
		
		// 1) books 요소에 반복 접근해서 제목만 꺼내오기
		// 2) 하나의 문자열로 만들기
		// 3) 반환한 후 출력
		
		String result = ""; // 빈 문자열 != null
		
		for(Book b : books) {
			result += b.getTitle() + "\n";
		}
		
		return result;
	}
	
	
	public String searchAuthor() {
		// 저자명을 입력 받아 일치하는 책 정보를 반환
		// 없을 경우, "해당 저자의 책이 존재하지 않습니다."
		
		System.out.print("저자명 입력 : ");
		String inputAuthor = sc.nextLine();
		for(Book b : books) {
			if(  b.getAuthor().equals(inputAuthor)  ) {
			//if(  b.getAuthor().contains(inputAuthor)  ) {
				
				// 문자열1.equals(문자열2)
				// 문자열1과 문자열2의 값이 똑같다면 true / 아니면 false
				
				return b.toString();
			}
		}
		
		// for 반복이 완료됐지만 반환이 되지 않은 경우 
		// == 일치하는 저자명이 없다
		return "해당 저자의 책이 존재하지 않습니다.";
	}
	
	
	public void priceCut(int cut) {
		// 1~99 사이 cut을 전달 받아
		// 책의 가격을 cut%만큼 인하된 가격으로 세팅
		
		if( cut >= 1 && cut <= 99 ) {
			
			for( Book b : books ) {
				
				// 인하된 가격  = 이전 가격 - (이전 가격 * cut%)
				//			= 이전 가격 * (1 - cut%)
				
				//(int)(b.getPrice() * ( 1 - (cut/100.0) ))
				b.setPrice((int)(b.getPrice() * ( 1 - (cut/100.0) )));
			}
			
			
		}else {
			System.out.println("1~99 사이 숫자를 입력해주세요.");
		}
		
	}
	
	
	
	
	
	
}
