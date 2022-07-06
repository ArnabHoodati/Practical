/*
@author: Arnab Kumar Hoodati
*/

//IS-A relationship

public class Inheritanceisa {	// parent/base class
	float salary = 400000;
}
class Inherit extends Inheritanceisa{	//child class
int bonus=100000;
public static  main (String[] args){
Inherit i = new inherit();
System.out.println("salary is :"+i.salary);
System.out.println("bonus is :"+i.bonus);
}
}