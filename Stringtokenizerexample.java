package String;
import java.util.StringTokenizer; 
public class Stringtokenizerexample { 	//Main class
	 public static void my() {  //my Method
	   //Creating object of the class
	   StringTokenizer t = new StringTokenizer("Anudip Foundation skill and Carrer Development Center"," ");  
	     while (t.hasMoreTokens()) {  //Boolean method it checks if there is more tokens available or not
	    	//String method it returns the next token from string tokenizer obj 
	         System.out.println(t.nextToken(" "));  {	
	        	 StringTokenizer st = new StringTokenizer("I am Arnab, Staying In Kolkata");
	     while (st.hasMoreTokens()) {  
	    	 System.out.println(st.nextToken(","));	//print next token
	         }
	     }  
	   }  
	 }
	 public static void main(String args[]){ //Main Method
		 my();
	}
}
