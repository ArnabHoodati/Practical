package IO;
import java.io.*;
import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			// instantiating the FileInputStream object and passing the address of the file
			FileInputStream obj = new FileInputStream("D:\\text1.txt");
			int i = obj.read();
			System.out.println(((char)i));
			int j = 0;
			//condition for reading file; if there is nothing in the file it will return '-1'
			while ((j = obj.read())!=-1) {
				System.out.print(((char)j)); //typecasting the int 'j' to char type
			}
			obj.close();	// close the file
		}
		catch (Exception e) {	//handling exception
			System.out.println(e);
		}
	}
}
