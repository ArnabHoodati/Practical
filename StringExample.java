package String;
public class StringExample {	//Main class
	public void show() { //Method 1
		char[]arr = {'J','a','v','a'}; //Represents sequence of char values
		String s = new String(arr);	//char array to string
		System.out.println("The value is "+s);	//Print the line
		System.out.println(arr);	//Output
	}
public void myfunction() {	//Method 2
	//Declaring String without new Operator
	String n = "arnab";
	String n1 = "arnab";
	String n2 = new String("arnab"); //Declaring String using new Operator
}
public static void main(String[] args) {	//Main Method
	StringExample obj = new StringExample();	//Creating object of the class
	//Calling Method
	obj.show();
	obj.myfunction();
	}
}
