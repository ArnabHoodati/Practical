package Array;

public class Copyarray {
    public static void main(String[] args) {    
    	//declaring a source array
        char[] copyFrom = {'d', 'e', 'c',  'a', 'f', 'f', 'i', 'n' };  
        char[] copyTo = new char[7];  //declaring a destination array  
        System.arraycopy(copyFrom, 1, copyTo, 0, 7);  
        System.out.println(String.valueOf(copyTo));  //printing the destination array 
    }  
}
