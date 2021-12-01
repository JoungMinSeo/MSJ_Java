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

	// File 클래스 : 파일 또는 폴더(디렉토리)를 다룰 수 있는 자바 제공 클래스
	// -> 이미 존재하는 파일 또는 폴더를 선택해서 다루거나,
	//    존재하지 않는 파일 또는 폴더를 생성할 수 있다.
	
	
	public void example1() {
		
		try {	
			// 1. 존재하지 않는 파일 test1.txt 파일을 프로젝트 폴더에 생성
			
			File f1 = new File("test1.txt");
			// File 객체 생성 시 선택 또는 생성할 파일명을 매개변수에 작성
			
			// boolean createNewFile() : 파일 생성 메소드
			// 파일 생성 성공 시 true, 실패 시 false
			// -> 해당 메소드는 IOException을 발생 시킬 가능성이 있음
			//    (public boolean createNewFile() throws IOException)
			if(  f1.createNewFile()  ) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println( f1.getName() + " 파일이 이미 존재합니다."  );
			}
			
			
			
			// 2. 이미 존재하는 폴더에 파일 생성하기 
			// -> File 객체 생성 시 파일명에 경로를 작성하면 됨.
			File f2 = new File("C:/dev/" + "test2.txt");
		
			if( f2.createNewFile()  ) {
				// C:/dev 폴더에 test2.txt 파일 생성
				System.out.println(f2.getName() + " 파일 생성 성공");
			}else {
				System.out.println(f2.getName() + " 파일이 이미 존재합니다.");
			}
			
			// 3. 폴더 생성 후 해당 폴더에 파일 생성하기
			File folder = new File("temp"); // temp 라는 이름의 폴더를 다루는 객체
			
			if(  !folder.exists()  ) { // temp 폴더가 없는 경우
				// exists() : 파일 또는 폴더가 존재하면 true를 반환
				
				// boolean mkdir() : make directory (폴더 생성)
				// -> 생성 성공 시 true 반환
				if( folder.mkdir() ) { 
					System.out.println(folder.getName() + " 폴더 생성 성공");
				}
			}
			
			
			File f3 = new File( folder.getName() + "/test3.txt" );
			// 프로젝트 폴더 밑에 생성된  temp폴더에  test3.txt 파일을 다루는 File 객체 생성
			
			if ( f3.createNewFile() ) {
				System.out.println(f3.getName() + " 파일 생성 성공");
			}else {
				System.out.println(f3.getName() + " 파일이 이미 존재합니다.");
			}
			
			
		}catch(IOException e) {
			System.out.println("파일 생성 중 예외 발생");
			e.printStackTrace();
		}
	}
	
	
	
	public void example2() {
		// 바이트 기반 스트림 : 1byte 단위로 데이터를 입/출력하는 스트림
		
		// FileInputStream : 파일의 내용을 1byte씩 입력 받는 스트림
		// -> FileInputStream 객체 생성 시
		//    FileNotFoundException 예외처리가 필요하다. (API 명시되어있음)
		
		FileInputStream fis = null; // FileInputStream 참조 변수만 선언.
		// Stream 관련 객체들은 메모리를 소비하는 자원이다.
		// Stream 연결된 프로그램으로의 통로로 극단적 상황에서는 
		// 데이터 유실, 악성코드 등의 침입을 유발할 수 있다.
		// -> 사용 완료된 Stream 닫아줘야 한다(없애야 한다). (필수!)
		//  --> 예외가 발생 하든 말든 사용된 Stream은 닫아야 한다
		//     ---> finally를 이용해 Stream을 닫아 준다.
		try {
			fis = new FileInputStream("byte/byteInput.txt");
			// FileInputStream 객체 생성 후 주소를 fis 참조 변수에 대입.
			// 생성한 파일과 현재 코드가 실행될 프로그램이 FileInputStream으로 연결됨
			
			// 파일로 부터 입력된 내용을 프로그램이 읽음.
			// int read() : 파일의 데이터를 1byte씩 순서대로 읽어옴.
			//				읽어올 내용이 없으면 -1 반환
			
			int value = 0; // read()로 읽어온 1byte 값을 임시 저장할 변수
			
			while( (value = fis.read()) != -1  ) {
				System.out.print( (char)value );
				// 1바이트 단위로 읽어오기 때문에
				// 2바이트인 한글은 깨진 상태로 읽어지고, 콘솔창에 출력된다
			}
			
		//}catch (FileNotFoundException e) {
		}catch (IOException e) {
			// IOException 은  FileNotFoundException의 부모로써
			// 다형성을 이용해 두 예외를 모두 잡을 수 있다.
			
			System.out.println("예외 발생");
			e.printStackTrace();
			
		} finally { // 예외가 발생 하든 말든 반드시 실행되는 구문
			try { // 스트림을 닫는 중 예외가 발생할 수 있음.
				if( fis != null) { // FileInputStream 객체가 생성되었다면
					fis.close(); // 스트림을 닫다. (== 없애다)
								 // 자원 반환
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public void example3() {
		// FileOutputStream : 1바이트 단위로 프로그램 -> 파일로 내용을 출력(저장)하는 스트림
		
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("byte/byteOutput.txt" , true );
			// 매개변수에 작성된 파일명과 같은 파일이 없으면 새 파일을 생성
			// 있으면 덮어쓰기
			
			// FileOutputStream("파일명", true) // 이어 쓰기 옵션
			// true 미작성 시 : 덮어 쓰기
			// true 작성 시 : 이어 쓰기
			
			String content  = "Hello World!!!@@@\n"
							+ "12345678901234567890\n"
							+ "가나다라마바사\n";
			
			
			for(int i=0 ; i<10 ; i++) {

				for(int j=0 ; j<=i ; j++) {
					content += "*";
				}
				
				content += "\n";
			}
			
			
			// write() : 1바이트씩 파일로 출력하는 메소드
			// -> IOException을 발생시킬 가능성이 있음.
			
			for(int i=0 ; i<content.length() ; i++) {
				fos.write( content.charAt(i) );
			}
			
			System.out.println("출력 완료");
			
		}catch(IOException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		
		}finally {
			// 사용한 스트림 닫기(자원 반환)
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
	
	// 문자 기반 스트림 : 2byte 문자(유니코드) 단위로 데이터를 입/출력하는
	//				 문자 전용 스트림
	
	// * Reader / Writer를 해석할 때 주체를 프로그램으로 생각해야 한다!
	//   (input)  (output)
	
	public void example4() {
		// FileWriter : 프로그램 -> 파일로 출력하는 문자 기반 스트림
		// (프로그램이 파일에 문자를 씀)
		
		// write() : 바이트 기반 스트림과 다르게
		// 			 문자 기반 스트림은 문자 하나 또는 문장 단위로 출력이 가능하다.
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("char/charOutput.txt" /* , true */);
			// 매개변수 뒤에 true 추가 시 이어 쓰기
			
			fw.write("자 이제 한 시간 남았습니다.\n");
			fw.write("졸지말고 힘내봅시다!\n");
			fw.write("하고 싶은말 써보세요 ㅎㅎ\n");
			fw.write("Show Me The Money, 10000\n");
			
			System.out.println("파일 출력 완료");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(fw != null) {
					fw.close();
					// 스트림 닫기(자원 반환)
					// + 스트림에 남은 내용 내보내기
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	public void example5() {
		// FileReader : 파일 -> 프로그램으로 입력하는 문자 기반 스트림
		// (프로그램이 파일의 문자를 읽어옴)
		
		FileReader fr = null;
		
		// BufferedReader : 문자 기반 입력 보조 스트림
		// -> 한 글자씩 읽어오는 것이 아닌, 
		//    내용을 하나의 버퍼에 담아 덩어리로 한 번에 입력 받음.
		//    --> 입력 횟수의 감소로 전체적인 코드 수행 시간이 짧아진다.
		
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("char/charOutput.txt");
			// 예제 4번에서 출력한 파일을 입력 받아 콘솔에서 출력
					
			// FileOutputStream과 방법은 동일함
			// -> 한 문자 씩 읽어와 화면에 출력
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
			// 보조 스트림 객체 생성 시 매개변수로는 기반 스트림이 작성되어야 한다.
			
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
		// Buffered 보조 스트림을 이용한 
		// 어떤 형식의 파일이든 복사하기
		
		BufferedInputStream bis = null;	 // 파일을 입력받아와서
		BufferedOutputStream bos = null; // 읽어온 내용 그대로 출력
		
		
		try {
			
			bis = new BufferedInputStream( new FileInputStream("띵동.gif") );
			bos = new BufferedOutputStream( new FileOutputStream("띵동_copy.gif")  );
			
			int value = 0;
			
			while( (value = bis.read()) != -1  ) {
				bos.write(value);
			}
			
			System.out.println("복사 완료");
			
			
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
