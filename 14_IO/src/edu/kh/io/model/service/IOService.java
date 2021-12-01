package edu.kh.io.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOService {

	// File Ŭ���� : ���� �Ǵ� ����(���丮)�� �ٷ� �� �ִ� �ڹ� ���� Ŭ����
	// -> �̹� �����ϴ� ���� �Ǵ� ������ �����ؼ� �ٷ�ų�,
	//    �������� �ʴ� ���� �Ǵ� ������ ������ �� �ִ�.
	
	
	public void example1() {
		
		try {	
			// 1. �������� �ʴ� ���� test1.txt ������ ������Ʈ ������ ����
			
			File f1 = new File("test1.txt");
			// File ��ü ���� �� ���� �Ǵ� ������ ���ϸ��� �Ű������� �ۼ�
			
			// boolean createNewFile() : ���� ���� �޼ҵ�
			// ���� ���� ���� �� true, ���� �� false
			// -> �ش� �޼ҵ�� IOException�� �߻� ��ų ���ɼ��� ����
			//    (public boolean createNewFile() throws IOException)
			if(  f1.createNewFile()  ) {
				System.out.println("���� ���� ����");
			}else {
				System.out.println( f1.getName() + " ������ �̹� �����մϴ�."  );
			}
			
			
			
			// 2. �̹� �����ϴ� ������ ���� �����ϱ� 
			// -> File ��ü ���� �� ���ϸ� ��θ� �ۼ��ϸ� ��.
			File f2 = new File("C:/dev/" + "test2.txt");
		
			if( f2.createNewFile()  ) {
				// C:/dev ������ test2.txt ���� ����
				System.out.println(f2.getName() + " ���� ���� ����");
			}else {
				System.out.println(f2.getName() + " ������ �̹� �����մϴ�.");
			}
			
			// 3. ���� ���� �� �ش� ������ ���� �����ϱ�
			File folder = new File("temp"); // temp ��� �̸��� ������ �ٷ�� ��ü
			
			if(  !folder.exists()  ) { // temp ������ ���� ���
				// exists() : ���� �Ǵ� ������ �����ϸ� true�� ��ȯ
				
				// boolean mkdir() : make directory (���� ����)
				// -> ���� ���� �� true ��ȯ
				if( folder.mkdir() ) { 
					System.out.println(folder.getName() + " ���� ���� ����");
				}
			}
			
			
			File f3 = new File( folder.getName() + "/test3.txt" );
			// ������Ʈ ���� �ؿ� ������  temp������  test3.txt ������ �ٷ�� File ��ü ����
			
			if ( f3.createNewFile() ) {
				System.out.println(f3.getName() + " ���� ���� ����");
			}else {
				System.out.println(f3.getName() + " ������ �̹� �����մϴ�.");
			}
			
			
		}catch(IOException e) {
			System.out.println("���� ���� �� ���� �߻�");
			e.printStackTrace();
		}
	}
	
	
	
	public void example2() {
		// ����Ʈ ��� ��Ʈ�� : 1byte ������ �����͸� ��/����ϴ� ��Ʈ��
		
		// FileInputStream : ������ ������ 1byte�� �Է� �޴� ��Ʈ��
		// -> FileInputStream ��ü ���� ��
		//    FileNotFoundException ����ó���� �ʿ��ϴ�. (API ��õǾ�����)
		
		FileInputStream fis = null; // FileInputStream ���� ������ ����.
		// Stream ���� ��ü���� �޸𸮸� �Һ��ϴ� �ڿ��̴�.
		// Stream ����� ���α׷������� ��η� �ش��� ��Ȳ������ 
		// ������ ����, �Ǽ��ڵ� ���� ħ���� ������ �� �ִ�.
		// -> ��� �Ϸ�� Stream �ݾ���� �Ѵ�(���־� �Ѵ�). (�ʼ�!)
		//  --> ���ܰ� �߻� �ϵ� ���� ���� Stream�� �ݾƾ� �Ѵ�
		//     ---> finally�� �̿��� Stream�� �ݾ� �ش�.
		try {
			fis = new FileInputStream("byte/byteInput.txt");
			// FileInputStream ��ü ���� �� �ּҸ� fis ���� ������ ����.
			// ������ ���ϰ� ���� �ڵ尡 ����� ���α׷��� FileInputStream���� �����
			
			// ���Ϸ� ���� �Էµ� ������ ���α׷��� ����.
			// int read() : ������ �����͸� 1byte�� ������� �о��.
			//				�о�� ������ ������ -1 ��ȯ
			
			int value = 0; // read()�� �о�� 1byte ���� �ӽ� ������ ����
			
			while( (value = fis.read()) != -1  ) {
				System.out.print( (char)value );
				// 1����Ʈ ������ �о���� ������
				// 2����Ʈ�� �ѱ��� ���� ���·� �о�����, �ܼ�â�� ��µȴ�
			}
			
		//}catch (FileNotFoundException e) {
		}catch (IOException e) {
			// IOException ��  FileNotFoundException�� �θ�ν�
			// �������� �̿��� �� ���ܸ� ��� ���� �� �ִ�.
			
			System.out.println("���� �߻�");
			e.printStackTrace();
			
		} finally { // ���ܰ� �߻� �ϵ� ���� �ݵ�� ����Ǵ� ����
			try { // ��Ʈ���� �ݴ� �� ���ܰ� �߻��� �� ����.
				if( fis != null) { // FileInputStream ��ü�� �����Ǿ��ٸ�
					fis.close(); // ��Ʈ���� �ݴ�. (== ���ִ�)
								 // �ڿ� ��ȯ
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public void example3() {
		// FileOutputStream : 1����Ʈ ������ ���α׷� -> ���Ϸ� ������ ���(����)�ϴ� ��Ʈ��
		
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("byte/byteOutput.txt" , true );
			// �Ű������� �ۼ��� ���ϸ�� ���� ������ ������ �� ������ ����
			// ������ �����
			
			// FileOutputStream("���ϸ�", true) // �̾� ���� �ɼ�
			// true ���ۼ� �� : ���� ����
			// true �ۼ� �� : �̾� ����
			
			String content  = "Hello World!!!@@@\n"
							+ "12345678901234567890\n"
							+ "�����ٶ󸶹ٻ�\n";
			
			
			for(int i=0 ; i<10 ; i++) {

				for(int j=0 ; j<=i ; j++) {
					content += "*";
				}
				
				content += "\n";
			}
			
			
			// write() : 1����Ʈ�� ���Ϸ� ����ϴ� �޼ҵ�
			// -> IOException�� �߻���ų ���ɼ��� ����.
			
			for(int i=0 ; i<content.length() ; i++) {
				fos.write( content.charAt(i) );
			}
			
			System.out.println("��� �Ϸ�");
			
		}catch(IOException e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		
		}finally {
			// ����� ��Ʈ�� �ݱ�(�ڿ� ��ȯ)
			try {
				if(fos != null) {
					fos.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// -------------------------------------------------------------
	
	// ���� ��� ��Ʈ�� : 2byte ����(�����ڵ�) ������ �����͸� ��/����ϴ�
	//				 ���� ���� ��Ʈ��
	
	// * Reader / Writer�� �ؼ��� �� ��ü�� ���α׷����� �����ؾ� �Ѵ�!
	//   (input)  (output)
	
	public void example4() {
		// FileWriter : ���α׷� -> ���Ϸ� ����ϴ� ���� ��� ��Ʈ��
		// (���α׷��� ���Ͽ� ���ڸ� ��)
		
		// write() : ����Ʈ ��� ��Ʈ���� �ٸ���
		// 			 ���� ��� ��Ʈ���� ���� �ϳ� �Ǵ� ���� ������ ����� �����ϴ�.
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("char/charOutput.txt" /* , true */);
			// �Ű����� �ڿ� true �߰� �� �̾� ����
			
			fw.write("�� ���� �� �ð� ���ҽ��ϴ�.\n");
			fw.write("�������� �������ô�!\n");
			fw.write("�ϰ� ������ �Ẹ���� ����\n");
			fw.write("Show Me The Money, 10000\n");
			
			System.out.println("���� ��� �Ϸ�");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(fw != null) {
					fw.close();
					// ��Ʈ�� �ݱ�(�ڿ� ��ȯ)
					// + ��Ʈ���� ���� ���� ��������
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	public void example5() {
		// FileReader : ���� -> ���α׷����� �Է��ϴ� ���� ��� ��Ʈ��
		// (���α׷��� ������ ���ڸ� �о��)
		
		FileReader fr = null;
		
		// BufferedReader : ���� ��� �Է� ���� ��Ʈ��
		// -> �� ���ھ� �о���� ���� �ƴ�, 
		//    ������ �ϳ��� ���ۿ� ��� ����� �� ���� �Է� ����.
		//    --> �Է� Ƚ���� ���ҷ� ��ü���� �ڵ� ���� �ð��� ª������.
		
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("char/charOutput.txt");
			// ���� 4������ ����� ������ �Է� �޾� �ֿܼ��� ���
					
			// FileOutputStream�� ����� ������
			// -> �� ���� �� �о�� ȭ�鿡 ���
			int count1 = 0;
			int value = 0;
			while( (value = fr.read()) != -1 ) {
				System.out.print( (char)value );
				count1++;
			}
			
			System.out.println(count1);
			//////////////////////////////////////////////////////////////////
			
			fr = new FileReader("char/charOutput.txt");
			
			br = new BufferedReader(fr); 
			// ���� ��Ʈ�� ��ü ���� �� �Ű������δ� ��� ��Ʈ���� �ۼ��Ǿ�� �Ѵ�.
			
			System.out.println("---------------------------------");
			int count2 = 0;
			String temp = null;
			while( (temp = br.readLine() ) != null  ) {
				System.out.println(temp);
				count2++;
			}
			System.out.println(count2);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				
				if(fr != null) {
					fr.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void example6() {
		// Buffered ���� ��Ʈ���� �̿��� 
		// � ������ �����̵� �����ϱ�
		
		BufferedInputStream bis = null;	 // ������ �Է¹޾ƿͼ�
		BufferedOutputStream bos = null; // �о�� ���� �״�� ���
		
		
		try {
			
			bis = new BufferedInputStream( new FileInputStream("��.gif") );
			bos = new BufferedOutputStream( new FileOutputStream("��_copy.gif")  );
			
			int value = 0;
			
			while( (value = bis.read()) != -1  ) {
				bos.write(value);
			}
			
			System.out.println("���� �Ϸ�");
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if( bis != null)  bis.close();
				if( bos != null)  bos.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
