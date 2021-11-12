package study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AdvancedIOStream implements Runnable{


	@Override
	public void run() {
		InputStream in = null;
		OutputStream out = null;
		
		long startTime = System.currentTimeMillis();
		try { 
			 in = new FileInputStream("D:/wesome/test-file/DAIA 개선 사업.zip");
			 out = new FileOutputStream("D:/wesome/test-file/cp_DAIA 개선 사업.zip");
		
			int data;
			while (true) {
				data = in.read(); // 1byte씩 읽는다
				if (data == -1) // 더 이상 읽을 것이 없다면 -1 반환
					break;
				out.write(data);
			}
		} catch (FileNotFoundException e) { // 파일을 찾지 못했을 경우
			e.printStackTrace();
		} catch(IOException e) { // 파일을 찾았으나 읽지 못했을 경우
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
		
		System.out.println("--------------- 스트림 전송시간--------------------");
		System.out.println("소요시간 : " + (endTime-startTime) + "ms");
		System.out.println("--------------- 스트림 전송시간--------------------");
		
		// CPU 사용률 : 평균 12.46% 사용
		// Memory 사용률 : 평균 28,196 KB 사용
		// 소요 시간 : ?? 
		
		// --------------------------------------------------------------------------------
		// 자바에서 입출력을 수행하기 위해, 두 대상을 연결하고 데이터를 전송 할 수 있는 것을 스트림이라고 정의한다.
		// 스트림은 단방향 통신만 가능하기 때문에 하나의 스트림으론 입력과 출력을 동시에 처리 할 수 없다.
		
	}
	
	
	
}
