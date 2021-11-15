package study;

public class Daemon extends Thread {
	 
    public void stream() {
        System.out.println("파일 복사중...");
    }
    
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            stream();
        }
    }
}

