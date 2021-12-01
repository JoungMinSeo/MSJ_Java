package study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.management.ManagementFactory;

import org.apache.commons.io.*;

import com.sun.management.OperatingSystemMXBean;

public class IOUtil {

	public static void main(String[] args) throws IOException {

		String in = "D:/wesome/test-file/210316_java.zip"; // 원본 파일 경로
		String out = "D:/wesome/test-file/copy/cp_210316_java.zip"; // 복사 파일 경로
		
		FileInputStream fis = new FileInputStream(in);
		FileOutputStream fos = new FileOutputStream(out);

		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
		
		long startTime = System.currentTimeMillis(); // 성능 테스트 시작 시간
		
		IOUtils.copy(bis, bos);
		
//		System.out.println("CPU 사용률 : " + String.format("%.2f", osBean.getSystemCpuLoad() * 100));
//		System.out.println("메모리 잔여량 : " + String.format("%.3f", (double) osBean.getFreePhysicalMemorySize() / 1024 / 1024));
//		System.out.println("물리 메모리량 : " + String.format("%.3f", (double) osBean.getTotalPhysicalMemorySize() / 1024 / 1024));
		
		long endTime = System.currentTimeMillis(); // 성능 테스트 끝난 시간
		
		bis.close();
		bos.close();
		// close()를 호출하여 스트림을 닫아 종료된 작업에 대해 메모리 확보
		System.out.println("---------------IOUtils 전송시간--------------------");
		System.out.println("소요시간 : " + (endTime - startTime) + "ms");
		                                
		}
	// CPU 사용률 : 평균 20% 
	// Memory 사용률 : 15MB
	// 소요 시간 : 102ms
	
	// ===========================================================================================
	// Commons IO = 아파치 소프트웨어 재단에서 제공하는 자바 기반의 IO관련 오픈소스
	
	
	
}
