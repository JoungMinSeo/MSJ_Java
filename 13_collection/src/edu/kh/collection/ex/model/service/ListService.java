package edu.kh.collection.ex.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.ex.model.vo.Student;

public class ListService {
	
	// Collection�̶�?
	// - �ڹٿ��� �����ϴ� �ڷᱸ���� ����ϴ� �����ӿ�ũ
	
	// Collection�� ���� (== �迭 ���� ����)
	// 1. ũ�� ������ ����.
	// 2. �߰�, ����, �˻�, ���� ���� ����� ����Ǿ� ����.
	// 3. ���� ������ Ÿ���� ������ �� �ִ�.
	//    (��, �⺻ �ڷ����� Wrapper Class�� �����ؼ� ����)
	
	
	// List 
	// - ������ �����Ǹ�, �ߺ� ������ ������ �����ϴ�
	//   (�����Ͱ� ���������� ������ �迭�� ����� ���)
	
	public void example1() {
		
		// ArrayList
		// - List�� �ļ�
		// - �迭ó�� ��� ���������� �迭�� ������ ���ϵǾ��ִ�.
		
		ArrayList list = new ArrayList(); // �ʱ�뷮 10
		ArrayList list2 = new ArrayList(3); // �ʱ�뷮 3
		
		
		// 1. add(E e) : ����Ʈ�� ���� �ν��Ͻ� �����͸� �߰��ϴ� �޼ҵ�
		//  E == Object			   (��ü ���� �ּ�)
		list2.add( new String("Hello World") );
		list2.add( new String("����Ŀ�") );
		
		// �÷����� ������ Ÿ���� ������ ����
		list2.add( new Integer(10) );
		
		// 2. toString() : ����Ʈ�� ����� ��� ��Ҹ� �� �ٷ� ���������� �������̵� �Ǿ�����.
		System.out.println( list2.toString() );
		
		// ������ ArrayList�� ũ�⺸�� �ʰ��� �����͸� �߰�
		list2.add( new Double(3.14) ); // ũ���� ������ ����. (�˾Ƽ� �ð� �ٰ� ��)
		
		System.out.println( list2 );
	
		// ���� for������ ���
		// -> �迭, �÷��� ��ü�� ����� ��Ҹ� ������� �ϳ��� �������� for��
		for(Object o : list2) {
			System.out.println(o);
		}
		
		System.out.println("------------------------");
		System.out.println("[�Ϲ� for�� ���]");
		
		// 3. size() : List�� ����� �������� ���� ��ȯ
		System.out.println("size() : " + list2.size());
		
		// 4. get(int index) : List�� ����� index��° ��� ��ȯ
		for(int i=0 ; i<list2.size() ; i++ ) {
			System.out.println( list2.get(i) );
		}
		
		// 5. Object set(int index, E e) : List ���� index��° ��Ҹ� e�� ����
		Object obj = list2.set(1, new Student("ȫ�浿", 17, 1));
		
		System.out.println("��ȯ�� Object : " + obj);
		System.out.println(list2);
		
		// 6. Object remove(int index) : 
		// List ���� index��° ��Ҹ� ���� �ϰ�, ���ŵ� ��Ҹ� ��ȯ��. 
		// �߰��� ��ĭ�� ������ index��° �ڿ� ��ҵ��� �� ĭ�� ���.
		Object obj2 = list2.remove(2);
		
		System.out.println("���ŵ� 2�� �ε��� ���� : " + obj2);
		System.out.println(list2);
		
		
		// ���� for���� �̿��Ͽ� list2�� ����� ��� ��� ���
		// ��, �ڷ����� String�̸� "String : ",
		// Student�̸� "Student : ",
		// Double�̸� "Double : " �̶�� �տ� ���
		// �׸��� �л��� �̸��� ���
		for(Object o : list2) { // ������(��ĳ����)
			
			if( o instanceof String ) {
				System.out.println("String : " + o.toString());
				
			} else if(o instanceof Double) {
				System.out.println("Double : " + o);
				
			} else if(o instanceof Student) {
				System.out.println("Student : " + ((Student)o).getName()   );
			}								// �� ĳ���� ���¶� ���� �Ұ� -> �ٿ� ĳ����
			
		}
		
	}
	
	
	public void example2() {
		// Generics(���׸�, ���׸���, ���׸�) :  <E>
		// Ŭ����, �޼ҵ�, �÷��� ���ο� ���� Ŭ���� Ÿ����
		// �� ������ �����ϴ� ���.
		
		// �÷��ǿ� ���� Ÿ���� ����Ǹ�
		// �ʿ� �� ���� Ÿ�԰˻�, ����ȯ�� ���÷� �Ͼ�� �ȴ�. -> ������ ���ŷӰ� ������.
		// -> ���׸��� �̿��� �÷����� �ϳ��� Ÿ�Ը� ������ �� �ְ� ����
		
		// ���׸��� ���� 
		// 1) �ϳ��� Ÿ������ ���ѵǱ� ������ Ÿ�԰˻�, ����ȯ�� �ʿ� ����.
		//    -> ������ �ܰ迡�� ������ Ÿ�� üũ ����
		
		// 2) �ϳ��� �ڵ�� ���� Ÿ�� ó���� �����ϴ�.
		
		// List�� ������ + ���׸� ����
		List<Student> list = new ArrayList<Student>();
		
		// List�� �������̽�
		// ArrayList�� List�� ��ӹ޾� ������ Ŭ����
		// (�θ�Ÿ����������) List list = (�ڽ�Ÿ�԰�ü)new ArrayList();
		//	 --> ��ĳ����
		
		// List<Student> list  
		// -> Ÿ���� Student�� ���ѵ� List �ڽ� ��ü�� �����ϴ� ��������
		
		// new ArrayList<Student>()
		// -> Ÿ���� Student�� ���ѵ� ArrayList ��ü ����
		
		// ArrayList<Student>
		// add(Student e)
		list.add( new Student("ȫ�浿", 17, 1) );
		list.add( new Student("������", 19, 3) );
		list.add( new Student("�Ż��Ӵ�", 15, 2) );
		
		// ���� for������ ���
		for( Student std : list ) {
			System.out.println(std.getName());
			// instanceof ���� Ÿ�� �˻� �ʿ� X
			// �ٿ�ĳ���� �ʿ� X
		}
		
		
		// list���� ������ �л��� �ִ� 1�� �ε��� ����
		Student removeStudent = list.remove(1);
		
		System.out.println("removeStudent : " + removeStudent);
		
		for(Student std : list) {
			System.out.println(std);
		}
		
		
		// 7. int indexOf(Object o)
		// -> o�� �����ϴ� ��ü�� ����(����) ��ü�� List�� �ִ��� Ȯ���Ͽ�
		//    ������ ���� ��ü�� index, ������ -1�� ��ȯ
		//  --> ���� �񱳸� ���� equlas�� �������̵� �Ǿ��־�� ��.
		
		// �Ż��Ӵ��� �ִ� �ε��� �˻�
		int index = list.indexOf( new Student("�Ż��Ӵ�", 15, 2) );
		
		System.out.println("�Ż��Ӵ��� index : " + index);
		
		
		// 8. boolean isEmpty() : List�� ��������� true, �ƴϸ� false ��ȯ
		
		System.out.println("list�� ����ִ°�? " + list.isEmpty()); // false
		
		
		// 9. void clear() : List ���� ��� ��Ҹ� ����
		list.clear();
		
		System.out.println("clear() �� list�� ����ִ°�? " + list.isEmpty());
		
	}
	
	
	
	
	
}
