package Thread;

public class DaemonThreadEg1 {
	public void run() {
		System.out.println("name :" +Thread.currentThread().getName());
		System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
	}
	public static void main(String... args) {
		DaemonThreadEg t1 = new DaemonThreadEg();
		DaemonThreadEg t2 = new DaemonThreadEg();
		t1.start();
		t1.setDaemon(true);	//we will throw exception
		t2.start();
		}
	}
