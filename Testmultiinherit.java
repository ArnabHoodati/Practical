/*
@author: Arnab Kumar Hoodati
*/

//Multilevel Inheritance
public class Vehicle {		//parent class
void run()
{
System.out.prinln("running mode on");
}
class Bike extends Vehicle {	//child class
void features() {
System.out.println("well executed features");
}
class BMW extends Bike {	//child class
void speed() {
System.out.println("Very high speed");
}
}

class Testmultiinherit{	//main class
public static void main (String args[]) {
	BMW d = new BMW();		//obj of child class
d.run();	//parent class method
d.features(); 	//child class method
d.speed(); 	//bmw class method
}
}
}
}