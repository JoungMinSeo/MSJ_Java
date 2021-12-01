package edu.kh.variable.ex.service;

public class C_Casting {
	/* ����ȯ
	 * 
	 * ��ǻ�Ϳ����� �� ó�� ��Ģ
	 * 1. ���� ������ �ڷ����� ���� ����
	 * 2. ���� ���� �ڷ����� ��� ����
	 * 3. ����� ����� ���� ������ �ڷ����� ���;� ��
	 * 
	 * -> �� ��Ģ�� �������� ���� �� ����ȯ�� �ʿ��ϴ�.
	 * (�ڵ� ����ȯ, ���� ����ȯ)
	 * */
	
	// �ڵ� ����ȯ ����
	public void example1() {
		// �ڵ� ����ȯ�̶�?
		// ���� ������ ���� �ڷ����� ū �ڷ��� ���� ���� ��
		// �����Ϸ��� �ڵ����� ������ ���� �ڷ����� 
		// ū �ڷ����� ���� ���·� ��ȯ��Ű�� ��.
		
		// int(4byte) -> double(8byte)
		int iNum = 12;
		
		double dNum = 3.3;
		
		System.out.println(iNum + dNum); // 15.3
					// (int)iNum -> (double)iNum �ڵ� ����ȯ
		
		double result = iNum + dNum;
		System.out.println("result : " + result); // result : 15.3
		
		
		
		// int(4byte) -> long(8byte)
		int iNum2 = 2147483647; // int �ִ밪
		long lNum2 = 1000000000L; // 10��
		
		long result2 = iNum2 + lNum2;
		//             (long)   (long)
		System.out.println("result2 : " + result2);
		
		
		// float(4byte) -> double(8byte)
		float fNum3 = 1.2f;
		double dNum3 = fNum3;
		
		
		
		// long(8byte) -> float(4byte)
		// float�� ���� ������ long���� �� ũ�� ������ �ڵ� ����ȯ�� �����ϴ�
		long lNum4 = Long.MAX_VALUE; // long�� �ִ밪
		float fNum4 = lNum4;
				   // (long) -> (float) 
		
		System.out.println("lNum4 : " + lNum4);
		System.out.println("fNum4 : " + fNum4);
		
		
		// char(2byte) -> int(4byte)
		char ch5 = '��';
		int iNum5 = ch5;
		System.out.println("iNum5 : " + iNum5);
		
		char ch6 = 65;
		//		  (int)
		// ������ ���� �ʴ� ���� :
		// char �ڷ����� ���� 0~65535 ������ ������ �����ϴ� ����
		// �׷��� char �ڷ����� ���ڸ� �����ϴ°� ������ ���� �ʴ´�.
		// �׷��� ������ ��Ÿ�� �� �ִ� ǥ����� int, long �� ���� ������.
		// ���� ������ char ���� ǥ����� ������ �ʰ� ���� ��
		// �ۼ��Ǵ� int ǥ����� char �ڷ��� ������ �ν��ϰ� java���� ���ص�.
		System.out.println("ch6 : " + ch6);
	}
	
	
	
	// ���� ����ȯ ����
	public void example2() {
		
		// ���� ����ȯ�̶�?
		// ���� ������ ū �ڷ�����  ���� ������ ���� �ڷ������� ��ȯ
		// -> ū �����͸� �߶� �־�� �ϱ� ������ 
		//    �ڵ����� ������� ���ϰ� ������ ���� ���Ѿ���.
		
		// ���� ����ȯ���� ���� ������ �ս�
		int iNum = 290;
		byte bNum = (byte)iNum; // iNum�� byte �ڷ������� ���� ����ȯ
		System.out.println("iNum : " + iNum);
		System.out.println("bNum : " + bNum);
		
		
		// �Ǽ��� -> ������ ���� ����ȯ
		// --> �Ҽ��� �Ʒ� ���� ȿ��
		int iNum2 = 10;
		double dNum2 = 1.25;
		
		System.out.println(iNum2 * dNum2); // 12.5
		
		int result2 = (int)(iNum2 * dNum2);
		// iNum2 * dNum2�� ����� ����� �ڷ����� double
		// -> iNum2�� double���� dNum2�� ����ϱ� ���ؼ� double�� �ڵ� ����ȯ��.
		
		// ��� ����� int�� ���� result2�� �����ϱ� ���ؼ��� 
		// ��� ���� �ڷ����� int�� �̿��� �ǹǷ� ���� ����ȯ ����.
		
		System.out.println("result2 : " + result2); // 12
		
		System.out.println(  iNum2  *  (int)dNum2 ); // 10
		
		
		// int -> char ���� ����ȯ
		int iNum3 = 65;
		
		char ch3 = 65; // char�� �� ���� �� int ���ͷ� ǥ����� ����� �� �ִ�.
		char ch4 = (char)iNum3; // char�� �� ���� �� int �ڷ����� ������ �� ����.
		
		System.out.println("ch3 : " + ch3);
		System.out.println("ch4 : " + ch4);
	}
	
	
	// ������ �����÷ο�
	public void example3() {
		
		int views = 2147483647;
		System.out.println("views : " + views);
		
		int views2 = views + 1;
		System.out.println("views2 : " + views2);
		
		// ������ �����÷ο�� �ڵ�����δ� ������ �߰ߵ��� ����.
		// -> ���� �� ������ �߻����� �ʵ���
		//    ��ȹ, ���� �ܰ迡�� ������ ���ؾ���.
	}
	
	
	
	// printf() ��¸޼ҵ�
	public void example4() {
		String name = "ȫ�浿";
		int age = 20;
		double height = 180.45;
		
		// ȫ�浿���� 20���̸�, Ű�� 180.45cm �Դϴ�.
		System.out.println(name + "���� " + age + "���̸�, Ű�� " + height +"cm �Դϴ�.");
		
		System.out.printf("%-5s���� %d���̸�, Ű�� %.2fcm �Դϴ�.\n", name, age, height);
		
		// %s (String) : ���ڿ� ����
		// %5s : 5ĭ�� Ȯ���ϰ� ������ ����
		// %-5s : 5ĭ�� Ȯ���ϰ� ���� ����
		
		// %d (Decimal) : 10�� ���� ����
		// %o : 8����  /  %x : 16����
		// %f (Float) : �Ǽ� ����
		// %.2f : �Ǽ� ����, �Ҽ��� �Ʒ� ���ڸ� ���� ǥ��
		//   -> �Ҽ��� �Ʒ� ��° �ڸ����� �ݿø�
		
		
	}
	
	
	
	
	
	
	
	
	
}
