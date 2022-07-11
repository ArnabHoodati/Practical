/*
@author: Arnab Kumar Hoodati
*/

class Animal{  
void eat(){
    System.out.println("eat");
    }  
}  
class Lion extends Animal{  
void eat(){
    System.out.println("eating meat");
    }  
}  
class Cat extends Animal{  
void eat(){
    System.out.println("eating fish");
    }  
}  
class Cow extends Animal{  
void eat(){
    System.out.println("eating grass");
    }  
}  
class Test{  
public static void main(String[] args){  
Animal a;  
    a=new Lion();  
        a.eat();  
    a=new Cat();  
        a.eat();  
    a=new Cow();  
        a.eat();  
    }
}