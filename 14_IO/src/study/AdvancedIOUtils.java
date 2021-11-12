package study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class AdvancedIOUtils implements Runnable{
	
	@Override
	public void run() {
			String in = "D:/wesome/test-file/DAIA 개선 사업.zip"; // 원본 파일 경로
			String out = "D:/wesome/test-file/copy/cp_DAIA 개선 사업.zip"; // 복사 파일 경로
			
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			
			long startTime = System.currentTimeMillis(); // 성능 테스트 시작 시간
			try {
				fis = new FileInputStream(in);
				fos = new FileOutputStream(out);
				
				bis = new BufferedInputStream(fis);
				bos = new BufferedOutputStream(fos);

				IOUtils.copy(bis, bos);
			} catch (FileNotFoundException e) { // 파일을 찾지 못했을 경우
				e.printStackTrace();
			}catch (IOException e){ // 파일을 찾았으나 읽지 못했을 경우
				e.printStackTrace();
			}finally {
				try {
					if (fis != null) { // 읽은 파일이 있다면
						fis.close();
						fos.close();
					}
				} catch (IOException e) { // stream을 닫을 때 에러 발생의 경우
					e.printStackTrace();
				}
			}
			
			long endTime = System.currentTimeMillis(); // 성능 테스트 끝난 시간
			
			System.out.println("--------------- 스트림 전송시간--------------------");
			System.out.println("소요시간 : " + (endTime-startTime) + "ms");
			System.out.println("--------------- 스트림 전송시간--------------------");
			
			// CPU 사용률 : 평균 12.46% 사용
			// Memory 사용률 : 평균 28,208 KB 사용
			// 소요 시간 : 48754ms 
			
			// ===========================================================================================
			// Commons IO = 아파치 소프트웨어 재단에서 제공하는 자바 기반의 IO관련 오픈소스
	}
}
