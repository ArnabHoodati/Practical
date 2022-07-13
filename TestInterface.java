public interface TestInterface {
	void printH();

}
class A4 implements TestInterface{
	public void printH() {
		System.out.println("How is the Josh");
	}
	public static void main(String args[]) {
		A4 a=new A4();
		a.printH();
	}
}