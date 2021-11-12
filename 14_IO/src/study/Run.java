package study;

import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class Run {
	

	public static void main(String[] args) {
		
		// Runnable은 스레드가 실행할 작업 내용을 가지고 있을 뿐, 실제 스래드는 아니다.
		Runnable stream = new AdvancedIOStream();
		Runnable buffer = new AdvancedBuffer();
		Runnable utils = new AdvancedIOUtils();
		// Runnable을 스레드 생성시 매개변수로 넘겨주어 thread 생성자를 호출한다.
		Thread t1 = new Thread(stream);
		Thread t2 = new Thread(buffer);
		Thread t3 = new Thread(utils);
		
		try{
			OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
			// t1.start();
			// t2.start();
			t3.start();
			
			while(t3.getState() == Thread.State.RUNNABLE){
				
				System.out.println("***********************************************************");
				System.out.println("CPU 사용률 : " + String.format("%.2f", osBean.getSystemCpuLoad() * 100));
				System.out.println("메모리 잔여량 : " + String.format("%.3f", (double)osBean.getFreePhysicalMemorySize()/1024/1024/1024  ));
				System.out.println("전체 물리메모리량 : " + String.format("%.3f", (double)osBean.getTotalPhysicalMemorySize()/1024/1024/1024  ));
				System.out.println("메모리 사용량 : " + String.format("%.3f", ((double)osBean.getTotalPhysicalMemorySize() - (double)osBean.getFreePhysicalMemorySize())/1024/1024/1024));
				
				Thread.sleep(1000);
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	// 프로세스를 하나 시작하려면 많은 자원 (resource)을 필요로한다.
	// 만약 하나의 작업을 동시에 수행하려고 할때 여러개의 프로세스를 띄워서 실행하면 각각 메모리를 할당해 주어야만 한다.
	// JVM은 기본적으로 아무런 옵션없이 실행하면 OS마다 다르지만, 32~64 MB의 물리 메모리를 점유한다.
	// 그에 반해서 쓰레드를 하나 추가하면 1MB 이내의 메모리를 점유한다.
	// 그래서 쓰레드를 "경량 프로세스" 라고 부른다.
}