public class SquareArea{      
     int area;
     void insert(int a){
          area=a;
     }
     void calculateArea(){
          System.out.println(area*area);
     }
     static class SquareArea1{
     public static void main (String args[]){
               SquareArea r1 = new SquareArea();
                    r1.insert(11);
                    r1.calculateArea();
               

          }
     }
}
