/*
@author: Arnab Kumar Hoodati
*/

class Shape{  
void run(){
    System.out.println("draw");
    }  
}  
class Square extends Shape{  
void run(){
    System.out.println("square");
    }  
}  
class Circle extends Shape{  
void run(){
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