/*
@author: Arnab Kumar Hoodati
*/

abstract class AbstractShape{  
abstract void run(); 
}  
class Square extends Shape{  
void run(){
    System.out.println("square");
    }  
}  
abstract class Circle extends Shape{  
abstract void run();{
    System.out.println("circle");
    }  
}  
class Triangle extends Shape{  
void run(){
    System.out.println("triangle");}  
}  
class Test{  
public static void main(String args[]){  
Shape s;  
    s=new Square();  
        s.run();  
    s=new Circle();  
        s.run();  
    s=new Triangle();  
    s.run();  
    }  
} 