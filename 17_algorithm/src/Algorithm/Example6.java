package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Example6 {

	// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇개를 비교할건지 입력 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		for(int i = 0; i < input; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("가장 작은 수 " + arr[0] + "\n가장 큰 수 : " + arr[input - 1]);
		
		
	}
	
}
