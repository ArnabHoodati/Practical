import java.util.Scanner;

/*
@author: Arnab Kumar Hoodati
*/

class Data {
	public static void main(String ags[]) {
		
		String name;
		long id, password;
		double sub1, sub2, sub3, sub4, sub5;

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter your name:- ");
		name=sc.nextLine();
		
		System.out.println("Enter your id:- ");
		id=sc.nextLong();
		
		System.out.println("Enter your password:-");
		password=sc.nextLong();
		
		System.out.println("Enter the number of 5 subjects");
		System.out.println("Enter number of sub1:-");
		sub1=sc.nextDouble();
		
		System.out.println("Enter number of sub2:-");
		sub2=sc.nextDouble();
		
		System.out.println("Enter number of sub3:-");
		sub3=sc.nextDouble();
		
		System.out.println("Enter number of sub4:-");
		sub4=sc.nextDouble();
		
		System.out.println("Enter number of sub5:-");
		sub5=sc.nextDouble();
		sc.close();
		
		EncapsulationDemo obj = new EncapsulationDemo ();    //creating object of EncapsulationDemo class

         //setting values by setter methods  
		obj.setName(name);
		obj.setPassword(password);
		obj.setId(id);

		 //getting values by getter methods 
		System.out.println("Name : "+obj.getName());
		System.out.println("User ID: "+obj.getId());
		System.out.println("User Password : "+obj.getPassword());
		
		obj.calculate(sub1,sub2,sub3,sub4,sub5);
		
		System.out.println("Percentage: "+obj.getPercentage());	
    }
}

public class EncapsulationDemo {
    //private data members
	private String name;
	private long id, password;
	private double sub1,sub2,sub3,sub4,sub5;
	private double percentage;
    
	//getter and setter methods 
	public String getName() {		
		return name;
	}
	public void setName(String name) {		
		this.name=name;
  }
	public long getId() {		
		return id;
	}
	public void setId(long id) {		
		this.id=id;
  }
	public long getPassword() {		
		return password;
	}
	public void setPassword(long password) {		
		this.password=password;
  }
	public double getSub1() {		
		return sub1;
	}
	public void setSub1(double sub1) {		
		this.sub1=sub1;
  }
	public double getSub2() {		
		return sub2;
	}
	public void setSub2(double sub2) {		
		this.sub2=sub2;
  }
	public double getSub3() {		
		return sub3;
	}
	public void setSub3(double sub3) {		
		this.sub3=sub3;
  }
	public double getSub4() {		
		return sub4;
	}
	public void setSub4(double sub4) {		
		this.sub4=sub4;
  }
	public double getSub5() {		
		return sub5;
	}
	public void setSub5(double sub5) {		
		this.sub5=sub5;
  }

	public double getPercentage() {		
		return percentage;
	}
	public void setPercentage(double percentage) {		
		this.percentage=percentage;
  }
	//Marks Calculation
	 void calculate(double sub1,double sub2,double sub3,double sub4,double sub5) {
		double total=sub1+sub2+sub3+sub4+sub5;
		percentage=total/5;
		
	}	
}