
/**
 * Write a description of class Copycons here.
 *
 * @author Arnab Kumar Hoodati
 */
public class Copycons
{
private String name;
private double marks;
//constructor
Copycons(String name, double marks){
this.name=name;
this.marks=marks;
}
//copy constructor
Copycons(Copycons c)
{
this.name=c.getName();
this.marks=c.getMarks();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public double getMarks(){
return marks;
}
public void setmarks(double marks) {
this.marks=marks;
}
}
public class Test {
public static void main (String[] args) {
Copycons c1 = new Copycons("Arnab", 56.25);
Copycons cloneofc1=new Copycons(c1);
c1.setname("AH");
System.out.println("First student name is "+c1.getName());
System.out.println("Clone student name is "+cloneofc1.getName());
}
}
