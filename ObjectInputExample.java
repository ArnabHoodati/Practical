package Serialization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class ObjectInputExample {
	public static void main(String[] args) {
		try {
			ObjectInputStream obj2 = new ObjectInputStream (new FileInputStream("D:\\sample3.txt")); 
			Student s = (Student)obj2.readObject();
			System.out.println("id is:"+s.id+", Name is:"+s.name+", Fees is:"+s.fees);
			obj2.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}