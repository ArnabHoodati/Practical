/*
@author: Arnab Kumar Hoodati
*/

//Hierarchical Inheritance

public class Vehicle {		//parent class
    void run()
    {
    System.out.prinln("running mode on");
    }
    class Bike extends Vehicle {	//child class
    void features() {
    System.out.println("well executed features");
    }
    class Activa extends Vehicle {	//child class
    void capasity() {
    System.out.println("high capasity");
    }
    }
    
    class Testsingleinherit{	//main class
    public static void main (String args[]) {
        Activa d = new Activa();		//obj of child class
    d.run();	//parent class method
    // d.features(); 	//child class method
    d.speed(); 	//bmw class method
    }
    }
    }
    }