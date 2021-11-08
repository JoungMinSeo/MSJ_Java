package edu.kh.array.ex.service;

import java.util.Arrays;
import java.util.Collections;

public class ArrayService2 {

	// 배열 복사
	
	// 얕은 복사 : 참조하는 배열의 시작 주소만을 복사
	//	-> 객체의 매개변수, 반환형 전달 시 사용
	
	
	// 깊은 복사 : 원본 배열과 동일한 자료형, 동일한 크기 이상을 가지는 배열을 만들어
	//		       내부 데이터까지 똑같이 작성하는 복사
	// -> 원본 데이터 유지, 원본과 똑같은 새로운 배열 필요 시 사용
	
	
	public void example1() {
		int[] arr = {10, 20, 30, 40, 50};
		
		// 얕은 복사 진행
		int[] copyArr = arr; // arr 변수에 저장된 배열 시작 주소만 복사
		
		System.out.println("arr : " + Arrays.toString(arr)  );
		System.out.println("copyArr : " + Arrays.toString(copyArr)  );
		// Arrays 클래스
		// - java.util 패키지에 존재
		// - 배열을 쉽게 사용하거나 추가적인 기능을 제공해주는 클래스
		
		// Arrays.toString(배열명)
		// - 해당 배열에 있는 모든 값을 하나의 문자열로 만듦.
		
		copyArr[0] = 99; // 복사본의 데이터를 변경
		
		System.out.println("arr : " + Arrays.toString(arr)  );
		System.out.println("copyArr : " + Arrays.toString(copyArr)  );
		
		
		// hashCode() : 주소를 이용해서 정해진 길이의 정수를 만들어 내는 기능
		System.out.println(arr.hashCode());
		System.out.println(copyArr.hashCode());
		
	}
	
	
	public void example2() {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		// 깊은 복사를 위한 배열 생성
		int[] copyArr = new int[arr.length];
		
		// for문을 이용한 깊은 복사
//		for(int i=0 ; i<arr.length ; i++) {
//			copyArr[i] = arr[i];
//		}
		
		// System.arraycopy(원본배열명, 원본 복사 시작인덱스, 복사배열명, 
		//						복사 배열 붙여넣기 시작 인덱스, 복사길이);
		System.arraycopy(arr, 0 , copyArr , 0  , arr.length);
		
		
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		// 복사본 데이터 변경
		copyArr[0] = 99;
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		
	}
	
	
	public void example3() {
		// 배열 정렬
		
		int[] arr = {5,1,7,2,9,8,6,3,4,10};
		
		// 오름차순 : 작은 값에서 점점 커지는 값으로 정렬
		// -> 1 2 3 4 5 6 7 8 9 10
		
		// 삽입 정렬(insertion sort)
		// 정렬 알고리즘 중 가장 간단하고 기본이되는 알고리즘
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
		// Arrays.sort(배열명) : 해당 배열을 오름차순으로 정렬
		// -> 원본 배열 자체가 정렬됨.
		
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr2 = {5,1,7,2,9,8,6,3,4,10};
		
		// 내림 차순 정렬
		Arrays.sort(arr2, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arr2));
		
		
		// 삽입, 선택, 버블 정렬
	}
	
	
	public void example4() {
		
		// 중복 검사, 중복 제거
		
		int[] arr = {4, 2, 3, 4, 2};
		
		
		
		
		for(int i=0 ; i<arr.length-1 ; i++) { // 비교 기준
			
			for(int j=i+1 ; j<arr.length ; j++) { // 비교 대상
				
				if(arr[i] == arr[j] ) {
					// 비교 기준 == 비교 대상 == 중복
					System.out.println(arr[i] + "중복");
				}
			}
		}
	}
	
	
	public void example5() {
		
		// 중복 제거
		
		// 1~5사이 난수 5개를 배열에 저장
		
		int[] arr = new int[6];
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] =  (int)(Math.random() * 45 + 1);
		
			for(int j=0 ; j<i ; j++) {
				
				if(arr[i] == arr[j]) { // 중복일 경우
					// arr[i] : 현재 발생한 난수
					// arr[j] : 앞서 발생한 난수
					i--; // 중복이 발생한 경우 현재 자리에 다시 난수 발생
					break;
				}
			}
		}
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	
	
	
	
	
	
	
}
