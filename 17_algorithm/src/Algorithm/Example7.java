package Algorithm;

import java.util.Iterator;
import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		
		// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i = 0; i < 9; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		int index = 0;
		int count = 0;
		
		for(int value : arr) {
			count++;
			if (value > max) {
				max = value;
				index = count;
			}
		}
		
		System.out.print("최대값 : " + max + "\n" + (index + 1) + "번째 수");
		
		
	}
	
	
}
