/*
@author: Arnab Kumar Hoodati
*/

abstract class AbstractClass{  
    abstract void run();  
  }  
  class child extends AbstractClass{  
  void run(){
    System.out.println("running mode is on");}  
  public static void main(String args[]){  
   child c = new child();  
   c.run();  
  }  
  } 