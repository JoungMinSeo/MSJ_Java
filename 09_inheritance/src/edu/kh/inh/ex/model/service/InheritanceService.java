package edu.kh.inh.ex.model.service;

import edu.kh.inh.ex.model.vo.Employee;
import edu.kh.inh.ex.model.vo.Person;
import edu.kh.inh.ex.model.vo.Student;

public class InheritanceService extends Student {

	public void example1() {
		
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(20);
		
		Student std = new Student();
		std.setName("김철수");
		std.setAge(15);
		std.setGrade(2);
		std.setClassroom(3);
		
		
		Employee emp = new Employee();
		emp.setName("유관순");
		emp.setAge(18);
		emp.setPosition("부장");
		emp.setEmpNo(1);
		emp.setSalary(4000000);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		
		Student std2 = new Student("김이박", 19, 3, 1);
		
		System.out.println(std2.getName());
		System.out.println(std2.getAge());
		System.out.println(std2.getGrade());
		System.out.println(std2.getClassroom());
	}
	
	
	public void example2() {
		Person p = new Person("홍길동", 20);
		
		System.out.println(p.toString());
		System.out.println(p);
		// print 관련 메소드의 매개변수로 참조변수들이 작성된 경우
		// 자동으로 참조변수가 참조하는 객체의 toString() 메소드를 호출한다.
		
		Employee emp = new Employee("고길동", 40, 10, "부장", 5000000);
		System.out.println(emp);
		
		Student std = new Student("김이박", 19, 3, 5);
		System.out.println(std); // 오버라이딩된 toString() 확인
		
		// 오버로딩 확인
		std.test();
		std.test("국어");
		System.out.println(std.test("수학", "영어"));
		
		System.out.println( test(10) );
		
	}
	
	
	public void example3() {
		
		// 필드 값이 똑같은 Student 객체 2개를 생성해서
		// 같은지 비교
		
		Student std1 = new Student("홍길동", 18, 2, 7);
		Student std2 = new Student("홍길동", 18, 2, 7);
		
		Student std3 = std1;
		
		// 동일 비교
		// == 비교되는 두 객체가 특정 하나의 객체인가?
		// == 참조하는 객체의 주소가 같은가?
		
		// 주소 비교
		System.out.println(std1 == std2); // false(동일하지 않다)
		System.out.println(std1 == std3); // true(동일하다)
		
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = str1;
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		// String 동등비교(같은 값이냐)
		System.out.println("equals() : " + str1.equals(str2)  );
		
		// Student equals() 활용하기
		
		// * Object 클래스의 equals()
		// 상속 받은 클래스로 생성한 객체간의 동등 비교(값이 같은가)를 위해
		// 자식 클래스에서 재정의(오버라이딩)해서 사용하는 용도의 메소드.
		
		Student std4 = new Student("손흥민", 12, 5, 2);
		Student std5 = new Student("손흥민", 12, 5, 2);
		
		System.out.println(std4.equals(std5));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
