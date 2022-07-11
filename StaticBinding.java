/*
@author: Arnab Kumar Hoodati
*/

class StaticBinding{  
 private void run(){
    System.out.println("Private Method");}  
  
 public static void main(String args[]){  
    StaticBinding s1=new StaticBinding();  
  s1.run();  
 }  
}