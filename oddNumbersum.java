/*
@author: Arnab Kumar Hoodati
*/

public class OddNumbersum {  
public static void main(String args[])   {  
	int a[]= {1,2,3,4,5,6,7,8,9,10}; //declaration, initialization and instantiation  
	
	int oddsum=0;
	 
	      for (int i=1; i<=a.length; i++)   //logic
{  
    if (i%2!=0)
    {
        oddsum = oddsum+a[i];
    }
}
    System.out.println("\nSum of odd number is: "+oddsum);	//print
    }
}
