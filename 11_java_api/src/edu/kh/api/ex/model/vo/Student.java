package edu.kh.api.ex.model.vo;

public class Student {
	private String name;
	private int grade;
	private int classroom;
	
	// �⺻ ������
	public Student() {}

	
	
	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}



	// �Ű����� �ִ� ������
	public Student(String name, int grade, int classroom) {
		this(name, grade);
		this.classroom = classroom;
	}
	
	// getter / setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	
	// Object.toString()
	// - java.lang ��Ű���� ����
	
	// ��ü�� ������ �ִ� �ʵ� ���� �ϳ��� ���ڿ��� ��ȯ�� �� �ֵ��� �ϴ� �뵵��
	// �ڹٿ��� �⺻ �����ϴ� �޼ҵ�(�������̵� �ؼ� ���)
	
	// @Override : �����Ϸ����� �������̵� �Ȱ����� �˸�.
	//				�������̵� ���� ������ �����ϴ��� �˻�
	@Override
	public String toString() {
		return name + " / " + grade + " / " + classroom;
	}
	
	
	// ���� ���� : �޼ҵ峪 ��� ������ �� ��� ������ ����(Stack ������ ����)
	//	-> Ư�� ���� ������ ��� ����ϴ� ����
	//  ex) �Է� ���� ���� �ӽ�����  int num = sc.nextInt();
	//      �ݺ��� ����� ����  for(int i=0 ; i<10 ; i++){ }
	//  	�˰����� ���� ���� int sum=0;  /  boolean flag = false;
	
	// ----- �ʵ� (��� ���� + Ŭ���� ����) ----- 
	// ��� ����(�ν��Ͻ� ����) : Ŭ���� ���� �ۼ��� ���� (Heap ������ ����)
	//  -> ��ü�� �����Ǿ��� �� ��ü�� ������ �ϴ� ���� �����ϴ� ���� (��ü�� �Ӽ�)
	//  ex) private String name;  private int age;
	
	// Ŭ���� ����(static ����) : Ŭ���� ���� �ۼ��� ������ static ���� ���� �� (Static ������ ����)
	//  -> ���α׷� ������ ������ ���������� ��� �����ϸ�, 
	//     �� ���� �������� ���Ǿ��� ��� �κ��� ���� �ϰ� �����ϴ� �뵵�� ����
	// ex) public static final double PI = 3.141592;
	//     public static int nationalCode = 81;
	
	
	// �⺻�ڷ��� ����  : �ڷ����� �⺻�ڷ��� 8�� �� �ϳ��� ����
	//				 �Ҵ�� �޸𸮿� ���� ���� ������ ��.
	// 				 (byte short int long float double char boolean)
	// ex) int num = 10;
	//     private int age;
	//     for(int i=0 ; i<10 ; i++){}
	//     public void ex1(int input)
	
	// ���� ����(���� �ڷ��� ����) : �⺻ �ڷ����� ������ ��� ����
	//			�ּ� ������ ���� 4byte�� �Ҵ�Ǹ�, ��ü�� �ּҸ� �����Ͽ� �����ϴ� ����.
	// ex) private String name;
	//     Student std = new Student();
	//     int[] arr = new int[3];
	//	   Person[] pArr new Person[3];
	//	   public boolean equals(Object obj){}
	
	// Ŭ���� == ��ü�� ����� ���� ���赵
	// new Ŭ������(); --> Ŭ������ �̿��Ͽ� ��ü�� ����
	// == ������� ��ü�� � Ŭ������ ������ ������ �ִ� 
	// == � Ŭ������ ���¸� ������ �ִ�.
	// Ŭ���� == ����� ���� �ڷ���
	
	
	// �Ű� ���� : �޼ҵ� �� () ���� �ۼ��Ǵ� ����
	//			�޼ҵ� ȣ�� �� ���� ���� ���� ������ �Ű�ü ������ ����
	//			�Ű� ������ �ش� �޼ҵ��� ���� ���� ����� ����.
	// ex) public void int ex1(int num){}
	//     ex1(10);		// ex1 �޼ҵ带 ȣ���ϸ鼭 �Ű� ���� int num�� 10�� ����
	
	// 	   public boolean equals(Object obj){  }
	//     std1.equals( std2 );
	//	   // std1�� �����ϰ� �ִ� ��ü�� equals �޼ҵ带 ȣ���ϸ鼭
	//		  std2�� �����ϰ� �ִ� ��ü�� �ּҸ� �Ű� ���� Object obj�� ����
	
	
	
	// Object.equals(Object obj)
	// ���� ��ü�� ���� ���� ��ü(obj)�� �������� Ȯ���ϴ� �޼ҵ�
	// (���� : ��ü�� ������ �ִ� �ʵ� ���� ��� ������ ����)
	
	@Override
	public boolean equals(Object obj) {
		// Object obj : ���ҷ��� �ٸ� ��ü ���� ����
		// �θ�Ÿ�� ���� ���� = �ڽ� ��ü ����; (������ ��ĳ����)
		
		// obj�� null�� ���
		if(obj == null) {
			return false;
		}
		
		// obj�� ���� ��ü�� ���
		if(obj == this) {
			return true;
		}
		// �����ϸ� �����Ѱ� = true
		// �����ϸ� �����Ѱ� = true || false
		
		
		// this. (this ��������) : ���� ��ü�� �����ּҸ� �����ϴ� ���� ����
		//						 ��ü���� �����Ǿ� ����.
		
		// this() (this ������) : Ŭ������ �ۼ��� �ٸ� �����ڸ� ȣ���ϴ� ����
		//						 Ŭ������ ������ ù��° �ٿ� �ۼ��Ǿ� ����.
		
		
		if( !(obj instanceof Student) ) {
			// obj�� �����ϴ� ��ü�� Student Ÿ���� �ƴҋ�
			return false;
		}
		
		// ���� �� ��찡 �ƴϸ� ���� Ÿ���� ���� �ٸ� ��ü�̴�.
		Student other = (Student)obj; // �ٿ� ĳ���� �ؾ����� 
									  // �� Student ��ü�� ���� ���� �� ����
		
		if( !this.name.equals(other.name) ) {
			// ���� ��ü�� name�� �ٸ� ��ü�� name�� ���� ���� ���
			return false;
		
		} else if( this.grade != other.grade) {
			// ���� ��ü�� grade�� �ٸ� ��ü�� grade�� ���� ���� ���
			return false;
			
		} else if( this.classroom != other.classroom) {
			// ���� ��ü�� classroom�� �ٸ� ��ü�� classroom�� ���� ���� ���
			return false;
		}
		
		// ��� �ʵ� ���� ���� == �����ϴ�
		return true;
	}
	
	
	
	// Object.hashCode()
	// - ������ ��ü ( equals() ����� true�� �� ��ü )�� ������ hashCode�� ��ȯ�ؾ� �Ѵ�.
	//   --> �̷��� ������ equals() �������̵� �� hashCode()�� �������̵� ��.
	
	// �� hashCode�� ����ϴ°�?
	// -> �ؽ� ���̺� ���ĵ� �� �ִ� ���� �����ؼ� �˻� �ӵ��� ��� ��Ŵ
	//    Hash��� �̸����� ��ü�� ȿ������. 
	//	  ex) HashSet, LinkedHashSet, HashMap ��
	
	@Override
	public int hashCode() {
		// ������ ��ü�� ���� ���� ��ȯ�Ǿ�� ��
		// ��� ȣ���ص� ���� ���̿��� �Ѵ�.
		// ���� �ٸ� ��ü�� �ߺ��Ǵ� hashCode�� ������ ��츦 �ּ�ȭ �Ѵ�.
		
		final int PRIME = 31; // prime : �Ҽ�
		int result = 1; 
		
		result = PRIME * result 
				+ ( name == null ? 0 : name.hashCode() ); 
		
		result = PRIME * result + grade;
		result = PRIME * result + classroom;
		
		return result;
	}
	
	
	
	
	
	
	
}
