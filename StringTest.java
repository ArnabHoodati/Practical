package String;
/*@author Arnab Kumar Hoodati
 */
import java.util.Scanner;
class StringTest { 
	public void show() { // method
Scanner s = new Scanner(System.in);
System.out.println("Enter String"); //line no 1

 String A = s.next(); // 1st string
 String B = s.next(); // 2nd string 
 
System.out.println (A.length() +B.length()); // 1st string length + (concat) 2nd string 1
System.out.println((A.compareTo (B)>0) ? "Yes" : "No"); // compare to ()
System.out.println (A.substring(0,1).toUpperCase() +A. substring (1)+" "
			+B.substring(0, 1).toUpperCase() +B.substring(1));
}
// Substring Java
public static void main(String...args) {
StringTest t = new StringTest();
t.show();
}
}

