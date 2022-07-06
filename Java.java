/*
@author: Arnab Kumar Hoodati
*/

//Single inheritance


class Java {
   void Single() {
      System.out.println("Single");
   }
}
class Python extends Java {
   void Multiple() {
      System.out.println("Multiple");
   }
}
public class Test {
   public static void main(String[] args) {
      Python d = new Python();
      d.Single();
      d.Multiple();
   }
}