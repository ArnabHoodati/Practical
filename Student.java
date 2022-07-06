/*
@author: Arnab Kumar Hoodati
*/


public class Student {      //another class
int id;  
String name;  
Address address;    //aggregation (entity ref of address class)
public Student(int id, Address address, String name) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){         //method
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}   
public static void main(String[] args) {  
Address address1=new Address("KOL","WB","India");  
Address address2=new Address("DGP","WB","India");   
Student s =new Student(1, address1,"Arnab");  
Student s1=new Student(2, address2,"Rahul");      
s.display();  
s1.display();  
      
}  
}  