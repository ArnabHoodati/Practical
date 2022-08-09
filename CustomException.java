package Exception;
@SuppressWarnings("serial")
class Invalidageexception extends Exception {
	public Invalidageexception(String string) {
	}
}

public class CustomException {	//class
	//whether the student is pass or not then enroll not possible
		public void checkage(int a) throws Invalidageexception {	//declaring exception
			if(a>=18 || a<25) {
				//throw Arithmetic exception if not then enroll not possible 
				throw new Invalidageexception("Invalid age for enrolling java course");	
			}else {
				System.out.println("Proper age for enrolling java course");
			}
		}
		//main method
		public static void main(String[] args) throws Invalidageexception{	
			CustomException c = new CustomException();
			c.checkage(17);
			System.out.println("rest of the code...");
		}
	}