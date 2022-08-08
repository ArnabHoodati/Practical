package IO;
import java.io.FileReader;

public class FileReaderDemo {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\text1.txt");	// Attach a file to FileReaded
			int i;
			//condition for reading file; if there is nothing in the file it will return '-1'
			while ((i = fr.read())!=-1) {
				System.out.print((char)i);
			}
			fr.close();	// close the file
		}
		catch (Exception e) {	//handling exception
			System.out.println(e);
		}
	}
}

		
				
				


