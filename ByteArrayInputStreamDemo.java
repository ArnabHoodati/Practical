package IO;
import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		byte [] arr = {65,37,70,39,81};  // Declaring byte array
		ByteArrayInputStream obj = new ByteArrayInputStream(arr);
		int i = 0;
		//condition for reading file; if there is nothing in the file it will return '-1'
		while ((i = obj.read())!=-1) {
			char ch = ((char)i);
			System.out.println("ASCII Charracter "+ i + " Value is "+ch);
		}
	}
}

