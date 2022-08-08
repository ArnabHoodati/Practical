package IO;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\text1.txt");  // Attach a file to FileWriter
			fw.write("Welcome to Anudip Foundation");
			FileReader fr = new FileReader("D:\\text1.txt");
			int i;
			//condition for reading file; if there is nothing in the file it will return '-1'
			while ((i = fr.read())!=-1) {	
			System.out.println((char)i);
		}
			// close the file
			fw.close();	 
			fr.close();
			System.out.println("done");
		}
		catch (Exception e) {	//handling exception
			System.out.println(e);
		}
	}
}


