/*
@author: Arnab Kumar Hoodati
*/

class DataMember{  
 int carspeed=80;  
}  
class carName extends DataMember{  
 int carspeed=90;  
  
 public static void main(String args[]){  
   carName obj=new carName();  
  System.out.println(obj.carspeed);  
}
}