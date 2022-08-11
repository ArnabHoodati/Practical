package Synchronization;

public class NonsyncEg {

	public static void main(String... args) {
		SampleTest s = new SampleTest();
		ThreadTest t1 = new ThreadTest(s);
		ThreadTest1 t2 = new ThreadTest1(s);
		t1.start();
		t2.start();
	}
}
