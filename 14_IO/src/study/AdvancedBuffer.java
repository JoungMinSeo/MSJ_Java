package study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AdvancedBuffer implements Runnable{

	@Override
	public void run() {

		InputStream in = null;
		OutputStream out = null;
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;

		long startTime = System.currentTimeMillis();
		int data;
		
		try {
			in = new FileInputStream("D:/wesome/test-file/DAIA 개선 사업.zip");
			out = new FileOutputStream("D:/wesome/test-file/cp_DAIA 개선 사업.zip");
			
			bin = new BufferedInputStream(in);
			bout = new BufferedOutputStream(out);
		
			while (true) {
				data = bin.read();
				if (data == -1)
					break;
				bout.write(data);
				out.flush(); // 파일 내용이 버퍼에만 남고 파일에는 쓰이지 않는 상황을 방지
			}
		} catch (FileNotFoundException e) { // 파일을 찾지 못했을 경우
			e.printStackTrace();
		} catch (IOException e) {  // 파일을 찾았으나 읽지 못했을 경우
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {  // stream을 닫을 때 에러 발생의 경우
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis(); // 성능 테스트 끝난 시간
		
		System.out.println("---------------버퍼 스트림 전송시간--------------------");
		System.out.println("소요시간 : " + (endTime - startTime) + "ms");
		
		// CPU 사용률 : 평균 12.21% 사용
		// Memory 사용률 : 평균 28,596 KB 사용
		// 소요 시간 : 97307ms 
		
		
		// ===========================================================================================
		// 보조스트림은 실제 데이터를 주고 받는 스트림이 아님.
		// 스트림의 기능을 향상 시키거나, 새로운 기능을 추가할 수 있다.
		// Buffer = 임시 저장 공간 
		// -> CPU는 1초에 100개의 데이터를 처리할 수 있지만 HDD는 데이터를 아무리 빨라도 CPU의 속도를 따라가지 못하기 때문에
		// -> HDD -> 버퍼에 데이터를 쌓아둠 -> 다른 할일을 찾아 처리하다가 버퍼에 데이터가 어느정도 쌓이면 한꺼번에 가져와서 처리
		// BufferedInputStream(InputStream in) 버퍼의 크기를 지정해주지 않으므로 기본적으로 8192byte크기의 버퍼를 갖게 된다.
	}

}
