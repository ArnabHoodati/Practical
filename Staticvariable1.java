
/**
  @author Arnab Kumar Hoodati
 **/

class Staticvariable1{  
   int rollno;	//integer variable  
   String name;  
   static String college ="SRM";		//static variable  
   //constructor  
   Staticvariable1 (int r, String n){  
   rollno = r;  
   name = n;  
   }  
   //method  
   void display (){
	System.out.println(rollno+" "+name+" "+college);
  
}  
//objects 
 
public class StaticVariable{  
public static void main(String[] args){  
Staticvariable1 s1 = new Staticvariable1(010,"Arnab");  
Staticvariable1 s2 = new Staticvariable1(011,"Virat");   
 s1.display();  
 s2.display();  
 }  
}  
}
