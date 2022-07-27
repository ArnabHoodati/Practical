package String;
import java.util.Scanner;

public class StringEquality {	//Main class

	public static void main(String[] args) {	//Main Method
		String str1, str2;	//String
		Scanner ab=new Scanner(System.in);	//Scanner class
		System.out.println("Enter first String"); //Print the line for first string
		str1 = ab.nextLine();
		System.out.println("Enter second String");	//Print the line for second string
		str2 = ab.nextLine();
		//Comparing two input string
		if (str1.equals(str2))
			System.out.println("Equals String");	//Output(if equal)
		else
			System.out.println("unequals String");	//Output(If not equal)

	}

}
