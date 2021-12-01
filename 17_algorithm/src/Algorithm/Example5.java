package Algorithm;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("합을 구하는 숫자 : ");
		int input = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i <=input; i++) {
			result += i;
		}
		System.out.println(result);
		
		
		
	}
	
}
