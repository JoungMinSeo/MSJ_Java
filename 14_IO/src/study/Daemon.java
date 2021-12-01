package study;


public class Daemon{
	 
	 public static void main(String[] args) {
		 	// DaemonIOStream daemon = new DaemonIOStream();
		 	// DaemonBuffer daemon = new DaemonBuffer();
		 	// DaemonIOUtils1 daemon = new DaemonIOUtils1();
		 	DaemonIOUtils2 daemon = new DaemonIOUtils2();
		 	daemon.setDaemon(true);        //daemon를 데몬 스레드로 만듬
		 	daemon.start();
			
		 	while(daemon.getState() != Thread.State.TERMINATED) {
	            try {
	                Thread.sleep(1000);
	                System.out.println("파일 복사중 ...");
	            } catch (InterruptedException e) {
	                break;
	            }
	        }
	    }
	 
}

