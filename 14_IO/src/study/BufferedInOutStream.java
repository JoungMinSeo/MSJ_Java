package study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.management.ManagementFactory;

import com.sun.management.OperatingSystemMXBean;

// 파일 복사 Input/OutputStream 성능
public class BufferedInOutStream {

	public static void main(String[] args) throws IOException {

		// 기반 스트림을 생성
		InputStream in = new FileInputStream("D:/wesome/test-file/210316_java.zip"); // 원본 파일 경로
		OutputStream out = new FileOutputStream("D:/wesome/test-file/copy/cp_210316_java.zip"); // 복사 파일 경로

		// 기반스트림을 사용해서 보조스트림을 생성
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);

		long startTime = System.currentTimeMillis(); // 성능 테스트 시작 시간

		int copyByte = 0; // 복사된 배열의 크기
		int data;
		OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);

		while (true) {
			data = bin.read();
			if (data == -1)
				break;
			bout.write(data);
			out.flush(); // 파일 내용이 버퍼에만 남고 파일에는 쓰이지 않는 상황을 방지
			copyByte++;

			
			  System.out.println("==============================================");
			  System.out.println("CPU 사용률 : " + String.format("%.2f",osBean.getSystemCpuLoad() * 100)); 
			  System.out.println("메모리 잔여량 : " + String.format("%.3f", (double) osBean.getFreePhysicalMemorySize() / 1024 /1024)); 
			  System.out.println("물리 메모리량 : " + String.format("%.3f", (double)osBean.getTotalPhysicalMemorySize() / 1024 / 1024));
			 
		}

		long endTime = System.currentTimeMillis(); // 성능 테스트 끝난 시간

		bin.close();
		bout.close();
		// close()를 호출하여 스트림을 닫아 종료된 작업에 대해 메모리 확보

		System.out.println("---------------버퍼 스트림 전송시간--------------------");
		System.out.println("소요시간 : " + (endTime - startTime) + "ms");
		System.out.println("복사된 바이트의 크기: " + copyByte);
	}

	// CPU 사용률 : 평균 19%
	// Memory 사용률 : 20MB 
	// 소요 시간 : 102ms
	
	// ===========================================================================================
	// 보조스트림은 실제 데이터를 주고 받는 스트림이 아님.
	// 스트림의 기능을 향상 시키거나, 새로운 기능을 추가할 수 있다.
	// Buffer = 임시 저장 공간 
	// -> CPU는 1초에 100개의 데이터를 처리할 수 있지만 HDD는 데이터를 아무리 빨라도 CPU의 속도를 따라가지 못하기 때문에
	// -> HDD -> 버퍼에 데이터를 쌓아둠 -> 다른 할일을 찾아 처리하다가 버퍼에 데이터가 어느정도 쌓이면 한꺼번에 가져와서 처리
	// BufferedInputStream(InputStream in) 버퍼의 크기를 지정해주지 않으므로 기본적으로 8192byte크기의 버퍼를 갖게 된다.
	
	

}
