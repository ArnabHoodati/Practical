package Array;

public class ReverseArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10}; //declaration, initialization and instantiation  
		System.out.println("Actual array");  
		for  (int i=0;i<a.length;i++){    //loop for the actual array
		    System.out.println(a[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse array");
			for (int i=a.length-1; i>=0; i--){        //loop for the array of reverse order
			    System.out.println(a[i]+" ");
}
	}
}