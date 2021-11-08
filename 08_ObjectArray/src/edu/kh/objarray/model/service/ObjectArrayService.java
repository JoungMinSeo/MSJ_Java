package edu.kh.objarray.model.service;

import java.util.Scanner;
import edu.kh.objarray.model.vo.Book;

public class ObjectArrayService {

	private Book[] books = null;
	// null : �ƹ��͵� �����ϰ� ���� ���� ����
	
	private Scanner sc = new Scanner(System.in);
	// Scanner�� ��� ���� ���� �� �ʱ�ȭ �Ͽ��� ������
	// �ش� Ŭ����(��ü) ������ �������� ��� ����.
	
	public void displayMenu() {
		// ���ᰡ �Էµ� �� ���� ����� ��� ������ �� �ִ� �޴��� ���� �ݺ�
		
		int sel = 0; // �޴� ���ÿ� ����
		
		// do - while() : ������ �ѹ� �̻��� �ݺ��ϴ� �ݺ���
		
		do {
			System.out.println("=======================");
			System.out.println("1. �ʱ�ȭ 1");
			System.out.println("2. �ʱ�ȭ 2");
			System.out.println("3. ��� å ���� ���");
			System.out.println("4. ��� å ���� ���");
			System.out.println("5. ���� �˻�");
			System.out.println("6. 10%�� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.println("=======================");
			System.out.print("�޴� ���� >> ");
			sel = sc.nextInt();
			sc.nextLine();
			
			// ���� Ŭ���� ������ �ʵ�, �޼ҵ�� 
			// �ܼ��� �̸��� �ۼ��ϴ� ������ ȣ���� �����ϴ�.
			switch(sel) {
			case 1 : init1(); break; 
			case 2 : init2(); break;
			case 3 : printBooks(); break;
			case 4 : System.out.println( printTitle() );   break;
			case 5 : System.out.println( searchAuthor() ); break;
			case 6 : priceCut(10);  break;
			
			case 0 : System.out.println("���α׷��� �����մϴ�."); break;
			
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}while(sel != 0);
	}
	
	
	
	
	
	public void init1() {
		// 3ĭ¥�� Book �迭�� �����Ͽ� �� �迭 ��Ҹ� �ʱ�ȭ
		
		// Book[] ��ü ����
		books = new Book[3];
		
		// Book[]�� �� ���(Book ���� ����)�� 
		// ���ο� Book ��ü�� �����ؼ� ���� �ϵ��� ��.
		books[0] = new Book();
		
		books[0].setTitle("�ڹ��� ����");
		books[0].setContent("�ڹٿ� ���� ������ ��������.");
		books[0].setAuthor("���� ��");
		books[0].setPublisher("��������");
		books[0].setPrice(30000);
		
		
		books[1] = new Book("�����", "������� �̾߱�", "�����㺣��", "���л�", 10000);
		books[2] = new Book("�ﱹ��", "���������ϰ� �̷��� ������", "�̹���", "�˿���ġ�ڸ���", 130000);
	}
	
	
	public void init2() {
		// 5ĭ ¥�� Book �迭�� ������ ��
		// å ������ 5�� �Է� �޾� ��ü�� ������ �� books �� ��ҿ� ����
		
		// 5ĭ ¥�� Book �迭 ����
		books = new Book[5];
		
		// å ������ 5�� �Է� �޾� Book ��ü  ���� �� �ʱ�ȭ �� books �� ��ҿ� ����
	
		for(int i=0 ; i<books.length ; i++) {
			
			System.out.print("���� : ");
			String title = sc.nextLine();
			
			System.out.print("���� : ");
			String content = sc.nextLine();
			
			System.out.print("���� : " );
			String author = sc.nextLine();
			
			System.out.print("���ǻ� : " );
			String publisher = sc.nextLine();
			
			System.out.print("���� : " );
			int price = sc.nextInt();
			sc.nextLine(); // �Է� ���ۿ� �����ִ� ���๮�� ����
			
			books[i] = new Book(title, content, author, publisher, price);
			
		}
		
	}
	
	
	
	
	
	public void printBooks() {
		// Book[] ��ü �迭�� ����� ��� ���� ���
		
		// 1) �ε����� �ϳ� �ϳ� �ۼ��ϴ� ���
		/*System.out.println(books[0].toString());
		System.out.println(books[1].toString());
		System.out.println(books[2].toString());*/
		
		// 2) for���� �̿��� ���
		/*for(int i=0 ; i<books.length ; i++) {
			System.out.println(books[i].toString());
		}*/
		
		// 3) ���� for��(for each��)
		// -> ó������ ������ �迭,�÷��� ���� ��� ��Ҹ� ������ �� ���
		
		/* for(�迭���� ���� ���� ������ ���� : �迭��){
		 * 	// �ݺ� ������ ����
		 * }
		 * */
		
		for(Book book : books) {
			System.out.println(book.toString());
		}
	}
	
	
	public String printTitle() {
		// books�� ����� å�� ���� ���ڿ� ���·� ��ȯ
		/* ��ȯ�� ���ڿ��� ����
		 * 
		 * �ڹ�������
		 * �����
		 * �ﱹ��
		 * 
		 * */
		
		// 1) books ��ҿ� �ݺ� �����ؼ� ���� ��������
		// 2) �ϳ��� ���ڿ��� �����
		// 3) ��ȯ�� �� ���
		
		String result = ""; // �� ���ڿ� != null
		
		for(Book b : books) {
			result += b.getTitle() + "\n";
		}
		
		return result;
	}
	
	
	public String searchAuthor() {
		// ���ڸ��� �Է� �޾� ��ġ�ϴ� å ������ ��ȯ
		// ���� ���, "�ش� ������ å�� �������� �ʽ��ϴ�."
		
		System.out.print("���ڸ� �Է� : ");
		String inputAuthor = sc.nextLine();
		for(Book b : books) {
			if(  b.getAuthor().equals(inputAuthor)  ) {
			//if(  b.getAuthor().contains(inputAuthor)  ) {
				
				// ���ڿ�1.equals(���ڿ�2)
				// ���ڿ�1�� ���ڿ�2�� ���� �Ȱ��ٸ� true / �ƴϸ� false
				
				return b.toString();
			}
		}
		
		// for �ݺ��� �Ϸ������ ��ȯ�� ���� ���� ��� 
		// == ��ġ�ϴ� ���ڸ��� ����
		return "�ش� ������ å�� �������� �ʽ��ϴ�.";
	}
	
	
	public void priceCut(int cut) {
		// 1~99 ���� cut�� ���� �޾�
		// å�� ������ cut%��ŭ ���ϵ� �������� ����
		
		if( cut >= 1 && cut <= 99 ) {
			
			for( Book b : books ) {
				
				// ���ϵ� ����  = ���� ���� - (���� ���� * cut%)
				//			= ���� ���� * (1 - cut%)
				
				//(int)(b.getPrice() * ( 1 - (cut/100.0) ))
				b.setPrice((int)(b.getPrice() * ( 1 - (cut/100.0) )));
			}
			
			
		}else {
			System.out.println("1~99 ���� ���ڸ� �Է����ּ���.");
		}
		
	}
	
	
	
	
	
	
}
