/*
@author: Arnab Kumar Hoodati
*/

//Method overloading : changing data type of argument

class Addition{  //class
static int add(int a,int b){    //no. of argument 2 add is method
    return (a+b);
}  
static double add(double a, double b)   //no. of arguments is 3, add is a method
{
    return (a+b);  
}  
class Overloading1{  //main class
public static void main(String args[]){  
System.out.println(Addition.add(10,10));  
System.out.println(Addition.add(10.6,10.5));  
}
} 