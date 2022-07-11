/*
@author: Arnab Kumar Hoodati
*/

class DynamicBinding{  
 void run(){
    System.out.println("Private Method");
   }  
}
class Test extends DynamicBinding {
   void run() {
      System.out.println("Method Implimentation");
   }
 public static void main(String args[]){  
    Test s1=new Test();  
      s1.run();  
 }  
}