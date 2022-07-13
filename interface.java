public interface Aa {
	void abc();
	void cde();
	void efg();
	void ghi();

}
abstract class Abc implements Aa{
	public void efg() {
		System.out.println("efg");
	}
}
class hello extends Abc{
	public void abc() {
		System.out.println("cde");	
	}
	public void cde() {
		System.out.println("cde");
	}
	public void ghi() {
		System.out.println("ghi");
	}
}
class InterTest{
	public static void main(String args[]) {
		hello h=new hello();
		h.abc();
		h.cde();
		h.efg();
		h.ghi();
	}
}