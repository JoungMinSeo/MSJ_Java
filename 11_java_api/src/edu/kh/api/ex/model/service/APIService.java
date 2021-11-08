package edu.kh.api.ex.model.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import edu.kh.api.ex.model.vo.Student;

public class APIService {

	public void example1() {
		
		Student std1 = new Student("홍길동", 3, 5);
		Student std2 = new Student("홍길동", 3, 5);
		
		System.out.println(std1);
		System.out.println( std1.equals(std2)  ); // true

		System.out.println( std1.hashCode() ); 
		System.out.println( std2.hashCode() ); 
		System.out.println( std1.hashCode() == std2.hashCode() ); 
		// equals() 오버라이딩 시 hashCode() 오버라이딩 해야된다
		// -> equals()가 true인 경우 두 객체의 hashCode()도 같아야 한다.
		
	}
	
	
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		
		// String 리터럴 작성 시 메모리구조
		// - String 리터럴로 생성된 문자열은 String Pool이라는 Heap영역 공간에 생성됨.
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.print("abc 입력 : ");
		String str4 = sc.next(); // abc 입력
		
		
		
		System.out.println(str1 == str2); // true
		// String 리터럴로 "abc"가 초기화된 str1, str2는
		// String Pool에 있는 같은 "abc" 주소를 참조한다.
		
