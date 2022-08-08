package Serialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {
	public static void main(String[] args) {
		try {
			Student s = new Student(111, "Arnab",2000);
			FileOutputStream obj = new FileOutputStream("D:\\sample3.txt"); // Attach a file to FileReaded
			ObjectOutputStream obj2 = new ObjectOutputStream(obj);
			obj2.writeObject(s);
			obj2.close();	// close the file
			System.out.println("Done..");
		}
		catch(Exception e) {	//handling exception
			System.out.println(e);
		}
	}

}
