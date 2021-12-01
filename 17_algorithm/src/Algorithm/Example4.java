package Algorithm;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		for(int i = 2; i <= dan ; i++) {
			System.out.println(i + "단 출력");
			for(int j = 1; j <= 9 ; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
		
	}
	
}
