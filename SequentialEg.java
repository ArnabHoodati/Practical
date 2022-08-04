
public class SequentialEg {
	public void run() {
		for(int i = 1; i<=5;i++) {
			try {
				Thread.sleep(200);	//the thread sleep/stop working for a specification
			}
			catch(InterruptedException e) {			
			}
			System.out.println(i);
		}	
	}
	public static void main(String[] args) {
		SequentialEg t1 = new SequentialEg();
		SequentialEg t2 = new SequentialEg();
		SequentialEg t3 = new SequentialEg();
		t1.run();
		t2.run();
		t3.run();
	}
}
