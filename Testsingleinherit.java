/*
@author: Arnab Kumar Hoodati
*/


/*
@author: Arnab Kumar Hoodati
*/

//Single Inheritance

public class Vehicle {		//parent class
void run()
{
System.out.prinln("running mode on");
}
class Bike extends Vehicle {        //child class
void features() {
System.out.println("well executed features");
}
class Testsingleinherit{	//main class
public static void main (String args[]) {       //main class
Bike b = new Bike();		//obj of child class
b.run();	//parent class method
b.features(); 	//child class method
}
}
}
}