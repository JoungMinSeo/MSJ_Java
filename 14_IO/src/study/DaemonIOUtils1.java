package study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;

public class DaemonIOUtils1 {

	public static void main(String[] args) {
		Daemon daemon = new Daemon();
	 	daemon.setDaemon(true);        //daemon를 데몬 스레드로 만듬
	 	daemon.start();
	 	
	 	long startTime = System.currentTimeMillis(); // 성능 테스트 시작 시간
		
	 	// try-with-resources를 이용한 자원해제 처리
	 	try ( // stream 객체 선언 및 할당
		        InputStream in = new FileInputStream("D:/wesome/test-file/DAIA 개선 사업.zip");
				OutputStream out = new FileOutputStream("D:/wesome/test-file/cp_DAIA 개선 사업.zip");
	 			BufferedInputStream bis = new BufferedInputStream(in);
				BufferedOutputStream bos = new BufferedOutputStream(out);
 			) {
	 			IOUtils.copy(bis, bos);
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		long endTime = System.currentTimeMillis(); // 성능 테스트 끝난 시간
		
		System.out.println("--------------- IO buffer 스트림 전송시간--------------------");
		System.out.println("소요시간 : " + (endTime-startTime) + "ms");
		System.out.println("--------------- IO buffer 스트림 전송시간--------------------");
		System.out.println("메인 스레드 종료");
	 	
		// try문이 끝나고나면 try()안에서 선언된 객체의 close() 메소드들을 호출하여 finally 사용하지 않아도됨
		// 코드가 매우 간결해짐.
		
		// buffer 사용한 IOUtils 
		// 소요시간 : 10585ms
	}
}	
