package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example8 {

	public static void main(String[] args) throws IOException {
		
		// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int[] arr = new int[10];
 
		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
 
		String str = String.valueOf(val);
 
		for (int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i) - 48)]++;
		}
 
		for (int v : arr) {
			System.out.println(v);
		}
 
	}
	
}
