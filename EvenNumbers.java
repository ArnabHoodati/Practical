/*
@author: Arnab Kumar Hoodati
*/

public class EvenNumbers {  
public static void main(String args[])   {  
	int a[]= {1,2,3,4,5,6,7,8,9,10}; //declaration, initialization and instantiation  
	  System.out.print("Even numbers are :");
	      for (int i=1; i<=a.length; i++)   //logic
{  
    if (i%2==0)   //if i%2=0; the number is even  
{  
        System.out.print(i + " ");  	//print
}  
        }  
    }  
}  