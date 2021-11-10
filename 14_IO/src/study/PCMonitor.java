package study;

import java.io.File;
import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class PCMonitor {
@SuppressWarnings("restriction")
public static void main(String args[]){
 OperatingSystemMXBean osBean = (com.sun.management.OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean();
    double load = 0 ;

    while(true){
      load = osBean.getSystemCpuLoad();
      try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
      if( load*100.0 > 0.0) break;
    }

    File f = new File("/");
    System.out.println("CPU ==============================");
    System.out.println("- Usage : "+  load*100.0 );
    System.out.println("- Usage Percent : "+  Math.round(load*100.0) + "%");
    System.out.println("- Idle  Percent : "+  (100 - Math.round(load*100.0)) + "%\n");
    System.out.println("HDD ==============================");
    System.out.println("- Total : " + Math.round( f.getTotalSpace()/(1024*1024) / 1000.0 ) + "(GB)");
    System.out.println("- Usage : " + Math.round( (f.getTotalSpace() - f.getUsableSpace())/(1024*1024)/ 1000.0) + "(GB)");
    System.out.println("- Idle  : " + Math.round( f.getUsableSpace()/(1024*1024) / 1000.0 ) + "(GB)");
    System.out.println("- Usage Percent : " + Math.round( Double.valueOf(f.getTotalSpace() - f.getUsableSpace())/ Double.valueOf(f.getTotalSpace()) * 100) + "%"   );
    System.out.println("- Idle  Percent : " + Math.round( Double.valueOf(f.getUsableSpace()) / Double.valueOf(f.getTotalSpace()) * 100) + "%\n" );
    System.out.println("Memory============================");
    System.out.println("- TotalPhysicalMemorySize: " + Math.round( osBean.getTotalPhysicalMemorySize() / (1024*1024) / 1000.0) + "(GB)"); 
    System.out.println("- FreePhysicalMemorySize: " + Math.round( osBean.getFreePhysicalMemorySize() / (1024*1024) / 1000.0) + "(GB)");
    System.out.println("- Usage Percent : " + Math.round( ( Double.valueOf(osBean.getTotalPhysicalMemorySize() - osBean.getFreePhysicalMemorySize() ) ) / Double.valueOf( osBean.getTotalPhysicalMemorySize() ) * 100) + "%");
    System.out.println("- Idle  Percent : " + Math.round( Double.valueOf(osBean.getFreePhysicalMemorySize()) / Double.valueOf( osBean.getTotalPhysicalMemorySize() ) * 100) + "%");
  }
}
