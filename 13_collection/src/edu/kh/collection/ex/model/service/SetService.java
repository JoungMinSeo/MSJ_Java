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

	// Set(����)
	// - ������ �������� ���� (== �ε����� ����)
	// - �ߺ� ������ ���� �Ұ���. (null�� �ϳ��� ���� ����)
	//  -> �ߺ� Ȯ���� ���ؼ� equals()�� �ݵ�� �������̵� �Ǿ� �־�� �Ѵ�.
	
	public void example1() {
		// HashSet 
		// - ��ü ���� �� hashCode() (�ؽ��Լ�)�� �̿���
		//   ���� ó���� �ߺ� �˻簡 ������ Set
		// - equals() �Ӹ� �ƴ϶� hashCode()�� �������̵� �Ǿ� �־�� �ϴ�.
		
		Set<String> set1 = new HashSet<String>();
		// String ���� �ڹٿ��� �������ִ� Ŭ������
		// ��κ� equals(), hashCode() �������̵� �� �Ǿ��ִ�.
		
		set1.add( new String("Apple") );
		set1.add( new String("Samsung") );
		set1.add( new String("LG") );
		set1.add( new String("Apple") );
		set1.add( new String("���") );
		set1.add( new String("�Ｚ") );
		set1.add( new String("����") );
		set1.add( new String("Hello") );
		set1.add( new String("World") );
		//set1.add( null );
		//set1.add( null );
		//set1.add( null );
		
		System.out.println(set1.toString());
		// ���� ���� X, �ߺ� ���� O
		
		
		// Set���� �� �ϳ��� ������
		// -> Set�� ���ϴ� �� �ϳ��� ��� ���� ���� �Ұ����ϴ�.
		//  --> �ϳ��� ������ Ȯ���� �ؾ� ��.
		
		// 1. Iterator �ݺ���
		// - �÷��� �����ӿ�ũ���� �����ϴ� 
		//   �÷��� ��ü ��Ҹ� �ϳ��� �ݺ� ������ ������ ���.
		
		Iterator<String> it = set1.iterator();
		// set1.iterator() : set1 ���տ� ����� ������ �ϳ��� �����ü� �ִ� ���·� �����ϴ� �޼ҵ�
		
		while(it.hasNext()) {
			// it.hasNext() : ������ ���� ���� �ִ��� �˻�. ������ true, ������ false
			
			String str = it.next();
			System.out.println(str);
			// it.next() : ���� �� ��������
		}
		
		System.out.println("--------------------");
		// 2. ���� for���� �̿�
		for(String s :  set1){
			System.out.println(s);
		}
	}
	
	
	public void lotto1() {
		
		Set<Integer> lotto = new HashSet<Integer>(); 
		
		while(true) {
			
			int ran = (int)(Math.random() * 45 + 1);
			// 1 ~ 45 ���� ����
			
			lotto.add(ran); // AutoBoxing(int -> Integer)
			
			if(lotto.size() == 6) {
				// lotto�� �ߺ� ���� 6���� ����� ���
				break;
			}
		}
		System.out.println(lotto);
		
	}
	
	
	
	public void example2() {
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		// LinkedHashSet : ������ �����ϴ� HashSet
		
		for(int i=0 ; i<20 ; i++) {
			set1.add("a"+i); // a0, a1, a2 ...
			set2.add("a"+i);
		}
		
		System.out.println(set1);
		System.out.println(set2);
		
		// set1�� Iterator�� �̿��� ���
		Iterator<String> it1 = set1.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("==================");
		
		// set2�� ���� for���� �̿��� ���
		for(String s : set2) {
			System.out.println(s);
		}
		
	}
	
	
	public void lotto2() {
		// TreeSet�� �̿��� ���ĵ� �ζ� ��ȣ ������
		// TreeSet : ���� Ʈ�� �ڷ� ������ �̿��� ����� �����Ͱ� �ڵ� ���ĵǴ� Set
		//			 (�⺻������ Set�̱� ������ ������ �ߺ� ���嵵 �ȵȴ�)
		
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
		// List + Set ��ģ �ζ� ��ȣ ������
	
		// �ݾ� �Է� : 3000
		// [1,2,3,4,5,6]
		// [1,2,3,4,5,6]
		// [1,2,3,4,5,6]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݾ� �Է� : ");
		
		try {
			int money = sc.nextInt();
			
			if(money < 1000) {
				System.out.println("1000�� �̸� �ݾ��� �ԷµǾ����ϴ�.");
				
				return; // -> ���� �޼ҵ� �������� �� ȣ���� ������ ���ư���
				// (��ȯ���� void�� �޼ҵ� ���� �������� �����Ϸ��� �ڵ� �߰�)
				
				// ���� �޼ҵ带 �����ϰ� ȣ���� ������ �����ʿ� �ۼ��� ���� ������ ��ȯ�Ѵ�.(���ư���)
			
			}else if(money > 1000000) {
				System.out.println("1�� �ִ� ���� ���� �ݾ��� 10������ �ʰ��� �� �����ϴ�.");
				return;
			}
			
			// ������ �ζ� ��ȣ�� ������ List
			List<Set<Integer>> lottoList = new ArrayList<Set<Integer>>();
			// -> Integer�� Ÿ���� ���ѵ� Set ��ü�� �����ϴ� List
			
			for(int i=0 ; i<money/1000 ; i++) {
				
				// �ζ� ��ȣ �� �� ����
				Set<Integer> lotto = new TreeSet<Integer>();
				while(true) {
					lotto.add(  (int)(Math.random() * 45 +1)  );
					
					if(lotto.size() == 6) break;
				}
				
				lottoList.add(lotto); // ����Ʈ�� ������ �ζ� ��ȣ �� �� �߰�
			}
			
			// ����Ʈ�� ����� �ζ� ��ȣ ��� ���
			for( Set<Integer> lotto  : lottoList) {
				System.out.println(lotto);
			}
			
		}catch(InputMismatchException e) {
			System.out.println("������ �ƴ� ���ڰ� �ԷµǾ� ����˴ϴ�.");
		}
		
	
		// �����ؾ� �� ��
		// 1. 1000�� �̸� �Է�
		// 2. ������ �ƴ� ���� �Է�  O
		// 3. 10���� ���� ������ ���� ����
		
		// 4. 1000�� ������ �ƴ� �Է�
		
		// �߰��� ���
		// 1. �ζ� ��÷��ȣ ����
		// 2. ��÷ Ȯ��
	}
	
	
	
	
}
