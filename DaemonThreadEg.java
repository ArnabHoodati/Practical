package Thread;

public class DaemonThreadEg extends Thread {
	public void run() {
	if(Thread.currentThread().isDaemon()) {	//checking for daemon thread
		System.out.println("I am demon thread");
	}
	else {
		System.out.println("I am user thread");
		}
	}
	public static void main(String... args) {
		DaemonThreadEg t1 = new DaemonThreadEg();
		DaemonThreadEg t2 = new DaemonThreadEg();
		DaemonThreadEg t3 = new DaemonThreadEg();
		t1.setDaemon(true);	//now t1 is daemon thread
		t1.start();
		t2.start();
		t3.start();
		}
	}
