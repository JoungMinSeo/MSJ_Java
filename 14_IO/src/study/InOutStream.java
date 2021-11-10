package study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.management.ManagementFactory;

import com.sun.management.OperatingSystemMXBean;

// 파일 복사 Input/OutputStream 성능
public class InOutStream {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("D:/wesome/test-file/210316_java.zip"); // 원본 파일 경로
		OutputStream out = new FileOutputStream("D:/wesome/test-file/copy/cp_210316_java.zip"); // 복사 파일 경로
		
		long startTime = System.currentTimeMillis(); // 성능 테스트 시작 시간
		
		int copyByte = 0; // 복사된 배열의 크기
		int data;
		OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
		
		while (true) {
			data = in.read(); // 1byte씩 읽는다
			if (data == -1) // 더 이상 읽을 것이 없다면 -1 반환
				break;
			out.write(data);
			copyByte++;
			
			/*
			 * System.out.println(
			 * "***********************************************************");
			 * System.out.println("CPU 사용률 : " + String.format("%.2f",
			 * osBean.getSystemCpuLoad() * 100)); System.out.println("메모리 잔여량 : " +
			 * String.format("%.3f", (double) osBean.getFreePhysicalMemorySize() / 1024 /
			 * 1024)); System.out.println("물리 메모리량 : " + String.format("%.3f", (double)
			 * osBean.getTotalPhysicalMemorySize() / 1024 / 1024));
			 */
			
		}
		
		long endTime = System.currentTimeMillis(); // 성능 테스트 끝난 시간
		
		in.close();
		out.close();
		// close()를 호출하여 스트림을 닫아 종료된 작업에 대해 메모리 확보
		
		System.out.println("--------------- 스트림 전송시간--------------------");
		System.out.println("소요시간 : " + (endTime-startTime) + "ms");
		System.out.println("복사된 배열의 크기: " + copyByte);
	}

	// CPU 사용률 : 평균 16% 사용
	// Memory 사용률 : 평균 30 MB 사용
	// 소요 시간 : 48754ms 
	
	// --------------------------------------------------------------------------------
	// 자바에서 입출력을 수행하기 위해, 두 대상을 연결하고 데이터를 전송 할 수 있는 것을 스트림이라고 정의한다.
	// 스트림은 단방향 통신만 가능하기 때문에 하나의 스트림으론 입력과 출력을 동시에 처리 할 수 없다.
}
