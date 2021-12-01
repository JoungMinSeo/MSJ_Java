package edu.kh.collection.ex.model.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.ex.model.vo.Student;

public class MapService {

	// Map : Key�� Value �� ���� �ϳ��� �����Ͱ� �Ǿ� �̸� ��Ƶ� ��ü
	
	// Key�� �ߺ��� ������� �ʰ�, ������ ��� Map ���ο� ���׹��� ���ĵȴ�.
	// == Set�� Ư¡
	
	// Value�� Key�� ���ؼ� �ߺ��Ǵ� ���� ����Ǿ ������ �ȴ�.
	// == List�� Ư¡
	
	public void example1() {
		//Map<String, Student> map = new HashMap<String, Student>();
		Map<String, Student> map = new LinkedHashMap<String, Student>();
		// Map�� K,V �� ������ �̷�� ���ְ�, K,V ��� ��ü�̾�� �Ѵ�.
		
		// HashMap
		// - Key�� �ش�Ǵ� ��ü�� hashCode(), equals() �������̵��� �Ǿ��־�� �Ѵ�.
		
		Student std1 = new Student("ȫ�浿", 17, 1);
		
		// �л� std1�� �й��� �߰��Ͽ� map�� ����
		// put(key, value) : Map�� �����͸� �߰��ϴ� �޼ҵ�
		map.put("H001", std1);
		map.put("M001", new Student("�Ż��Ӵ�", 15, 2));
		map.put("H002", new Student("������", 19, 3));
		map.put("E001", new Student("������", 13, 6));
		map.put("M002", new Student("�̼���", 16, 3));
		
		System.out.println(map.toString());
		
		
		// Iterator�� �� �� �� ����ϱ�
		// Set<E> keySet() : Map ������ �� Key�� �ϳ��� ����(Set)���� ����� ��ȯ
		Set<String> set = map.keySet(); // map�� Key�� �ش��ϴ� �й��� ��� ���.
		
		Iterator<String> it = set.iterator();
		// �й��� �ϳ��� �ݺ� ����
		
		while(it.hasNext()) {
			// ���� �ݺ� ������ ���� �ִٸ�
			
			String key = it.next(); // ������ �й�(key)�� ���� key�� ����
			
			// E get(Object key) : Map���� key���� ��ġ�ϴ� �������� value�� ��ȯ
			Student value = map.get(key); // Student("ȫ�浿", 17, 1)
			
			// K = V �������� ���
			System.out.println(key + " = " + value);
		}
		
	}
	
	public void example2() {
		
		Map<Integer, String> map = new HashMap<>();
		// -> Ÿ�� �߷� : ��ü ���� ������ ���׸��� ��� �־
		//			   ���� ������ �ۼ��� �������� Ÿ�� ������ �Ǵ� ��.
		
		int number = 1;
		map.put(number++ , "���"); // 1
		map.put(number++ , "���"); // 2
		map.put(number++ , "����"); 
		map.put(number++ , "����"); 
		map.put(number++ , "������"); 
		map.put(number++ , "��â"); 
		map.put(number++ , "������ġ"); 
		map.put(number++ , "����"); 
		
		System.out.println(map);
		
		
		map.put(1, "���߱��");
		System.out.println(map);
		
		// Map�� �ߺ��Ǵ� Ű�� ���� �����Ͱ� ������
		// �ߺ����� �Ǵ��� �����ϴ� ���� �ƴ�
		// Ű�� �����ϵ�, Value�� ���ο� �����ͷ� ����

		
		// Iterator�� �̿��Ͽ� �ϳ��� �ݺ� �����ϱ�
		// Set<Map.Entry<K,V>> entrySet()
		// -> Map�� Ű�� �� ������ ������ Map.Entry�� Set��ü�� ��� ��ȯ
		// ( Map.Entry == K,V ���� �ѹ��� ��Ÿ�� ��ü )
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		// �ݺ� ���� �ϸ鼭 Map.Entry�� �ϳ��� ������
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			// entrySet�� ����� Map.Entry ��ü�� �ϳ� ���� entry ������ ����
			
			// entry���� key�� value�� ��� ����ִ�.
			System.out.println( entry.getKey() + " = " + entry.getValue() );
			// entry.getKey() : entry�� �ִ� key�� ��ȯ
			// entry.getValue() : entry�� �ִ� value�� ��ȯ
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
