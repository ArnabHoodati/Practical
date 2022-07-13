abstract class TestAbstract {  
    TestAbstract(){
      System.out.println("Abstract class is created");
    }  
    abstract void run();  
    
    void changeSpeed(){
      System.out.println("Speed changed");}  
 }  
  class child extends TestAbstract {  
    void run(){
      System.out.println("Running safely");}  
 }  

 class TestAbstraction1{  
 public static void main(String args[]){  
  TestAbstract obj = new Child();  
  obj.run();  
  obj.changeSpeed();  
 }  
}