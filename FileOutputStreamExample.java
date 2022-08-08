package IO;
import java.io.*;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) {
		try {
			// instantiating the FileInputStream object and passing the address of the file
			FileOutputStream obj = new FileOutputStream("D:\\text1.txt");
			obj.write(111);
			String s = "Welcome to java world";
			byte b [] = s.getBytes();
			obj.write(b);
			obj.close();	// close the file
			System.out.println("done");
		}
		catch (Exception e) {	//handling exception
			System.out.println(e);
		}
	}
}


			
		
