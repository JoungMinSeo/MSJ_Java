package edu.kh.op.ex.service;

public class OperatorService1 {

	// �� ���� ������( ! )
	// ����(true / false)�� �ݴ�� �ٲٴ� ������
	public void example1() {
		System.out.println(true);
		System.out.println(!true);
		
		boolean isTrue = true;
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("!isTrue : " + !isTrue);
	}
	
	
	// ���� ������( ++ , -- )
	// �ǿ����ڸ� 1 ���� �Ǵ� ���� ��Ű�� ������
	public void example2() {
		int num = 10;
		num++;
		System.out.println("num : " + num); // num : 11
		
		// ���� ���� 
		// ���� 1�� ������Ų �� �ٸ� ������ ����
		int a1 = 10;
		int b1 = ++a1;
		
		System.out.println( a1 + " / " + b1 );
						//  11		     11	
		
		// ���� ����
		// �ٸ� ���� ���� �� 1�� ������Ŵ
		int a2 = 10;
		int b2 = a2++;
		
		System.out.println( a2 + " / " + b2);
		//					11           10
		
		
		int a3 = 3;
		int b3 = 5;
		int c3 = a3++ + --b3;
		//  c3 = 3++ + --5;
		//  c3 = 3 + 4;      (a3++ �������� �ؾߵ�...)
		//  c3 = 7
		
		// a3 = 4
		// b3 = 4
		// c3 = 7
		System.out.println(a3 + " / " + b3 + " / " + c3);
	}
	
	
	
	// ��� ������ ( + - * / % )
	public void example3() {
		int num1 = 5;
		int num2 = 2;
		
		System.out.println("�� : " + (num1 / num2) );
		System.out.println("������ : " + (num1 % num2) );
		
		// 5 / 2 �� ���� �� 2.5�� ��µǰ� �ϴ� ���
		
		//  5.0  /  2.0  = 2.5
		// int / int = int 
		
		System.out.println(   (double)num1 / (double)num2   ); // 2.5 
		System.out.println(   (double)num1 / num2   ); // 2.5
		System.out.println(   num1 / (double)num2   ); // 2.5
		System.out.println(   (double)(num1 / num2)   ); // 2.0
		
		// ���� ������ ū �ڷ����� ���� �� ���� �ڷ����� �ڵ����� ū �ڷ������� ����ȯ�� �ȴ�.
		// * ���� / ���� ������ ����� �Ǽ� ������ ����� �� �� 
		// ū �ڷ��������� ���� ����ȯ�� ���� �߻���.
	}
	
	
	// �� ������
	public void example4() {
		/* a == b : a�� b�� ����
		 * a != b : a�� b�� ���� �ʴ�. (a�� b�� �ٸ���)
		 * a > b  : a�� b���� ũ��(�ʰ�). (b�� a���� �۴�(�̸�)) 
		 * a < b  : a�� b���� �۴�(�̸�). (b�� a���� ũ��(�ʰ�))
		 * a >= b : a�� b���� ũ�ų� ����.(�̻�) (b�� a���� �۰ų� ����(����))
		 * a <= b : a�� b���� �۰ų� ����.(����) (b�� a���� ũ�ų� ����(�̻�))
		 * 
		 * *** �� �������� ���� ����� ������ true �Ǵ� false �̴�.
		 * boolean(����)							
		 * 
		 * */
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 == num2); // false
		System.out.println(num1 != num2); // true
		System.out.println( !(num1 == num2) ); // true
		System.out.println( (num1 == num2) == true ); // false
		
		System.out.println("\n--------------------------------\n");
		
		System.out.println(num1 > num2); // false
		System.out.println( num1 > (num2 - num1)  ); // false
		System.out.println( (num1 > num2) != (num2 >= num1)  ); // true
		
		System.out.println("\n--------------------------------\n");
		
		// %, == �Ǵ� != �� �̿��ؼ� ¦��, Ȧ��, ��� �Ǻ�
		
		int a = 5;
		System.out.println("a�� ¦���ΰ�? " + ( a % 2 == 0 ));
		System.out.println("a�� ¦���ΰ�? " + ( a % 2 != 1 ));
		
		System.out.println("a�� Ȧ���ΰ�? : " + ( a % 2 == 1 ) );
		System.out.println("a�� Ȧ���ΰ�? : " + ( a % 2 != 0 ) );
		
		System.out.println("a�� 5�� ����ΰ�? : " + ( a % 5 == 0 ) );
		
	}
	
	
}
