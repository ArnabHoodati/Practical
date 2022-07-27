import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
public static void main(String[] args) {
Pattern p = Pattern.compile(".a");	//single dot represent single character
//compile regular expression into pattern
Matcher m = p.matcher("ma");	//.a dot represent single char m
boolean b = m.matches();	//output for b
boolean bb = Pattern.compile("..ma").matcher("aam").matches();
//character class
boolean b5 = Pattern.matches("[a-zA-Z]", "Anudip");
//Quantifiers
boolean b1 = Pattern.matches("[a-zA-Z0-9]{8,}","Anud123ppp");
//Meta char
//Match any phone number
boolean b2 = Pattern.matches("[6789]{1}[0-9]{9}","8348222888");
//For email
boolean b3 = Pattern.matches("[a-z0-9_.-]*@+\\.[a-z]{3}","arnab123@gmail.com");
boolean b4 = Pattern.matches("[a-zA-Z0-9_.-]{8,}","Arnab@123_.-");

System.out.println(b+ " " +bb+ " " +b1+ " " +b2+ " "+b3+ " " +b4+ " "+b5); //Print output
		

	}

}
