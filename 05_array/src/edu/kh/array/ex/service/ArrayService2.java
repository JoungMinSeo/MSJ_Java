package edu.kh.array.ex.service;

import java.util.Arrays;
import java.util.Collections;

public class ArrayService2 {

	// �迭 ����
	
	// ���� ���� : �����ϴ� �迭�� ���� �ּҸ��� ����
	//	-> ��ü�� �Ű�����, ��ȯ�� ���� �� ���
	
	
	// ���� ���� : ���� �迭�� ������ �ڷ���, ������ ũ�� �̻��� ������ �迭�� �����
	//		       ���� �����ͱ��� �Ȱ��� �ۼ��ϴ� ����
	// -> ���� ������ ����, ������ �Ȱ��� ���ο� �迭 �ʿ� �� ���
	
	
	public void example1() {
		int[] arr = {10, 20, 30, 40, 50};
		
		// ���� ���� ����
		int[] copyArr = arr; // arr ������ ����� �迭 ���� �ּҸ� ����
		
		System.out.println("arr : " + Arrays.toString(arr)  );
		System.out.println("copyArr : " + Arrays.toString(copyArr)  );
		// Arrays Ŭ����
		// - java.util ��Ű���� ����
		// - �迭�� ���� ����ϰų� �߰����� ����� �������ִ� Ŭ����
		
		// Arrays.toString(�迭��)
		// - �ش� �迭�� �ִ� ��� ���� �ϳ��� ���ڿ��� ����.
		
		copyArr[0] = 99; // ���纻�� �����͸� ����
		
		System.out.println("arr : " + Arrays.toString(arr)  );
		System.out.println("copyArr : " + Arrays.toString(copyArr)  );
		
		
		// hashCode() : �ּҸ� �̿��ؼ� ������ ������ ������ ����� ���� ���
		System.out.println(arr.hashCode());
		System.out.println(copyArr.hashCode());
		
	}
	
	
	public void example2() {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		// ���� ���縦 ���� �迭 ����
		int[] copyArr = new int[arr.length];
		
		// for���� �̿��� ���� ����
//		for(int i=0 ; i<arr.length ; i++) {
//			copyArr[i] = arr[i];
//		}
		
		// System.arraycopy(�����迭��, ���� ���� �����ε���, ����迭��, 
		//						���� �迭 �ٿ��ֱ� ���� �ε���, �������);
		System.arraycopy(arr, 0 , copyArr , 0  , arr.length);
		
		
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		// ���纻 ������ ����
		copyArr[0] = 99;
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		
	}
	
	
	public void example3() {
		// �迭 ����
		
		int[] arr = {5,1,7,2,9,8,6,3,4,10};
		
		// �������� : ���� ������ ���� Ŀ���� ������ ����
		// -> 1 2 3 4 5 6 7 8 9 10
		
		// ���� ����(insertion sort)
		// ���� �˰��� �� ���� �����ϰ� �⺻�̵Ǵ� �˰���
		/*for(int i=1 ; i<arr.length ; i++) {
			
			for(int j=0 ; j < i ; j++) {
				
				if(arr[i] < arr[j]) {
					
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}*/
		
		Arrays.sort(arr);
		// Arrays.sort(�迭��) : �ش� �迭�� ������������ ����
		// -> ���� �迭 ��ü�� ���ĵ�.
		
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr2 = {5,1,7,2,9,8,6,3,4,10};
		
		// ���� ���� ����
		Arrays.sort(arr2, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arr2));
		
		
		// ����, ����, ���� ����
	}
	
	
	public void example4() {
		
		// �ߺ� �˻�, �ߺ� ����
		
		int[] arr = {4, 2, 3, 4, 2};
		
		
		
		
		for(int i=0 ; i<arr.length-1 ; i++) { // �� ����
			
			for(int j=i+1 ; j<arr.length ; j++) { // �� ���
				
				if(arr[i] == arr[j] ) {
					// �� ���� == �� ��� == �ߺ�
					System.out.println(arr[i] + "�ߺ�");
				}
			}
		}
	}
	
	
	public void example5() {
		
		// �ߺ� ����
		
		// 1~5���� ���� 5���� �迭�� ����
		
		int[] arr = new int[6];
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] =  (int)(Math.random() * 45 + 1);
		
			for(int j=0 ; j<i ; j++) {
				
				if(arr[i] == arr[j]) { // �ߺ��� ���
					// arr[i] : ���� �߻��� ����
					// arr[j] : �ռ� �߻��� ����
					i--; // �ߺ��� �߻��� ��� ���� �ڸ��� �ٽ� ���� �߻�
					break;
				}
			}
		}
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	
	
	
	
	
	
	
}
