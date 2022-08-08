package Serialization;
//writing state of an object into byte stream
import java.io.Serializable;

public class Student implements Serializable {
	int id;
	String name;
	transient int fees;	//use with data member of class in order to avoid serialization
	public Student (int id,String name,int fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
}
		


