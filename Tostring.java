package String;
public class Tostring {	//Main class
		 int rollno;  //int type variable
		 String name, addr;   //string
		 Tostring(int rollno, String name, String addr){  //Constructor
		 //Variable refers to current instance
		 this.rollno=rollno;  
		 this.name=name;  
		 this.addr=addr;  
		 }   
		 public String toString(){ //return obj to string
		  return super.toString(); //obj to string
		 }  
		 public static void main(String args[]){  //Main Method
		  //Creating object of the class
		  Tostring s1 = new Tostring(1,"Ram","Mumbai");  
		  Tostring s2 = new Tostring(2,"Karan","Delhi");  
		    
		   //Print value of object instead of hashcode
		   System.out.println(s1); 
		   System.out.println(s2);  
		 }  
		}  
