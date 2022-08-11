package Synchronization;

public class SampleTest {
	//void print (int num){ //non synchronized method
	synchronized void print(int num) {	//synchronized method
		for(int i=1;i<=5;i++) {
			System.out.println(num*i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class ThreadTest extends Thread{
	//public void run(){
	//SampleTest.print(3);
	SampleTest t;
	public ThreadTest(SampleTest t) {

		this.t = t;
	}
	public void run() {
		t.print(3);
	}
}
class ThreadTest1 extends Thread{
	//public void run(){
	//SampleTest.print(5);
	SampleTest t;
	public ThreadTest1(SampleTest t) {
		this.t = t;
	}
	public void run() {
		t.print(5);
	}
}
