//thread eg by implimenting runnable interface
//public class Threadtest implements Runnable {

//thread eg by extending thread class 
public class Threadtest extends Thread {
	public void run() {
		System.out.println("i am a thread");
	}
	public static void main(String[] args) {
		Threadtest t1 = new Threadtest();
		t1.start();//thread class is user to start a newly
	}
}
