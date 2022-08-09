package Wrapper;
//Wrapper to primitive
public class Unboxing {

	public static void main(String[] args) {
		
		Integer a =new Integer(10);
		Integer i = a.intValue();
		Integer j = a;
		System.out.println(a+" "+i+" "+j);

	}

}
