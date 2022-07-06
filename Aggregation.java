/*
@author: Arnab Kumar Hoodati
*/


public class Aggregation {
     int Square(int n) {
        return n*n;
     }
}
class circle{        //class 2
Aggregation ag;    //obj(entity ref) line1
double pi=3.14; 
double area (int radius){ 
ag=new Aggregation();        //line2
 int psquare=ag.Square(radius);
  return pi*psquare;
}
public static void main(String args[]) { //main method
circle c=new circle(); 
double result=c.area(5);
System.out.println(result);
} 
}