		System.out.println(str1 == str3); // false
		System.out.println(str1 == str4); // false
		
		
		// str1과 str2가 참조하는 주소가 실제로 같은지 확인
		// -> System.identityHashCode()
		//  -> 자바는 실제 메모리 주소를 볼수는 없지만
		//     메모리 주소를 이용해 일정한 형태에 숫자를 반환하는
		//     identityHashCode()라는 것을 볼수 있다. 
		//  == 실제 주소라고 생각해도 무방함.
		System.out.println("std1 : " + System.identityHashCode(str1));
		System.out.println("std2 : " + System.identityHashCode(str2));
		System.out.println("std3 : " + System.identityHashCode(str3));
		System.out.println("std4 : " + System.identityHashCode(str4));
	}
	
	
	public void example3() {
		
		// String의 불변성(immutable) 
		//		<-> 가변성(mutable)
		
		// String 자료형의 값은 한번 메모리에 저장되면 절대로 변할 수 없다. == 불변성
		// String 객체가 변하게 될 경우
		// 기존에 참조하고있던 String 객체가 변한 것이 아닌
		// 새로운 String 객체가 메모리에 생성되어 그 주소를 참조함.
		
		// String 불변성으로 인해 발생하는 문제점
		// - 많은 양의 String 객체가 반복적으로 이어쓰기, 생성 등이 이루어지게 되면
		//   그 때 마다 새로운 String 객체가 생성되기 때문에
		//   심한 메모리 소비를 야기한다.
		
		String str1 = "abc";
		
		// "def" 문자열 추가 전 str1의 참조 주소 확인
		System.out.println("def 추가 전 : " + System.identityHashCode(str1));
		
		str1 += "def";
		System.out.println(str1); // abcdef
		
		// "def" 문자열 추가 후 str1의 참조 주소 확인
		System.out.println("def 추가 후 : " + System.identityHashCode(str1));
		
		/*String result = "";
		for(int i=0 ; i<10000 ; i++) {
			result += i;
			// 012345678910111213141516
			System.out.println(result);
		}*/
	}
	
	
	public void example4() {
		// String 불변성 문제 해결
		// -> StringBuffer, StringBuilder
		
		// StringBuffer, StringBuilder (mutable, 가변성)
		// -> 문자열 값이 변해도 같은 객체 내에서 변화가 이루어짐.
		
		// 두 클래스는 이름은 다르지만 기능은 완전히 동일하다.
		
		// 차이점 : StringBuffer는 동기화를 지원한다.
		//		  StringBuilder는 동기화를 지원하지 않는다.
		
		// Buffer: 컴퓨터가 데이터를 저장하는 메모리 영역 (임시 저장)
		// (Scanner의 입력버퍼 : 키보드에서 입력된 값을 임시 저장하는 메모리 영역)
		
		// Buffering : 버퍼에 데이터를 채우는 동작
		// -> 프로그램은 버퍼링을 통해 채워진 데이터를 재생하거나 출력한다.
		
		StringBuffer sb1 = new StringBuffer(); // 16칸 짜리 StringBuffer객체 생성
		//sb1 = "abc"; // String 처럼 값 대입 불가능
		
		System.out.println("abc 추가 전 용량 : " + sb1.capacity());
		System.out.println("abc 추가 전 주소 : " + System.identityHashCode(sb1));
		
		sb1.append("abc"); // append(값) : 문자열 제일 뒤에 추가
		
		System.out.println("abc 추가 후 용량 : " + sb1.capacity());
		System.out.println("abc 추가 후 주소 : " + System.identityHashCode(sb1));
		
		sb1.append("defghijklmnopqrstuvwxyz"); // 23 글자 추가 -> 16칸 크기 넘어섬.
		
		System.out.println(sb1.toString()); // 문자열이 뒤에 추가 되었나 확인
		System.out.println("용량 증가 확인 : " + sb1.capacity());
		System.out.println("주소 변화 확인 : " + System.identityHashCode(sb1));
		
		// StringBuffer의 값을 String으로 변환하는 방법
		String str = sb1.toString();
		
		
		//////////////////////////////////////////////////////////
		
		StringBuilder sb2 = new StringBuilder(5); // 5칸 짜리 StringBuilder 객체 생성
		
		System.out.println("추가 전 용량 : " + sb2.capacity());
		
		sb2.append("Hello World!!"); // 13글자
		
		System.out.println("추가 후 용량 : " + sb2.capacity());
		System.out.println(sb2.toString());
		
		// StringBuffer와 StringBuilder 사용법은 동일
		
	}
	
	public void example5() {
		// String에서 제공하는 유용한 메소드
		
		// boolean contains(CharSequence s)
		// 특정 단어가 문자열에 포함되어 있는지 확인하여 있으면 true / 없으면 false
		
		String str1 = "동해물과 백두산이 ...";
		System.out.println( str1.contains("백두산")  );
		
		// int	indexOf(String str)
		// 특정 문자열이 시작하는 인덱스를 반환. 없으면 -1을 반환
		// 중복되는 문자열이 있다면 
		// 앞에서부터 검색해서 첫 번째 검색되는 인덱스를 반환한다.
		// <-> lastIndexOf(String str) (뒤에서 부터)
		
		String str2 = "abcdef abcdef";
		System.out.println( str2.indexOf("c")   ); // 2
		System.out.println( str2.lastIndexOf("c")   ); // 9
		
		System.out.println( str2.indexOf("z")   ); // -1
		
		
		// String[]	split(String 구분자)
		// 구분자를 기준으로 하나의 문자열을 분리하여 String[] 형태로 반환
		// ex) 사과,바나나,포도  ->  "," 기준으로 분리하면
		//    [0] = 사과, [1] = 바나나, [2] = 포도
		String str3 = "사과,,,바나나,,,포도,,,파인애플,,,복숭아,,,멜론,,,오렌지";
		
		String[] arr = str3.split(",,,");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// static String join(CharSequence delimiter, CharSequence... elements)
		// 배열을 delimiter(구분자)를 이용하여 하나의 String으로 반환
		
		String str4 = String.join("/", arr);
					// arr 배열 요소들을 "/"를 구분자로 하여 하나의 문자열로 만들어 반환
		System.out.println(str4);
		
		
		// StringTokenizer
		// - java.util에 있음.
		// 문자열을 지정한 구분자로 쪼개서 하나씩 순서대로 반환하는 객체
		// (단, 구분자가 지정되지 않으면 공백문자가 구분자가 됨.)
		// (공백문자 : 띄어쓰기, 엔터, 탭 등)
		
		String str5 = "aa bb cc";
		StringTokenizer st1 = new StringTokenizer(str5);
		// -> 공백문자를 기준으로 나눠짐
		
		while(st1.hasMoreTokens()) {
			// hasMoreTokens() : 토큰 더 가지고 있냐?
			//					 다음 토큰이 있는지 검사하는 메소드
			
			System.out.println(st1.nextToken());
			// nextToken() : 다음 토큰을 얻어옴.
		}
		
		
		String str6 = "AA/BB,CC~DD";
		StringTokenizer st2 = new StringTokenizer(str6, "/,~" );
		// 문자열에서 "/,~" 3개 중 하나라도 일치하면 쪼개줌
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		// StringTokenizer는 
		// split()보다 구분자를 다양하게 지정할 수 있고,
		// 속도도 미세하게 더 빠름. (다량의 데이터가 있을 시 훨씬 빠름)
		
	}
	
	
	public void example6() {
		// 날짜 관련 클래스  Date
		// - java.util에 존재함.
		// - 많은 생성자, 메소드가 더이상 사용되지 않는 옛날 클래스
		// -> 우리가 추후 사용할 DB Date와 관계가 있음
		
		Date date1 = new Date();
		// Date() 기본생성자 : 현재 날짜, 시간 정보가 객체에 기록됨.
		System.out.println(date1);
		

		// Date(long date) 생성자
		// 1970년 1월 1일, 00:00 GMT를 기준으로
		// -> 한국에서는 KST로 표시됨. 왜? OS가 한국 OS라 시간 기준이 정해져 있음
		
		// 몇 밀리세컨드 지난 시간이 객체에 기록됨.
		// 밀리 세컨드(밀리초, ms) == 1/1000 초
		// 1ms == 0.001초
		Date date2 = new Date(0L);
		System.out.println(date2);
		// 우리나라 기준으로는 1970/1/1 09:00 출력됨
		
		// 1970/1/2 09:00 출력
		Date date3 = new Date( 1000L * 60 * 60 * 24 );
		System.out.println(date3);
		
		// 현재 시간으로 부터 24시간 전 출력
		Date date4 = new Date( System.currentTimeMillis() - (1000L * 60 * 60 * 24 )  );
		
		System.out.println(System.currentTimeMillis()  );
		
		System.out.println(date4);
		
		
		// SimpleDateFormat 클래스
		// - java.text
		// - 날짜를 원하는 형식으로 간단히 변경하는 기능을 제공
		
		SimpleDateFormat sdf 
			= new SimpleDateFormat("G yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		
		String text = sdf.format(date4);
		// date4에 저장된 시간을 sdf에 지정된 형식의 문자열로 변환하여
		// text에 변수에 저장
		
		System.out.println(text);
	}
	
	
	public void example7() {
		// Math 클래스
		// - java.lang
		// - Math 클래스의 모든 필드와 메소드는 static이다.
		//  -> 모든 내용이 static 영역에 있다
		//     == Math 자체가 static 다 있으니까 별도로 객체 생성을 하지 않는다.
		
		double d1 = 360.45;
		// 3604.5    ( * 10 )
		
		// ceil() -> 3605.0
		// round() -> 3605
		// floor() -> 3604.0
		
		// ( / 10.0)
		// 3605.0 / 10.0 = 360.5
		// 3605 / 10.0 = 360.5
		// 3604.0 / 10.0 = 360.4
		
		
		// 소수점 아래 둘째 자리에서 올림, 반올림, 내림 처리하기
		
		// double ceil() : 올림
		System.out.println(  Math.ceil(d1 * 10)  / 10.0  );
		
		// long/int round() : 반올림
		System.out.println( Math.round(d1 * 10) / 10.0  );
		
		// double floor() : 내림
		System.out.println( Math.floor(d1 * 10)  / 10.0 );
		
		// random() : 0이상 1미만의 난수 발생
		
		// 1~50 사이 난수를 발생시켜 저장
		int ran =  (int)(Math.random() * 50 + 1);
		
		// 10 ~ 20사이 난수
		int ran2 = (int)(Math.random() * 11 + 10);
				// 0 <= ran <11
				// 10 <= ran < 21
		
		System.out.println(ran);
		System.out.println(ran2);
	}
	
	
	public void example8() {
		
		// Wrapper 클래스
		// -> 기본 자료형을 객체 형태로 변환하는 클래스를 종합하여 
		//     Wrapper 클래스라고 부른다.
		
		// 왜 사용하는가?
		// 1) 각 자료형만의 필요한 필드, 기능을 제공하기 위하여
		//  ex) Integer.MAX_VALUE; // int 최대값
		//      Integer.parseInt( "123" ); // String -> int로 변환
		
		// 2) 컬렉션에 변수값을 저장할 수 있게 하기 위하여
		//		-> 컬렉션은 객체만 저장할 수 있음. (기본 자료형은 저장 불가능)
		//		--> 하지만 Wrapper 클래스는 저장 가능 .
		
		/* 기본 자료형		Wrapper 클래스
		 * byte				Byte
		 * short			Short
		 * int				Integer
		 * long				Long
		 * float			Float
		 * double			Double
		 * char				Character
		 * boolean			Boolean
		 * 
		 * */
		
		// Integer Wrapper 클래스 살펴보기
		System.out.println(Integer.BYTES); // int byte 크기 == 4
		System.out.println(Integer.SIZE);  // int의 bit 크기 == 32
		System.out.println(Integer.MAX_VALUE); // 최대값
		System.out.println(Integer.MIN_VALUE); // 최소값
		System.out.println(Integer.TYPE); // 매칭되는 기존 자료형
		
		
		// String으로된 기본자료형 내용을 -> 기본자료형으로 변환
		//  ex) "123"  ->  123
		int iNum = Integer.parseInt("10000");
		System.out.println(iNum + 10000);
		
		long lNum = Long.parseLong("10000");
		
		// "3.123456789"를 double, float로 변경
		double dNum = Double.parseDouble("3.12345678901234567890");
		float fNum = Float.parseFloat("3.12345678901234567890");
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		
		// 기본자료형 -> String으로 변환
		
		int num = 123;
		
		String str = Integer.valueOf(num).toString();
		String st2 = num + "";
		
		
		// Boxing : 기본 자료형 -> 객체로 변경
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("20"); // Boxing + Parsing
		
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		
		// UnBoxing : Wrapper 객체 -> 기본 자료형
		int u1 = i1.intValue(); // i1 이 참조하는 객체가 가진 int값 반환
		int u2 = (int)i2; // Wrapper 객체 -> 기본 자료형 형변환

		
		// AutoBoxing / AutoUnBoxing
		// 자동으로   기본 자료형 <-> Wrapper 객체  형변환
		
		//Integer i3 = new Integer(100);
		Integer i3 = 100; // AutoBoxing
		
		int u3 = i3; // AutoUnBoxing
		
		// 참고 : Java9 버전 이후부터는 AutoBoxing/AutoUnBoxing이 강제됨
		
	}
	
	
	
	
	
	
	
	
	
	
}
